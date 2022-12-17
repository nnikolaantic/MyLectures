/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderPatternPractice;

/**
 *
 * @author anticn
 */
public class Director {

    public void buildBugatti(Builder builder) {
        builder.brand("Bugatti")
                .color("Blue")
                .nbrOfDoors(2)
                .engine("8L")
                .height(115);
    }

    public void buildLambo(Builder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .color("Yellow")
                .height(120);
    }

}