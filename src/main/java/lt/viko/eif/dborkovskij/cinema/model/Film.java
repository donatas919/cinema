package lt.viko.eif.dborkovskij.cinema.model;

import javax.xml.bind.annotation.XmlType;

/**
 * Stores the information about the film.
 */

@XmlType(propOrder = {"name", "rating", "ageRestriction"})
public class Film {
    private String name;
    private float rating;
    private int ageRestriction;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return rating;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    @Override
    public String toString() {
        return String.format("%s\n\t\t\tScore: %f\n\t\t\tAge Restriction: %d+", name, rating, ageRestriction);
    }
}
