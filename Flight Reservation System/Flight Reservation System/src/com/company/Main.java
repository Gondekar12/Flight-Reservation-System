package com.company;


import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String args[]) {

        Flight flight1 = new Flight(1023,"Jet Airway","Nagpur","Delhi",100,90);

        Flight flight2 = new Flight(1204,"British Air","Nagpur","London",300,200);

        Flight flight3 = new Flight(1266,"Spicejet","Nagpur","Dubai",200,150);

        List flights =new ArrayList();
        flights.add(flight1);
        flights.add(flight2);
        flights.add(flight3);

        Passenger passenger1 = new Passenger("Sumedh",5555,"sumedh@gmail.com","khau galli","Nagpur","Maharastra");
        Passenger passenger2 = new Passenger("Shreyas",4444,"shreyas@gmail.com","medical street","Nagpur","Maharastra");

        List passengers = new ArrayList();
        passengers.add(passenger1);
        passengers.add(passenger2);


        Ticket t1 = new TouristTicket(101, 35, 2000, "Hydrabad", "location1");
        Ticket t2 = new RegularTicket(201, 36, 1000, "food");


        printTicketDetails(t1);
        printTicketDetails(t2);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}





