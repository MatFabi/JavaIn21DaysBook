/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.io.*;


/**
 *
 * @author Mateusz
 */
public class ByteReader {
    public static void main(String[] args) {
        try(
            FileInputStream file = new FileInputStream("save.gif");
        ){
            boolean eof=false;
            int count=0;
            while(!eof){
                int input=file.read();
                System.out.println(input+"");
                if(input==-1)
                    eof=true;
                else
                    count++;
            }
            file.close();
            System.out.println("\nOdczytanych bajtów: "+count);
        } catch(IOException e){
            System.out.println("Błąd -- " + e.toString());
        }
    }
}
