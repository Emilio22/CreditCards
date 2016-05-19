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
public abstract class Card {
    
    
    private double interest = 0;
    private double balance;
    private double rate = 0;
    private String type = "";
    
    
    public Card(double balance, double rate, String type){
            this.rate = rate;
            this.balance = balance;
            this.interest = setInterest(balance, rate);
            this.type = type;
            
    }
    
    private double setInterest(double balance, double rate){
       return balance * rate; 
    }
    
    public double getInterest(){
        return interest;
    } 
  
    public void setBalance(){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public double getRate(){
        return rate;
    }

    @Override
    public String toString(){
        return String.format("Type: %s, balance: $%.2f, interest: $%.2f, rate: %.2f \n",type, balance, interest, rate);
    }
}
