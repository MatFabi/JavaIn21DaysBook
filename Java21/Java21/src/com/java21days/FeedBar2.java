/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

/**
 *
 * @author Mateusz
 */
public class FeedBar2 extends JFrame {
    public FeedBar2(){
        super("Pasek narzędziowy");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLookAndFeel();
        
        ImageIcon loadIcon = new ImageIcon("load.gif");
        ImageIcon saveIcon = new ImageIcon("sabe.gif");
        ImageIcon subscribeIcon = new ImageIcon("subscribe.gif");
        ImageIcon unsubscribeIcon = new ImageIcon("unsubscribe.gif");
        
        JButton load = new JButton("Wczytaj", loadIcon);
        JButton save = new JButton("Zapisz", saveIcon);
        JButton sub = new JButton("Subskrybuj", subscribeIcon);
        JButton unsub = new JButton("Wyrejestruj", unsubscribeIcon);
        
        JToolBar bar = new JToolBar();
        bar.add(load);
        bar.add(save);
        bar.add(sub);
        bar.add(unsub);
        
        JMenuItem j1 = new JMenuItem("Wczytaj");
        JMenuItem j2 = new JMenuItem("Zapisz");
        JMenuItem j3 = new JMenuItem("Zarejestruj");
        JMenuItem j4 = new JMenuItem("Wyrejestruj");
        
        JMenuBar menubar = new JMenuBar();
        JMenu menu = new JMenu("Źródła danych");
        menu.add(j1);
        menu.add(j2);
        menu.addSeparator();
        menu.add(j3);
        menu.add(j4);
        menubar.add(menu);
        
        JTextArea edit = new JTextArea(8,40);
        JScrollPane scroll = new JScrollPane(edit);
        BorderLayout bord = new BorderLayout();
        setLayout(bord);
        add("North", bar);
        add("Center", scroll);
        setJMenuBar(menubar);
        pack();
        setVisible(true);                
    }
    private void setLookAndFeel(){
        try {
            UIManager.setLookAndFeel(
            "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch(Exception exc) {
            System.err.println("Nie potrafię wczytać systemowego wyglądu" + exc);
        }
    }
    public static void main(String[] args) {
        FeedBar2 frame = new FeedBar2();
    }
}
