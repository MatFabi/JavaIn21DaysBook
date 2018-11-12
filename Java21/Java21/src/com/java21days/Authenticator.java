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
public class Authenticator  extends javax.swing.JFrame{
    JTextField username = new JTextField(15);
    JPasswordField password = new JPasswordField(15);
    JTextArea comments = new JTextArea(4,15);
    JButton ok = new JButton("ok");
    JButton cancel = new JButton("cancel");
    
    public Authenticator(){
        super("Informacje o koncie");
        setSize(300,220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pane = new JPanel();
        JLabel usernameLabel = new JLabel("Użytkownik: ");
        JLabel passwordLabel = new JLabel("Hasło: ");
        JLabel commentsLabel = new JLabel("Komentarz: ");
        
        comments.setLineWrap(true);
        comments.setWrapStyleWord(true);
        
        pane.add(usernameLabel);
        pane.add(username);
        pane.add(passwordLabel);
        pane.add(password);
       
        pane.add(commentsLabel);
        pane.add(comments);
        pane.add(ok);
        pane.add(cancel);
        
        add(pane);
        setVisible(true);
    }
    public static void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFee");
        
    } catch (Exception exc){
            System.out.println(exc.getMessage());
    }
}
    public static void main(String[] args) {
        Authenticator.setLookAndFeel();
        Authenticator auth = new Authenticator();
    }
}