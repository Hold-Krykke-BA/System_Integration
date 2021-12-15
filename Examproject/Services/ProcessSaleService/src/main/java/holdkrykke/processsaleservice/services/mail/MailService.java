package holdkrykke.processsaleservice.services.mail;

import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.models.OrderItem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class MailService {
    private static final Logger logger = LoggerFactory.getLogger(MailService.class);
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String to, String subject, String text) throws MessagingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
        helper.setFrom("holdkrykke.ba.si@gmail.com");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(text,true);
        javaMailSender.send(mimeMessage);
        logger.info("Sending mail to [{}]", to);
    }

    public String createBody(Order order){
        String items = "";
        for(OrderItem item : order.getOrderItems()){
            String authors = "";
            for (String author : item.getAuthors()){
                authors = authors + author + ", ";
            }
            authors = authors.substring(0,authors.length()-2);
            String temp =  "<b>Title: </b>" + item.getTitle() + "<br>"
                    + "<b>Authors: </b>" + authors + "<br>"
                    + "<b>Format: </b>" + item.getType() + "<br>"
                    + "<b>Price: </b>" + item.getPrice() + "<br>"
                    + "-----<br>";
            items = items + temp;

        }
        String mailText = "<h1>Dear " + order.getCustomerFullName() + "</h1>"
                + "<h2>Your order status for, " + order.getOrderNumber() + " has changed to " + order.getOrderStatus() + "</h2>"
                + "<h3>Delivery to:</h3>"
                + "<b>Customer</b>: " + order.getCustomerFullName() + "<br>"
                + "<b>Address: </b>" + order.getCustomerAddress() + "<br>"
                + "<b>Mail: </b>" + order.getCustomerMail()
                + "<h3>Order: </h3>"
                + items
                + "<h3>Total price: " + order.getTotalPrice() + "<h3>";
        return mailText;

    }
}
