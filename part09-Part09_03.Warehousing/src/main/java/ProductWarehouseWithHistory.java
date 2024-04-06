/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory ch;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {

        super(productName, capacity);
        this.ch = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }

    public String history() {

        return ch.toString();
    }

    @Override
    public void addToWarehouse(double amount) {

        super.addToWarehouse(amount);
        ch.add(super.getBalance());
        
    }
    
    @Override
    public double takeFromWarehouse(double amount) {
        
        double value = super.takeFromWarehouse(amount);
        ch.add(super.getBalance());
        return value;
    }
    
    public void printAnalysis() {
        
        System.out.println("Product:" + super.getName());
        System.out.println("History:" + this.ch.toString());
        System.out.println("Largest amount of product:" + ch.maxValue());
        System.out.println("Smallest amount of product:" + ch.minValue());
        System.out.println("Average:" + ch.average());
    }

}
