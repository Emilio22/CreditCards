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
public class Visa extends Card {
    
    //Visa has an interest rate of 10%
    private static final double RATE = 0.1;
    
    public Visa(double balance){
        super(balance, RATE, "Visa");
    }
    
}
