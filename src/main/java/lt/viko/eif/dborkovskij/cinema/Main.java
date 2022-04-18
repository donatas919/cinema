package lt.viko.eif.dborkovskij.cinema;

import lt.viko.eif.dborkovskij.cinema.model.*;
import lt.viko.eif.dborkovskij.cinema.service.TransformerService;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws JAXBException, IOException {

        TransformerService transformerService = new TransformerService();

        Customers customers = transformerService.transformToPojo("customer.xml");

        System.out.println(customers); // performing transformation to object and outputting result

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 to change student 1 name: ");

        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                customers.getCustomerList().get(0).setName("Changed Name");
                break;
        }
        System.out.println();
        transformerService.transformToXML(customers); // performing transformation to XML and outputting result
    }
}
