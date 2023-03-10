/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ailtongfd
 */
public class PaymentCard {
    
    private double balance;
    
    public PaymentCard (double openingBalance) {
        
        this.balance = openingBalance;
    }
    
    public String toString() {
        
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void addMoney(double money) {
        
        if (money < 0) {
            
            return;
        }
        
        if (this.balance + money <= 150.0) {
            
            this.balance += money;
            
        } else {
            
            this.balance = 150.0;
        }
    }
    
    
    public void eatAffordably() {
        
        if (this.balance >= 2.60) {
            
            this.balance-= 2.60;
        }
        
        
    }
    
    public void eatHeartily() {
        
        
        if (this.balance >= 4.60) {
            
            this.balance-= 4.60;
        }
    }
    
    
}
