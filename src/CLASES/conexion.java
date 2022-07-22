/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.sql.*;

public class Conexion {

    private static Connection con;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/planilla";

    public static Connection getConnection() {
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

    public static ResultSet getTable(String consulta) {
        Connection con2 = getConnection();
        Statement st;
        ResultSet datos = null;
        try {
            st = con2.createStatement();
            datos = st.executeQuery(consulta);
        } catch (Exception e) {
            System.out.print(e.toString());
        }
        return datos;
    }

    public void close_db() {
        con = null;
        if (con == null) {
            System.out.println("Connection ended");

        }
    }
}
