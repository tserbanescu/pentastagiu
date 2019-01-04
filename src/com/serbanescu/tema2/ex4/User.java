package com.serbanescu.tema2.ex4;

public class User {

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private String username;
    private String password;

    public User(String user, String pass) {
        this.username=user;
        this.password =pass;
    }



}

