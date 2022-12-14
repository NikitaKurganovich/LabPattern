package com.example;

public class Account {
    private String _login;
    private String _password;

    public String get_login() {
        return _login;
    }
    
    public String get_password() {
        return _password;
    }

    public void set_login(String _login) {
        this._login = _login;
    }

    public void set_password(String _password) {
        this._password = _password;
    }
}
