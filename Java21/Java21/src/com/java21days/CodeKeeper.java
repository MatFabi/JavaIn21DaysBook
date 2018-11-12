/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java21days;

import java.util.*;

/**
 *
 * @author Mateusz
 */
public class CodeKeeper {
    ArrayList list;
    String[] codes = {"Alfa", "lambda", "gamma", "delta", "zeta"};
    
    public CodeKeeper(String[] userCodes){
        list = new ArrayList();
        for (int i=0; i<codes.length; i++){
            addCode(codes[i]);
        }
        for (int j=0; j<userCodes.length; j++){
            addCode(userCodes[j]);
        }
        for(Iterator ite = list.iterator(); ite.hasNext();){
            String output = (String) ite.next();
            System.out.println(output);
        }
    }
    private void addCode(String code){
        if (!list.contains(code)){
            list.add(code);
        }
    }
 
    public static void main(String[] arguments) {
        CodeKeeper keeper = new CodeKeeper(arguments);
        
    }
}
