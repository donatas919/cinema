package lt.viko.eif.dborkovskij.cinema.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * This object contains a list of "Customer" objects.
 * Uses overridden method toString() to print out the contents of the object in a list.
 */

@XmlRootElement
public class Customers {
    private List<Customer> customerList = new ArrayList<>();

    public List<Customer> getCustomerList() {
        return customerList;
    }

    @XmlElement(name = "customer")
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    private String printCustomers(){
        String result = "";
        for (Customer cust : getCustomerList()) {
            result += cust;
        }
        return result;
    }

    @Override
    public String toString() {
        return String.format(printCustomers());
    }
}
