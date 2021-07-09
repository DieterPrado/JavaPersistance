/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.messages_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author dayte
 */
public class Main {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("--------------");
            System.out.println("Aplicacion de mensajes");
            System.out.println("1. crear mensaje");
            System.out.println("2. listar mensajes");
            System.out.println("3. editar mensajes");
            System.out.println("4. eliminar mensajes");
            System.out.println("5. salir");
            // leemos la opcion del usuario
            option = sc.nextInt();
            
            switch (option){
                case 1:
                    ServiceMessages.createMessage();
                    break;
                case 2:
                    ServiceMessages.listMessage();
                    break;
                case 3:
                    ServiceMessages.editMessage();
                    break;
                case 4:
                    ServiceMessages.deleteMessage();
                    break;
                default:
                    break;
                       
            }
        }while(option != 5);
        
        ConnectionMysql connectionMysql = new ConnectionMysql();
         try(Connection cnn = connectionMysql.get_connection()){
             
         }catch(Exception e){
             System.out.println("e");
         }
    }
}
     