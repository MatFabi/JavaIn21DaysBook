/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

/**
 *
 * @author Mateusz
 */
public class InstanceCounter {
    private static int numInstances=0;
    
    protected static int getCount(){
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    InstanceCounter(){
        InstanceCounter.addInstance();
    }
    public static void main(String[] args) {
        System.out.println("Rozpoczynanie z " + InstanceCounter.getCount() + " obiektów");
        for(int i=0; i<500; i++){
            new InstanceCounter();
        }
        System.out.println("Utworzono " + InstanceCounter.getCount()+" obiektów");
    }
}
