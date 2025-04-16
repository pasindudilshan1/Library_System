package com.example.library_system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override

    public void start(Stage stage) throws Exception {
        var fxml = getClass().getResource("/com/example/library_system/book.fxml");

        if (fxml == null) {
            throw new RuntimeException("FXML file not found! Check the path and file name.");
        }

        FXMLLoader fxmlLoader = new FXMLLoader(fxml);
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Library System");
        stage.show();
    }


    public static void main(String[] args) {
        launch();
    }
}