/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cards;

/**
 *
 * @author emiliorodriguez
 */
public class MasterCard extends Card {
    
    //MasterCard has an interest rate of 5%
    private static final double RATE = 0.05;
    
    public MasterCard(double balance){
        super(balance, RATE, "MasterCard");
    }

   
}
