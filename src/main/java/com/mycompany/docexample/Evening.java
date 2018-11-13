/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.docexample;

/**
 * Evening class, which has methods to return evening greetings
 * 
 * @author Petrus18002
 */
public class Evening implements Greeting{

    /**
     * Method to return a evening greeting
     * 
     * @return String, evening greeting
     */
    @Override
    public String greet() {
        return "Good evening";
    }

    /**
     * Method to return a evening greeting for a specific person
     * 
     * @param name, Person name for specific greet
     * @return String, evening greeting for specific person
     */
    @Override
    public String greetPerson(String name) {
        return "Good evening " + name;
    }
    
}
