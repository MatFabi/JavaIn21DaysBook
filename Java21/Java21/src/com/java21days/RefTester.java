/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.awt.Point;

/**
 *
 * @author Mateusz
 */
public class RefTester {
    public static void main(String[] args) {
        Point pt1,pt2;
        pt1= new Point(100,100);
        pt2=pt1;
        
        pt1.x=200;
        pt2.y=200;
        System.out.println("Point1: " +pt1.x + ", " +pt1.y);
        System.out.println("Point2: " +pt2.x + ", " +pt2.y);
    }
}
