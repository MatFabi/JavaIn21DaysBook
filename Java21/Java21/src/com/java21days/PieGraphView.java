/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JTextField;

/**
 *
 * @author Mateusz
 */
public class PieGraphView extends JFrame{
    private JButton addNewValueField, makeGraph;
    private static ArrayList<JTextField> valueList = new ArrayList<>();
    PiePanell pie;
    
    public static ArrayList<JTextField> getValueList() {
        return valueList;
    }
    private JPanel paneWest, paneNorth, paneCenter;
   
    public PieGraphView(){
       setSize(500,500);       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
       
       paneWest = new JPanel(new GridLayout(0,2)); 
       
       addNewValueField = new JButton("Add new value");       
       makeGraph = new JButton("Make graph");
       addNewValueField.addActionListener(event->listUpdate());
       makeGraph.addActionListener(event->sum());       
       
       valueList.add(new JTextField(15));
       JLabel valueNr = new JLabel("Value number: 1");
       
       paneWest.setPreferredSize(new Dimension(250, 200));
       paneWest.add(addNewValueField);
       paneWest.add(makeGraph);
       paneWest.add(valueNr);
       paneWest.add(valueList.get(0));
       add(paneWest, BorderLayout.WEST);
       
       JPanel paneNorth = new JPanel();
       JLabel programInfo = new JLabel();
       programInfo.setText("Make your own pie graph!!");
       programInfo.setHorizontalAlignment(JLabel.CENTER);
       paneNorth.add(programInfo);
       add(programInfo, BorderLayout.NORTH);
       

       setVisible(true);
    }
    
    public void listUpdate(){
        valueList.add(new JTextField(15));  
        System.out.println(valueList.size());
        paneWest.add(new JLabel("Value number: "+ valueList.size()));
        paneWest.add(valueList.get(valueList.size()-1));
        revalidate();
        repaint();      
    }
    
    public void sum(){
        boolean noEmptyFields = true;            
            for(int i=0; i<valueList.size()-1;i++){
                if(valueList.get(i).getText().length()==0){
                    noEmptyFields=false;              
                for(JTextField item:valueList){
                    if(item.getText().length()==0){
                        item.setBackground(Color.RED);
                    }
                }
                }  
                pie=new PiePanell();
                add(pie,BorderLayout.CENTER);
            }
        if(noEmptyFields){
            float sum = 0;
            try{
                for(int i=0;i<valueList.size();i++){
                    sum+=Float.parseFloat(valueList.get(i).getText());                   
                }
                System.out.println(""+sum);
            } catch (NumberFormatException nfe){
                System.out.println("Błąd: " + nfe); 
            }
        }   
    }
    public static void main(String[] args) {
        new PieGraphView();
    }
}
