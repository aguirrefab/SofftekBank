package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;


public class DBConnection {
    private static Connection connectionDb = null;

    public static Connection getConnectionDb(){
        try{
            if (connectionDb == null){

                ResourceBundle resourceProp = ResourceBundle.getBundle("jdbc");
                String driver=resourceProp.getString("driver");
                String url=resourceProp.getString("url");
                String pwd=resourceProp.getString("pwd");
                String usr=resourceProp.getString("usr");
                Class.forName(driver);
                connectionDb = DriverManager.getConnection(url,usr,pwd);
            }
            return connectionDb;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
            throw new RuntimeException("Error creating the connection",ex);
        }
    }
}
