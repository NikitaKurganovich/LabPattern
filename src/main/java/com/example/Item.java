package com.example;

import java.io.Serializable;

public class Item implements Serializable{
    private double _price;
    private String _name;
    private String _description;
    private String _type;

    public Item(double _price, String _name,String _description, String _type){
        this._price = _price;
        this._name = _name;
        this._description = _description;
        this._type = _type;
    }

    public String get_type() {
        return _type;
    }

    public String get_description() {
        return _description;
    }
    
    public String get_name() {
        return _name;
    }

    public double get_price() {
        return _price;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_price(double _price) {
        this._price = _price;
    }
    
    public void set_type(String _type) {
        this._type = _type;
    }
}
