package lt.viko.eif.dborkovskij.cinema.model;

/**
 * Stores the name and price of food.
 */

public class Food {
    private String name;
    private float price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("%s Price: %f", name, price);
    }
}
