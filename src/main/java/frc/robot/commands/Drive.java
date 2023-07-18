// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

/*

  Date: 3/22/22
  Name: Team 2338 (everyone knows methods though)
  Task Done: Created class

*/

package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.Robot;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class Drive extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */

  public Drive() {
    super();
    addRequirements(RobotContainer.Drivetrain);  // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    
    double left = Robot.driver2.getLeftY();
    double right = Robot.driver2.getRightY();
    //boolean toggleExponentialDrive = false;

    RobotContainer.Drivetrain.tankDriveVolts(left, right);

    //RobotContainer.Drivetrain.tankExponentialDriveVolts(left, right);


    //boolean turnRight = Robot.driver.getStartButton();
    //boolean turnLeft = Robot.driver.getBackButton();

   // if(Robot.driver2.getAButtonPressed()) toggleExponentialDrive = !toggleExponentialDrive;

    //tankDriveExponentialVolts() receives button values and sends voltages to the robot accordingly in an exponential pattern
    //if(toggleExponentialDrive) Robot.Drivetrain.tankExponentialDriveVolts(left, right);
    //tankDriveLinearVolts() receives button values and sends voltages to the robot accordingly in a linear pattern
   // else Robot.Drivetrain.tankLinearDriveVolts(left, right);

    System.out.println("Tank Drive Working");
   // if(left > 0 || left < 0)
     // Robot.driver2.setRumble(RumbleType.kLeftRumble, Math.pow((left), 2));
    //if(right > 0 || right < 0)
      //Robot.driver2.setRumble(RumbleType.kRightRumble, Math.pow((right), 2));
    if(left == 0 && right == 0)
      Robot.driver2.setRumble(RumbleType.kBothRumble, 0.0);

    /*
    if (turnRight  && !turnLeft){
      Robot.Drivetrain.tankDriveVolts(0.1, -0.1);
    }
    else if (turnLeft && !turnRight ){
      Robot.Drivetrain.tankDriveVolts(-0.1, 0.1);
    }
    else{
      Robot.Drivetrain.tankDriveVolts(0, 0);
    }
    */

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
