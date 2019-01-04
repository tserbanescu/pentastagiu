package com.serbanescu.tema2.ex3;

public class Customer {

    private static int id = 0;
    private String name;
    private Membership status;

    public String getName() {
        return name;
    }


    public Membership getStatus() {
        return status;
    }

    public void setStatus(Membership status) {
        this.status = status;
    }

    public Customer(int id,String name, Membership status) {
        this.id=id;
        this.name = name;
        this.status = status;
    }

}
