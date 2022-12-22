package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private void switchToRegistration() throws IOException {
        App.setRoot("registration");
    }
    @FXML
    private Account getAccount() throws IOException{
        TextField field = new TextField();
        PasswordField password = new PasswordField();
        return Account(field,password);
    }
}
