/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.docexample;

/**
 *  Morning class, which has methods to return morning greetings
 * 
 * @author Petrus18002
 */
public class Morning implements Greeting{

    /**
     * Method which returns a morning greeting
     * 
     * @return String, morning greeting
     */
    @Override
    public String greet() {
        return "Good morning";
    }

    /**
     * Method which returns a morning greeting for a specific person
     * 
     * @param name, Person name to greet.
     * @return String, morning greeting with name
     */
    @Override
    public String greetPerson(String name) {
        return "Good morning " + name;
    }
    
}
