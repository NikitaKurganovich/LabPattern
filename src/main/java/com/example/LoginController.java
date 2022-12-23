package com.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class LoginController {
    @FXML
    private PasswordField passwordHidden;

    @FXML
    private TextField passwordShown;

    @FXML
    private TextField username;

    @FXML
    private CheckBox checkBox;

    
    @FXML
    private void switchToRegistration() throws IOException {
        App.setRoot("registration");
    }

    @FXML
    private void switchToMainWindow() throws IOException{
        App.setRoot("main_screen");
    }

    @FXML
    private void showPassword(ActionEvent event){
        if(checkBox.isSelected()){
            passwordShown.setText(passwordHidden.getText()); 
            passwordShown.setVisible(true);
            passwordHidden.setVisible(false);
            return;
        }
        passwordHidden.setText(passwordShown.getText());
        passwordShown.setVisible(false);
        passwordHidden.setVisible(true);
    }
    
    @FXML
    private void logInToApp(ActionEvent event) throws IOException{
        AllUsers users = Methods.checkUsers();
        for(Account user: users.getAccountList()){
            if(username.getText().equals(user.get_login())  &&  passwordHidden.getText().equals(user.get_password())){
               switchToMainWindow();
               return;
            }
        }
       ControllerInterface.showMessage(event, Constants.INCORRECT_INPUT);
    }
}
