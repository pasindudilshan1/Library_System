package com.example.library_system.Controller;

import com.example.library_system.Models.Book;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class view_book {
    @FXML
    private TableView <Book> tableView;
    @FXML
    private TableColumn<Book, String> book_IdField;
    @FXML
    private TableColumn<Book,String>titleField;
    @FXML
    private TableColumn<Book,String>authorField;
    @FXML
    private TableColumn<Book,String>genreField;
    @FXML
    private TableColumn<Book, Integer>copiesField;

    private ObservableList<Book> Booklist= FXCollections.observableArrayList();

    private void initialize(){
        book_IdField.cellFactoryProperty(new PropertyValueFactory<book_Id>());

    }

}
