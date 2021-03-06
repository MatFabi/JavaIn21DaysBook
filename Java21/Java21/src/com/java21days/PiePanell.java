/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;

/**
 *
 * @author Mateusz
 */
            

    
class PiePanell extends JPanel {
    private Color color;
    private PieSlice[] slice;
    private int current = 0;
    private float totalSize = 0;
    private Color background;

    public PiePanell() {
        slice = new PieSlice[PieGraphView.getValueList().size()];
        background = getBackground();
        for(int i=0; i<PieGraphView.getValueList().size();i++){
            addSlice(colorPicker(), Float.parseFloat(PieGraphView.getValueList().get(i).getText()));
        } 
    }
    public void addSlice(Color sColor, float sSize) {
        if (current <= slice.length) {
            slice[current] = new PieSlice(sColor, sSize);
            totalSize += sSize;
            current++;
        }
    }

    public void paintComponent(Graphics comp) {
        Graphics2D comp2D = (Graphics2D) comp;
        int width = getSize().width - 50;
        int height = getSize().height - 15;
        int xInset = 5;
        int yInset = 5;
        if (width < 5) {
            xInset = width;
        }
        if (height < 5) {
            yInset = height;
        }
        comp2D.setColor(background);
        comp2D.fillRect(0, 0, getSize().width, getSize().height);
        comp2D.setColor(Color.lightGray);
        Ellipse2D.Float pie = new Ellipse2D.Float(
            xInset, yInset, width, height);
        comp2D.fill(pie);
        float start = 0;
        for (PieSlice slice1 : slice) {
            float extent = slice1.size * 360F / totalSize;
            comp2D.setColor(slice1.color);
            Arc2D.Float drawSlice = new Arc2D.Float(
                xInset, yInset, width, height, start, extent,
                Arc2D.Float.PIE);
            start += extent;
            comp2D.fill(drawSlice);
        }
    }
    public Color colorPicker(){  
        color = new Color((int)Math.random()*255, (int)Math.random()*255,(int)Math.random()*255);
        
        
       return color;
    }

}




