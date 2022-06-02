package models.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;


public class DBConnection {
    private static Connection connectionDB = null;

    public static Connection getConnection(){
        try{
            if (connectionDB == null){

                ResourceBundle resourceProp = ResourceBundle.getBundle("jdbc");
                String driver=resourceProp.getString("driver");
                String url=resourceProp.getString("url");
                String pwd=resourceProp.getString("pwd");
                String usr=resourceProp.getString("usr");
                Class.forName(driver);
                connectionDB = DriverManager.getConnection(url,usr,pwd);
            }
            return connectionDB;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            throw new RuntimeException("Error creating the connection",ex);
        }
    }
}
