package assortment;

import java.util.Date;

public abstract class Item {
    private double _price;
    private String _name;
    private String _description;
    private String _type;
    private Date _dateOfPreparing;

    public String get_description() {
        return _description;
    }
    
    public String get_name() {
        return _name;
    }

    public double get_price() {
        return _price;
    }

    public String get_type() {
        return _type;
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

    public void set_dateOfPreparing(Date _dateOfPreparing) {
        this._dateOfPreparing = _dateOfPreparing;
    }

    public Date get_dateOfPreparing() {
        return _dateOfPreparing;
    }
}
