/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryDesignPatternLecture;

/**
 *
 * @author anticn
 */
// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications

public class EnemyShipFactory{
	// This could be used as a static method if we
	// are willing to give up subclassing it
	
	public EnemyShip makeEnemyShip(String newShipType){
		EnemyShip newShip = null;
		
		if (newShipType.equals("U")){
			return new UFOEnemyShip();
		} else 
		if (newShipType.equals("R")){
			
			return new RocketEnemyShip();
		} else 
		if (newShipType.equals("B")){
			
			return new BigUFOEnemyShip();
		} else return null;
	}
	
}