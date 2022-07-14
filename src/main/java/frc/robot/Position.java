package frc.robot;

import static lib.Romi.driveDistance;
import static lib.Romi.turnDegrees;

public class Position {


    public void driveUp() throws InterruptedException {
driveDistance(10);
      turnDegrees(-360);
    }

    public void driveDown() throws InterruptedException {
driveDistance(10);
      turnDegrees(-90);
    }

    public void driveRight() throws InterruptedException {
driveDistance(10);
      turnDegrees(-360);
    }

    public void driveLeft() throws InterruptedException {
driveDistance(10);
    }

    public void returnToHome() {

    }

    public String toString() {
        return "+position+";
    }
}
