package lt.viko.eif.dborkovskij.cinema.model;

import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"row", "number"})
public class Seat {
    private int row;
    private int number;

    public Seat(int row, int number) {
        this.row = row;
        this.number = number;
    }

    public Seat() {
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return String.format("Row: %d Seat: %d", row, number);
    }
}
