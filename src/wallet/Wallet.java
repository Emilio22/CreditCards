/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wallet;
import cards.*;

/**
 *
 * @author emiliorodriguez
 */
public class Wallet {
    
    private Card[] cards;
    private double totalInterest;
    private double totalBalance;
    
    public Wallet(Card[] cards){
        
        setCards(cards);
        calcTotalInterest();
        calcTotalBalance();     
    }
    
    private void setCards(Card[] cards){
        this.cards = cards;
    }
    
    private void calcTotalInterest(){
        for (Card card : cards) {
            this.totalInterest += card.getInterest();
        }
    }
    
    public double getTotalInterest(){
        return totalInterest;
    }
    
    private void calcTotalBalance(){
        for (Card card : cards) {
            this.totalBalance += card.getBalance();
        }
    }
    
    public double getTotalBalance(){
        return totalBalance;
    }
    
    
    @Override
    public String toString(){
        return String.format("Total Balance: $%.2f, Total Interest: $%.2f\n", totalBalance, totalInterest);
    }
    
}
