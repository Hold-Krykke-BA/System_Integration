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
    private long ssn, loanAmount, durationMonths;
    private String loanType, applicationID;
    private boolean bankAccept;
    private double ARP, monthlyPayment;

    public LoanApplicantOutDTO(LoanApplicant applicant){
        this.ssn = applicant.getSsn();
        this.loanAmount = applicant.getLoanAmount();
        this.durationMonths = applicant.getDurationMonths();
        this.loanType = applicant.getLoanType();
        this.applicationID = applicant.getApplicationID();
        this.bankAccept = applicant.isBankAccept();
        this.ARP = applicant.getARP();
        this.monthlyPayment = applicant.getMonthlyPayment();
    }
}