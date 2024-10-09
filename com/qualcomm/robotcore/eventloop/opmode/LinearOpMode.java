package com.qualcomm.robotcore.eventloop.opmode;

import com.qualcomm.robotcore.hardware.HardwareMap;

public abstract class LinearOpMode {
    public HardwareMap hardwareMap;

    public LinearOpMode() {
        this.hardwareMap = new HardwareMap();
    }


    public void sleep(int delay) {
        try {
            // to sleep 10 seconds
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            // recommended because catching InterruptedException clears interrupt flag
            Thread.currentThread().interrupt();
            // you probably want to quit if the thread is interrupted
            return;
        }
    }

    public abstract void runOpMode();


    public void waitForStart() {

    }


    public boolean opModeIsActive() {
        return true;
    }
}
