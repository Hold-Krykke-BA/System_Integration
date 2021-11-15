package holdkrykke.consumer.consumer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class LoanApplicant {
    private long ssn, creditScore, loanAmount, currentDebt, yearlySalary, durationMonths;
    private String loanType, applicationID;
    private boolean bankAccept;
    private double ARP, monthlyPayment;
}