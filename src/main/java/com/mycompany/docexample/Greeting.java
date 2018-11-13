/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.docexample;

/**
 * Greeting interface
 * 
 * @author Petrus18002
 */
public interface Greeting {
    
    /**
     * Method which return a greet message
     * 
     * @return String, greet message with name
     */
    public String greet();
    
    /**
     * Method which return a greet message for a specific person
     * 
     * @param name, Person name to greet
     * @return String, greet message with name
     */
    public String greetPerson(String name);
    
}
