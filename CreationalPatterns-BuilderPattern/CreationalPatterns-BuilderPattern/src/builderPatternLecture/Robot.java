/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderPatternLecture;

/**
 *
 * @author anticn
 */
// The concrete Robot class based on the RobotPlan interface
public class Robot implements RobotPlan {

    private String robotHead;
    private String robotTorso;
    private String robotArms;
    private String robotLegs;

    public void setRobotHead(String head) {
        robotHead = head;
    }

    public String getRobotHead() {
        return robotHead;
    }

    public void setRobotTorso(String torso) {

        robotTorso = torso;

    }

    public String getRobotTorso() {
        return robotTorso;
    }

    public void setRobotArms(String arms) {

        robotArms = arms;

    }

    public String getRobotArms() {
        return robotArms;
    }

    public void setRobotLegs(String legs) {

        robotLegs = legs;

    }

    public String getRobotLegs() {
        return robotLegs;
    }

}
