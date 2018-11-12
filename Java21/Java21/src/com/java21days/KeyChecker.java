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
public class KeyChecker extends JFrame{
    JLabel keyLabel = new JLabel("Naciśnij dowolny klawisz");
    
    public KeyChecker(){
        super("Naciśnij klawisz");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        KeyMonitor monitor = new KeyMonitor(this);
        setFocusable(true);
        addKeyListener(monitor);
        add(keyLabel);
        setVisible(true);
    }
        private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            System.err.println("Nie potrafiÄ™ wczytaÄ‡ "
                + "systemowego wyglÄ…du: " + exc);
        }
    }
        public static void main(String[] args) {
        KeyChecker.setLookAndFeel();
        new KeyChecker();
    }
        class KeyMonitor extends KeyAdapter{
            KeyChecker display;
            KeyMonitor(KeyChecker display){
                this.display = display;
            }
            public void keyTyped(KeyEvent event){
                display.keyLabel.setText("" + event.getKeyChar());
                display.repaint();
            }
        }
}
