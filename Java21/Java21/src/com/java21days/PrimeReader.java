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
public class PrimeReader {
    public static void main(String[] args) {
        try (FileInputStream file = new FileInputStream("400pierwszych.dat");
                BufferedInputStream buff = new BufferedInputStream(file);
                DataInputStream data = new DataInputStream(buff)) {
            
            try{
                while(true){
                    int in = data.readInt();
                    System.out.println(in + "");
                }
            } catch(EOFException eof){
                buff.close();
            }
        } catch(IOException e){
            System.out.println("Błąd -- "+e.toString());
        }
    }
}
