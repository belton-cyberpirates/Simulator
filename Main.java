import org.firstinspires.ftc.teamcode.AutoBlueLeft;

import simulatorlib.Simulator;
import simulatorlib.hardwareconfigs.*;

public class Main {
    public static void main(String[] args) {
        new Simulator();

        // Hardware Configs
        // Enter a hardware device like the following:
        // DcMotorExConfig("motor1", 1/20);
        // This adds a DcMotorEx with the config name 
        // "motor1" and a gear ratio of 20:1

        new DcMotorExConfig("m1", 1.0/20.0);
        new DcMotorExConfig("m2", 1.0/20.0);
        new DcMotorExConfig("m3", 1.0/20.0);
        new DcMotorExConfig("m4", 1.0/20.0);

        ( new AutoBlueLeft() ).runOpMode(); // Replace AutoBlueLeft with your auto class
    }
}
