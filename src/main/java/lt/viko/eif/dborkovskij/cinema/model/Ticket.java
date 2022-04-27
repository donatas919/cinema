package lt.viko.eif.dborkovskij.cinema.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Creates a ticket object that hold the information regarding the movie, where and when it will be,
 * as well as the price of the ticket.
 */

@XmlType(propOrder = {"price", "film", "theaterRoom", "seat", "date"})
public class Ticket {
    private float price;
    private Film film;
    private TheaterRoom theaterRoom;
    private Seat seat;
    private int date;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @XmlElement(name = "film")
    public Film getFilm() {
       return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @XmlElement(name = "theaterRoom")
    public TheaterRoom getTheaterRoom() {
        return theaterRoom;
    }

    public void setTheaterRoom(TheaterRoom theaterRoom) {
        this.theaterRoom = theaterRoom;
    }

    @XmlElement(name = "seat")
    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return String.format("\tPrice: %f\n\t\t\tFilm: %s\n\t\t\tTheater room: %d\n\t\t\t%s\n\t\t\tDate: %d", price, film, theaterRoom.getRoomNumber(), seat, date);
    }
}
