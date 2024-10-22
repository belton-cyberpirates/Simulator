package org.firstinspires.ftc.robotcore.external.tfod;

import simulatorlib.SimConfig;

public class Recognition {
    String label;

    int x;
    int y;

    int width;
    int height;

    int left;
    int right;
    int top;
    int bottom;


    public Recognition() {
        this.x = (int)(Math.random() * SimConfig.CAMERA_RESO_X);
        this.y = (int)(Math.random() * SimConfig.CAMERA_RESO_Y);

        this.width = (int)( Math.random() * (SimConfig.MAX_DETECTION_WIDTH - SimConfig.MIN_DETECTION_WIDTH) ) + SimConfig.MIN_DETECTION_WIDTH;
        this.height = (int)( Math.random() * (SimConfig.MAX_DETECTION_HEIGHT - SimConfig.MIN_DETECTION_HEIGHT) ) + SimConfig.MIN_DETECTION_HEIGHT;
    }

    public double getConfidence() {
        return Math.random() * 100;
    }

    public int getRight() {
        return this.right;
    }

    public int getLeft() {
        return this.left;
    }

    public int getTop() {
        return this.top;
    }

    public int getBottom() {
        return this.bottom;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public String getLabel() {
        return this.label;
    }
}
