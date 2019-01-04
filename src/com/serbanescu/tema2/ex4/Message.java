package com.serbanescu.tema2.ex4;

public class Message {

    private String description;
    private String author;

    public String getDescription() {
        return description;
    }

    public String getAuthor() {
        return author;
    }

    public Message(String desc,String aut){
        this.author=aut;
        this.description=desc;
    }
}
