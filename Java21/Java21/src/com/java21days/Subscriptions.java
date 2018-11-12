/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import javax.swing.*;

/**
 *
 * @author Mateusz
 */
public class Subscriptions extends JFrame {
    String[] subs = {"Burningbird", "Freeform Goodness", "IdeoPlex", "Inessential","Interwingly","Now this","Rasterweb","RC3","Whole Lotta nothing"};
    JList<String> subList = new JList<>(subs);
    
    public Subscriptions(){
        super("Subskrypcje");
        setSize(150,335);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel subLabel = new JLabel("Subskrypcje RSS:");
        panel.add(subLabel);
        subList.setVisibleRowCount(1);
        JScrollPane scroller = new JScrollPane(subList);
        panel.add(scroller);;
        add(panel);
        setVisible(true);
    }
    public static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            
        } catch(Exception exc){
            System.out.println(exc.getMessage());
        }
    }
    public static void main(String[] args) {
        Subscriptions.setLookAndFeel();
        Subscriptions app = new Subscriptions();
    }
}
