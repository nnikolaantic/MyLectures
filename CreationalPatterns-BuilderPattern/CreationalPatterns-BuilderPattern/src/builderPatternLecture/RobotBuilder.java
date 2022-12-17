/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderPatternLecture;

/**
 *
 * @author anticn
 */
// Defines the methods needed for creating parts 
// for the robot
public interface RobotBuilder {

    public void buildRobotHead();

    public void buildRobotTorso();

    public void buildRobotArms();

    public void buildRobotLegs();

    public Robot getRobot();

}
