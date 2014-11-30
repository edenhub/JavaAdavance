package TestMail.BaseMail;

import Mail.BaseMail.SendMail;
import org.junit.Test;

import javax.mail.MessagingException;

/**
 * Created by adam on 14-12-1.
 */
public class TestSendMail {

    @Test
    public void testSendMail() throws MessagingException {
        SendMail.doSend();
    }
}
