package com.qualcomm.robotcore.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareDevice;

public class DcMotorEx extends HardwareDevice {
    private DcMotor.RunMode runMode = DcMotor.RunMode.DEFAULT;
    private DcMotor.ZeroPowerBehavior zeroPowerBehavior = DcMotor.ZeroPowerBehavior.DEFAULT;

    public DcMotorEx(String name) {
        super(name);
    }

    public void setTargetPosition(int position) {
        assert (position != 0 && this.runMode != DcMotor.RunMode.RUN_TO_POSITION) : 
            "Trying to set non-zero target position before setting runMode to RUN_TO_POSITION.\nTry calling motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);";
        System.out.println("moving " + this.name + " to " + position);
    }

    public void setVelocity(int velocity) {
        System.out.println("Setting " + this.name + "'s velocity to " + velocity);
    }

    public void setPower(double power) {
        System.out.println("Setting " + this.name + "'s power to " + power);
    }

    public void setMode(DcMotor.RunMode runMode) {
        System.out.println("Setting " + this.name + "'s run mode to " + runMode);
    }

    public void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior behavior) {
        System.out.println("Setting " + this.name + "'s zero power behavior to " + behavior);
    }

    public boolean isBusy() {
        return false;
    }
}
