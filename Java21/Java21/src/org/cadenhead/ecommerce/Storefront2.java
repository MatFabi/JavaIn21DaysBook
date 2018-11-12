/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cadenhead.ecommerce;
import java.util.*;
/**
 *
 * @author Mateusz
 */
public class Storefront2 {
    private LinkedList catalog = new LinkedList();
    
    public void addItem(String id, String name, String price, String quant, String disc){
        Item2 it = new Item2(id, name, price, quant, disc);
        catalog.add(it);
    }
    public Item2 getItem(int i){
        return (Item2) catalog.get(i);
        
    }
    public int getSize(){
        return catalog.size();
    }
    public void sort(){
        Collections.sort(catalog);
    }
}
