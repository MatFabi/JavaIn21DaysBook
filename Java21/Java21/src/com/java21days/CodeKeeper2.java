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
public class CodeKeeper2 {
    ArrayList<String> list;
    String[] codes = {"Alfa", "lambda", "gamma", "delta", "zeta"};
    
    public CodeKeeper2(String[] userCodes){
        list = new ArrayList<>();
        for (int i=0; i<codes.length; i++){
            addCode(codes[i]);
        }
        for (int j=0; j<userCodes.length; j++){
            addCode(userCodes[j]);
        }
        for(String code : list){           
            System.out.println(code);
        }
    }
    private void addCode(String code){
        if (!list.contains(code)){
            list.add(code);
        }
    }
 
    public static void main(String[] arguments) {
        CodeKeeper2 keeper = new CodeKeeper2(arguments);
        
    }
}
