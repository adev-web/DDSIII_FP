/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.sql.*;

public class conexion {

    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/planilla";

    public static Connection getConnection() {
        /*
        
        //for online. 
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://jk6u9316dsxd.us-east-2.psdb.cloud/planilla?sslMode=VERIFY_IDENTITY",
            "lmz0lviewjs4",
            "pscale_pw_A3_b79WZrnO7NL8DItlcTxc8mdbIM8I57bpLs6sRXHc");
         */
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (con != null) {
                System.out.println("Connection succesfull");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Failure Connection" + e);
        }
        return con;
    }

    public void close_db() {
        con = null;
        if (con == null) {
            System.out.println("Connection ended");

        }
    }
}
