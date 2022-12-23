package com.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Constants implements Serializable{
    static String USERS_FILE = "C://Users.dat";
    static String ASSORTMENT = "C://Assortment.dat";

    static String USER_IS_TAKEN = "This username is taken!";
    static String PASSWORDS_DOESNT_MATCH ="Passwords doesn't match!";
    static String INCORRECT_INPUT = "Login or password are incorrect!";
    static String THATS = "That's it!";

    static List<Account> usersList = new ArrayList<Account>(){{
        add(new Account("admin", "admin"));
    }};

    static List<Item> assortment = new ArrayList<Item>(){{
        add(new Item(2.28,"Beer","Wow, that's a DRG reference!", "Alcohol"));
        add(new Item(3.37, "Ghost","I wanna shoot him cause of his stupid ass mask","Slave"));
    }};

    static public void createUserFile(){
        try
        {   
            AllUsers users = new AllUsers(usersList);
            FileOutputStream file = new FileOutputStream(Constants.USERS_FILE); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            out.writeObject(users); 
              
            out.close(); 
            file.close(); 
        } 
        catch(IOException ex) 
        { 
            ex.printStackTrace();
            System.out.println("ERROR");
        }
    }

    static public void createAssortmentFile(){
        try
        {   
            Assortment _assortment = new Assortment(assortment);
            FileOutputStream file = new FileOutputStream(Constants.ASSORTMENT); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            out.writeObject(_assortment); 
              
            out.close(); 
            file.close(); 
        } 
        catch(IOException ex) 
        { 
            ex.printStackTrace();
            System.out.println("ERROR");
        }
    }
}
