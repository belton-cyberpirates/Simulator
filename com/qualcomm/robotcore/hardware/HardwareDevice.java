package com.qualcomm.robotcore.hardware;

public class HardwareDevice {
    String name;

    public HardwareDevice(String name) {
        this.name = name;
    }

    public String getDeviceName() {
        return this.name;
    }
}
