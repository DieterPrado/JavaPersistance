/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catapp;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author dayte
 */
public class Main {
    public static void main(String[] args) throws IOException{
        int menuOption = -1;
        String[] buttons = {"1. ver gatos", "2. salir"};
        do{
            
            String option = (String) JOptionPane.showInputDialog(null, "Gatitos java", "Menu principal", JOptionPane.INFORMATION_MESSAGE,
                    null, buttons, buttons[0]);
            
            for (int i = 0; i < buttons.length; i++) {
                if(option.equals(buttons[i])){
                    menuOption = i;
                }
            }
            
            switch(menuOption){
                case 0:
                    serviceCats.seeCats();
                    break;
                default:
                    break;
            }
            
        }while(menuOption != 1);  
        
        
    }
}
