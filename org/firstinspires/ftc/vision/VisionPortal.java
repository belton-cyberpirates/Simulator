package org.firstinspires.ftc.vision;

import org.firstinspires.ftc.robotcore.external.hardware.camera.BuiltinCameraDirection;
import org.firstinspires.ftc.robotcore.external.hardware.camera.CameraName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.tfod.TfodProcessor;

public class VisionPortal {
    public static class Builder {
        CameraName camera;
        TfodProcessor processor;

        public void setCamera(CameraName camera) {
            this.camera = camera;
        }
        public void addProcessor(TfodProcessor processor) {
            this.processor = processor;
        }
        public VisionPortal build() {
            return new VisionPortal();
        }
        public void setCamera(WebcamName webcamName) {
        }
        public void setCamera(BuiltinCameraDirection direction) {
        }
    }

    public void resumeStreaming() {
        
    }

    public void stopStreaming() {
        
    }

    public void close() {
        
    }
}
