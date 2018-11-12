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
public class IconFrame extends JFrame {
    JButton load, save, subscribe, unsubscribe;
    
    public IconFrame(){
        super("Ramka z ikonami");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        ImageIcon loadIcon = new ImageIcon("load.gif");
        ImageIcon saveIcon = new ImageIcon("save.gif");
        ImageIcon subscribeIcon = new ImageIcon("subscribe.gif");
        ImageIcon unsubscribeIcon = new ImageIcon("unsubscribe.gif");
        
        load = new JButton("Wczytaj", loadIcon);
        save = new JButton("zapisz",saveIcon);
        subscribe = new JButton("subskrybuj",subscribeIcon);
        unsubscribe = new JButton("Wyrejestruj",unsubscribeIcon);
        
        panel.add(load);
        panel.add(save);
        panel.add(subscribe);
        panel.add(unsubscribe);
        
        add(panel);
        pack();
        setVisible(true);
    }
    public static void main(String[] args) {
        IconFrame ike = new IconFrame();
    }
    
}
