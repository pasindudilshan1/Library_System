package com.example.library_system.Controller;
import com.example.library_system.Database.*;
import java.sql.DriverManager;



import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookController {
    @FXML
    private TextField book_IdField;
    @FXML
    private TextField titleField;
    @FXML
    private TextField authorField;
    @FXML
    private TextField genreField;
    @FXML
    private TextField copiesField;

    @FXML
    protected void addBook(){
        String book_Id = book_IdField.getText();
        String title = titleField.getText();
        String author = authorField.getText();
        String genre= genreField.getText();
        int copies = Integer.parseInt(copiesField.getText());


        if (book_Id.isEmpty() || title.isEmpty() || author.isEmpty() || genre.isEmpty() || copies <1 ){
            showAlter("Error", "All Field Must Be Filled" );
            return;
        }

        try(Connection conn= DBConnection.connect()) {
            if (conn == null) {
                showAlter("Error", "Databse Connection Failed");
                return;
            }

            String sql = "INSERT INTO book(book_Id,title,author,genre,copies) VALUES (?,?,?,?,?)";

            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, book_Id);
                stmt.setString(2, title);
                stmt.setString(3, author);
                stmt.setString(4, genre);
                stmt.setInt(5, copies);

                stmt.executeUpdate();
                showAlter("Success", "Book is Added to the database");
                clearField();
            }
        } catch (SQLException e) {
            showAlter("DB Error.....", e.getMessage());

        }

    }
    private void showAlter(String title, String message){
        Alert alter= new Alert(Alert.AlertType.INFORMATION);
        alter.setTitle(title);
        alter.setContentText(message);
        alter.show();

    }
    private void clearField(){
        book_IdField.clear();
        titleField.clear();
        authorField.clear();
        genreField.clear();
        copiesField.clear();

    }


}