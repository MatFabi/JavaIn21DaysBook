/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import javax.swing.*;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mateusz
 */
public class Slider extends JFrame {
    public Slider(){
        super("Suwak");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        JSlider pick = new JSlider(JSlider.HORIZONTAL, 0,30, 5);
        pick.setMajorTickSpacing(10);
        pick.setMinorTickSpacing(1);
        pick.setPaintTicks(true);
        pick.setPaintLabels(true);
        add(pick);
        pack();
        setVisible(true);
    }
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch(Exception e){
            System.err.println("nie potrafie wczyta wyglądu systemowego " +e);
        }
    }
    public static void main(String[] args) {
        Slider frame = new Slider();
    }
}
