/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
import wallet.*;
/**
 *
 * @author emiliorodriguez
 */
public class Person {
    
    private Wallet[] wallets;
    private double totalInterest;
    private double totalBalance;
    
    public Person(Wallet[] wallets){
        setWallets(wallets);
        calcTotalInterest();
        calcTotalBalance();
        
    }
    
    private void setWallets(Wallet[] wallets){
        this.wallets = wallets;
    }
    
    private void calcTotalInterest(){
        for (Wallet wallet : wallets){
            this.totalInterest += wallet.getTotalInterest();
        }
    }
    
    public double getTotalInterest(){
        return totalInterest;
    }
        
    private void calcTotalBalance(){
        for (Wallet wallet : wallets){
            this.totalBalance += wallet.getTotalBalance();
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
