/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mateusz
 */
public class CircleDiagram extends JFrame implements FocusListener{
    JTextField value1, value2, sum;
    JLabel plus,equals;
    JButton dodaj;
    
    public CircleDiagram(){
        super("Dodaj dwie liczby");
        setSize(350,90);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        setLayout(flow);
        
        
        dodaj = new JButton("Dodaj");
        value1 = new JTextField("0",5);
        plus =new JLabel("+");
        value2 = new JTextField("0",5);
        equals = new JLabel("=");
        sum = new JTextField("0",5);
        
        value1.addFocusListener(this);
        value2.addFocusListener(this);
        
        sum.setEditable(false);
        add(dodaj);
        add(value1);
        add(plus);
        add(value2);
        add(sum);
        setVisible(true);
}     
        
    
        public void focusGained(FocusEvent event){
            try{
                float total = Float.parseFloat(value1.getText()) + Float.parseFloat(value2.getText());
                sum.setText("" + total);
            } catch (NumberFormatException nfe){
                value1.setText("0");
                value2.setText("0");
                sum.setText("0");
            }
        }
        public void focusLost(FocusEvent event){
            focusGained(event);
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
        CircleDiagram frame = new CircleDiagram();
    }
}
