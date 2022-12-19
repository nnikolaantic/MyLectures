/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatorPatternLectureNO;

/**
 *
 * @author anticn
 */

// Jos jedan zaposleni
public class JTPoorman extends Colleague {

    public JTPoorman(Mediator newMediator) {
        super(newMediator);
        System.out.println("JT Poorman signed up with the stockexchange\n");
    }

}
