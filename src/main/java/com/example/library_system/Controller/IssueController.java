package com.example.library_system.Controller;

import com.example.library_system.Database.DBConnection;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class IssueController {

    @FXML
    private TextField issue_IdField;
    @FXML
    private TextField book_IdField;
    @FXML
    private TextField member_IdField;
    @FXML
    private DatePicker issue_DateField;


    @FXML
private void addIssueRecord(){
        String issue_Id=issue_IdField.getText().trim();
        String book_Id=book_IdField.getText().trim();
        String member_Id= member_IdField.getText().trim();
        LocalDate issue_Date= issue_DateField.getValue();





        if(issue_Id.isEmpty()||member_Id.isEmpty()||book_Id.isEmpty()||issue_Date==null){
            showAlter("Error", "These field are cunt miss");
            return;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = issue_Date.format(formatter);



        try (Connection conn= DBConnection.connect()){
            if(conn==null){
                showAlter("Damn!","Database is not connected");
                return;
            }

            String sql ="INSERT INTO issuerecord(issue_Id,book_Id,member_Id,issue_Date,return_Date,status) VALUEs(?,?,?,?,?,?)";

            try(PreparedStatement stmt = conn.prepareStatement(sql)){
                stmt.setString(1, issue_Id);
                stmt.setString(2, book_Id);
                stmt.setString(3, member_Id);
                stmt.setDate(4, Date.valueOf(issue_Date));

                stmt.setNull(5, java.sql.Types.DATE);

                stmt.setString(6, "Not Returned");

                stmt.executeUpdate();
                showAlter("Successfull","Retutn Date add when recived the book");
                clearField();

            }catch (SQLException e){
                return;
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);

        }


    }

    private void showAlter(String title,String message){
        Alert alter=new Alert(Alert.AlertType.INFORMATION);
        alter.setTitle(title);
        alter.setContentText(message);
        alter.show();
    }
    private  void clearField(){
        issue_IdField.clear();
        book_IdField.clear();
        member_IdField.clear();
        issue_DateField.setValue(null);

    }



}
