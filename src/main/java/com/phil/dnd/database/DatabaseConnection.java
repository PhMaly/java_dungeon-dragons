package com.phil.dnd.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {

    String URL = "jdbc:mysql://hostname/ databaseName";
    String USER = "dndUser";
    String PASS = "1234";
    private Connection connection;

    public DatabaseConnection() {

        try {
            this.connection = DriverManager.getConnection(URL, USER, PASS);
            //Statement stmt = connection.createStatement();
        } catch (SQLException error) {
            System.err.println(error.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }
}


