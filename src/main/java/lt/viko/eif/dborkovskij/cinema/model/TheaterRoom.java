package lt.viko.eif.dborkovskij.cinema.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;

/**
 * Hold the information of the room number and a list of sits it contains.
 */

@XmlType(propOrder = {"roomNumber", "seatList"})
public class TheaterRoom {
    private int roomNumber;
    private List<Seat> seatList = new ArrayList<>();

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @XmlElement(name = "seatList")
    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    @Override
    public String toString() {
        return String.format("%d\n\t\t%d",roomNumber, seatList.size());
    }
}
