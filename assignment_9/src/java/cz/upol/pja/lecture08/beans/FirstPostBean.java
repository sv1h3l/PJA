package cz.upol.pja.lecture08.beans;

import cz.upol.pja.lecture08.models.Discussion;
import cz.upol.pja.lecture08.models.Post;
import cz.upol.pja.lecture08.models.User;
import jakarta.ejb.MessageDriven;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import java.util.Date;
import java.util.List;
import java.util.Random;

@MessageDriven(mappedName = "jms/topic")
public class FirstPostBean implements MessageListener {

    private EntityManager entityManager = Persistence.createEntityManagerFactory("lecture04PU").createEntityManager();

    @Override
    public void onMessage(Message message) {
        try {
            Discussion discussion = message.getBody(Discussion.class);
            createFirstPost(discussion);
        } catch (JMSException e) {
            e.printStackTrace();
        }

    }

    private void createFirstPost(Discussion discussion) {
        List<User> users = (List<User>) entityManager.createQuery("select user from User user").getResultList();

        if (!users.isEmpty()) {
            User randomUser;
            Random random = new Random();
            int randomIndex = random.nextInt(users.size());
            randomUser = users.get(randomIndex);
            Post post = new Post(discussion, "První!", randomUser.getFirstName(), new Date());
            discussion.addPost(post);

            entityManager.getTransaction().begin();
            entityManager.persist(discussion);
            entityManager.persist(post);
            entityManager.getTransaction().commit();
        }
    }

}
