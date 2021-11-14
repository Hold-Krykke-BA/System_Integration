package holdkrykke.consumer.consumer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanApplicant {
    private long ssn, creditScore, loanAmount, currentDebt, yearlySalary;
    private String loanType, applicationID;
}