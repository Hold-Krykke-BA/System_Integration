package holdkrykke.mp1.soap;

import holdkrykke.mp1.lib.client.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

@SpringBootApplication
public class Soap2Application {

    public static void main(String[] args){
        try {

            WSCitationImplServiceLocator locator = new WSCitationImplServiceLocator();
            WSCitationImpl service = locator.getWSCitationImplPort();

            ResponseWrapper response =  service.searchPublications("HER2", "lite", "*", "5", "CITED desc", "true", "ac@ebi.ac.uk");
            for (Result res : response.getResultList()){
                System.out.println(res.getDoi());
            }


        }
        catch (ServiceException | RemoteException ex) {
        }
    }
}
