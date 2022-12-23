package com.example;

import java.io.File;

public class Methods {
    
    public static AllUsers checkUsers(){
        File userFile = new File(Constants.USERS_FILE);
        if(!userFile.exists()){
            Constants.createUserFile();
        }
        return Deserialization.usersDeserialization();
    }
    
    public static Assortment checkAssortment(){
        File userFile = new File(Constants.ASSORTMENT);
        if(!userFile.exists()){
            Constants.createAssortmentFile();
        }
        return Deserialization.assortmentDeserialization();
    }
}
