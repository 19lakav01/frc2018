/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6662.robot;

import org.usfirst.frc.team6662.robot.commands.AvoidCollision;
import org.usfirst.frc.team6662.robot.commands.JoystickTankDrive;
import org.usfirst.frc.team6662.robot.subsystems.Drivetrain
import org.usfirst.frc.team6662.robot.subsystems.RolleyGrabber;
import org.usfirst.frc.team6662.robot.commands.CloseClaw;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

public class Robot extends TimedRobot {
	public static RolleyGrabber rolleyGrabber ;
	public static Drivetrain drivetrain;
	public static OI oi;
	Command joystickTankDrive;
	Command avoidCollision;
	Command closeClaw;
	
	String fieldData;
    	char allianceSwitch;
    	char allianceScale;
    	char opponentSwitch;
    	public static Boolean isAutonomous;
	
	@Override
	public void robotInit() {
		oi = new OI();
		rolleyGrabber = new RolleyGrabber ();
		drivetrain = new Drivetrain();
		joystickTankDrive = new JoystickTankDrive();
		avoidCollision = new AvoidCollision();
		closeClaw = new CloseClaw();
		 
		drivetrain.gyro.initGyro();
				drivetrain.gyro.calibrate();
	}

	@Override
	public void autonomousInit(){
		Robot.drivetrain.getSonic().setAutomaticMode(true);
    		fieldData = DriverStation.getInstance().getGameSpecificMessage();
    		allianceSwitch = fieldData.charAt(0);
    		allianceScale = fieldData.charAt(1);
    		opponentSwitch = fieldData.charAt(2);
    		isAutonomous = true;
		
		if (allianceSwitch == 'L'){
      		//code for the autonomous will go in these spaces
    		}
    		else if(allianceSwitch == 'R') {
  		
    		}
    
    		if (allianceScale == 'L'){
    
    		}
    		else if(allianceScale == 'R'){
    		
    		}
    
    		if (opponentSwitch == 'L'){
    		
    		}
    		else if(opponentSwitch == 'R'){
    		
    		}
	}
	
	@Override
	public void autonomousPeriodic(){
		avoidCollision.start();
    		Scheduler.getInstance().run();
    		
	}		
	
	@Override
	public void teleopInit() {
		joystickTankDrive.start();
		closeClaw.start()
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}
}
