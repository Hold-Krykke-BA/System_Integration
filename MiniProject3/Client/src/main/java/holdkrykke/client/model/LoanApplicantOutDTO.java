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
public class LoanApplicantOutDTO {
    private long ssn, loanAmount, durationMonths, monthlyPayment;
    private String loanType, applicationID, ARP;
    private boolean bankAccept;
}