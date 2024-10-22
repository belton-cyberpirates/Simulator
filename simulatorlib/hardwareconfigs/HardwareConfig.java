package simulatorlib.hardwareconfigs;

import java.util.ArrayList;

public abstract class HardwareConfig {
    public static ArrayList<HardwareConfig> configs = new ArrayList<HardwareConfig>();

    public String configName;

    public HardwareConfig(String configName) {
        this.configName = configName;
        configs.add(this);
    }
}
