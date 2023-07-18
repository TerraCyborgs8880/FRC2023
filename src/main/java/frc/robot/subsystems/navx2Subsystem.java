
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

// Usman 7/18/23

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.*;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.SerialPort;
import com.kauailabs.navx.frc.AHRS;

public class NavX2Subsystem extends SubsystemBase {
  
    private static NavX2Subsystem instance = null;

    public static AHRS navX2Micro;

    public NavX2Subsystem() {
        super();
        navX2Micro = new AHRS(SerialPort.Port.kUSB);
    }

    private static NavX2Subsystem getInstance(){

        if (instance == null){
            System.out.println("NavX2Subsystem init");
            instance = new NavX2Subsystem();
        }
        return instance;

    }

    @Override
    public void periodic() {
        System.out.println(navX2Micro.getYaw());
        if (navX2Micro.getYaw()!=0){
            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        }
    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation
    }
}
