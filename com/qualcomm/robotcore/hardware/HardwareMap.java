package com.qualcomm.robotcore.hardware;

public class HardwareMap {
    public <T> T get(java.lang.Class<? extends T> classOrInterface, java.lang.String deviceName) {
        System.out.println("Constructing hardware device called " + deviceName);
        try {
            return classOrInterface.getDeclaredConstructor(String.class).newInstance(deviceName);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
