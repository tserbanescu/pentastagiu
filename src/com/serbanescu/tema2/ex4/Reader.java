package com.serbanescu.tema2.ex4;

import java.util.Scanner;

public class Reader {

    private Scanner reader=new Scanner(System.in);

    public String readString(){
        String s= reader.nextLine();
        return s;
    }

    public int readInt(){
        return reader.nextInt();
    }

}
