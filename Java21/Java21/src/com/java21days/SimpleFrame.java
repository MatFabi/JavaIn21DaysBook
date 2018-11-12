/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Mateusz
 */
public class SimpleFrame extends JFrame{
    public SimpleFrame(){
        super("Tytuł ramki");
        setSize(300,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setVisible(true);
    }
    public static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
            "com.sun.java.swing.pl.plaf.nimbus.NimbusLookAndFeel"
            );
        }catch(Exception exc){
            
        }
    }
    public static void main(String[] args) {
        setLookAndFeel();
        SimpleFrame sf = new SimpleFrame();
    }
}
