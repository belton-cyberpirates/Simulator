package com.qualcomm.robotcore.hardware;

public class HardwareMap {
    public <T> T get(java.lang.Class<? extends T> classOrInterface, java.lang.String deviceName) {
        System.out.println("Getting hardware map called " + deviceName);
        try {
            return classOrInterface.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
