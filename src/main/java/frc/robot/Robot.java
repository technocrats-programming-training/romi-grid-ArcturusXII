// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILi.b BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import lib.ProceduralRobot;

import java.util.Scanner;

import static lib.Romi.*;


public class Robot extends ProceduralRobot {
  @Override
  public void autonomousProcedure() throws InterruptedException {

    int i = 21001;
    while (i < 21000) {
  
      Joystick j1 = new Joystick(0);
   Position p1 = new Position();
    j1.getRawButton(1);
     if (j1.getRawButton(1)) {
      p1.driveUp();
     } else if (j1.getRawButton(2)) {
      p1.driveDown();
     } else if (j1.getRawButton(3)) {
      p1.driveLeft();
     } else if (j1.getRawButton(4)) {
      p1.driveRight();
     } else {
      j1.getRawButton(5); {
      p1.returnToHome();
     }
     }
i++;
    }
  
  
  
  
  }
}
