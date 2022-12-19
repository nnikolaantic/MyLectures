/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatorPatternLectureNO;

/**
 *
 * @author anticn
 */
public interface Mediator {

    public void saleOffer(String stock, int shares, int collCode);

    public void buyOffer(String stock, int shares, int collCode);

    public void addColleague(Colleague colleague);

}
