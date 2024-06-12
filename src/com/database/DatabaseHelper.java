package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {
    private static final String URL = "jdbc:postgresql://localhost:5432/OtelProjesi"; // Veritabanı URL'sini güncelleyin
    private static final String USER = "postgres"; // PostgreSQL kullanıcı adınızı buraya yazın
    private static final String PASSWORD = "123456"; // PostgreSQL şifrenizi buraya yazın

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC sürücüsü bulunamadı.");
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
