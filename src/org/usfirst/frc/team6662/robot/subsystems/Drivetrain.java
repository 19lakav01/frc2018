package org.usfirst.frc.team6662.robot.subsystems;


import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.Ultrasonic;
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
	DoubleSolenoid shifter = new DoubleSolenoid(0, 1);
	
		  // Ultrasonic sonic = new Ultrasonic(RobotMap.ULTRASONIC_ECHO_PULSE_OUTPUT,
					//RobotMap.ULTRASONIC_TRIGGER_PULSE_INPUT);
	public void switchModesReverse() {
		shifter.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void drive(double leftSpeed,double rightSpeed) {
		drivetrain.tankDrive(leftSpeed, rightSpeed);
	}
	
	public Drivetrain() {
		super("Drivetrain");
		
	}
//	public boolean isValidRange() {return sonic.isRangeValid();}
	//public double getInchRange() {return sonic.getRangeInches();}
	//public Ultrasonic getSonic() {return sonic;}
	//make sur to fiish ode before pushing into git
	@Override
	protected void initDefaultCommand() {
		
	}
}
