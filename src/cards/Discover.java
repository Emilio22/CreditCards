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
public class Discover extends Card{
    
    //Discover has an interest rate of 1%
    private static final double RATE = 0.01;
    
    public Discover(double balance){
    super(balance, RATE, "Discover");
    
    }
}
