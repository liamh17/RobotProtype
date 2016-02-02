
package org.usfirst.frc.team3167.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Joystick;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /*final String defaultAuto = "Default";
    final String customAuto = "My Auto";
    String autoSelected;
    SendableChooser chooser;*/
	
	private Joystick driveStick; 
	
	private CANJaguar leftMotorA;
	//private CANJaguar leftMotorB;
	
	private CANJaguar rightMotorA;
	//private CANJaguar rightMotorB;
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() 
    {
    	driveStick = new Joystick(1); 
    	
    	leftMotorA = new CANJaguar(1);
    	//LeftMotorB = new Jaguar(2);
    	
    	rightMotorA = new Jaguar(3);
    	//rightMotorB = new Jaguar(4);
    	
    	/*chooser = new SendableChooser();
        chooser.addDefault("Default Auto", defaultAuto);
        chooser.addObject("My Auto", customAuto);
        SmartDashboard.putData("Auto choices", chooser);*/
    }
    
    public void autonomousInit() 
    {
    		
    	/*autoSelected = (String) chooser.getSelected();
    	//autoSelected = SmartDashboard.getString("Auto Selector", defaultAuto);
		System.out.println("Auto selected: " + autoSelected);*/
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() 
    {    	
    	
    	/*switch(autoSelected) {
    	case customAuto:
        //Put custom auto code here   
            break;
    	case defaultAuto:
    	default:
    	//Put default auto code here
            break;
    	}*/
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() 
    {
        if(driveStick.getRawButton(5)) 
        {
        	leftMotorA.set();
        	rightMotorA.set(-0.5); 
        }
        else if(driveStick.getRawButton(3)) 
        {
        	leftMotorA.set(-0.5);
        	rightMotorA.set(0.5);
        }
        else if(driveStick.getRawButton(2)) //Trigger
        {
        	leftMotorA.set(0.5);
        	rightMotorA.set(0.5);
        }
        else if(driveStick.getRawButton(3)) //Side button
        {
        	leftMotorA.set(-0.5); 
        	rightMotorA.set(-0.5);
        }
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    public void disabledInit() 
    {
    	System.out.println("The robot is ready to rock and roll!");
    }
    
}
