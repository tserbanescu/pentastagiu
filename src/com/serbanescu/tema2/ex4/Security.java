package com.serbanescu.tema2.ex4;

import java.util.ArrayList;
import java.util.List;

public class Security {

    public Security() {
        User user1 = new User("1", "2");
        users.add(user1);
        user1 = new User("2", "3");
        users.add(user1);
    }

    private List<User> users = new ArrayList<>();


    public boolean checkUser(User user) {
        for (User u : users) {
            if (u.getUsername().toLowerCase().equals(user.getUsername().toLowerCase()) && u.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }
}
