package com.example.library_system.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "db.url";

    private static final String USER = "db.username";
    private static final String PASSWORD = "db.password";

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
