package com.serbanescu.tema3.bluetooth;

public class Refrigerator implements Connectable {

    private double height;
    private double width;
    private String brand;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress for Refrigerator");
    }
}
