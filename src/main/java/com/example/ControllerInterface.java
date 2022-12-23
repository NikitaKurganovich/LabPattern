package com.example;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import java.util.Optional;
import javafx.scene.control.ButtonType;
import javafx.event.ActionEvent;

public interface ControllerInterface {

    @FXML
    static void showMessage(ActionEvent event, String message){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Kapec");
        alert.setContentText(message);
        Optional<ButtonType> result = alert.showAndWait();

        if(result.isEmpty()){
            System.out.println("Alert closed");
        } else if(result.get() == ButtonType.OK){
            System.out.println("OK!");
        } else if(result.get() == ButtonType.CANCEL){
            System.out.println("Never!");
        }
    }

}
