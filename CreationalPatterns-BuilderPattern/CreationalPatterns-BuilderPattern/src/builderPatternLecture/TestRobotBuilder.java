/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderPatternLecture;

/**
 *
 * @author anticn
 */
public class TestRobotBuilder {
	//OVDE JE CELA FORA BILA DA SE NAPRAVI BLUEPRINT za pravljenje robota sto je u ovoj situaciji RobotEngineer/Director
	public static void main(String[] args){
		// Get a RobotBuilder of type OldRobotBuilder
		RobotBuilder oldStyleRobot = new OldRobotBuilder();
		// Pass the OldRobotBuilder specification to the engineer
		RobotEngineer robotEngineer = new RobotEngineer(oldStyleRobot);
		// Tell the engineer to make the Robot using the specifications
		// of the OldRobotBuilder class
		robotEngineer.makeRobot();
		// The engineer returns the right robot based off of the spec
		// sent to it on line 11
		Robot firstRobot = robotEngineer.getRobot();
		System.out.println("Robot Built");
		System.out.println("Robot Head Type: " + firstRobot.getRobotHead());
		System.out.println("Robot Torso Type: " + firstRobot.getRobotTorso());
		System.out.println("Robot Arm Type: " + firstRobot.getRobotArms());
		System.out.println("Robot Leg Type: " + firstRobot.getRobotLegs());
		
	}
	
}