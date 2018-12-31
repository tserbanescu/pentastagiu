package com.serbanescu.tema1;

public class StringCalculator {

    public boolean verificareIncludereString(String sursa,String cautat){
        return sursa.toLowerCase().contains(cautat.toLowerCase());
    }
}
