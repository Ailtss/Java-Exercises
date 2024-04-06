/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuário
 */
public class Person {
    
    private String name;
    private String address;
    
    public Person(String n, String a) {
        
        this.name = n;
        this.address = a;
    }
    
    @Override
    public String toString() {
        
        return this.name + "\n" + "  " + this.address;
    }
    
}
