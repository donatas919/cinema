package lt.viko.eif.dborkovskij.test;

import lt.viko.eif.dborkovskij.cinema.model.Customers;
import lt.viko.eif.dborkovskij.cinema.service.CustomersDAO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomersDAOTest {

    private CustomersDAO customersDAO;

    @BeforeEach
    void setUp(){
        customersDAO= new CustomersDAO();
    }

    @Test
    void custumersDataTestMethod(){

        Customers customers = customersDAO.fetchCustomersData();

        assertNotNull(customers);

        assertEquals(3,customers.getCustomerList().size());

        assertEquals("name01",customers.getCustomerList().get(0).getName());
        assertEquals("name02",customers.getCustomerList().get(1).getName());
        assertEquals("name03",customers.getCustomerList().get(2).getName());

        assertEquals(1,customers.getCustomerList().get(0).getTicketsList().size());
        assertEquals(1,customers.getCustomerList().get(1).getTicketsList().size());
        assertEquals(2,customers.getCustomerList().get(2).getTicketsList().size());

        assertEquals(1,customers.getCustomerList().get(0).getFoodList().size());
        assertEquals(1,customers.getCustomerList().get(1).getFoodList().size());
        assertEquals(2,customers.getCustomerList().get(2).getFoodList().size());

        assertEquals(9,customers.getCustomerList().get(0).getTicketsList().get(0).getTheaterRoom().getSeatList().size());

        assertEquals("Dune",customers.getCustomerList().get(0).getTicketsList().get(0).getFilm().getName());

        assertEquals("pop",customers.getCustomerList().get(2).getFoodList().get(0).getName());
        assertEquals("coke",customers.getCustomerList().get(2).getFoodList().get(1).getName());
    }
}