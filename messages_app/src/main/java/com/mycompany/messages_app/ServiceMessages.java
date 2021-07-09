/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.messages_app;

import java.util.Scanner;

/**
 *
 * @author dayte
 */
public class ServiceMessages {
     public static void createMessage(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Escribe tu mensaje");
         String message = sc.nextLine();
         
         System.out.println("Escribe el autor del mensaje");
         String author = sc.nextLine();
         
         Messages messageObject = new Messages();
         messageObject.setMessage(message);
         messageObject.setMessageAuthor(author);
         DAOMessages.createMessagesDB(messageObject);
   
     }
     
     public static void listMessage(){
         DAOMessages.readMessagesDB();
     }
     
     public static void deleteMessage(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Escribe el ID del mensaje a borrar");
         int messageId = sc.nextInt();
         DAOMessages.deleteMessagesDB(messageId);
     }
     
     public static void editMessage(){
         Scanner sc = new Scanner(System.in);
         System.out.println("Escribe el ID del mensaje a editar");
         int messageId = sc.nextInt();
         sc.nextLine();
         System.out.println("Escribe el nuevo mensaje");
         String message = sc.nextLine();
         Messages messageObject = new Messages();
         messageObject.setMessage(message);
         messageObject.setMessageId(messageId);
         DAOMessages.editMessagesDB(messageObject);
     }
}
