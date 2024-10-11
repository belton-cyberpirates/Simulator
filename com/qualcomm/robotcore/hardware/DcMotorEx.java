package com.qualcomm.robotcore.hardware;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareDevice;
import simulatorlib.SimConfig;

public class DcMotorEx extends HardwareDevice {
    static final int TARGET_COMFORT_DIST = 10;

    static PIDController _PIDController = new PIDController(SimConfig.DcMotorEx_PID_CONFIG)

    DcMotor.RunMode runMode = DcMotor.RunMode.DEFAULT;
    DcMotor.ZeroPowerBehavior zeroPowerBehavior = DcMotor.ZeroPowerBehavior.DEFAULT;
    
    int currentPosition = 0;
    int targetPosition = 0;
    int velocity = 0;
    double power = 0;

    public DcMotorEx(String name) {
        super(name);
    }

    public void process(double delta) {
        if (!this.isBusy()) return
    }

    public void setTargetPosition(int targetPosition) {
        assert (targetPosition != 0 && this.runMode != DcMotor.RunMode.RUN_TO_POSITION) : 
            "Trying to set non-zero target position before setting runMode to RUN_TO_POSITION.\nTry calling motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);";
        
        this.targetPosition = targetPosition;
        System.out.println("moving " + this.name + " to " + this.targetPosition);
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
        System.out.println("Setting " + this.name + "'s velocity to " + velocity);
    }

    public void setPower(double power) {
        this.power = power;
        System.out.println("Setting " + this.name + "'s power to " + power);
    }

    public void setMode(DcMotor.RunMode runMode) {
        this.runMode = runMode;
        System.out.println("Setting " + this.name + "'s run mode to " + runMode);

        switch(runMode) {
            case DcMotor.RunMode.STOP_AND_RESET_ENCODER:
                this.currentPosition = 0;
                this.targetPosition = 0;
                break;
        }
    }

    public void setZeroPowerBehavior(DcMotor.ZeroPowerBehavior zeroPowerBehavior) {
        this.zeroPowerBehavior = zeroPowerBehavior;
        System.out.println("Setting " + this.name + "'s zero power behavior to " + zeroPowerBehavior);
    }

    public double getCurrentPosition() {
        return this.currentPosition
    }

    public boolean isBusy() {
        return Math.abs(this.targetPosition - this.currentPosition) > TARGET_COMFORT_DIST;
    }
}
