package org.usfirst.frc.team6662.robot.subsystems;

import org.usfirst.frc.team6662.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class PneumaticsSub extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	DoubleSolenoid dSolenoid = new DoubleSolenoid(RobotMap.SOLE_CHANNEL_A,RobotMap. SOLE_CHANNEL_B);
	Solenoid sSolenoid = new Solenoid(RobotMap.SSOLE_CHANNEL);
//All methods for rolley grabber
	public void setPush()
	{
		dSolenoid.set(DoubleSolenoid.Value.kForward);
	}
	
	
	public void setReverse()
	{
		dSolenoid.set(DoubleSolenoid.Value.kReverse);
	}
	
	public void setOff()
	{
		dSolenoid.set(DoubleSolenoid.Value.kOff);
	}
	//end of rolley grabber methods
	
	public void setSingOn()
	{
		sSolenoid.set(true);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

