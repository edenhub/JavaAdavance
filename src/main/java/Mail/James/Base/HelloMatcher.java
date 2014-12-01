package Mail.James.Base;

import org.apache.mailet.MailAddress;
import org.apache.mailet.base.GenericRecipientMatcher;

import javax.mail.MessagingException;

/**
 * Created by lab on 14-12-1.
 */
public class HelloMatcher extends GenericRecipientMatcher {
    @Override
    public boolean matchRecipient(MailAddress mailAddress) throws MessagingException {
        String user = mailAddress.getUser();

        if (user.startsWith("hello"))
            return true;
        else
            return false;
    }
}
