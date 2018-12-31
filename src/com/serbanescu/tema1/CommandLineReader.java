package com.serbanescu.tema1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CommandLineReader {
    private Scanner reader;

    public CommandLineReader() {
        reader = new Scanner(System.in);
    }

    public int readInt() {
        int n = reader.nextInt();
        return n;
    }

    public List<Integer> readIntList(int n) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            result.add(this.readInt());
        }
        return result;
    }

    public String readString(){
        String s= reader.nextLine();
        return s;
    }
}
