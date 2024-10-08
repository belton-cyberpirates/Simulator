package com.qualcomm.robotcore.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;

public class DcMotorEx {
    DcMotor.RunMode runMode = DcMotor.RunMode.DEFAULT;
    DcMotor.ZeroPowerBehavior zeroPowerBehavior = DcMotor.ZeroPowerBehavior.DEFAULT;

    public void setTargetPosition(int position) {
        assert (position != 0 && this.runMode != DcMotor.RunMode.RUN_TO_POSITION) : 
            "Trying to set non-zero target position before setting runMode to RUN_TO_POSITION.\nTry calling motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);";
        System.out.println(this + " moving to " + position);
    }

    public void setVelocity(int velocity) {
        System.out.println("Setting " + this + "'s velocity to " + velocity);
    }

    public void setPower(double power) {
        System.out.println("Setting " + this + "'s power to " + power);
    }

    public void setMode(DcMotor.RunMode runMode) {
        System.out.println("Setting " + this + "'s run mode to " + runMode);
    }

    public void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior behavior) {
        System.out.println("Setting " + this + "'s zero power behavior to " + behavior);
    }

    public boolean isBusy() {
        return false;
    }
}
