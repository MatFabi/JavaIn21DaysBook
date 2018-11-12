/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import javax.swing.*;

/**
 *
 * @author Mateusz
 */
public class SurveyFrame extends JFrame{
    public SurveyFrame(){
        super("Ankieta");
        setSize(290,140);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        SurveyWizard wiz= new SurveyWizard();
        add(wiz);
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
        SurveyFrame surv = new SurveyFrame();
    }
}
