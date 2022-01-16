/*
  ___ _ _  _ _ 
 ( _ ) | |/ / |
 / _ \_  _| | |
 \___/ |_||_|_|

*/

package org.firstinspires.ftc.teamcode.Autonomous;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.Hardware.Drive_Hardware;

@Autonomous(name="Autonomous_Base", group="Testing")
//@Disabled

public class Autonomous_Base extends LinearOpMode {
    // create HW map
    Drive_Hardware robot = new Drive_Hardware();
    private ElapsedTime runtime = new ElapsedTime();


    @Override
    public void runOpMode() {
        // Initialize the program
        robot.init(hardwareMap);
        telemetry.addData("Status", "Ready to launch...");
        waitForStart();

        // autonomous
        moveForward();
        sleep(200);
        stopMovement();
        telemetry.addData("Status", "Completed autonomous!");

        // Done!
    }


    // autonomous drive functions:
    double moveForward1;
    double moveForward2;
    double moveForward3;
    double moveForward4;
    double moveForward5;
    double moveForward6;
    double moveForward7;
    double moveForward8;
    double moveForward9;

    double moveLeft1;
    double moveLeft2;
    double moveLeft3;
    double moveLeft4;
    double moveLeft5;
    double moveLeft6;
    double moveLeft7;
    double moveLeft8;
    double moveLeft9;

    double moveRight1;
    double moveRight2;
    double moveRight3;
    double moveRight4;
    double moveRight5;
    double moveRight6;
    double moveRight7;
    double moveRight8;
    double moveRight9;

    // drive
    public void drive(double left, double right) {
        robot.leftFrontDrive.setPower(left);
        robot.rightFrontDrive.setPower(right);
        robot.leftBackDrive.setPower(left);
        robot.rightBackDrive.setPower(right);
    }

    // stop
    public void stopMovement() {
        robot.leftFrontDrive.setPower(0);
        robot.rightFrontDrive.setPower(0);
        robot.leftBackDrive.setPower(0);
        robot.rightBackDrive.setPower(0);
        sleep(100);
    }

    // forward
    public void moveForward() {
        robot.leftFrontDrive.setPower(-1);
        robot.rightFrontDrive.setPower(-1);
        robot.leftBackDrive.setPower(-1);
        robot.rightBackDrive.setPower(-1);
        sleep(100);
    }

    moveForward1 = moveForward() * .1;
    moveForward2 = moveForward() * .2;
    moveForward3 = moveForward() * .3;
    moveForward4 = moveForward() * .4;
    moveForward5 = moveForward() * .5;
    moveForward6 = moveForward() * .6;
    moveForward7 = moveForward() * .7;
    moveForward8 = moveForward() * .8;
    moveForward9 = moveForward() * .9;

    // backwards
    public void moveBackwards() {
        robot.leftFrontDrive.setPower(1);
        robot.rightFrontDrive.setPower(1);
        robot.leftBackDrive.setPower(1);
        robot.rightBackDrive.setPower(1);
        sleep(100);
    }

    // left
    public void moveLeft() {
        robot.leftFrontDrive.setPower(1);
        robot.rightFrontDrive.setPower(-1);
        robot.leftBackDrive.setPower(1);
        robot.rightBackDrive.setPower(-1);
        sleep(100);
    }
    moveLeft1 = moveLeft() * .1;
    moveLeft2 = moveLeft() * .2;
    moveLeft3 = moveLeft() * .3;
    moveLeft4 = moveLeft() * .4;
    moveLeft5 = moveLeft() * .5;
    moveLeft6 = moveLeft() * .6;
    moveLeft7 = moveLeft() * .7;
    moveLeft8 = moveLeft() * .8;
    moveLeft9 = moveLeft() * .9;


    // right
    public void moveRight() {
        robot.leftFrontDrive.setPower(-1);
        robot.rightFrontDrive.setPower(1);
        robot.leftBackDrive.setPower(-1);
        robot.rightBackDrive.setPower(1);
        sleep(100);
    }

    moveRight1 = moveRight() * .1;
    moveRight2 = moveRight() * .2;
    moveRight3 = moveRight() * .3;
    moveRight4 = moveRight() * .4;
    moveRight5 = moveRight() * .5;
    moveRight6 = moveRight() * .6;
    moveRight7 = moveRight() * .7;
    moveRight8 = moveRight() * .8;
    moveRight9 = moveRight() * .9;

   
}