package Mail.BaseMail;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.*;
import java.util.Properties;

/**
 * Created by adam on 14-12-1.
 */
public class SendMail {

    public static void doSend() throws MessagingException {
        String sender = "adam";
        String pass = "adamchen";
        String smtpServer = "localhost";
        String recipient = "adam@localhost";
        String subject = "邮件测试主题";
        String fileAttachement = "";
        String content = "邮件测试内容";

        Properties proper = new Properties();
        proper.put("mail.smtp.host",smtpServer);
        proper.put("mail.smtp.auth","true");
        proper.put("mail.smtp.port","25");
        proper.put("mail.transport.protocal","smtp");
        proper.put("mail.store.protocol","pop3");

        InternetAddress[] receiveAddress = new InternetAddress[1];
        receiveAddress[0] = new InternetAddress(recipient);
        SmtpAuth smtpAuth = new SmtpAuth();
        smtpAuth.setUserInfo(sender,pass);
        Session session = Session.getInstance(proper,smtpAuth);

        MimeMessage sendMess = new MimeMessage(session);
        MimeBodyPart bodyPart = new MimeBodyPart();
        MimeMultipart multipart = new MimeMultipart();

        bodyPart.setContent(content,"text/plain; charset=UTF-8");
        multipart.addBodyPart(bodyPart);

        if(fileAttachement!=null && fileAttachement!=""){
            DataSource dataSource = new FileDataSource(fileAttachement);
            String fileName = dataSource.getName();
            bodyPart = new MimeBodyPart();
            bodyPart.setDataHandler(new DataHandler(dataSource));
            bodyPart.setFileName(fileName);
            multipart.addBodyPart(bodyPart);
        }

        sendMess.setSubject(subject);
        sendMess.setContent(multipart);

        sendMess.setFrom(new InternetAddress(sender));
        sendMess.setRecipients(Message.RecipientType.TO,receiveAddress);
        Transport.send(sendMess);

        System.out.println("发送成功");
    }
}
