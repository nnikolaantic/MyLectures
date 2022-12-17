/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryDesignPatternLecture;

/**
 *
 * @author anticn
 */
public abstract class EnemyShip {

    private String name;
    private double speed;
    private double directionX;
    private double directionY;
    private double amtDamage;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getDamage() {
        return amtDamage;
    }

    public void setDamage(double newDamage) {
        amtDamage = newDamage;
    }

    public void followHeroShip() {
        System.out.println(getName() + " is following the hero");
    }

    public void displayEnemyShip() {
        System.out.println(getName() + " is on the screen");
    }

    public void enemyShipShoots() {
        System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");
    }

}
