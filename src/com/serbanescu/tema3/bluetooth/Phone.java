package com.serbanescu.tema3.bluetooth;

public class Phone implements Connectable {
    private String brandType;
    private double cameraResolution;
    private double batteryPower;

    public String getBrandType() {
        return brandType;
    }

    public void setBrandType(String brandType) {
        this.brandType = brandType;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(double batteryPower) {
        this.batteryPower = batteryPower;
    }

    @Override
    public void connectToBluetooth() {
        System.out.println("Connect to bluetooth in progress for Phone");
    }
}
