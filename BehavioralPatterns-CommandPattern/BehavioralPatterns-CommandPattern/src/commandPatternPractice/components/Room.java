/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandPatternPractice.components;

/**
 *
 * @author anticn
 */
public class Room extends Component {

    private final Curtains curtains;

    public Room() {
        this.curtains = new Curtains();
    }

    public Curtains getCurtains() {
        return curtains;
    }

    public boolean curtainsOpen() {
        return curtains.isOpen();
    }

}
