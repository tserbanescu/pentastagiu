package com.serbanescu.aeroport;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        AirportUI uiAirport = new AirportUI(reader);
        Flight flight = new Flight("CT10", "Cuba", new Date("23/12/2019"), 10, 25);
        uiAirport.getFlights().add(flight);
        flight = new Flight("BV13", "Malta", new Date("23/05/2019"), 5, 37);
        uiAirport.getFlights().add(flight);
        User user = new User("Teodor", "Serbanescu", new Date("25/08/1989"));
        uiAirport.getUsers().add(user);
        uiAirport.start();

    }
}
