/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderPatternPractice;

/**
 *
 * @author anticn
 */
public class MainApp {

    /*
     * Video Reference: https://youtu.be/MaY_MDdWkQw
     */
    public static void main(String[] args) {
        CarBuilder cb = new CarBuilder();
        cb.model("Yugo").color("Red").nbrOfDoors(3);
        Car yugo = cb.build();
        System.out.println(yugo);
        
        System.out.println("=====================================");

        Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.buildBugatti(builder);
        builder.model("Chiron");
        System.out.println(builder.build());
        
        System.out.println("====================================");

        CarSchemaBuilder schemaBuilder = new CarSchemaBuilder();
        director.buildLambo(schemaBuilder);
        schemaBuilder.engine("90").nbrOfDoors(3);
        System.out.println(schemaBuilder.build());

    }

}