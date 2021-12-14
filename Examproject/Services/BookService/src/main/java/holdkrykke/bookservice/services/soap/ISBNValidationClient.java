package holdkrykke.bookservice.services.soap;

import holdkrykke.Exceptions.ISBNValidationException;
import holdkrykke.bookservice.services.soap.consumingwebservice.ISBNServiceLocator;
import holdkrykke.bookservice.services.soap.consumingwebservice.ISBNServiceSoapType;
import org.springframework.stereotype.Service;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * ISBN Validation Client of the ISBN Validation SOAP service.
 */
@Service
public class ISBNValidationClient {

    private static ISBNServiceLocator locator;
    private static ISBNServiceSoapType service;

    static {
        boolean success = initialize();
        if (success) System.out.println("Succesfully instantiated the ISBN Validation Client!");
    }

    private static boolean initialize() {
        System.out.println("Attempting to instantiate the ISBN Validation Client.");
        locator = new ISBNServiceLocator();
        try {
            service = locator.getISBNServiceSoap();
            return true;
        } catch (ServiceException e) {
            //throw new ISBNValidationException("Could not instantiate ISBN SOAP service", e);
            System.out.println("Unable to instantiate ISBN SOAP service:\n");
            e.printStackTrace();
            return false;
        }
    }


    /**
     * Determines the ISBN standard by length and validates it by a remote SOAP service.
     * <p>
     * https://webservices.daehosting.com/services/ISBNService.wso
     * <p>
     * Dashes are accepted by the service.
     * <p>
     * Example ISBN10: 87-01-32671-6
     * <p>
     * Example ISBN13: 9788701326513
     *
     * @param ISBN The ISBN to validate
     * @return true if valid, false if not
     * @throws ISBNValidationException If string does not live up to ISBN rules
     */
    public boolean validateISBN(String ISBN) throws ISBNValidationException {
        String ISBNNoDash = ISBN.replace("-", "");
        try {
            if (ISBNNoDash.length() == 13) {
                //Rule: 13 digits number
                return service.isValidISBN13(ISBN);

            } else if (ISBNNoDash.length() == 10 || ISBNNoDash.length() == 9) {
                //Rule: 10 digits number or 8 digits and an X.
                return service.isValidISBN10(ISBN);
            }
        } catch (RemoteException e) {
            throw new ISBNValidationException("Failed to establish remote connection.", e);
        }
        throw new ISBNValidationException(String.format("ISBN input \"%s\" is not a valid ISBN format", ISBN));
    }

}
