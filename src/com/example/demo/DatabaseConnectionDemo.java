package com.example.demo;

import com.example.config.DatabaseConnection;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnectionDemo {
    public static void runDemo() {
        try {
            DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
            DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();

            Connection conn1 = databaseConnection1.getConnection();
            Connection conn2 = databaseConnection2.getConnection();

            System.out.println(conn1);
            System.out.println(conn2);

            if (conn1 == conn2) {
                System.out.println("Both connections are the same instance");
            } else {
                System.out.println("Different instances");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
