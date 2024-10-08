package com.qualcomm.robotcore.hardware;

public class DcMotor {
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
