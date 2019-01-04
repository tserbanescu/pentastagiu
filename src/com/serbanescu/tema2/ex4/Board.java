package com.serbanescu.tema2.ex4;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Message> messages;

    public Board() {
        messages = new ArrayList<>();
        Message dummy = new Message("Welcome!", "Admin");
        addMessage(dummy);
    }

    public String getMessages() {
        String result = "";
        for (Message m : messages) {
            result += "Author: " + m.getAuthor() + "\nMessage: " + m.getDescription() + "\n\n";
        }
        return result;
    }

    public void addMessage(Message m) {
        messages.add(m);
    }
}
