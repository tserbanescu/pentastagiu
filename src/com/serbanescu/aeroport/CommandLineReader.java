package com.serbanescu.aeroport;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

    public String readString() {
        String s = reader.nextLine();
        return s;
    }

    public Date readDate() {
        System.out.println("Date must of followiing format: dd-mm-yyyy");

        try {
            SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");
            String data = reader.nextLine();

            Date date = format.parse(data);
            return date;
        } catch (ParseException e) {
            System.out.println("Wrong date format!");
        }
        return null;
    }
}
