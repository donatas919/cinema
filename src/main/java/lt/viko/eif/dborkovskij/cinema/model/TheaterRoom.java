package lt.viko.eif.dborkovskij.cinema.model;

import java.util.ArrayList;
import java.util.List;

public class TheaterRoom {
    private int roomNumber;
    private List<Seat> seatList = new ArrayList<>();

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

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
