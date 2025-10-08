package org.example.database;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;


public class ConnectionClass {

    private static final String url = "jdbc:mysql://localhost:3306/clinicadb?useSSL=false&serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "mysqlPW";

    public static Connection connect() throws SQLException{

        return DriverManager.getConnection(url,user,password);
    }


}
