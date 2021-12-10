package holdkrykke.registernewbookservice.services.soap;

import holdkrykke.Exceptions.ISBNValidationException;
import holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceLocator;
import holdkrykke.registernewbookservice.services.soap.consumingwebservice.ISBNServiceSoapType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Singleton implementation of the ISBN Validation Client of the ISBN Validation SOAP service.
 */
public class ISBNValidationClient {

    private static ISBNValidationClient instance = new ISBNValidationClient();
    private static ISBNServiceLocator locator;
    private static ISBNServiceSoapType service;

    private ISBNValidationClient() {
        System.out.println("Attempting to instantiate the ISBN Validation Client.");
        locator = new ISBNServiceLocator();
        try {
            service = locator.getISBNServiceSoap();
        } catch (ServiceException e) {
            //throw new ISBNValidationException("Could not instantiate ISBN SOAP service", e);
            System.out.println("Unable to instantiate ISBN SOAP service:\n");
            e.printStackTrace();
            return;
        }
        System.out.println("Succesfully instantiated the ISBN Validation Client!");
    }

    public static ISBNValidationClient getInstance() {
        return instance;
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
        throw new ISBNValidationException(String.format("ISBN input %s is not a valid ISBN format", ISBN));
    }

}
