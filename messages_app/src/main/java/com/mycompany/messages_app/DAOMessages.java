/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.messages_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dayte
 */
public class DAOMessages {
    
    public static void createMessagesDB(Messages message){
        ConnectionMysql dbConnect = new ConnectionMysql();
         
        try(Connection connectionTest = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "INSERT INTO messages(message, message_author) VALUES (?,?)";
                ps = connectionTest.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setString(2, message.getMessageAuthor());
                ps.executeUpdate();
                System.out.println("Mensaje creado satisfactoriametne");
            }catch(SQLException ex){
                System.out.println(ex);
            }
            
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void readMessagesDB(){
        
        ConnectionMysql dbConnect = new ConnectionMysql();
        PreparedStatement ps = null;
        ResultSet rs = null;
        try(Connection connectionTest = dbConnect.get_connection()){
            String query = "SELECT * FROM messages";
            ps = connectionTest.prepareStatement(query);
            rs = ps.executeQuery();
            
            while (rs.next()){
                System.out.println("ID" + rs.getInt("id_message"));
                System.out.println("Mensagge" + rs.getString("message"));
                System.out.println("Author" + rs.getString("message_author"));
                System.out.println("");
            }
    
        }catch(SQLException ex){
            System.out.println(ex);
            System.out.println("No se pudieron obtener los mensajes");
        }
    }
    
    public static void deleteMessagesDB(int messageId){
        ConnectionMysql dbConnect = new ConnectionMysql();
      
        try(Connection connectionTest = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try {
                String query = "DELETE FROM messages WHERE id_message = ?";
                ps = connectionTest.prepareStatement(query);
                ps.setInt(1, messageId);
                ps.executeUpdate();
                System.out.println("El mensaje fue borrado");
            }catch(SQLException ex){
            System.out.println(ex);
            System.out.println("No se pudo borrar el mensaje");
                
            }
          
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
    
    public static void editMessagesDB(Messages message){
        ConnectionMysql dbConnect = new ConnectionMysql();
        try(Connection connectionTest = dbConnect.get_connection()){
            PreparedStatement ps = null;
            try{
                String query = "UPDATE messages SET message = ? WHERE id_message = ?";
                ps = connectionTest.prepareStatement(query);
                ps.setString(1, message.getMessage());
                ps.setInt(2, message.getMessageId());
                ps.executeUpdate();
                System.out.println("El mensaje se actualizo correctamente");
            }catch(SQLException ex){
                System.out.println(ex);
                System.out.println("No se pudo actualizar el mensaje");
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
    }
}
