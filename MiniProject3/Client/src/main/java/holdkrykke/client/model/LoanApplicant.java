package holdkrykke.client.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanApplicant {
    private long ssn, creditScore, loanAmount, currentDebt, yearlySalary;
    private String loanType;
}
