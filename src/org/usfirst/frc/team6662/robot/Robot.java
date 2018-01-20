/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6662.robot;

import org.usfirst.frc.team6662.robot.commands.JoystickTankDrive;
import org.usfirst.frc.team6662.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {
	
	public static Drivetrain drivetrain;
	public static OI oi;
	Command joystickTankDrive;
	
	String fieldData;
    	String allianceSwitch;
    	String allianceScale;
    	String opponentSwitch;
	
	@Override
	public void robotInit() {
		oi = new OI();
		drivetrain = new Drivetrain();
		joystickTankDrive = new JoystickTankDrive();
	}

	@Overrride
	public void autonomousInit(){
    		fieldData = DriverStation.getInstance().getGameSpecificMessage();
    		allianceSwitch = fieldData.charAt(0);
    		allianceScale = fieldData.charAt(1);
    		opponentSwitch = fieldData.charAt(2);
	}
	
	@Override
	public void autonomousPeriodic(){
    		if (allianceSwitch == "L"){
      		//code for the autonomous will go in these spaces
    		}
    		else if(allianceSwitch == "R")
  		
    		}
    
    		if (allianceScale == "L"){
    
    		}
    		else if(allianceScale == "R"){
    		
    		}
    
    		if (opponentSwitch == "L"){
    		
    		}
    		else if(opponentSwitch == "R"){
    		
    		}
	}		
	
	@Override
	public void teleopInit() {
		joystickTankDrive.start();
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}
}
