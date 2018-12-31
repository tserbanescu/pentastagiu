package com.serbanescu.tema2.ex2;

import java.util.Scanner;

public class Reader {
    private Scanner reader;

    public Reader() {
        reader = new Scanner(System.in);
    }

    public double readDouble() {
        double n = reader.nextDouble();
        return n;
    }

    public int readInt() {
        int n = reader.nextInt();
        return n;
    }
}
