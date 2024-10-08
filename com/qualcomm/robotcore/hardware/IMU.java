package com.qualcomm.robotcore.hardware;

import com.qualcomm.robotcore.hardware.HardwareDevice;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
import org.firstinspires.ftc.robotcore.external.navigation.YawPitchRollAngles;

public class IMU extends HardwareDevice {
    public double yaw = 0;

    public IMU(String name) {
        super(name);
    }

    public void resetYaw() {
        this.yaw = 0;
    }

    public YawPitchRollAngles getRobotYawPitchRollAngles() {
        return new YawPitchRollAngles(AngleUnit.DEGREES, 0, 0, 0, 0);
    }
}
