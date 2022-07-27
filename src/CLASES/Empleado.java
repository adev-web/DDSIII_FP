package CLASES;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Empleado extends Usuario {

    private double salarioHoras, horasTrabajadas;

    public double getSalarioHoras() {
        return salarioHoras;
    }

    public void setSalarioHoras(double salarioHoras) {
        this.salarioHoras = salarioHoras;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double SalarioBruto() {
        return horasTrabajadas * salarioHoras;
    }

    public double SeguroSocial() {
        return SalarioBruto() * 0.0975;
    }

    public double SeguroEducativo() {
        return SalarioBruto() * 0.0125;
    }

    public double SalarioNeto() {
        return SalarioBruto() - SeguroEducativo() - SeguroSocial();
    }

    public boolean db_SearchEmpleado(String searchUser) {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "SELECT * FROM tbl_empleado WHERE cedula_empleado = '" + searchUser + "'";
            ResultSet registro = consulta.executeQuery(query);
            if (registro.next()) {
                setCedula(registro.getString("cedula_empleado"));
                setNombre1(registro.getString("nombre_1"));
                setNombre2(registro.getString("nombre_2"));
                setApellido1(registro.getString("apellido_1"));
                setApellido2(registro.getString("apellido_2"));
                String[] fechaNacimiento = registro.getString("fecha_nacimiento").split("\\-");
                this.setAño(fechaNacimiento[0]);
                this.setMes(fechaNacimiento[1]);
                this.setDia(fechaNacimiento[2]);
                setDireccion(registro.getString("direccion"));
                setTelefono(registro.getString("telefono"));
                result = true;
            }
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return result;
    }

    public boolean db_InsertEmpleado() {
        boolean result = false;
        String fechaNacimiento = getAño() + "-" + getMes() + "-" + getDia();
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String insertQuery = ""
                + "INSERT INTO tbl_empleado"
                + "(cedula_empleado, "
                + "nombre_1, "
                + "nombre_2, "
                + "apellido_1, "
                + "apellido_2, "
                + "fecha_nacimiento, "
                + "direccion, "
                + "telefono) "
                + "VALUES('" + this.getCedula() + "', "
                + "'" + this.getNombre1() + "', "
                + "'" + this.getNombre2() + "', "
                + "'" + this.getApellido1() + "', "
                + "'" + this.getApellido2() + "', "
                + "'" + fechaNacimiento + "', "
                + "'" + this.getDireccion() + "', "
                + "'" + this.getTelefono() + "');";
            consulta.executeUpdate(insertQuery);
            Conn.close_db();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean db_ModifyEmpleado() {
        boolean result = false;
        String fechaNacimiento = getAño() + "-" + getMes() + "-" + getDia();
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = ""
                + "UPDATE tbl_empleado "
                + "SET "
                + "    cedula_empleado = '" + getCedula() + "',"
                + "    nombre_1 = '" + getNombre1() + "', "
                + "    nombre_2 = '" + getNombre2() + "', "
                + "    apellido_1 = '" + getApellido1() + "', "
                + "    apellido_2 = '" + getApellido2() + "', "
                + "    fecha_nacimiento = '" + fechaNacimiento + "', "
                + "    direccion = '" + getDireccion() + "', "
                + "    telefono = '" + getTelefono() + "' "
                + "WHERE "
                + "'" + getCedula() + "' = cedula_empleado;";
            consulta.executeUpdate(query);
            Conn.close_db();
            result = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean db_Insert_Planilla() {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String fechaPlanilla = getAño() + "-" + getMes() + "-" + getDia();
            String query = "SELECT fecha FROM tbl_planilla WHERE fecha = '" + fechaPlanilla + "'";
            ResultSet rs1 = consulta.executeQuery(query);
            if (rs1.next()) {
            } else {
                Conn.close_db();
                try {
                    Statement consulta2 = Conn.getConnection().createStatement();
                    String insertQuery = "INSERT INTO tbl_planilla (fecha) values('" + fechaPlanilla + "');";
                    consulta2.executeUpdate(insertQuery);
                    result = true;
                    Conn.close_db();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean db_select_idPlanilla() {
        try {
            Statement consulta = Conn.getConnection().createStatement();
            ResultSet registro = consulta.executeQuery("SELECT MAX(id_planilla) AS id_planilla FROM tbl_planilla;");
            if (registro.next()) {
                this.setId_planilla((registro.getString("id_planilla")));
            }
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean db_insert_detallePlanilla() {
        Usuario obj_Usuario = new Usuario();
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String insertQuery = "INSERT INTO tbl_empleado_planilla(id_planilla, cedula_empleado, horas_trabajadas, sph, sb, ss, se, sn) VALUES ("
                + "'" + getId_planilla() + "','" + getCedula() + "','" + getHorasTrabajadas() + "', round( '" + getSalarioHoras() + "',2),round('" + SalarioBruto() + "' ,2),round('" + SeguroSocial() + "',2), round('" + SeguroEducativo() + "',2), round('" + SalarioNeto() + "',2)"
                + ");";
            consulta.executeUpdate(insertQuery);
            Conn.close_db();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean db_select_CheckFecha() {
        boolean result = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String fechaPlanilla = getAño() + "-" + getMes() + "-" + getDia();
            ResultSet registro = consulta.executeQuery("SELECT fecha FROM tbl_planilla WHERE fecha = '" + fechaPlanilla + "');");
            if (registro.next()) {
                String[] fechaNacimiento = registro.getString("fecha").split("\\-");
                this.setAño(fechaNacimiento[0]);
                this.setMes(fechaNacimiento[1]);
                this.setDia(fechaNacimiento[2]);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int db_intLastPlanilla() {
        int result = 0;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "SELECT MAX(id_planilla) AS id_planilla, max(fecha) AS last_fecha FROM tbl_planilla;";
            ResultSet rs = consulta.executeQuery(query);
            if (rs.next()) {
                if (rs.getString("last_fecha") != null) {
                    String[] fecha = rs.getString("last_fecha").split("\\-");
                    result = Integer.parseInt(fecha[0] + "" + fecha[1] + "" + fecha[2]);
                } else {
                    result = 00000000;
                }
            }
            Conn.close_db();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public String db_getPlanillaActual() {
        String id_planillaCurrent = null;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "SELECT MAX(id_planilla) AS id_planilla, MAX(fecha) AS last_fecha FROM tbl_planilla;";
            ResultSet rs = consulta.executeQuery(query);
            if (rs.next()) {
                id_planillaCurrent = rs.getString("id_planilla");
            }
            Conn.close_db();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id_planillaCurrent;
    }

    public boolean checkEmplData(String str_id, String str_cedula) {
        boolean checker = false;
        try {
            Statement consulta = Conn.getConnection().createStatement();
            String query = "SELECT * FROM tbl_empleado_planilla WHERE '" + str_id + "' = id_planilla AND cedula_empleado = '" + str_cedula + "';";
            ResultSet rs = consulta.executeQuery(query);
            if (rs.next()) {
                String id = rs.getString("id_planilla");
                checker = true;
            }
            Conn.close_db();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return checker;
    }

}//FIN DE LA CLASE
