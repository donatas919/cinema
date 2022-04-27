package lt.viko.eif.dborkovskij.cinema.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Creates the object "Customer "and stores the information about that object.
 * Uses overridden method toString() to print out the contents of the object in a list.
 */

@XmlType(propOrder = {"name", "age", "moneyBalance", "ticketsList", "foodList"})
public class Customer {
    private String name;
    private int age;
    private float moneyBalance;
    private List<Ticket> ticketsList = new ArrayList<>();
    private List<Food> foodList = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getMoneyBalance() {
        return moneyBalance;
    }

    public void setMoneyBalance(float moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    @XmlElement(name = "ticket")
    public List<Ticket> getTicketsList() {
        return ticketsList;
    }

    public void setTicketsList(List<Ticket> ticketsList) {
        this.ticketsList = ticketsList;
    }

    @XmlElement(name = "food")
    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    private String ticketListToSting(){
        StringBuilder S = new StringBuilder();
        for (Ticket var:
             ticketsList) {
            S.append(String.format("Ticket%s:\n\t\t%s\n\t\t",ticketsList.indexOf(var)+1, var.toString()));
        }
        return S.toString();
    }

    private String foodListToString(){
        StringBuilder S = new StringBuilder();
        for (Food var:
             foodList) {
            S.append(String.format("%s\n\t\t", var.toString()));
        }
        return S.toString();
    }
    
    @Override
    public String toString() {
        return String.format("%s:\n\tAge: %d\n\tMoney balance: %f\n\tTickets:\n\t\t%s\n\tFood:\n\t\t%s", name, age, moneyBalance, ticketListToSting(), foodListToString());
    }
}
