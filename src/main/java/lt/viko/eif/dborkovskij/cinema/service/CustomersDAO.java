package lt.viko.eif.dborkovskij.cinema.service;

import lt.viko.eif.dborkovskij.cinema.model.Customer;
import lt.viko.eif.dborkovskij.cinema.model.Customers;
import lt.viko.eif.dborkovskij.cinema.model.Food;
import lt.viko.eif.dborkovskij.cinema.model.Ticket;

public class CustomersDAO {
    public Customers fetchCustomersData() {
        Customer fist = new Customer();
        Customer second = new Customer();
        Customer third = new Customer();

        Customers customers = new Customers();

        Ticket ticket01 = new Ticket();
        Ticket ticket02 = new Ticket();

        Food pop = new Food();
        Food coke = new Food();

        return customers;
    }
}
