package simulatorlib;

import com.qualcomm.robotcore.hardware.HardwareDevice;

import java.util.List;
import java.util.ArrayList;
import java.lang.Thread;
import java.time.Duration;
import java.time.Instant;

public class HardwareLoop extends Thread {
    List<HardwareDevice> hardwareDevices = new ArrayList<>();

    public void run() {
        Instant prevInstant = Instant.now();

        while (true) {
            Instant currInstant = Instant.now();
            Duration deltaDur = Duration.between(prevInstant, currInstant);
            prevInstant = currInstant;

            double delta = deltaDur.getSeconds();

            for (HardwareDevice device : this.hardwareDevices) {
                device.process(delta);
            }
        }
    }
}
