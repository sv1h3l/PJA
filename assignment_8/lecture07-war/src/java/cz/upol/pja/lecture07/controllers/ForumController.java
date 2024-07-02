package cz.upol.pja.lecture07.controllers;

import cz.upol.pja.lecture07.api.ActiveSessionInt;
import cz.upol.pja.lecture07.api.ForumInt;
import cz.upol.pja.lecture07.beans.ActiveSessionBean;
import cz.upol.pja.lecture07.model.Discussion;
import cz.upol.pja.lecture07.model.ParticipatedUser;
import cz.upol.pja.lecture07.model.Post;
import jakarta.ejb.EJB;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.util.Date;
import java.util.List;

@ApplicationScoped
@Named("forumCtl")
public class ForumController {

    @EJB
    private ForumInt forumInt;

    public ForumController() {
    }

    public String show(Discussion discussion) {
        forumInt.show(discussion);
        return "discussion";

    }

    public List<Discussion> getDiscussions() {
        return forumInt.getDiscussions();
    }

    public List<Discussion> getParticipatedDiscussions() {
        return forumInt.getParticipatedDiscussions();
    }

    public List<Post> getPosts() {
        return forumInt.getPosts();
    }

    public List<ParticipatedUser> getParticipatedUsers() {
        return forumInt.getParticipatedUsers();
    }

    public void addItem() {
        forumInt.addItem();
    }

    public String back() {
        return "forum";
    }

    public boolean authorOfDiss(String firstName) {
        return forumInt.authorOfDiss(firstName);
    }

    public String saveFormDisc() {
        forumInt.saveFormDisc();
        return "forum";

    }

    public String saveFormPost() {
        forumInt.saveFormPost();
        return "discussion";

    }

    public String delete(Discussion discussion) {
        forumInt.delete(discussion);
        return "";

    }

    public String deletePost(Post post) {
        forumInt.deletePost(post);
        return "discussion";

    }

    public String deleteMyPosts() {
        forumInt.deleteMyPosts();
        return "discussion";

    }

    // <editor-fold defaultstate="collapsed" desc="getters, setters, equals & hashCode ">
    public String getTopic() {
        return forumInt.getTopic();
    }

    public void setTopic(String topic) {
        forumInt.setTopic(topic);
    }

    public ActiveSessionInt getActiveSession() {
        return forumInt.getActiveSession();
    }

    public void setActiveSession(ActiveSessionBean activeSession) {
        forumInt.setActiveSession(activeSession);
    }

    public Discussion getDiscussion() {
        return forumInt.getDiscussion();
    }

    public void setDiscussion(Discussion discussion) {
        forumInt.setDiscussion(discussion);
    }

    public String getFirstName() {
        return forumInt.getFirstName();
    }

    public void setFirstName(String firstName) {
        forumInt.setFirstName(firstName);
    }

    public Date getDate() {
        return forumInt.getDate();
    }

    public void setDate(Date date) {
        forumInt.setDate(date);
    }

    public String getContent() {
        return forumInt.getContent();
    }

    public void setContent(String content) {
        forumInt.setContent(content);
    }

    // </editor-fold>
}
