/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Mateusz
 */
public class Diagram1 extends JFrame{
    private static ArrayList<JTextField> lista = new ArrayList<>();
    JButton btnFieldsAdd, btnSum;
    JPanel pane;
    
    Diagram1(){
        super("Diagram");
        setSize(450,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        pane = new JPanel();
        BorderLayout bl = new BorderLayout();
        pane.setLayout(bl);
        
        
        JPanel jp = new JPanel();
        GridLayout gl =new GridLayout(2,2);
        jp.setLayout(gl);

        
        
        btnFieldsAdd = new JButton("Dodaj element");
        btnSum = new JButton("Suma");
       
        btnFieldsAdd.addActionListener(event->listUpdate());
        btnSum.addActionListener(event->addUp());
        lista.add(new JTextField(15));
     
        
        
        pane.add(btnFieldsAdd);              
        pane.add(jp);
        pane.add(btnSum);
        pane.add(lista.get(0));
        
        add(pane);        
        
        
        setVisible(true);      
    }
    

   
    public void listUpdate(){
        lista.add(new JTextField(15));      
        pane.add(lista.get(lista.size()-1));
        revalidate();
        repaint();      
    }

    public void addUp(){
        boolean noEmptyFields = true;            
            for(int i=1; i<lista.size();i++){
                if(lista.get(i).getText().length()==0){
                    noEmptyFields=false;              
                }
            }
        if(noEmptyFields){
            float sum = 0;
            try{
                for(int i=0;i<lista.size();i++){
                    sum+=Float.parseFloat(lista.get(i).getText());                   
                }
                System.out.println(""+sum);
            } catch (NumberFormatException nfe){
                System.out.println("Błąd: " + nfe); 
            }
        }   
    }
    
    public static void main(String[] args) {
        Diagram1 d = new Diagram1();
        System.out.println(lista.size());
    }    
}
