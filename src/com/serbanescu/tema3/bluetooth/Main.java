package com.serbanescu.tema3.bluetooth;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Connectable car = new Car();
        Connectable phone = new Phone();
        Connectable fridge = new Refrigerator();

        List<Connectable> connect = new ArrayList<>();
        connect.add(car);
        connect.add(phone);
        connect.add(fridge);

        for (Connectable i : connect) {
            i.connectToBluetooth();
        }
    }
}
