package com.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {


    static AllUsers usersDeserialization(){
        try
        {    
            FileInputStream file = new FileInputStream(Constants.USERS_FILE); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            AllUsers obj = (AllUsers)in.readObject(); 
        
            in.close();
            file.close();
            return obj;
        } 
        catch(IOException ex) 
        { 
            ex.printStackTrace();
            System.out.println("ERROR"); 
            Constants.createUserFile();
        }
        
        
        catch(ClassNotFoundException ex) 
        { 
            ex.printStackTrace();
            System.out.println("CLASS ERROR"); 
            Constants.createUserFile();
        } 
        return Deserialization.usersDeserialization();
    }

    static Assortment assortmentDeserialization(){
        try
        {    
            FileInputStream file = new FileInputStream(Constants.ASSORTMENT); 
            ObjectInputStream in = new ObjectInputStream(file); 
              
            Assortment obj = (Assortment)in.readObject(); 
        
            in.close();
            file.close();
            return obj;
        } 
        catch(IOException ex) 
        { 
            ex.printStackTrace();
            System.out.println("ERROR"); 
            Constants.createAssortmentFile();
        }
        
        catch(ClassNotFoundException ex) 
        { 
            ex.printStackTrace();
            System.out.println("CLASS ERROR"); 
            Constants.createAssortmentFile();
        } 
        return Deserialization.assortmentDeserialization();
    }
}
