/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.FlowLayout;
import javax.swing.*;

/**
 *
 * @author Mateusz
 */
public class Alphabet  extends JFrame{
    public Alphabet(){
        super("Alphabet");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(360,120);
        FlowLayout lm = new FlowLayout(FlowLayout.LEFT);
        setLayout(lm);
        JButton a = new JButton("Alibi");
        JButton b = new JButton("Biurko");
        JButton c = new JButton("Ciało");
        JButton d = new JButton("Dowód");
        JButton e = new JButton("Ekran");
        JButton f = new JButton("Fasada");
        
        add(a);
        add(b);
        add(c);
        add(d);
        add(e);
        add(f);
        setVisible(true);
    }
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e){
            System.err.println("Nie potrafie wczytac systemowego wygladu " +e);
        }
    }
    public static void main(String[] args) {
        Alphabet frame = new Alphabet();
    }
}
