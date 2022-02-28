package lt.viko.eif.dborkovskij.cinema;

import lt.viko.eif.dborkovskij.cinema.model.*;

public class Main {
    public static void main(String[] args) {
//        room
        TheaterRoom room01 = new TheaterRoom();
        room01.setRoomNumber(1);

//        room seats
        for (int i = 0; i<=10; i++){
            for(int j = 0; j<=10; j++){
                Seat seat = new Seat(i,j);
                room01.getSeatList().add(seat);
            }
        }

//        film
        Film film01 = new Film();
        film01.setName("Titanic");
        film01.setRating((float)8.1);
        film01.setAgeRestriction(13);

//        ticket
        Ticket ticket01 = new Ticket();
        ticket01.setPrice((float)9.99);
        ticket01.setFilm(film01);
        ticket01.setTheaterRoom(room01);
        ticket01.setSeat(room01.getSeatList().get(1));
        ticket01.setDate(1);

//        food
        Food pop = new Food();
        pop.setName("Pop");
        pop.setPrice((float)4.99);

        Food pepsi = new Food();
        pepsi.setName("pepsi");
        pepsi.setPrice((float)2.99);

//        Customer
        Customer customer01 = new Customer();
        customer01.setName("Donat Borkovskij");
        customer01.setAge(21);
        customer01.setMoneyBalance((float)999999999.99);
        customer01.getFoodList().add(pop);
        customer01.getFoodList().add(pepsi);
        customer01.getTicketsList().add(ticket01);

        System.out.println(customer01);

    }
}
