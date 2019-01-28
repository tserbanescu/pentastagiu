package com.serbanescu.aeroport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {

    private String flightNumber;
    private String destination;
    private Date departureDate;
    private int flightDuration;
    private int maxUserCapacity;

    public List<User> getPassengers() {
        return passengers;
    }

    private List<User> passengers = new ArrayList<>();

    public enum status {SCHEDULED, FINISHED, CANCELLED}

    public Flight(String flightNumber, String destination, Date departureDate, int flightDuration, int maxUserCapacity) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureDate = departureDate;
        this.flightDuration = flightDuration;
        this.maxUserCapacity = maxUserCapacity;
    }

    public int getMaxUserCapacity() {
        return maxUserCapacity;
    }

    public void setMaxUserCapacity(int maxUserCapacity) {
        this.maxUserCapacity = maxUserCapacity;
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestionation() {
        return destination;
    }

    public void setDestionation(String destination) {
        this.destination = destination;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public int getFlightDuration() {
        return flightDuration;
    }

    public void setFlightDuration(int flightDuration) {
        this.flightDuration = flightDuration;
    }

    @Override
    public String toString() {
        return this.getFlightNumber() + " with " + this.getMaxUserCapacity();
    }
}
