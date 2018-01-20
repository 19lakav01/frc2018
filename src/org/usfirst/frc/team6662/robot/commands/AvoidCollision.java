package org.usfirst.frc.team6662.robot.commands;
import org.usfirst.frc.team6662.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;
public class AvoidCollision extends Command {
	// test 
	public AvoidCollision() {
		requires(Robot.drivetrain);
	}
	@Override
	protected void initialize() {}
	@Override
	protected void execute() {
		
	}
	@Override
	protected boolean isFinished() {
		return false;
	}
	
}
