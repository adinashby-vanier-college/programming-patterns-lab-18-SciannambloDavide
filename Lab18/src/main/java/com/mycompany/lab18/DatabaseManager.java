/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class DatabaseManager {

    private static final String DATABASE_URL = "jdbc:sqlite:src/main/resources/LibrarySystem.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL);
    }

    public static void addBook(Patient patient) {
        String sql = "INSERT INTO patients(fname, lname, age) VALUES(?, ?, ?)";

        try ( Connection connection = getConnection();  PreparedStatement pstatement = connection.prepareStatement(sql)) {

            pstatement.setString(1, patient.getfName());
            pstatement.setString(2, patient.getlName());
            pstatement.setInt(3, patient.getAge());
            pstatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void removePatients(Patient patient) {
        String sql = "DELETE  FROM patients WHERE fname = ? AND lname = ? AND age = ?";

        try ( Connection connection = getConnection();  PreparedStatement pstatement = connection.prepareStatement(sql)) {
            pstatement.setString(1, patient.getfName());
            pstatement.setString(2, patient.getlName());
            pstatement.setInt(3, patient.getAge());
            pstatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     public static void clear() {
    String sqlDeleteAllBooks = "DELETE FROM patients";

    try (Connection connection = getConnection(); Statement statement = connection.createStatement()) {
        statement.executeUpdate(sqlDeleteAllBooks);
        System.out.println("All patients have been removed from the database.");
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}


    public static void initialize() {
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS patients ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "fname TEXT NOT NULL,"
                + "lname TEXT NOT NULL,"
                + "age TEXT NOT NULL)";

        try ( Connection connection = getConnection();  Statement statement = connection.createStatement()) {
            statement.execute(sqlCreateTable);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void loadPatients(Hospital hospital) {
        String sqlSelectAllBooks = "SELECT * FROM patients";

        try ( Connection connection = getConnection();  Statement statement = connection.createStatement();  ResultSet rs = statement.executeQuery(sqlSelectAllBooks)) {

            while (rs.next()) {
                Patient patient = new Patient(
                        rs.getString("fname"),
                        rs.getString("lname"),
                        rs.getInt("age"));
                hospital.addPatient(patient);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
