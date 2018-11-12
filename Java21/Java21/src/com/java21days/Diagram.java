/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Mateusz
 */
public class Diagram extends JFrame implements ActionListener{
    JButton dodaj;
    JLabel info,data;
    public Diagram(){
        super("Diagram!");
        setSize(350,90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();

        
        dodaj = new JButton("Dodaj");
        info = new JLabel("Dodaj dane w %");
        data = new JLabel("Dane: ");
        
         ArrayList<JLabel> newLabels = new ArrayList<>();
        for(JLabel label:newLabels){
              add(label);
            }
  
        
        dodaj.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                newLabels.add(new JLabel("Dane :"));  
                System.out.println(newLabels);
            
            }
        });
        
    
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);       
        setLayout(flow);
        add(dodaj);
        add(info);
        add(data);
        setVisible(true);
        
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
        Diagram d= new Diagram();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
