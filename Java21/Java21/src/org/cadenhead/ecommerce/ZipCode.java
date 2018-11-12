/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.cadenhead.ecommerce;

/**
 *
 * @author Mateusz
 */
public class ZipCode {
   private String zip="";
   
   public ZipCode(String inZipCode){
       setZipCode(inZipCode);
   }
    
   public void setZipCode(String inZip){
       if(inZip.length()==5)       
        zip=inZip;
   }
   public String getZipCode(){
       return zip;
   }
    public static void main(String[] args) {
        ZipCode zip1 = new ZipCode("44521");
        System.out.println(zip1.getZipCode());
        ZipCode zip2 = new ZipCode("444521");
        System.out.println(zip2.getZipCode());
    }   
}
