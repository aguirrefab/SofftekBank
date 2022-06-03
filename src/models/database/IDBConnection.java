package models.database;

import dao.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class IDBConnection {
    protected Connection connectionDB = null;

    private final String URL = "jdbc:mysql://127.0.0.1:3306/";
    private final String DB = "softteksystembank";
    private final String USER = "root";
    private final String PASW = "";


    protected Connection connectToDB() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connectionDB = DriverManager.getConnection(URL+DB, USER, PASW);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Error creating the connection", e);
        }
        return connectionDB;
    }


}
