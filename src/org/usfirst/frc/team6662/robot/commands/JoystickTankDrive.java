package org.usfirst.frc.team6662.robot.commands;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team6662.robot.Robot;
public class JoystickTankDrive extends Command{
	
	public JoystickTankDrive(){
		requires(Robot.drivetrain); //drivetrain instance of Drivetrain class...
	}
	@Override
	protected void initialize() {
		
	}
	@Override
	protected void execute(){
		Robot.drivetrain.drive(-1 * Robot.oi.getJoystick().getRawAxis(1),
							   -1 * Robot.oi.getJoystick().getRawAxis(5));
	}

	@Override
	protected boolean isFinished() {
		
		return false;
	}
	
}
