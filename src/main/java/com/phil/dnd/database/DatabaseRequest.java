package com.phil.dnd.database;

import com.phil.dnd.characters.Character;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabaseRequest {

private DatabaseConnection dbConnection;

    public DatabaseRequest() {
        this.dbConnection = new DatabaseConnection();
    }

    public void getHeroes() {
    }

    public void createHero(Character hero) {
        String sql = "INSERT INTO hero (id, job, name, PV, strengthPoint, position) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = dbConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)){

            pstmt.setString(1, hero.getJob());
            pstmt.setString(2, hero.getName());
            pstmt.setInt(3, hero.getPV());
            pstmt.setInt(4, hero.getStrengthPoint());
            pstmt.setInt(5, hero.getPosition());

            pstmt.executeUpdate();
        } catch (SQLException error) {
            System.err.println(error.getMessage());
        }

    }

}
