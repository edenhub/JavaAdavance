package Mail.James.Base;

import org.apache.mailet.Mail;
import org.apache.mailet.base.GenericMailet;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

/**
 * Created by lab on 14-12-1.
 */
public class HelloMailet extends GenericMailet {
    @Override
    public void service(Mail mail) throws MessagingException {
        MimeMessage mimeMessage  = mail.getMessage();
        String subject = mimeMessage.getSubject();
        mimeMessage.setSubject("Hello : "+subject);

        System.out.println("Dealing Hello from : "+mimeMessage.getMessageID());
    }
}
