package CLASES;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;

/**
 *
 * @author termi
 */
public class Usuario {

    private static String CurrentUser;
    private int id_planilla;
    private String UserLog;
    private String Cedula;
    private String cedulaSearch;
    private String password;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String dia;
    private String mes;
    private String año;
    private String direccion;
    private String telefono;
    private String ruta = "C:\\proyecto\\";
    private String usuarios = "usuario.txt";
    private String splitter = "\\|";
    private String concat = "|";

    public Usuario() {
    }

    public Usuario(String Cedula, String password, String nombre1, String nombre2, String apellido1, String apellido2, String dia, String mes, String año, String direccion, String telefono) {
        this.Cedula = Cedula;
        this.password = password;
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public int getId_planilla() {
        return id_planilla;
    }

    public void setId_planilla(int id_planilla) {
        this.id_planilla = id_planilla;
    }

    public static String getCurrentUser() {
        return CurrentUser;
    }

    public static void setCurrentUser(String CurrentUser) {
        Usuario.CurrentUser = CurrentUser;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getCedulaSearch() {
        return cedulaSearch;
    }

    public void setCedulaSearch(String cedulaSearch) {
        this.cedulaSearch = cedulaSearch;
    }

    public String getNombre1() {
        return nombre1;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getUserLog() {
        return UserLog;
    }

    public void setUserLog(String UserLog) {
        this.UserLog = UserLog;
    }

//METODO PARA CAMBIO DE TEXTO EN LBL DEL USER
    public String changeNamelbl(String userValue) {
        String result = "";
        try {
            File path = new File(ruta + usuarios);
            Scanner read = new Scanner(path);
            while (read.hasNextLine()) {
                String[] linea = read.nextLine().split(this.splitter);
                if (linea[0].equals(userValue)) {
                    result = linea[2] + " " + linea[4];
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return result;
    }
//FIN METODO PARA CAMBIO DE TEXTO EN LBL DEL USER

///////////////////////////////////////////////////
    private conexion Conn = new conexion();

    public boolean db_LoginCheck(String checkUser, String checkPass) {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            ResultSet registro = consulta.executeQuery("call sp_select_tbl_usuarios_by_id('" + checkUser + "');");
            if (registro.next()) {
                String user = registro.getString("userid");
                String pass = registro.getString("contrasenna");
                if (checkUser == user) {
                    if (checkPass == pass) {
                        result = true;
                    }
                }
            }
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean db_SearchUser(String searchUser) {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            ResultSet registro = consulta.executeQuery("call sp_select_tbl_usuarios_by_id('" + searchUser + "');");
            if (registro.next()) {
                Cedula = registro.getString("cedula");
                UserLog = registro.getString("userid");
                password = registro.getString("contrasenna");
                nombre1 = registro.getString("nombre");
                apellido1 = registro.getString("apellido");
                direccion = registro.getString("direccion");
                result = true;
            }
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean db_InsertUser() {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String insertQuery = "INSERT INTO tbl_usuarios(cedula,userid,contrasenna,nombre,apellido,direccion,fechaingreso) VALUES('" + getCedula() + "', '" + getUserLog() + "', '" + getPassword() + "', '" + getNombre1() + "', '" + getApellido1() + "', '" + getDireccion() + "', now();";
            consulta.executeUpdate(insertQuery);
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
