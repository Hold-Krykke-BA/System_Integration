package holdkrykke.mp1.soap;

import holdkrykke.mp1.lib.client.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Scanner;

@SpringBootApplication
public class Soap2Application {

    public static void main(String[] args){
        try {

            WSCitationImplServiceLocator locator = new WSCitationImplServiceLocator();
            WSCitationImpl service = locator.getWSCitationImplPort();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Free and shitty SOAP School Scientific Paper Lookup");
            System.out.println("Choose search term:");
            String searchTerm = scanner.nextLine();

            ResponseWrapper response =  service.searchPublications(searchTerm, "", "", "", "", "true", "");
            for (Result res : response.getResultList()){
                if (res.getDoi() != null) System.out.println("DOI: " + res.getDoi());
                if (res.getCitationId() != null) System.out.println("Citation ID: " + res.getCitationId());
                if (res.getTitle() != null) System.out.println("Title: " + res.getTitle());
                if (res.getJournalTitle() != null) System.out.println("Journal Title: " + res.getJournalTitle());
                if (res.getPubYear() != null) System.out.println("Publication Year: " + res.getPubYear());
                System.out.println("");
            }
        }
        catch (ServiceException | RemoteException ex) {
        }
    }
}
