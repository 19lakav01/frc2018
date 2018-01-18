
package org.usfirst.frc.team6662.robot;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team6662.robot.RobotMap;

public class OI {
	
	private Joystick stick = new Joystick(RobotMap.JOYSTICK_PORT);
	
	public Joystick getJoystick() {
		return stick;
	}

	
}
