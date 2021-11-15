package holdkrykke.consumer.model;

import holdkrykke.consumer.consumer.LoanApplicant;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;

import java.util.HashMap;

@Scope("singleton")
@NoArgsConstructor
public class LoanContainer {
    /**
     * <applicationId, Loan>
     */
    public HashMap<String, LoanApplicant> loans = new HashMap<>();

}
