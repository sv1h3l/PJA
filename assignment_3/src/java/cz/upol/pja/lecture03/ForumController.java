package cz.upol.pja.lecture03;

import java.util.Collections;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Named("forum")
public class ForumController {

        @Inject
    private ActiveSession activeSession;
    
    private String title;
    private String body;

    private List<ForumMessage> forumMessages = new ArrayList<>();

    public ForumController() {
        forumMessages.add(new ForumMessage("Alice", "Best IDE for Java", "In my opinion, I think that IntelliJ is really great IDE."));
        forumMessages.add(new ForumMessage("Bob", "Better IDE for Java", "You are wrong. NetBeans is the best IDE."));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public synchronized String addMessage() {
            forumMessages.add(new ForumMessage(activeSession.getUser().getFirstName(), title, body));
            return "forum";
    }

    public synchronized List<ForumMessage> getforumMessages() {
        return Collections.unmodifiableList(new ArrayList<>(forumMessages));
    }
}
