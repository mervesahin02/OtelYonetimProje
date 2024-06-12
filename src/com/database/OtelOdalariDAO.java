package com.database;

import psodeneme.Classes.OtelOdalari;
import com.database.DatabaseHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OtelOdalariDAO {

    public List<OtelOdalari> getAllOtelOdalari() {
        List<OtelOdalari> otelOdalariList = new ArrayList<>();
        String query = "SELECT kisiSyisi, oda_id, tur FROM OtelOdalari";

        try (Connection connection = DatabaseHelper.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query);
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                int kisiSyisi = resultSet.getInt("kisiSyisi");
                int oda_id = resultSet.getInt("oda_id");
                String tur = resultSet.getString("tur");

                OtelOdalari otelOdasi = new OtelOdalari(kisiSyisi, oda_id, tur);
                otelOdalariList.add(otelOdasi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return otelOdalariList;
    }
}