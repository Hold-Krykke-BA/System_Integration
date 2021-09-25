package holdkrykke.mp1.soap;

import holdkrykke.mp1.calc.client.CalculatorLocator;
import holdkrykke.mp1.calc.client.CalculatorSoap_PortType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Scanner;

@SpringBootApplication
public class SoapApplication {

    public static void main(String[] args){
        try {
            CalculatorLocator locator = new CalculatorLocator();
            CalculatorSoap_PortType service = locator.getCalculatorSoap();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Free and shitty SOAP School calculator");
            System.out.println("Choose operator:\n1) Add\n2) Subtract\n3) Multiply\n4) Integer division\n5) Exit");

            int operatorChoice = Integer.parseInt(scanner.nextLine());
            int first = 0;
            int second = 0;
            int res = 0;

            switch(operatorChoice) {
                case 1:
                    System.out.println("Enter first number in calculation");
                    first = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter second number in calculation");
                    second = Integer.parseInt(scanner.nextLine());
                    res = service.add(first, second);
                    System.out.println("Result is: " + res);
                    break;
                case 2:
                    System.out.println("Enter first number in calculation");
                    first = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter second number in calculation");
                    second = Integer.parseInt(scanner.nextLine());
                    res = service.subtract(first, second);
                    System.out.println("Result is: " + res);
                    break;
                case 3:
                    System.out.println("Enter first number in calculation");
                    first = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter second number in calculation");
                    second = Integer.parseInt(scanner.nextLine());
                    res = service.multiply(first, second);
                    System.out.println("Result is: " + res);
                    break;
                case 4:
                    System.out.println("Enter first number in calculation");
                    first = Integer.parseInt(scanner.nextLine());
                    System.out.println("Enter second number in calculation");
                    second = Integer.parseInt(scanner.nextLine());
                    res = service.divide(first, second);
                    System.out.println("Result is: " + res);
                    break;
                default:
                    System.out.println("Exiting");
                    System.exit(0);
            }
        }
        catch (ServiceException | RemoteException ex) {
        }
    }
}
