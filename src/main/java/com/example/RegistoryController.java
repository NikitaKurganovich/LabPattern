package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class RegistoryController {
    @FXML
    private PasswordField passwordHidden;
    
    @FXML
    private TextField passwordShown;

    @FXML
    private PasswordField secondPasswordHidden;
    
    @FXML
    private TextField secondPasswordShown;

    @FXML
    private TextField username;

    @FXML
    private CheckBox checkBox;

    @FXML
    private void switchToLogin() throws IOException {
        App.setRoot("login");
    }

    @FXML
    void showPasswords(ActionEvent event){
        if(checkBox.isSelected()){
            passwordShown.setText(passwordHidden.getText());
            secondPasswordShown.setText(secondPasswordHidden.getText());

            passwordShown.setVisible(true);
            secondPasswordShown.setVisible(true);

            passwordHidden.setVisible(false);
            secondPasswordHidden.setVisible(false);
            return;
        }

        passwordHidden.setText(passwordShown.getText());
        secondPasswordHidden.setText(secondPasswordShown.getText());

        passwordShown.setVisible(false);
        secondPasswordShown.setVisible(false);

        passwordHidden.setVisible(true);
        secondPasswordHidden.setVisible(true);
    }

    @FXML
    void registration(ActionEvent event)throws IOException{
        AllUsers users = Methods.checkUsers();
        if(!passwordHidden.getText().equals(secondPasswordHidden.getText())){
            ControllerInterface.showMessage(event, Constants.PASSWORDS_DOESNT_MATCH);
            return;
        }
        for(Account user: users.getAccountList()){
            if(username.getText().equals(user.get_login())){
            ControllerInterface.showMessage(event, Constants.USER_IS_TAKEN);
            return;
            }
        }
        AllUsers allUsers = Methods.checkUsers(); 
        allUsers.getAccountList().add(new Account(username.getText(), passwordHidden.getText()));
        new Thread(new UserSerialization(allUsers)).start();
        ControllerInterface.showMessage(event, Constants.THATS);
    }
}