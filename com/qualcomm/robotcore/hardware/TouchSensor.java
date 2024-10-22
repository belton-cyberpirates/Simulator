package com.qualcomm.robotcore.hardware;

public class TouchSensor extends HardwareDevice {
    public boolean pressed;

    public TouchSensor(String name) {
        super(name);
    }

    @Override
    public void process(double delta) {}
    
    public boolean isPressed() {
        return this.pressed;
    }
}
