/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.docexample;

/**
 * Main class to test all the methods
 * 
 * @author Petrus18002
 */
public class Main {
    /**
     * Main method to test all the classes and methods
     * 
     * @param args, Start arguments 
     */
    public static void main(String[] args) {
        Greeting morningGreeting = new Morning();
        System.out.println(morningGreeting.greet());
        System.out.println(morningGreeting.greetPerson("Rick"));
        
        Greeting eveningGreeting = new Evening();
        System.out.println(eveningGreeting.greet());
        System.out.println(eveningGreeting.greetPerson("Rick"));
        
    }
}
