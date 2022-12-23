package com.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserSerialization implements Runnable{
    AllUsers usersList;
    
    UserSerialization(AllUsers usersList){
        this.usersList = usersList;
    }

    @Override
    public void run(){
        try
        {
        FileOutputStream file = new FileOutputStream(Constants.USERS_FILE); 
        ObjectOutputStream out = new ObjectOutputStream(file); 
          
        out.writeObject(usersList); 
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
