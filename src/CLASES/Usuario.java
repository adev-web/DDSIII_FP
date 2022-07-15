package CLASES;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author termi
 */
public class Usuario {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    private static String CurrentUser;
    private int id_planilla;
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

    //METODO DE INSERTAR/////
    public boolean insertarPlanilla() {
        try {
            con = conexion.getConnection();
            ps = con.prepareCall("call sp_insert_planilla(?)");
            ps.setString(1, año + mes + dia);
            rs = ps.executeQuery();
            if (rs.next()) {
                this.id_planilla = Integer.parseInt(rs.getString("ultimo_id"));
                con.close();
                return true;
            }
            con.close();
            return false;
        } catch (SQLException e) {
            return false;
        }
        //return false;

    }
    //FIN DEL METODO INSERTAR///// 

//METODO DE CHECKEO DE LOGIN/////
    public boolean LoginCheck(String userValue, String Pass) {
        boolean result = false;
        try {
            File path = new File(ruta + usuarios);
            Scanner read = new Scanner(path);

            while (read.hasNextLine()) {
                String[] linea = read.nextLine().split(this.splitter);
                if (linea[0].equals(userValue) && linea[1].equals(Pass)) {
                    result = true;
                }
            }
        } catch (Exception e) {
            System.err.println(e);
        }
        return result;
    }
//FIN METODO DE CHECKEO DE LOGIN/////

//METODO BUSCAR//// 
    public boolean Buscar() {
        boolean result = false;
        File fileRuta = new File(ruta);
        if (!fileRuta.exists()) {
            fileRuta.mkdir();
        }
        File fl = new File(ruta + usuarios);
        try {
            Scanner read = new Scanner(fl);
            while (read.hasNextLine()) {
                String[] linea = read.nextLine().split(this.splitter);
                if (linea[0].equals(this.Cedula)) {
                    this.Cedula = linea[0];
                    this.password = linea[1];
                    this.nombre1 = linea[2];
                    this.nombre2 = linea[3];
                    this.apellido1 = linea[4];
                    this.apellido2 = linea[5];
                    this.dia = linea[6];
                    this.mes = linea[7];
                    this.año = linea[8];
                    this.direccion = linea[9];
                    this.telefono = linea[10];
                    result = true;
                }
            }
            read.close();
        } catch (FileNotFoundException e) {
            System.err.println(e);
        }
        return result;
    }
// FIN DEL METODO BUSCAR  

//METODO DE MODIFICAR EL USUARIO
    public boolean ModificarUsuario() {
        boolean result = false;
        File fileRuta = new File(ruta);
        if (!fileRuta.exists()) {
            fileRuta.mkdir();
        }
        File fl = new File(ruta + usuarios);
        try {
            FileWriter fw = new FileWriter(ruta + usuarios + ".tmp", true);
            PrintWriter pw = new PrintWriter(fw);
            try {
                Scanner read = new Scanner(fl);
                while (read.hasNextLine()) {
                    String linea = read.nextLine();
                    String[] arr = linea.split(this.splitter);
                    if (arr[0].equals(getCedulaSearch())) {
                        arr[0] = getCedula();
                        arr[1] = arr[1];
                        arr[2] = getNombre1();
                        arr[3] = getNombre2();
                        arr[4] = getApellido1();
                        arr[5] = getApellido2();
                        arr[6] = getDia();
                        arr[7] = getMes();
                        arr[8] = getAño();
                        arr[9] = getDireccion();
                        arr[10] = getTelefono();
                        pw.println(
                                arr[0] + this.concat
                                + arr[1] + this.concat
                                + arr[2] + this.concat
                                + arr[3] + this.concat
                                + arr[4] + this.concat
                                + arr[5] + this.concat
                                + arr[6] + this.concat
                                + arr[7] + this.concat
                                + arr[8] + this.concat
                                + arr[9] + this.concat
                                + arr[10]);
                        result = true;
                    } else {
                        pw.println(
                                arr[0] + this.concat
                                + arr[1] + this.concat
                                + arr[2] + this.concat
                                + arr[3] + this.concat
                                + arr[4] + this.concat
                                + arr[5] + this.concat
                                + arr[6] + this.concat
                                + arr[7] + this.concat
                                + arr[8] + this.concat
                                + arr[9] + this.concat
                                + arr[10]);
                    }
                }
                pw.close();
                fw.close();
                read.close();
                fl.delete();
                File newFile = new File(ruta + usuarios + ".tmp");
                newFile.renameTo(fl);
            } catch (FileNotFoundException e) {
                System.err.println(e);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        return result;
    }
//FIN METODO DE MODIFICAR

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
            ResultSet registro = consulta.executeQuery("call sp_select_tbl_usuarios();");
            if (registro.next()) {
                String user = registro.getString("userid");
                String pass = registro.getString("contrasenna");
                if (checkUser == user) {
                    if (checkPass == pass) {
                        result = true;
                    } else {
                    }
                } else {
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
            ResultSet registro = consulta.executeQuery("call sp_select_tbl_usuarios();");
            if (registro.next()) {
                String validador = registro.getString("cedula");
                System.out.println(validador);
                Cedula = registro.getString("cedula");
                nombre1 = registro.getString("nombre");
                apellido1 = registro.getString("apellido");
                direccion  = registro.getString("direccion");
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
            Statement insercion = Conn.getConnection().createStatement();
            String query = "call ";
            insercion.execute(dia);
        } catch (Exception e) {
        }

        return result;
    }
}
