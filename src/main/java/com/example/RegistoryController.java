package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class RegistoryController {

    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("login");
    }
}