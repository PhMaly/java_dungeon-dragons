package com.phil.dnd.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    String URL = "jdbc:mysql://localhost:3306/DnD";
    String USER = "dndUser";
    String PASS = "1234";
    private Connection connection;

    public DatabaseConnection() {

        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException error) {
            System.err.println(error.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}


