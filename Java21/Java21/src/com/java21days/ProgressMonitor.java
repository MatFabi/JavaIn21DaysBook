/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mateusz
 */
public class ProgressMonitor extends JFrame{
    JProgressBar current;
    JTextArea out;
    JButton find;
    int num =0;
    
    public ProgressMonitor(){
        super("Monitorowanie postępu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(205,68);
        setLayout(new FlowLayout());
        current = new JProgressBar(0, 2000);
        current.setValue(0);
        current.setStringPainted(true);
        add(current);
    }
    public void iterate(){
        while(num<2000){
        current.setValue(num);
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){}
        num+=95;
    }
    }
    private void setLookAndFeel(){
        try {
                UIManager.setLookAndFeel(
                "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception e){
            System.err.println("Nie moge wczytac wygladu systemowego " +e);
        }
    } 
    public static void main(String[] args) {
        ProgressMonitor frame = new ProgressMonitor();
        frame.setVisible(true);
        frame.iterate();
    }
}
