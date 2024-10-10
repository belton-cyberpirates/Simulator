package simulatorlib;

import simulatorlib.HardwareLoop;

public class Simulator {
    public Simulator() {
        HardwareLoop hardwareLoop = new HardwareLoop();
        hardwareLoop.start();
    }
}
