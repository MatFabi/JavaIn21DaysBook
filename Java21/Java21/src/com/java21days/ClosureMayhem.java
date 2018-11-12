/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mateusz
 */
public class ClosureMayhem extends JFrame{
        JButton harry,wade,hansel;
    
    public ClosureMayhem(){
        super("wybierz kursor");
        setLookAndFeel();
        setSize(400,80);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        harry = new JButton("Celownik");
        add(harry);
        wade= new JButton("Oczekiwanie");
        add(wade);
        hansel = new JButton("Rączka");
        add(hansel);
        
        ActionListener act = (evt)-> {
                if(evt.getSource()==harry){
                    setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                }
                if(evt.getSource()==wade){
                    setCursor(new Cursor(Cursor.WAIT_CURSOR));
                }
                if(evt.getSource()==hansel){
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
            };
        harry.addActionListener(act);
        wade.addActionListener(act);
        hansel.addActionListener(act);
        setVisible(true);
    }
        private void setLookAndFeel(){
      try{
          javax.swing.UIManager.setLookAndFeel(
          "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
             SwingUtilities.updateComponentTreeUI(this);
      } catch (Exception e){
          
        }
    }
        public static void main(String[] args) {
        new ClosureMayhem();
    }
}
