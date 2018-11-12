/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cadenhead.ecommerce;

/**
 *
 * @author Mateusz
 */
public class Item2 implements Comparable {
    private String id;
    private String name;
    private double retail;
    private int quantity;
    private double price;
    private boolean noDiscount;
    
    Item2(String idIn, String nameIn, String retailIn, String qIn,String discountIn){
        id=idIn;
        name=nameIn;
        retail = Double.parseDouble(retailIn);
        quantity = Integer.parseInt(qIn);
        noDiscount = discountIn.equals("TAK");
                
        if (noDiscount){
        if(quantity>400)
            price=retail*.5D;
        else if(quantity>200)
            price=retail * .6D;
        else
            price=retail*.7D;
        price = Math.floor(price*100+.5)/100;
        }
        else{
            price=retail;
        }
    }
    @Override
    public int compareTo(Object obj){
        Item2 temp = (Item2) obj;
        if(this.price<temp.price){
           return 1;
        } else if (this.price>temp.price){
            return -1;        
        }
        return 0;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }

    public double getRetail() {
        return retail;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
    
}
