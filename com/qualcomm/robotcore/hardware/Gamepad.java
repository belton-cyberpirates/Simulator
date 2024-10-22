package com.qualcomm.robotcore.hardware;

import java.util.ArrayList;

public class Gamepad extends HardwareDevice {
    public Gamepad(String name) {
        super(name);
    }

    public static ArrayList<Integer> deviceIds = new ArrayList<Integer>();

    public static int ID_SYNTHETIC;
    public static int ID_UNASSOCIATED;
    protected float	joystickDeadzone;
    protected float dpadThreshold;

    public int ID;
    public long timestamp;

    public boolean a;
    public boolean b;
    public boolean x;
    public boolean y;
    
    public boolean dpad_left;
    public boolean dpad_right;
    public boolean dpad_up;
    public boolean dpad_down;

    public boolean start;
    public boolean back;
    public boolean guide;

    public float left_stick_x;
    public float left_stick_y;

    public float right_stick_x;
    public float right_stick_y;

    public float left_trigger;
    public float right_trigger;

    public boolean left_bumper;
    public boolean right_bumper;

    public boolean left_stick_button;
    public boolean right_stick_button;


    public boolean atRest() {
        return (
            left_stick_x == 0 &&
            left_stick_y == 0 &&

            right_stick_x == 0 &&
            right_stick_y == 0 &&

            left_trigger == 0 &&
            right_trigger == 0
        );
    }

    public static boolean isGamepadDevice(int deviceId) {
        return deviceIds.contains(deviceId);
    }

    @Override
    public void process(double delta) {}
}
