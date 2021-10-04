/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.nwmissouri.zoo04lab;

/**
 *
 * @author Sandhya Nidigonda
 */
public class Duck extends Animal {
    public Duck(String name){
        super(name);
    } 
    @Override
     public  void speak() {
        System.out.println("I am Duck named " +this.name);
}
    
     public  void eat() {
        System.out.println("I eat earthworms");
}
    
     public  void sleep() {
        System.out.println("I sleep on water");
} 
}
