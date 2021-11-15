package holdkrykke.consumer.consumer;

import holdkrykke.consumer.config.KafkaConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;


@Service
public class ConsumerService {
    private final Random rand = new Random();

    @Autowired
    private ApplicationContext context;

    @KafkaListener(topics = "request-topic", groupId = "requestreplygroup")
    @SendTo
    public LoanApplicant listen(LoanApplicant request) throws InterruptedException {
        System.out.println("Consumer1 request\n" + request);

        var loanStatus = acceptedOrDeclined(request);
        request.setBankAccept(loanStatus);
        request.setApplicationID(generateApplicationID());

        if (loanStatus) {
            request.setLoanMessage(String.format("Dear Mx %s\n " +
                    "Thank you for your application to our bank. We are happy to announce that your loan application has gone through successfully." +
                    "Below you will find the details of the loan.", request.getLastName()));
            request.setARP(calculateARP(request));
            request.setDurationMonths(calculateDurationMonths(request));
            request.setMonthlyPayment(calculateMonthlyPayment(request));
        } else {
            request.setLoanMessage(String.format("Dear Mx %s\n " +
                    "Thank you for your application to our bank. Unfortunately we cannot grant you a loan at this time.", request.getLastName()));
        }

        System.out.println("Consumer1 response\n" + request);

        //Save (update) all loans
        HashMap<String, LoanApplicant> loanContainer = (HashMap<String, LoanApplicant>) context.getBean("loans");
        loanContainer.put(request.getApplicationID(), request);

        //Return loan
        return request;
    }

//    @KafkaListener(topics = "request-topic", groupId = "requestreplygroup2")
//    @SendTo
//    public LoanApplicant listen2(LoanApplicant request) throws InterruptedException {
//        System.out.println("Consumer2\n" +request);
//
//        request.setBankAccept(acceptedOrDeclined(request));
//        request.setARP(calculateARP(request));
//        request.setDurationMonths(calculateDurationMonths(request));
//        request.setMonthlyPayment(calculateMonthlyPayment(request));
//        request.setApplicationID(generateApplicationID());
//        System.out.println("Consumer2 response\n" +request);
//        return request;
//    }

    private boolean acceptedOrDeclined(LoanApplicant loanapplicant) {
        return loanapplicant.getCreditScore() > 550 && loanapplicant.getYearlySalary() > 100000;
    }

    private double calculateARP(LoanApplicant loanapplicant) {
        int max = 15;
        int min = 1;
        if (loanapplicant.getYearlySalary() - loanapplicant.getCurrentDebt() > 0) max = 10;
        if (loanapplicant.getYearlySalary() - loanapplicant.getCurrentDebt() > 200000) max = 5;
        if (loanapplicant.getYearlySalary() - loanapplicant.getCurrentDebt() > 500000) max = 3;
        if (loanapplicant.getYearlySalary() - loanapplicant.getCurrentDebt() > 1000000) max = 2;
        return (rand.nextInt((max - min) + 1) + min) / 100.00;
    }

    private long calculateDurationMonths(LoanApplicant loanapplicant) {
        if (loanapplicant.getLoanType().equals("HOME")) return (long) 360;
        if (loanapplicant.getLoanType().equals("VEHICLE") || loanapplicant.getLoanType().equals("INVESTMENT"))
            return (long) 84;
        if (loanapplicant.getLoanAmount() > 500000) return (long) 120;
        return (long) 60;
    }

    private double calculateMonthlyPayment(LoanApplicant loanapplicant) {
        // Calculating using: G=y⋅1−(1+r)^n/r
        double rightSideOfEquation = (1 - (Math.pow(1 + loanapplicant.getARP(), -loanapplicant.getDurationMonths()))) / loanapplicant.getARP();
        double db = loanapplicant.getLoanAmount() / rightSideOfEquation;
        BigDecimal dc = new BigDecimal(db);
        dc = dc.round(new MathContext(2));
        return dc.doubleValue();
    }

    private String generateApplicationID() {
        UUID uuid = UUID.randomUUID();
        return "HAT-" + uuid + "-HATTER";
    }
}