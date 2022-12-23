package com.example;

import java.io.Serializable;
import java.util.List;

public class Assortment implements Serializable{
    private List<Item> assortment;

    public Assortment(List<Item> assortment){
        this.assortment = assortment;
    }

    public List<Item> getAssortment() {
        return assortment;
    }

    public void setAssortment(List<Item> assortment) {
        this.assortment = assortment;
    }
}
