/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package commandPatternLecture;

/**
 *
 * @author anticn
 */
public class TVRemote {
    //Postavljamo naseg recivera na Television
    // biramo koji cemo uredjaj da koristimo
    public static ElectronicDevice getDevice() {
        return new Television();
    }

}
