package CLASES;

import java.sql.SQLException;
import java.sql.*;
import java.util.ArrayList;

public class Usuario {

    private String id_planilla;
    private static String currentUser;
    private String cedulaSearch;
    private String cedula;
    private String userId;
    private String password;
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    private String dia;
    private String mes;
    private String año;
    private String direccion;

    // <editor-fold defaultstate="collapsed" desc="Set&Get">  
    public String getId_planilla() {
        return id_planilla;
    }

    public void setId_planilla(String id_planilla) {
        this.id_planilla = id_planilla;
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
    private String telefono;

    public static String getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(String currentUser) {
        Usuario.currentUser = currentUser;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedulaSearch() {
        return cedulaSearch;
    }

    public void setCedulaSearch(String cedulaSearch) {
        this.cedulaSearch = cedulaSearch;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre1() {
        return nombre1;
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
// </editor-fold>      
    ///////////////////////////////
    Conexion Conn = new Conexion();

    public boolean db_LoginCheck(String checkUser, String checkPass) {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "select '" + true + "' as result, nombre, apellido from tbl_usuario where user = '" + checkUser + "' and password = '" + checkPass + "';";
            ResultSet registro = consulta.executeQuery(query);

            if (registro.next()) {
                String prueba = new String(registro.getString("result"));
                setNombre1(registro.getString("nombre"));
                setApellido1(registro.getString("apellido"));
                result = Boolean.parseBoolean(prueba);
            }

            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        //System.out.print("Login: " + result);
        return result;
    }

    public boolean db_SearchUser(String searchUser) {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "select *,'" + true + "' as result from tbl_usuario where cedula_usuario = '" + searchUser + "';";
            ResultSet registro = consulta.executeQuery(query);
            if (registro.next()) {
                cedula = registro.getString("cedula_usuario");
                userId = registro.getString("user");
                password = registro.getString("password");
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
            String insertQuery = "INSERT INTO tbl_usuario"
                + "(cedula_usuario, "
                + "user, "
                + "password, "
                + "nombre, "
                + "apellido, "
                + "direccion, "
                + "fecha_ingreso)"
                + "VALUES('" + getCedula() + "', "
                + "'" + getUserId() + "', "
                + "'" + getPassword() + "', "
                + "'" + getNombre1() + "', "
                + "'" + getApellido1() + "', "
                + "'" + getDireccion() + "', "
                + "now());";
            consulta.executeUpdate(insertQuery);
            Conn.close_db();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean db_ModifyUser() {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "UPDATE tbl_usuario "
                + "SET "
                + "user = '" + this.getUserId() + "', "
                + "password = '" + this.getPassword() + "', "
                + "nombre = '" + this.getNombre1() + "', "
                + "apellido = '" + this.getApellido1() + "', "
                + "direccion = '" + this.getDireccion() + "' "
                + "WHERE "
                + "cedula_usuario = '" + this.getCedula() + "';";

            consulta.executeUpdate(query);
            Conn.close_db();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public ArrayList<Planilla> db_planilla() {
        ArrayList<Planilla> Datos = new ArrayList<>();
        try {
            Statement st = Conn.getConnection().createStatement();
            String query = ""
                + "SELECT a.id_planilla,a.fecha,round(sum(b.sb),2) as TSB,round(sum(b.ss), 2) AS TSS, round(sum(b.se), 2) AS TEE, round(sum(b.sn), 2) AS TSN FROM tbl_empleado_planilla AS b INNER JOIN tbl_planilla AS a WHERE a.id_planilla = b.id_planilla GROUP BY a.id_planilla;";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Planilla obj_Planilla = new Planilla();
                obj_Planilla.setId_planilla(rs.getString("id_planilla"));
                obj_Planilla.setFecha(rs.getString("fecha"));
                obj_Planilla.setTSB(rs.getString("TSB"));
                obj_Planilla.setTSS(rs.getString("TSS"));
                obj_Planilla.setTEE(rs.getString("TEE"));
                obj_Planilla.setTSN(rs.getString("TSN"));
                Datos.add(obj_Planilla);
            }
            Conn.close_db();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Datos;
    }

    public ArrayList<Planilla> calculoPlanilla() {
        ArrayList<Planilla> Datos = new ArrayList<>();
        try {
            Statement st = Conn.getConnection().createStatement();
            String query = "SELECT * FROM tbl_empleado AS a, tbl_empleado_planilla AS b, tbl_planilla as c where a.cedula_empleado = b.cedula_empleado AND b.id_planilla = c.id_planilla ORDER BY c.id_planilla;";
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                Planilla obj_Planilla = new Planilla();
                obj_Planilla.setId_planilla(rs.getString("id_planilla"));
                obj_Planilla.setFecha(rs.getString("fecha"));
                obj_Planilla.setCedula(rs.getString("cedula_empleado"));
                obj_Planilla.setNombre1(rs.getString("nombre_1"));
                obj_Planilla.setNombre2(rs.getString("nombre_2"));
                obj_Planilla.setApellido1(rs.getString("apellido_1"));
                obj_Planilla.setApellido2(rs.getString("apellido_2"));
                obj_Planilla.setHT(rs.getString("horas_trabajadas"));
                obj_Planilla.setTSXH(rs.getString("sph"));
                obj_Planilla.setTSB(rs.getString("sb"));
                obj_Planilla.setTSS(rs.getString("ss"));
                obj_Planilla.setTEE(rs.getString("se"));
                obj_Planilla.setTSN(rs.getString("sn"));
                Datos.add(obj_Planilla);
            }
            Conn.close_db();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Datos;
    }

    public String db_planillaTotales(String str) {
        String result = "";
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "Select round(sum(sb), 2) AS sb, round(sum(sn), 2) AS sn FROM tbl_empleado_planilla;";
            ResultSet registro = consulta.executeQuery(query);
            if (registro.next()) {
                result = registro.getString(str);
            }
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }
}
