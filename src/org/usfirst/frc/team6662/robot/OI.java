/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team6662.robot;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team6662.robot.RobotMap;

public class OI {
	
	private static Joystick stick = new Joystick(RobotMap.JOYSTICK_PORT);
	
	public static Joystick getJoystick() {
		return stick;
	}
	
	public static boolean getTrigger()
	{
		return stick.getTriggerPressed();
	}

	
	
}

