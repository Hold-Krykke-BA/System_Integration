package holdkrykke.processsaleservice.services.mail;

import holdkrykke.processsaleservice.models.Order;
import holdkrykke.processsaleservice.models.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class MailService {
    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(String to, String subject, String text) throws MessagingException {
       // SimpleMailMessage message = new SimpleMailMessage();
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "utf-8");
        helper.setFrom("holdkrykke.ba.si@gmail.com");
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(text,true);
        javaMailSender.send(mimeMessage);
    }

    public String createBody(Order order){
        String items = "";
        for(OrderItem item : order.getOrderItems()){
            String temp =  "<b>Title</b>" + item.getTitle() + "<br>"
                    + "<b>Authors</b>" + item.getAuthors() + "<br>"
                    + "<b>Price</b>" + item.getPrice() + "<br>";
            items = items + temp;

        }
        String mailText = "<h1>Dear " + order.getCustomerFullName() + "</h1>"
                + "<h2>Your order status for, " + order.getOrderNumber() + " has changed to " + order.getOrderStatus() + "</h2>"
                + "<h3>Delivery to:</h3>"
                + "<b>Customer</b>: " + order.getCustomerFullName() + "<br>"
                + "<b>Address: </b>" + order.getCustomerAddress() + "<br>"
                + "<b>Mail: </b>" + order.getCustomerMail()
                + "<h3>Order: </h3>"
                + items + "<br>"
                + "<b>Total price</b>: " + order.getTotalPrice() + "<br>";
        return mailText;

    }


}

//    public void sendSimpleMessage(String to, String subject, String text) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("holdkrykke.ba.si@gmail.com");
//        message.setTo(to);
//        message.setSubject(subject);
//        message.setText(text);
//        emailSender.send(message);