package cz.upol.pja.lecture07.api;

import cz.upol.pja.lecture07.beans.ActiveSessionBean;
import cz.upol.pja.lecture07.model.Discussion;
import cz.upol.pja.lecture07.model.ParticipatedUser;
import cz.upol.pja.lecture07.model.Post;
import jakarta.ejb.Local;
import java.util.Date;
import java.util.List;

@Local
public interface ForumInt {

    public void show(Discussion discussion);

    public List<Discussion> getDiscussions();

    public List<Discussion> getParticipatedDiscussions();

    public List<Post> getPosts();

    public List<ParticipatedUser> getParticipatedUsers();

    public void addItem();

    public boolean authorOfDiss(String firstName);

    public void saveFormDisc();

    public void saveFormPost();

    public void delete(Discussion discussion);

    public void deletePost(Post post);

    public void deleteMyPosts();

    // <editor-fold defaultstate="collapsed" desc="getters, setters, equals & hashCode ">
    public String getTopic();

    public void setTopic(String topic);

    public ActiveSessionInt getActiveSession();

    public void setActiveSession(ActiveSessionBean activeSession);

    public Discussion getDiscussion();

    public void setDiscussion(Discussion discussion);

    public String getFirstName();

    public void setFirstName(String firstName);

    public Date getDate();

    public void setDate(Date date);

    public String getContent();

    public void setContent(String content);

    // </editor-fold>
}
