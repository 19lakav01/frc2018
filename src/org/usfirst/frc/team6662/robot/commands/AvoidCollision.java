package org.usfirst.frc.team6662.robot.commands;

import org.usfirst.frc.team6662.robot.Robot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AvoidCollision extends Command {
	public AvoidCollision() {
		requires(Robot.drivetrain);
	}
	@Override
	protected void initialize() {
	}
	@Override
	protected void execute() {
		//while ((Robot.drivetrain.isValidRange() == true && Robot.drivetrain.getInchRange() <= 32)) {
			//if it detects something in autonomous
			//Robot.drivetrain.drive(0,0);
			//Timer.delay(2);
			// OK, now we just need to figure out how to make this specific to robots, maybe see if we can make the code detect
			//accelleration so it doesn't stop when at switch?
			
		}
	}
	@Override
	protected boolean isFinished() {
		return true;
	}
	
}
