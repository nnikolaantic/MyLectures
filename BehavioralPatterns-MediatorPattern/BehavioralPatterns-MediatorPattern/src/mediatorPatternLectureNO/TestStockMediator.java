/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mediatorPatternLectureNO;

/**
 *
 * @author anticn
 */
public class TestStockMediator{
	
	public static void main(String[] args){
		
		StockMediator nyse = new StockMediator();
		
		GormanSlacks broker = new GormanSlacks(nyse);
		
		JTPoorman broker2 = new JTPoorman(nyse);
		
		broker.saleOffer("MSFT", 100);
		broker.saleOffer("GOOG", 50);
		
		broker2.buyOffer("MSFT", 100);
		broker2.saleOffer("NRG", 10);
		
		broker.buyOffer("NRG", 10);
		
		nyse.getstockOfferings();
		
	}
	
}