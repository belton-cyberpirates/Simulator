package simulatorlib;

public class SimConfig {
    /*****************************************************************************************
     *                                     MOTOR CONFIGS                                     *
     *****************************************************************************************/

    public static final PIDConfig DcMotorEx_PID_CONFIG = new PIDConfig(
        0, //Kp
        0, //Ki
        0  //Kd
    );

    public static final double MOTOR_RPM = 6000;
    public static final double MOTOR_TICKS_PER_REVOLUTION = 28;
    

    /*****************************************************************************************
     *                                    CAMERA CONFIGS                                     *
     *****************************************************************************************/

    public static final int CAMERA_RESO_X = 640;
    public static final int CAMERA_RESO_Y = 320;

    public static final int MIN_DETECTION_WIDTH = 50;
    public static final int MAX_DETECTION_WIDTH = 75;
    public static final int MIN_DETECTION_HEIGHT = 50;
    public static final int MAX_DETECTION_HEIGHT = 75;
}
