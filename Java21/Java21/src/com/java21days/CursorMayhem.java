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
public class CursorMayhem extends JFrame{
    JButton harry,wade,hansel;
    
    public CursorMayhem(){
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
        
        ActionListener act = new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                if(evt.getSource()==harry){
                    setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
                }
                if(evt.getSource()==wade){
                    setCursor(new Cursor(Cursor.WAIT_CURSOR));
                }
                if(evt.getSource()==hansel){
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                }
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
        new CursorMayhem();
    }
}
