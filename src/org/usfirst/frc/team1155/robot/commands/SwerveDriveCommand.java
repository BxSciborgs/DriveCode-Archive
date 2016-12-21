package org.usfirst.frc.team1155.robot.commands;

import org.usfirst.frc.team1155.robot.Robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class SwerveDriveCommand extends Command{
	
	CANTalon FLdrive, FLsteer, RLdrive, RLsteer, FRdrive, FRsteer, RRdrive, RRsteer;
	Joystick rightJoy, leftJoy;
	AnalogGyro gyro;

	double forwardRaw;
	double strafeRaw;
	double rotateClockwiseRaw;
	double temp;
	double forwardFieldCentric;
	double strafeFieldCentric;
	double wheelbase;
	double trackwidth;
	double diagonal;
	double a;
	double b;
	double c;
	double d;
	double frontRSpeed, frontLSpeed, backLSpeed, backRSpeed; //Front Right, Front Left, Rear Left, Rear Right Wheel Speeds, respectively
	double frontRAngle, frontLAngle, backLAngle, backRAngle; //Wheel Angles
	double max;
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		requires(Robot.drive);
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
