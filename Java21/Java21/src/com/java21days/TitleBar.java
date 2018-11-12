/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Mateusz
 */
public class TitleBar extends JFrame implements ActionListener{
    JButton b1;
    JButton b2;
    
    public TitleBar(){
        super("Pasek tytułu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        b1 = new JButton("Rosenkratz");
        b2 = new JButton("Guildstern");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        FlowLayout flow = new FlowLayout();
        setLayout(flow);
        add(b1);
        add(b2);
        pack();
        setVisible(true);
    }
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source == b1) {
            setTitle("Rosenkrantz");
        } else if (source == b2) {
            setTitle("Guildenstern");
        }
        repaint();
    }
       private void setLookAndFeel(){
      try{
          UIManager.setLookAndFeel(
          "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
      SwingUtilities.updateComponentTreeUI(this);
      } catch (Exception e){
          System.err.println("Nie potrafię wczytać wyglądu systemowego " + e);
        }
    }
       public static void main(String[] args) {
        TitleBar tb = new TitleBar();
    }

    
}
