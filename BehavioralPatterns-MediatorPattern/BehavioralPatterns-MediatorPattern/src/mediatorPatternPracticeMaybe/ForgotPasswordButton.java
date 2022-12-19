/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatorPatternPracticeMaybe;

/**
 *
 * @author anticn
 */
import javax.swing.*;
import java.awt.event.ActionEvent;

public class ForgotPasswordButton extends JButton implements Component {

    private Mediator mediator;

    public ForgotPasswordButton() {
        super("Forgot Password?");
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.forgotPass();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "ForgotPasswordButton";
    }

}