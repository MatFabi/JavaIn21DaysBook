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
public class TabPanels extends JFrame{
    public TabPanels(){
        super("Zakładki");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        setSize(480,218);
        JPanel mainSettings = new JPanel();
        JPanel advancedSettings = new JPanel();
        JPanel privacySettings = new JPanel();
        JPanel emailSettings = new JPanel();
        JPanel securitySettings = new JPanel();
        
        JTabbedPane tabs = new JTabbedPane();
        tabs.addTab("Główna", mainSettings);
        tabs.addTab("Zaawansowana", advancedSettings);
        tabs.addTab("Prywatna", privacySettings);
        tabs.addTab("E-mail", emailSettings);
        tabs.addTab("Bezpieczeństwo", securitySettings);
        add(tabs);
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
        TabPanels frame = new TabPanels();
    }
}
