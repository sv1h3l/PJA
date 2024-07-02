package cz.upol.pja.lecture08.controllers;

import cz.upol.pja.lecture08.ActiveSession;
import cz.upol.pja.lecture08.models.Discussion;
import cz.upol.pja.lecture08.models.ParticipatedUser;
import cz.upol.pja.lecture08.models.Post;
import jakarta.annotation.Resource;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.jms.JMSConnectionFactory;
import jakarta.jms.JMSContext;
import jakarta.jms.Topic;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ApplicationScoped
@Named("forumCtl")
public class ForumController {

    @Inject
    @JMSConnectionFactory("java:comp/DefaultJMSConnectionFactory")
    private JMSContext context;

    @Resource(mappedName = "jms/topic")
    private Topic newDissTopic;

    private final EntityManager entityManager = Persistence.createEntityManagerFactory("lecture04PU").createEntityManager();

    @Inject
    private ActiveSession activeSession;

    private Discussion discussion = new Discussion();

    private String topic;
    private String content;
    private String firstName;
    private Date date;

    public ForumController() {
        discussion.setDate(new Date());
    }

    public String enqueue() throws Exception {
        discussion = new Discussion(topic, content, activeSession.getUser().getFirstName(), new Date());

        context.createProducer().send(newDissTopic, discussion);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "forum";
    }

    public String show(Discussion discussion) {
        this.discussion = discussion;
        return "discussion";
    }

    public List<Discussion> getDiscussions() {
        Query q = entityManager.createNamedQuery("allDiscs");
        return (List<Discussion>) q.getResultList();
    }

    public List<Discussion> getParticipatedDiscussions() {
        Query q = entityManager.createNamedQuery("participatedDiscs");
        q.setParameter("postAuthor", activeSession.getUser().getFirstName());
        return (List<Discussion>) q.getResultList();
    }

    public List<Post> getPosts() {
        Query q = entityManager.createNamedQuery("allPosts");
        return (List<Post>) q.getResultList();
    }

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

        return participatedUsers;
    }

    public void addItem() {
        discussion.addPost(new Post(discussion, content, firstName, date));
    }

    public String back() {
        return "forum";
    }

    public boolean authorOfDiss(String firstName) {
        if (!activeSession.userLoggedIn()) {
            return false;

        }
        return firstName.equals(activeSession.getUser().getFirstName());
    }

    public void saveFormDisc(Discussion discussion) {
        entityManager.getTransaction().begin();
        entityManager.persist(discussion);
        entityManager.getTransaction().commit();
    }

    public String saveFormPost() {
        Post post = new Post(discussion, content, activeSession.getUser().getFirstName(), new Date());
        discussion.addPost(post);

        entityManager.getTransaction().begin();
        entityManager.persist(post);
        entityManager.getTransaction().commit();
        return "discussion";
    }

    public String delete(Discussion discussion) {
        entityManager.getTransaction().begin();
        // odstraneni objektu z databaze
        entityManager.remove(discussion);
        entityManager.getTransaction().commit();
        return "";
    }

    public String deletePost(Post post) {
        discussion.removePost(post);

        entityManager.getTransaction().begin();
        // odstraneni objektu z databaze
        entityManager.remove(post);
        entityManager.getTransaction().commit();
        return "discussion";
    }

    public String deleteMyPosts() {
        String firstName = activeSession.getUser().getFirstName();
        Query q = entityManager.createNamedQuery("allPostsOfDiscussion");
        q.setParameter("discId", discussion.getId());
        List<Post> posts = (List<Post>) q.getResultList();

        if (posts.get(0) == null) {
            return "discussion";
        }

        for (Post post : posts) {
            if (post.getFirstName().equals(firstName)) {
                discussion.removePost(post);

                entityManager.getTransaction().begin();
                // odstraneni objektu z databaze
                entityManager.remove(post);
                entityManager.getTransaction().commit();
            }
        }

        return "discussion";
    }

    // <editor-fold defaultstate="collapsed" desc="getters, setters, equals & hashCode ">
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public ActiveSession getActiveSession() {
        return activeSession;
    }

    public void setActiveSession(ActiveSession activeSession) {
        this.activeSession = activeSession;
    }

    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    // </editor-fold>
}
