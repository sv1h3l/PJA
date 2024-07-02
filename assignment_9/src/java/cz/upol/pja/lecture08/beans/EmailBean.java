package cz.upol.pja.lecture08.beans;

import cz.upol.pja.lecture08.models.Discussion;
import cz.upol.pja.lecture08.models.User;
import jakarta.annotation.Resource;
import jakarta.ejb.MessageDriven;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;
import java.util.List;

@MessageDriven(mappedName = "jms/topic")
public class EmailBean implements MessageListener {

    @Resource(lookup = "mail/lecture08")
    private Session session;

    private EntityManager entityManager = Persistence.createEntityManagerFactory("lecture04PU").createEntityManager();

    @Override
    public void onMessage(Message message) {
        try {
            Discussion discussion = message.getBody(Discussion.class);
            sendEmail(discussion);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendEmail(Discussion discussion) throws Exception {
        session.setDebugOut(System.out);
        session.setDebug(true);

        List<User> users = (List<User>) entityManager.createQuery("select user from User user").getResultList();

        for (User user : users) {
            MimeMessage message = new MimeMessage(session);
            message.setRecipient(jakarta.mail.Message.RecipientType.TO, new InternetAddress(user.getFirstName()));
            message.setSubject("New Discussion");
            message.setSender(new InternetAddress("noreply@example.com"));
            message.setText("New discussion added. Its topic is: " + discussion.getTopic());
            Transport.send(message);
        }
    }
}
