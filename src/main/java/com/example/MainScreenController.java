package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.util.Optional;
import javafx.scene.control.ButtonType;

public class MainScreenController {
    @FXML
    private void switchLogin() throws IOException{
        App.setRoot("login");
    }
    
}
