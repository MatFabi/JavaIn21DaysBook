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
public class GiftShop2 {
    public static void main(String[] arguments) {
        Storefront2 store = new Storefront2();
        store.addItem("C01", "KUBEK", "9.99", "150","TAK");
        store.addItem("C02", "DUŻY KUBEK", "12.99", "82","NIE");
        store.addItem("CO3", "PODKŁADKA", "10.49", "800","TAK");
        store.addItem("C04", "KOSZULKA", "16.99", "90","NIE");
        store.sort();
        
        for (int i = 0; i < store.getSize(); i++) {
            Item2 show = (Item2) store.getItem(i);
            System.out.println("\nIdentyfikator elementu: " + show.getId() + 
                                    "\nNazwa: "+show.getName()+"\nCena detaliczna: " + show.getRetail()+"zł" + 
                                    "\nCena: " + show.getPrice()+"zł " + 
                                    "\nSztuk: "+show.getQuantity());
        }
    }
}

