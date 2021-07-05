/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.messages_app;

import java.sql.Connection;

/**
 *
 * @author dayte
 */
public class Main {
    public static void main(String[] args){
        ConnectionMysql connectionMysql = new ConnectionMysql();
         try(Connection cnn = connectionMysql.get_connection()){
             
         }catch(Exception e){
             System.out.println("e");
         }
    }
}
     