package com.serbanescu.aeroport;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AirportUI {

    private final ArrayList<Flight> flights = new ArrayList<>();
    private final ArrayList<User> users = new ArrayList<>();
    private final Scanner reader;
    CommandLineReader r = new CommandLineReader();

    public AirportUI(Scanner reader) {
        this.reader = reader;
    }

    public ArrayList<Flight> getFlights() {
        return flights;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void start() {
        airportPanel();
    }

    private void airportPanel() {
        while (true) {

            startStatements();

            String command = r.readString();
            command = cleanString(command);

            switch (command) {

                case "1":
                    viewOptions();
                    break;
                case "2":
                    commandOptions();
                    break;
                default:
                    break;

            }
        }
    }

    private void viewOptions() {
        viewStatements();

        String command = r.readString();
        command = cleanString(command);

        switch (command) {
            case "1":
                viewFlights();
                break;
            case "2":
                viewPlaneCapacity();
                break;
            case "3":
                viewUsers();
                break;
            case "4": {
                System.out.println("Pentru ce client?");
                String lastName = r.readString();
                User u = findUserByLastName(lastName);
                viewUserFlights(u);
                break;
            }
            case "5": {
                System.out.println("Pentru ce client?");
                String lastName = r.readString();
                User u = findUserByLastName(lastName);
                viewUserDestinations(u);
                break;
            }
            case "6": {
                System.out.println("Pentru ce client?");
                String lastName = r.readString();
                User u = findUserByLastName(lastName);
                viewUserFutureFlights(u);
                break;
            }
            default:
                break;
        }

    }

    private void viewFlights() {
        for (Flight flight : flights) {
            System.out.println(flight.getFlightNumber());
        }
    }

    private void viewPlaneCapacity() {
        for (Flight flight : flights) {
            System.out.println(flight.toString());
        }
    }

    private void viewUsers() {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }

    private void viewUserFlights(User user) {
        for (Flight flight : user.getFlights()) {
            System.out.println(flight.toString());
        }
    }

    private void viewUserDestinations(User user) {
        for (Flight flight : user.getDestinations()) {
            System.out.println(flight.getDestionation());
        }

    }

    private void viewUserFutureFlights(User user) {
        Date now = new Date();
        for (Flight flight : user.getFlights()) {
            if (flight.getDepartureDate().after(now)) {
                System.out.println(flight.toString());
            }
        }
    }

    private void commandOptions() {
        commandStatements();

        String command = r.readString();
        command = cleanString(command);

        switch (command) {
            case "1":
                addOptions();
                break;
            case "2":
                removeOptions();
                break;
            case "3":
                updateOptions();
                break;
            default:
                break;
        }

    }


    private void addOptions() {
        addOptionStatements();

        String command = r.readString();
        command = cleanString(command);

        switch (command) {
            case "1":
                addUser();
                break;
            case "2":
                addFlight();
                break;
            case "3":
                addPassengerToFlight();
                break;
            default:
                break;
        }
    }

    private void addPassengerToFlight() {
        System.out.println("Numarul zborului: ");
        String flightNumber = r.readString();
        Flight flight = returnFlightByNumber(flightNumber);
        String lastName = r.readString();
        User user = findUserByLastName(lastName);
        if (flight != null && user != null) {
            if (flight.getMaxUserCapacity() < (flight.getPassengers().size() + 1)) {
                flight.getPassengers().add(user);
                user.getFlights().add(flight);
                System.out.println("Userul a fost adaugat!");
            } else {
                System.out.println("Zbor plin!");
            }
        }
    }

    private Flight returnFlightByNumber(String flightNumber) {
        for (Flight f : flights) {
            if (f.getFlightNumber().equals(flightNumber)) {
                return f;
            }
        }
        System.out.println("Flight not found!");
        return null;
    }

    private User findUserByLastName(String lastName) {
        for (User u : users) {
            if (u.getLastName().equals(lastName)) {
                return u;
            }
        }
        System.out.println("User not found!");
        return null;
    }

    private void addUser() {
        String firstName = r.readString();
        String lastName = r.readString();
        Date dateOfBirth = r.readDate();

        if (dateOfBirth != null) {
            User user = new User(firstName, lastName, dateOfBirth);
            users.add(user);
        } else {
            System.out.println("Could not create user!");
        }

    }

    private void addFlight() {
        String flightNumber = r.readString();
        String destination = r.readString();
        Date departureDate = r.readDate();
        int flightDuration = r.readInt();
        int maxUserCapacity = r.readInt();

        if (departureDate != null) {
            Flight flight = new Flight(flightNumber, destination, departureDate, flightDuration, maxUserCapacity);
            flights.add(flight);
        } else {
            System.out.println("COuld not create flight!");
        }
    }

    private void removeOptions() {
        removeOptionStatements();

        String command = r.readString();
        command = cleanString(command);

        switch (command) {
            case "1":
                removeUser();
                break;
            case "2":
                removeFlight();
                break;
            case "3":
                removeUserFromFlight();
                break;
            default:
                break;
        }
    }

    private void removeUser() {
        System.out.println("Numele calatorului: ");
        String lastName = r.readString();
        User user = findUserByLastName(lastName);
        if (user != null) {
            if (users.remove(user)) {
                System.out.println("Utilizator sters!");
            }
        }
    }

    private void removeFlight() {
        System.out.println("Numarul zborului: ");
        String flightNumber = r.readString();
        Flight flight = returnFlightByNumber(flightNumber);
        if (flight != null) {
            if (flights.remove(flight)) {
                System.out.println("Zbor sters");
            }
        }
    }

    private void removeUserFromFlight() {
        System.out.println("Numarul zborului: ");
        String flightNumber = r.readString();
        Flight flight = returnFlightByNumber(flightNumber);
        System.out.println("Numele calatorului: ");
        String lastName = r.readString();
        User user = findUserByLastName(lastName);
        if (flight != null && user != null) {
            for (User u : flight.getPassengers()) {
                if (u.equals(user)) {
                    flight.getPassengers().remove(u);
                    System.out.println("User removed from flight!");
                    break;
                }
            }
        }
    }

    private void updateOptions() {
        updateOptionStatements();

        String command = r.readString();
        command = cleanString(command);

        switch (command) {
            case "1":
                updateUser();
                break;
            case "2":
                updateFlight();
                break;
            default:
                break;
        }
    }


    //restul de updatari sunt identice
    private void updateUser() {
        System.out.println("Numele calatorului: ");
        String lastName = r.readString();
        User user = findUserByLastName(lastName);
        System.out.println("Noul nume de familie: ");
        String newName = r.readString();
        if (newName != null) {
            user.setLastName(newName);
        }
    }

    //restul de updatari sunt identice
    private void updateFlight() {
        System.out.println("Numarul zborului: ");
        String flightNumber = r.readString();
        Flight flight = returnFlightByNumber(flightNumber);
        System.out.println("Noul numar al zborului: ");
        String newFlight = r.readString();
        flight.setFlightNumber(newFlight);
    }

    private void commandStatements() {
        System.out.println("Commands Panel\n--------------------\nChoose operation : \n[1] Add\n" +
                "[2] Remove\n[3] Update\n[4] Exit");
    }

    private String cleanString(String command) {
        return command.trim();
    }

    private void viewStatements() {
        System.out.println("View Panel\n--------------------\nChoose operation : \n[1] Flights\n[2] Plane capacity\n[3] Users\n" +
                "[4] User flight no\n[5] User destination no\n[6] User future flights\n[7] Exit");
    }

    private void startStatements() {
        System.out.println("Airport Panel\n--------------------\nChoose operation : \n[1] View\n[2] Commands\n[3] Exit");
    }

    private void addOptionStatements() {
        System.out.println("Add Panel\n--------------------\nWhat would you like to add : \n[1] User\n[2] Flight\n" +
                "[3]User to flight\n[4] Exit");
    }

    private void removeOptionStatements() {
        System.out.println("Remove Panel\n--------------------\nWhat would you like to remove : \n[1] User\n[2] Flight\n" +
                "[3]User from flight\n[4] Exit");
    }

    private void updateOptionStatements() {
        System.out.println("Update Panel\n--------------------\nWhat would you like to add : \n[1] User\n[2] Flight\n" +
                "[3] Exit");
    }

}
