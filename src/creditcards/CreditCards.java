/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditcards;

import cards.*;
import wallet.*;
import person.*;

/**
 *
 * @author emiliorodriguez
 */
public class CreditCards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MasterCard card1 = new MasterCard(100);
        Visa card2 = new Visa(100);
        
        Card[] cards = {new Visa(100), new MasterCard(100), new Discover(100)};
        
        Card[] cards2 = {new Visa(100), new Discover(100)};
        Card[] cards3 = {new MasterCard(100)};
        
        
        Wallet wallet = new Wallet(cards);
        
       Wallet[] wallets = {new Wallet(cards2), new Wallet(cards3)};
       
       Person person = new Person(wallets);
       
       System.out.print(person);
       
        
        
        

             

        
    }
    
}
