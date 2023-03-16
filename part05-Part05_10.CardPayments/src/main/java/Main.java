
public class Main {

    public static void main(String[] args) {
        // write experimental main programs here
        
        PaymentCard petesCard = new PaymentCard(10);
        
        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
        
        
        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());
        
        System.out.println("");
        System.out.println("");
        
        PaymentTerminal unicafeExactum = new PaymentTerminal();
        
        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);
        
        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);
        
        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);
        
        
        System.out.println(unicafeExactum);
        
        
        System.out.println("");
        System.out.println("");
        
        
        PaymentTerminal unicafeExactum2 = new PaymentTerminal();
        System.out.println(unicafeExactum2);
        
        PaymentCard annesCard = new PaymentCard(2);
        
        
        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
        
        
        boolean wasSuccessful2 = unicafeExactum2.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful2); 
        
        
        unicafeExactum2.addMoneyToCard(annesCard, 100);
        
        wasSuccessful2 = unicafeExactum2.eatHeartily(annesCard);
        System.out.println("there was enough money: " + wasSuccessful2);
        
        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");
        
        System.out.println(unicafeExactum2);
        
        
        
    }
}

