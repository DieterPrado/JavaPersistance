/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.catapp;

import com.google.gson.Gson;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import sun.management.Agent;

/**
 *
 * @author dayte
 */
public class serviceCats {
    public static void seeCats() throws IOException{
        //Traer gatos
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url("https://api.thecatapi.com/v1/images/search").method("GET", null).build();
        Response response = client.newCall(request).execute();
       
        String theJson = response.body().string();
         
        theJson = theJson.substring(1, theJson.length());
        theJson = theJson.substring(0, theJson.length()-1);
         
         //hacre objeto
        Gson gson = new Gson();
        Cats cat = gson.fromJson(theJson, Cats.class);
         
         //redimensionar la imagen
        Image image = null;
        try{
             URL url = new URL(cat.getUrl());
             HttpURLConnection httpcon = (HttpURLConnection) url.openConnection();
             httpcon.addRequestProperty("User-Agent", "");
             BufferedImage bufferedImage = ImageIO.read(httpcon.getInputStream());
             ImageIcon catBackground = new ImageIcon(bufferedImage);

             if(catBackground.getIconWidth() > 800){
                 Image background = catBackground.getImage();
                 Image modified = background.getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH);
                 catBackground = new ImageIcon(modified);
              
             }
             
             String menu = "Opciones\n"
                     + "1. ver otra imagen \n" 
                     + "2. favorito \n"
                     + "3. Volver \n";
             String[] buttons = {"ver otra imagen", "favorito", "volver"};
             String catId = String.valueOf(cat.getId());
             String option = (String) JOptionPane.showInputDialog(null, menu, catId, JOptionPane.INFORMATION_MESSAGE, catBackground, buttons, buttons[0]);
             
             int selection = -1;
             for (int i = 0; i < buttons.length; i++) {
                if(option.equals(buttons[i])){
                    selection = i;
                }
                
             switch (selection){
                 case 0:
                     seeCats();
                     break;
                 case 1:
                     favoriteCat(cat);
                     break;
                 default:
                     break;
             }   
            }
             
        }catch(IOException ex){
             System.out.println(ex);
        }
        
   
    
    }
    
    public static void favoriteCat(Cats cat){
            
        }
}
