
package CLASES;

import java.sql.*;
import static jdk.internal.org.jline.utils.Colors.s;

public class Conexion {

    private static Connection con;
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "4jcaqulow1qf";
    private static final String password = "pscale_pw_vSCbCykf5aYu6iGoMrZeeRZYyROlmIt9MFFAm3Z70Vo";
    private static final String url = "jdbc:mysql://ukkqgwu901a8.us-east-2.psdb.cloud/planilla?sslMode=VERIFY_IDENTITY";

    public static Connection getConnection() {
        con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            if (con != null) {
            //System.out.println("Connection Succesfull");
            }
        } catch (ClassNotFoundException | SQLException e) {
            //System.err.println("Failure Connection" + e);
            e.printStackTrace();
        }
        return con;
    }

    public static void close_db() {
        con = null;
        if (con == null) {
                        System.out.println("End Connection");
        }
    }
    public static void main(String[] args) {
        //getConnection();
        
    }
}
