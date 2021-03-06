// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

	// DifferentialDriveKinematics
	public static final double kTrackWidthMeters = .5883;

	// Speeds
	public static final double kWheelDiameterMeters = .158;
	
	// TrajectoryConfig
	public static final double kMaxVelocityMetersPerSecond = 0.5;
	public static final double kMaxAccelerationMetersPerSecondSq = 1;
	public static final double kDriveGearRatio = (46.0/9) * (44.0/20);
	public static final int kFalconTicksPerRotation = 2048;

	// SimpleMotorFeedforward
	public static final double kDriveS = 0.166; 
	public static final double kDriveV = 2.41; 
	public static final double kDriveA = 0.25; 

	// PIDController
	public static final double kDriveP = 0; 
	public static final double kDriveI = 0;
	public static final double kDriveD = 0;
	
	// Talon Encoder	
	public static final int kPIDIdx = 0;
	public static final int kTimeoutMs = 10;
    
}
