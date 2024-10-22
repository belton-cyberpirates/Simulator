package org.firstinspires.ftc.vision.tfod;

import org.firstinspires.ftc.robotcore.external.tfod.Recognition;

import java.util.ArrayList;
import java.util.List;

public class TfodProcessor {
    public static class Builder {
        String modelFileName;
        String[] modelLabels;

        public Builder setModelFileName(String modelFileName) {
            this.modelFileName = modelFileName;
            return this;
        }
        public Builder setModelLabels(String[] modelLabels) {
            this.modelLabels = modelLabels;
            return this;
        }
        public TfodProcessor build() {
            return new TfodProcessor();
        }
    }

    public List<Recognition> getRecognitions() {
        ArrayList<Recognition> recognitions = new ArrayList<Recognition>();
        for (int i = 0; i<5; i++) {
            recognitions.add(new Recognition());
        }
        return recognitions;
    }
}
