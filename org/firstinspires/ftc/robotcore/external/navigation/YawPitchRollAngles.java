package org.firstinspires.ftc.robotcore.external.navigation;

import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

public class YawPitchRollAngles {
    AngleUnit angleUnit;
    double yaw;
    double pitch;
    double roll;
    long acquisitionTime;

    public YawPitchRollAngles(AngleUnit angleUnit, double yaw, double pitch, double roll, long acquisitionTime) {
        this.angleUnit = angleUnit;
        this.yaw = yaw;
        this.pitch = pitch;
        this.roll = roll;
        this.acquisitionTime = acquisitionTime;
    }

    public double getYaw() {
        return this.yaw;
    }
    public double getYaw(AngleUnit angleUnit) {
        if (angleUnit == this.angleUnit) { return this.yaw; } // if same unit just return
        if (angleUnit == AngleUnit.RADIANS) { return this.yaw * Math.PI/180; } // if not same unit and desired unit is RADIANS, assume current unit is DEGREES and convert
        return this.yaw * 180/Math.PI; // if not same unit and desired is not RADIANS, assume current is RADIANS and desired is DEGREES and convert
    }

    public double getPitch() {
        return this.pitch;
    }
    public double getPitch(AngleUnit angleUnit) { // same logic as getYaw()
        if (angleUnit == this.angleUnit) { return this.pitch; }
        if (angleUnit == AngleUnit.RADIANS) { return this.pitch * Math.PI/180; }
        return this.pitch * 180/Math.PI;
    }

    public double getRoll() {
        return this.roll;
    }
    public double getRoll(AngleUnit angleUnit) { // same logic as getYaw()
        if (angleUnit == this.angleUnit) { return this.roll; }
        if (angleUnit == AngleUnit.RADIANS) { return this.roll * Math.PI/180; }
        return this.roll * 180/Math.PI;
    }

    public long getAcquisitionTime() {
        return this.acquisitionTime;
    }
}
