package lt.viko.eif.dborkovskij.test;

import lt.viko.eif.dborkovskij.cinema.model.Customers;
import lt.viko.eif.dborkovskij.cinema.service.CustomersDAO;
import lt.viko.eif.dborkovskij.cinema.service.TransformerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransformerServiceTest {

    private TransformerService transformerService;

    private CustomersDAO customersDAO;

    @BeforeEach
    void setUp(){
        transformerService = new TransformerService();
    }

    @Test
    void transformToPojoTest(){

        Customers customers = transformerService.transformToPojo("customer.xml");

        assertNotNull(customers);

        assertEquals(3, customers.getCustomerList().size());
    }

    @Test
    void transformtoXMLTest(){

        customersDAO = new CustomersDAO();

        String customersXMLDocument = transformerService.transformToXML(customersDAO.fetchCustomersData());

        assertNotNull(customersXMLDocument);

        assertTrue(customersXMLDocument.contains("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"));

        assertTrue(customersXMLDocument.contains("<customers>"));
        assertTrue(customersXMLDocument.contains("<customer>"));
        assertTrue(customersXMLDocument.contains("<name>"));
        assertTrue(customersXMLDocument.contains("<age>"));
        assertTrue(customersXMLDocument.contains("<ticket>"));
        assertTrue(customersXMLDocument.contains("<food>"));
    }
}