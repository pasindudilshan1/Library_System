package com.example.library_system.Controller;

import com.example.library_system.Database.DBConnection;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javafx.scene.control.Alert;


public class MemberController {
    @FXML
    private TextField member_IdField;
    @FXML
    private  TextField f_nameField;
    @FXML
    private TextField l_nameField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField phoneField;
    @FXML
    private TextField addressField;


    @FXML
    protected void addMember(){
        String member_Id= member_IdField.getText();
        String f_name= f_nameField.getText();
        String l_name = l_nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String address = addressField.getText();


        if( member_Id.isEmpty() ||  f_name.isEmpty() ||  l_name.isEmpty() ||  email.isEmpty() ||  phone.isEmpty() ||  address.isEmpty()){
            showAlter("Error","All the field must be filled");
            return;

        }

        try (Connection conn = DBConnection.connect()){
            if(conn == null){
                showAlter("Error","Database is not connected" );

                return;
            }

            String sql = "INSERT INTO member(member_Id, f_name, l_name, email,phone,address) VALUE (?,?,?,?,?,?)";

            try(PreparedStatement stmt= conn.prepareStatement(sql)){
                stmt.setString(1,member_Id);
                stmt.setString(2,f_name);
                stmt.setString(3,l_name);
                stmt.setString(4,email);
                stmt.setString(5,phone);
                stmt.setString(6,address);

                stmt.executeUpdate();
                showAlter("Successfull","Member Add to the Database");
                clearField();
            }catch (SQLException e){
                showAlter("Error", e.getMessage()) ;
            }


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
         private void showAlter(String title, String message){
        Alert alter=new Alert(Alert.AlertType.INFORMATION);
        alter.setTitle(title);
        alter.setContentText(message);
        alter.show();

    }
        private void clearField(){
            member_IdField.clear();
            f_nameField.clear();
            l_nameField.clear();
            emailField.clear();
            phoneField.clear();
            addressField.clear();
        }
}
