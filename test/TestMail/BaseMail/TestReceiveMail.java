package TestMail.BaseMail;

import Mail.BaseMail.ReceiveMail;
import org.junit.Test;

import javax.mail.MessagingException;
import java.io.IOException;

/**
 * Created by adam on 14-12-1.
 */
public class TestReceiveMail {

    @Test
    public void testReceiveMail() throws MessagingException, IOException {
        ReceiveMail.receiveMail();
    }
}
