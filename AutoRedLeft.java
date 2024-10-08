// package org.firstinspires.ftc.teamcode;

// import org.firstinspires.ftc.robotcore.external.hardware.camera.BuiltinCameraDirection;
// import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
// import org.firstinspires.ftc.robotcore.external.tfod.Recognition;
// import org.firstinspires.ftc.vision.tfod.TfodProcessor;
// import org.firstinspires.ftc.vision.VisionPortal;
// import com.qualcomm.robotcore.hardware.Servo;
// import org.firstinspires.ftc.vision.apriltag.AprilTagDetection;
// import org.firstinspires.ftc.robotcore.external.Telemetry;
// import com.qualcomm.hardware.bosch.BNO055IMU;
// import org.firstinspires.ftc.robotcore.external.navigation.AxesReference;
// import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;
// import org.firstinspires.ftc.robotcore.external.navigation.Orientation;
// import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import org.firstinspires.ftc.robotcore.external.JavaUtil;
// import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
// import org.firstinspires.ftc.robotcore.external.navigation.AxesOrder;
// import org.openftc.easyopencv.OpenCvCamera;
// import org.openftc.easyopencv.OpenCvCameraRotation;
// import org.openftc.easyopencv.OpenCvInternalCamera;
// import org.openftc.easyopencv.OpenCvInternalCamera2;

// import org.firstinspires.ftc.teamcode.DriveMotors;
// import org.firstinspires.ftc.teamcode.Arm;
// import org.firstinspires.ftc.teamcode.Direction;
// import org.firstinspires.ftc.teamcode.Config;
// import org.firstinspires.ftc.teamcode.Auto;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;


@Autonomous(name="AutoRedLeft", preselectTeleOp="MecanumDriveFieldCentric")
public class AutoRedLeft extends Auto {
	/**
	 * This function is executed when this Op Mode is initialized from the Driver Station.
	 */
	@Override
	public void runOpMode() {
		Initialize();

		waitForStart();

		int position = 0 //camera.GetPropPos();

		if (opModeIsActive()) { // <----------------------------------------------------------------
			MotorSetup(); // arm between 0 and -2500

			switch(position) {
				case 0:
					// Move to the left spike mark
					driveMotors.Move(Direction.FORWARD, (int)(Config.TILE_LENGTH * .7));
					driveMotors.Move(Direction.LEFT, (int)(Config.TILE_LENGTH * .6));
					// Drop pixel
					intake.OpenRight(0);
					intake.MoveWrist(0, 350);
					
					break;
				case 1:
					// Move to the center spike mark
					driveMotors.Move(Direction.LEFT, (int)(Config.TILE_LENGTH * .2));
					driveMotors.Move(Direction.FORWARD, (int)(Config.TILE_LENGTH * 1.11));
					// Drop pixel
					intake.OpenRight(0);
					intake.MoveWrist(0, 350);
				
					break;
				case 2:
					// Move to the right spike mark
					driveMotors.Move(Direction.FORWARD, (int)(Config.TILE_LENGTH * 1));
					driveMotors.Turn(45);
					driveMotors.Move(Direction.FORWARD, (int)(Config.TILE_LENGTH * 0.2));
					// Drop purple pixel
					intake.OpenRight(0);
					intake.MoveWrist(0, 350);
					break;
			}
		}
		saveHeading();
	}
}

