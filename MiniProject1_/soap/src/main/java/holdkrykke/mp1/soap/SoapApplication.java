package holdkrykke.mp1.soap;

import holdkrykke.mp1.client.GeoIPServiceLocator;
import holdkrykke.mp1.client.GeoIPServiceSoap_PortType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SoapApplication {

    public static void main(String[] args){
        String country;
        String ip = "2.106.16.17";
        try {
            GeoIPServiceLocator locator	= new GeoIPServiceLocator();
            GeoIPServiceSoap_PortType service =	locator.getGeoIPServiceSoap();

            country	= service.getIpLocation(ip);
            System.out.println(country);
        }
        catch (javax.xml.rpc.ServiceException ex) {
            ex.printStackTrace();
        }
        catch (java.rmi.RemoteException	ex) {
            ex.printStackTrace();
        }
    }
}
