package simulatorlib.hardwareconfigs;

public class DcMotorExConfig extends HardwareConfig {
    public double gearRatio;

    public DcMotorExConfig(String configName, double gearRatio) {
        super(configName);
        this.gearRatio = gearRatio;
    }

    public DcMotorExConfig(String configName) {
        super(configName);
        this.gearRatio = 1;
    }
}
