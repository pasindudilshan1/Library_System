package com.example.library_system.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mariadb://localhost:3306/library_system";

    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection connect(){
        try{
            return DriverManager.getConnection(URL,USER, PASSWORD
            );
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }

}
