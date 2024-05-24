package com.phil.dnd.database;

import com.phil.dnd.characters.Character;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseRequest {

    private DatabaseConnection dbConnection;

    public DatabaseRequest() {
        this.dbConnection = new DatabaseConnection();
    }

    public void getHeroes() {
        String sql = "SELECT * FROM heroes";
        try (Connection connection = dbConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {
            ResultSet resultSet = pstmt.executeQuery();

            while (resultSet.next()) {

                String id = resultSet.getString("id");
                String job = resultSet.getString("job");
                String name = resultSet.getString("name");
                int PV = resultSet.getInt("PV");
                int strength = resultSet.getInt("strengthPoint");
                int offStuff = resultSet.getInt("offensiveStuff");
                int defStuff = resultSet.getInt("defensiveStuff");
                int positionOnBoard = resultSet.getInt("position");

                System.out.println("Id :" + id + "Job :" + job + ", Name :" + name + ", PV :" + PV + ", Strength :" + strength + ", Weapon/Spell :" + offStuff + ", Shield/Philtre :" + defStuff + "Position :" + positionOnBoard);
            }

        } catch (SQLException error) {
            System.err.println(error.getMessage());
        }
    }

//    public Character getHeroById(String id){
//        String sql = "SELECT id FROM heroes";
//
//        try (Connection connection = dbConnection.getConnection();
//             PreparedStatement pstmt = connection.prepareStatement(sql)){
//            ResultSet resultSet = pstmt.executeQuery();
//
//            while (resultSet.next()) {
//                id = resultSet.getString("id");
//                String name = resultSet.getString("name");
//                System.out.println("ID : " + id + "Name :" + name);
//            }
//        }catch (SQLException error) {
//            System.err.println(error.getMessage());
//        }
//        return null;
//    }

    public void createHero(Character hero) {
        String sql = "INSERT INTO heroes (id, job, name, PV, strengthPoint, position) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection connection = dbConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, hero.getId().toString());
            pstmt.setString(2, hero.getJob());
            pstmt.setString(3, hero.getName());
            pstmt.setInt(4, hero.getPV());
            pstmt.setInt(5, hero.getStrengthPoint());
            pstmt.setInt(6, hero.getPosition());

            pstmt.executeUpdate();
        } catch (SQLException error) {
            System.err.println(error.getMessage());
        }

    }

    public void editHero(Character hero) {
        String sql = "UPDATE heroes SET name = ? WHERE id = ?";

        try (Connection connection = dbConnection.getConnection();
             PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setString(1, hero.getName());
            pstmt.setString(2, hero.getId().toString());

            pstmt.executeUpdate();

        } catch (SQLException error) {
            System.err.println(error.getMessage());
        }
    }


}
