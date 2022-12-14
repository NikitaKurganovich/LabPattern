package com.example;

import java.io.IOException;

import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToRegistration() throws IOException {
        App.setRoot("registration");
    }
}
