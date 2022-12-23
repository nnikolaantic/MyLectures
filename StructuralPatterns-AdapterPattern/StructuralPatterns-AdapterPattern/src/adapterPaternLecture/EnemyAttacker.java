/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterPaternLecture;

/**
 *
 * @author anticn
 */
// This is the Target Interface : This is what the client
// expects to work with. It is the adapters job to make new 
// classes compatible with this one.
public interface EnemyAttacker {

    public void fireWeapon();

    public void driveForward();

    public void assignDriver(String driverName);

}
