package CLASES;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Planilla extends Empleado {

    // <editor-fold defaultstate="collapsed" desc="SAVED">
    Conexion Conn = new Conexion();
    private String id_planilla, fecha, TSB, TSS, TEE, TSN;

    public String getId_planilla() {
        return id_planilla;
    }

    public void setId_planilla(String id_planilla) {
        this.id_planilla = id_planilla;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTSB() {
        return TSB;
    }

    public void setTSB(String TSB) {
        this.TSB = TSB;
    }

    public String getTSS() {
        return TSS;
    }

    public void setTSS(String TSS) {
        this.TSS = TSS;
    }

    public String getTEE() {
        return TEE;
    }

    public void setTEE(String TEE) {
        this.TEE = TEE;
    }

    public String getTSN() {
        return TSN;
    }

    public void setTSN(String TSN) {
        this.TSN = TSN;
    }
    // </editor-fold>///////////////////////////////


}
