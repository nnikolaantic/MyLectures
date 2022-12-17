/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builderPatternPractice;

/**
 *
 * @author anticn
 */
public interface Builder {

    Builder id(int id);

    Builder brand(String brand);

    Builder model(String model);

    Builder color(String color);

    Builder height(int height);

    Builder engine(String engine);

    Builder nbrOfDoors(int nbrOfDoors) ;

}