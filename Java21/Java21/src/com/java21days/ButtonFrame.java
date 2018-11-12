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
public class ButtonFrame extends JFrame {
    JButton load = new JButton("wczytaj");
    JButton save = new JButton("zapisz");
    JButton unsubscribe = new JButton("wyrejestruj");
    
    public ButtonFrame(){
        super("Ramka z przyciskami");
        setSize(340,170);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(load);
        pane.add(save);
        pane.add(unsubscribe);
        add(pane);
        setVisible(true);
    }
    private static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch (Exception exc){
            System.out.println(exc.getMessage());
    } 
        
    }
    public static void main(String[] args) {
        setLookAndFeel();
        ButtonFrame bf = new ButtonFrame();
    }
}
