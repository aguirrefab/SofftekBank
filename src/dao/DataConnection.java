package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DataConnection {
    private static Connection connectionDB = null;

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String DB = "softteksystembank";
    private static final String USER = "root";
    private static final String PASSW = "AGUIpata21";


    public static Connection getConnection() throws SQLException {

        if (connectionDB == null){
            try {
                Class.forName(DRIVER);
                connectionDB = DriverManager.getConnection(URL+DB, USER, PASSW);
            } catch (SQLException e) {
                throw new RuntimeException(e.getMessage());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("Error creating the connection with database", e.getCause());
            }
        }
        return connectionDB;
    }


}
