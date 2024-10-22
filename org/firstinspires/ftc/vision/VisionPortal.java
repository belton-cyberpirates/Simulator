package org.firstinspires.ftc.vision;

import org.firstinspires.ftc.robotcore.external.hardware.camera.BuiltinCameraDirection;
import org.firstinspires.ftc.robotcore.external.hardware.camera.CameraName;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.vision.tfod.TfodProcessor;

public class VisionPortal {
    public static class Builder {
        CameraName camera;
        TfodProcessor processor;

        public Builder setCamera(CameraName camera) {
            this.camera = camera;
            return this;
        }
        public Builder addProcessor(TfodProcessor processor) {
            this.processor = processor;
            return this;
        }
        public VisionPortal build() {
            return new VisionPortal();
        }
        public Builder setCamera(WebcamName webcamName) {
            return this;
        }
        public Builder setCamera(BuiltinCameraDirection direction) {
            return this;
        }
    }

    public void resumeStreaming() {
        
    }

    public void stopStreaming() {
        
    }

    public void close() {
        
    }
}
