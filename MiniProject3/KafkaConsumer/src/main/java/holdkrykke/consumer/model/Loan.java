package holdkrykke.consumer.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import holdkrykke.consumer.consumer.LoanApplicant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Loan {

    private static LoanApplicant applicant;
    /**
     * loanMessage should be seen as a JSON field.
     * It can be extended with more depending on field loanStatus
     */
    private static String loanMessage;
    private boolean loanStatus;
    /**
     * ÅOP
     */
    private double APR;
    /**
     * Monthly Payment
     */
    private double payment;
    private int durationInMonths;

    static {
        String name;
        if (applicant.getFirstName() == null || applicant.getLastName() == null) {
            name = "";
        } else {
            name = applicant.getFirstName() + " " + applicant.getLastName();
        }

        loanMessage = String.format("Dear Mx %s\n " +
                "Thank you for your application to our bank. Below you will find the details of the loan.", name);

    }

}
