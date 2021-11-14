package holdkrykke.client.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class LoanApplicant {
    private long ssn, creditScore, loanAmount, currentDebt, yearlySalary;
    private String loanType, applicationID;
}
