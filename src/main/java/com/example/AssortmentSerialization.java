package com.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AssortmentSerialization implements Runnable {
    Assortment assortment;
    
    AssortmentSerialization(Assortment assortment){
        this.assortment = assortment;
    }

    @Override
    public void run(){
        try
        {
        FileOutputStream file = new FileOutputStream(Constants.ASSORTMENT); 
        ObjectOutputStream out = new ObjectOutputStream(file); 
          
        out.writeObject(assortment); 
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
