package lt.viko.eif.dborkovskij.cinema.service;

import lt.viko.eif.dborkovskij.cinema.model.*;

public class CustomersDAO {
    public Customers fetchCustomersData() {
        Customer first = new Customer();
        Customer second = new Customer();
        Customer third = new Customer();

        Customers customers = new Customers();

        Food pop = new Food();
        pop.setPrice((float)4.99);
        pop.setName("pop");

        Food coke = new Food();
        coke.setPrice((float)3.99);
        coke.setName("coke");

        Film film = new Film();
        film.setName("Dune");
        film.setRating((float)8.2);
        film.setAgeRestriction(13);

        TheaterRoom theaterRoom = new TheaterRoom();
        theaterRoom.setRoomNumber(1);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j <3 ; j++){
                theaterRoom.getSeatList().add(new Seat(i,j));
            }
        }

        Ticket ticket01 = new Ticket();
        ticket01.setPrice((float)4.99);
        ticket01.setFilm(film);
        ticket01.setTheaterRoom(theaterRoom);
        ticket01.setSeat(new Seat(1,1));
        ticket01.setDate(1);

        Ticket ticket02 = new Ticket();
        ticket02.setPrice((float)6.99);
        ticket02.setFilm(film);
        ticket02.setTheaterRoom(theaterRoom);
        ticket02.setSeat(new Seat(2,2));
        ticket02.setDate(2);

        first.setName("name01");
        first.setAge(18);
        first.setMoneyBalance((float)98.50);
        first.getTicketsList().add(ticket01);
        first.getFoodList().add(pop);

        second.setName("name02");
        second.setAge(18);
        second.setMoneyBalance((float)50.32);
        second.getTicketsList().add(ticket02);
        second.getFoodList().add(coke);

        third.setName("name03");
        third.setAge(18);
        third.setMoneyBalance((float)30);
        third.getTicketsList().add(ticket01);
        third.getTicketsList().add(ticket02);
        third.getFoodList().add(pop);
        third.getFoodList().add(coke);

        customers.getCustomerList().add(first);
        customers.getCustomerList().add(second);
        customers.getCustomerList().add(third);

        return customers;
    }
}
