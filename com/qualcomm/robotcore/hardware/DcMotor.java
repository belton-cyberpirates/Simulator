package com.qualcomm.robotcore.hardware;

import com.qualcomm.robotcore.hardware.HardwareDevice;

public class DcMotor extends HardwareDevice {
    public DcMotor(String name) {
        super(name);
    }

    public void process(double delta) {}

    public static enum RunMode {
        DEFAULT,
        STOP_AND_RESET_ENCODER,
        RUN_TO_POSITION,
        RUN_WITHOUT_ENCODER,
    }

    public static enum ZeroPowerBehavior {
        DEFAULT,
        BRAKE,
    }
}
