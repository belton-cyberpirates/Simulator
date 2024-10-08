package com.qualcomm.robotcore.hardware;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.YawPitchRollAngles;

public class IMU {
    public double yaw = 0;


    public void resetYaw() {
        this.yaw = 0;
    }

    public YawPitchRollAngles getRobotYawPitchRollAngles() {
        return new YawPitchRollAngles(AngleUnit.DEGREES, 0, 0, 0, 0);
    }
}
