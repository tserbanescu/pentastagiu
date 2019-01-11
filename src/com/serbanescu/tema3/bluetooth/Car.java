package com.serbanescu.tema3.bluetooth;

public class Car implements Connectable {

    private int horsePower;
    private String brand;
    private String driverName;

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress for Car");
    }
}
