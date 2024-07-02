package cz.upol.pja.lecture07.beans;

import cz.upol.pja.lecture07.api.ActiveSessionInt;
import cz.upol.pja.lecture07.api.ForumInt;
import cz.upol.pja.lecture07.model.Discussion;
import cz.upol.pja.lecture07.model.ParticipatedUser;
import cz.upol.pja.lecture07.model.Post;
import cz.upol.pja.lecture07.model.User;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Stateless
public class ForumBean implements ForumInt {

    @PersistenceContext(unitName = "lecture04PU")
    private EntityManager entityManager;

    @EJB
    private ActiveSessionInt activeSession;

    private Discussion discussion = new Discussion();

    private String topic;
    private String content;
    private String firstName;
    private Date date;

    public ForumBean() {
        discussion.setDate(new Date());
    }

    @Override
    public void show(Discussion discussion) {
        this.discussion = discussion;
    }

    @Override
    public List<Discussion> getDiscussions() {
        Query q = entityManager.createNamedQuery("allDiscs");
        return (List<Discussion>) q.getResultList();
    }

    @Override
    public List<Discussion> getParticipatedDiscussions() {
        Query q = entityManager.createNamedQuery("participatedDiscs");
        q.setParameter("postAuthor", activeSession.getUser().getFirstName());
        return (List<Discussion>) q.getResultList();
    }

    @Override
    public List<Post> getPosts() {
        Query q = entityManager.createNamedQuery("allPosts");
        return (List<Post>) q.getResultList();
    }

    @Override
    public List<ParticipatedUser> getParticipatedUsers() {
        List<ParticipatedUser> participatedUsers = new ArrayList<>();
        List<Post> posts = discussion.getPosts();
        Query q = entityManager.createNamedQuery("allUsersFirstName");
        List<String> usersNames = q.getResultList();

        for (String usersName : usersNames) {
            ParticipatedUser user = new ParticipatedUser(usersName);

            for (Post post : posts) {
                if (post.getFirstName().equals(user.getFirstName())) {
                    user.incNumberOfPosts();
                }
            }

            if (user.getNumberOfPosts() != 0) {
                participatedUsers.add(user);
            }
        }

        System.out.println("xx");

        return participatedUsers;
    }

    @Override
    public void addItem() {
        discussion.addPost(new Post(discussion, content, firstName, date));
    }

    @Override
    public boolean authorOfDiss(String firstName) {
        if (!activeSession.userLoggedIn()) {
            return false;

        }
        return firstName.equals(activeSession.getUser().getFirstName());
    }

    @Override
    public void saveFormDisc() {

        discussion = new Discussion(topic, content, activeSession.getUser().getFirstName(), new Date());

        entityManager.persist(discussion);
    }

    @Override
    public void saveFormPost() {
        Post post = new Post(discussion, content, activeSession.getUser().getFirstName(), new Date());
        discussion.addPost(post);

        entityManager.persist(post);
    }

    @Override
    public void delete(Discussion discussion) {
        Discussion mergedEntity = entityManager.merge(discussion);
        entityManager.remove(mergedEntity);
    }

    @Override
    public void deletePost(Post post) {
        discussion.removePost(post);

        Post mergedEntity = entityManager.merge(post);
        entityManager.remove(mergedEntity);
    }

    @Override
    public void deleteMyPosts() {
        String firstName = activeSession.getUser().getFirstName();
        Query q = entityManager.createNamedQuery("allPostsOfDiscussion");
        q.setParameter("discId", discussion.getId());
        List<Post> posts = (List<Post>) q.getResultList();

        if (posts.get(0) == null) {
            return;
        }

        for (Post post : posts) {
            if (post.getFirstName().equals(firstName)) {
                discussion.removePost(post);

                entityManager.remove(post);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="getters, setters, equals & hashCode ">
    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public ActiveSessionInt getActiveSession() {
        return activeSession;
    }

    @Override
    public void setActiveSession(ActiveSessionBean activeSession) {
        this.activeSession = activeSession;
    }

    @Override
    public Discussion getDiscussion() {
        return discussion;
    }

    @Override
    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    // </editor-fold>
}
