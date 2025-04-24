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



public class Return_book {
@FXML
    private TextField member_IdField;
@FXML
    private DatePicker return_DateField;
@FXML
    private void addReturn(){
    String member_Id=member_IdField.getText();

    LocalDate return_Date=return_DateField.getValue();

    if(member_Id.isEmpty() || return_Date==null){
        showAlter("error","All field should filled");
        return;
    }

    try (Connection conn= DBConnection.connect()){
        if(conn == null){
            showAlter("Error","DB Intrupted");
            return;
        }
        String  sql="""
      UPDATE issuerecord
      SET return_Date = ?, status = ?
      WHERE member_Id = ?
      """;;
        try(PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setString(1, String.valueOf(Date.valueOf(return_Date)));
            stmt.setString(2,"Returned");
            stmt.setString(3,member_Id);

           int up=stmt.executeUpdate();
           if(up==0){
               showAlter("Error","There is not such member id");
           }else{
               showAlter("successful","updated");
           }

            clearField();

        } catch (SQLException e) {
            throw new RuntimeException(e);
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
private void clearField(){
    member_IdField.clear();
    return_DateField.setValue(null);

}

}
