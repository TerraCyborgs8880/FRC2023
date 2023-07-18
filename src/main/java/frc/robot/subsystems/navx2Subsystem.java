
    // Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// Umar and Usman

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.*;
import frc.robot.Constants;

public class navX2Subsystem extends SubsystemBase {
  
    private static navX2Subsystem instance = null;

    public static AHRS navX2Micro;

    public PneumaticsSubsystem() {
        super();
        navX2Micro = new AHRS(SerialPort.Port.kUSB);
    }

    private static navX2Subsystem getInstance(){

        if (instance == null){
            System.out.println("navX2Subsystem init");
            instance = new navX2Subsystem();
        }
        return instance;

    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
