package com.example.library_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        var fxml = getClass().getResource("/com/example/library_system/main.fxml");
        if (fxml == null) {
            throw new RuntimeException("Main FXML file not found!");
        }

        Parent root = FXMLLoader.load(fxml);
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("Library System");
        stage.setFullScreen(true);
        stage.show();
    }

}
