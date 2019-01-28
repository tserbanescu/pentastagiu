package com.serbanescu.aeroport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    private List<Flight> flights =new ArrayList<>();

    public List<Flight> getFlights() {
        return flights;
    }

    public List<Flight> getDestinations(){
        return flights;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public User(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return this.getFirstName() + " " + this.getLastName();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        User u=(User) obj;
        if(!this.lastName.equals(((User) obj).lastName)){
            return false;
        }
        if(!this.firstName.equals(((User) obj).firstName)){
            return false;
        }
        return true;
    }
}
