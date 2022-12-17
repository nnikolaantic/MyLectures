/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderPatternLecture;

/**
 *
 * @author anticn
 */
// The director / engineer class creates a Robot using the
// builder interface that is defined (OldRobotBuilder)
public class RobotEngineer {

    private RobotBuilder robotBuilder;

    // OldRobotBuilder specification is sent to the engineer // ON ovde moze da primi Objekat OldRobotBulder class-e a i neke druge u buducnosti zbog interfesa.. cini ga generickim
    public RobotEngineer(RobotBuilder robotBuilder) {
        this.robotBuilder = robotBuilder;
    }

    // Return the Robot made from the OldRobotBuilder spec
    public Robot getRobot() {
        return this.robotBuilder.getRobot();
    }

    // Execute the methods specific to the RobotBuilder 
    // that implements RobotBuilder (OldRobotBuilder)
    public void makeRobot() {

        this.robotBuilder.buildRobotHead();
        this.robotBuilder.buildRobotTorso();
        this.robotBuilder.buildRobotArms();
        this.robotBuilder.buildRobotLegs();

    }

}
