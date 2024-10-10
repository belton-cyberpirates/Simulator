package com.qualcomm.robotcore.hardware;

public abstract class HardwareDevice {
    String name;

    public HardwareDevice(String name) {
        this.name = name;
    }

    public abstract void process(double delta);

    public String getDeviceName() {
        return this.name;
    }
}
