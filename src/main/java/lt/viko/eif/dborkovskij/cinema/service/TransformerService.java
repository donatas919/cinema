package lt.viko.eif.dborkovskij.cinema.service;

import lt.viko.eif.dborkovskij.cinema.model.Customer;
import lt.viko.eif.dborkovskij.cinema.model.Customers;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Path;

public class TransformerService {
    private static JAXBContext jaxbContext;

    static {

        try {
            jaxbContext = JAXBContext.newInstance(Customers.class);
        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
    }

    public Customers transformToPojo(String fileName) {  // from XML to objects

        Customers customers = null;
        try {

            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

            Path filePath = Path.of(fileName);
            String actual = Files.readString(filePath); // reading xml string from file
            System.out.print(actual);
            StringReader reader = new StringReader(actual);
            customers = (Customers) unmarshaller.unmarshal(reader);

        } catch (JAXBException | IOException e) {
            System.out.println(e.getMessage());
        }

        return customers;
    }

    public String transformToXML(Customers customers) { // from objects to XML

        StringWriter xmlWriter = new StringWriter();

        try {
            Marshaller marshaller = jaxbContext.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(customers, xmlWriter);

            System.out.println(xmlWriter);

        } catch (JAXBException e) {
            System.out.println(e.getMessage());
        }
        return xmlWriter.toString();
    }
}
