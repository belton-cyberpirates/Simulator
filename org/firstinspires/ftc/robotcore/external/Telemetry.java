package org.firstinspires.ftc.robotcore.external;

import java.util.Map;
import java.util.HashMap;

public interface Telemetry {
    static Map<String, String> data = new HashMap<String, String>();

    public default void addData(String key, Object value) {
        data.put(key, (String)value);
    }

    public default void addData(String key, String format, Object... formatValues) {
        String value = String.format(format, formatValues);
        data.put(key, value);
    }

    public default void update() {
        for (Map.Entry<String, String> entry : data.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("$TELEMETRY ~ " + key + ", " + value);
        }
    }
}
