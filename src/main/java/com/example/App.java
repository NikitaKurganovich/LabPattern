package com.example;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene _scene;

    @Override
    public void start(Stage _stage) throws Exception {
        _scene = new Scene(loadFXML("login"), 640, 480);
        _stage.setScene(_scene);
        _stage.setTitle("Laboratory 4");
        _stage.show();
        
    }

    static void setRoot(String _fxml) throws IOException {
        _scene.setRoot(loadFXML(_fxml));
    }

    private static Parent loadFXML(String _fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(_fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}