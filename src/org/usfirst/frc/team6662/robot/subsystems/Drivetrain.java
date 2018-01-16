package org.usfirst.frc.team6662.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import org.usfirst.frc.team6662.robot.RobotMap;

public class Drivetrain extends Subsystem {
	
		   Spark m_frontLeft = new Spark(RobotMap.TOP_LEFT_MOTOR);
		   Spark m_rearLeft = new Spark(RobotMap.BOTTOM_LEFT_MOTOR);
		   SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

		   Spark m_frontRight = new Spark(RobotMap.TOP_RIGHT_MOTOR);
		   Spark m_rearRight = new Spark(RobotMap.BOTTOM_RIGHT_MOTOR);
		   SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);
		   DifferentialDrive drivetrain = new DifferentialDrive(m_left, m_right);
	
	public void drive(double leftSpeed,double rightSpeed) {
		drivetrain.tankDrive(leftSpeed, rightSpeed);
	}
	
	public Drivetrain() {
		super("Drivetrain");
		
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
	}
}
