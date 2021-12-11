package holdkrykke.processsaleservice.services.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import java.util.logging.Logger;

public class ProcessRequestDelegate implements JavaDelegate {

    private final static Logger LOGGER = Logger.getLogger("LOAN-REQUESTS");

    public void execute(DelegateExecution execution) throws Exception {
        System.out.println("Processing request by '" + execution.getVariable("order") + "'...");
    }
}