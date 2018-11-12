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
public class Inwestycje {
    
    public static void main(String[] args) {
        double amount = 14000;
        double firstYear = amount*1.4;
        double secondYear = firstYear - 1500;
        double thirdYear = secondYear*1.12;

        System.out.println("Po 3 latach kwota jest równa: " + thirdYear);
    }

       
}
