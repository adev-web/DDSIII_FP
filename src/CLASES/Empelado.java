package CLASES;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Empelado extends Usuario {

  private String empleados = "empleados.txt";
  private String ruta = "C:\\proyecto\\";
  private String usuarios = "usuario.txt";
  private final String separador = "|";
  private String fecha = super.getDia() + "/" + super.getMes() + "/" + super.getAño();
  
  private double salarioHoras, horasTrabajadas;

  public String getFecha() {
    return fecha;
  }

  public void setFecha(String fecha) {
    this.fecha = fecha;
  }

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

   

  
  public Empelado() {
  }

  public Empelado(String Cedula, String password, String nombre1, String nombre2, String apellido1, String apellido2, String dia, String mes, String año, String direccion, String telefono) {
    super(Cedula, password, nombre1, nombre2, apellido1, apellido2, dia, mes, año, direccion, telefono);
  }

  //METODO DE CREAR/////
  public boolean CrearEmpleado() {
    File fileRuta = new File(this.ruta);
    if (!fileRuta.exists()) {
      fileRuta.mkdir();
    }
    try {
      FileWriter fw = new FileWriter(this.ruta + this.empleados, true);
      PrintWriter pw = new PrintWriter(fw);
      pw.println(
              super.getCedula() + this.separador
              + super.getNombre1() + this.separador
              + super.getNombre2() + this.separador
              + super.getApellido1() + this.separador
              + super.getApellido2() + this.separador
              + this.salarioHoras + this.separador
              + this.horasTrabajadas + this.separador
              + "");
      pw.close();
      fw.close();
      return true;
    } catch (IOException e) {
      return false;
    }
  }

  //***************************
  //METODO BUSCAR//// 
  public boolean Buscar() {
    boolean result = false;
    File fileRuta = new File(ruta);
    if (!fileRuta.exists()) {
      fileRuta.mkdir();
    }
    File fl = new File(this.ruta + this.usuarios);
    try {
      Scanner read = new Scanner(fl);
      while (read.hasNextLine()) {
        String[] linea = read.nextLine().split("\\|");
        if (linea[0].equals(super.getCedula())) {
          linea[0] = super.getCedula();
          linea[1] = super.getNombre1();
          linea[2] = super.getNombre2();
          linea[3] = super.getApellido1();
          linea[4] = super.getApellido2();
          read.close();
          result = true;
        }
      }
      read.close();
    } catch (FileNotFoundException e) {
      System.err.println(e);
    }
    return result;
  }

  //METODO DE MODIFICAR EL USUARIO
  public boolean ModificarEmpleado() {
    File fileRuta = new File(ruta);
    if (!fileRuta.exists()) {
      fileRuta.mkdir();
    }
    File fl = new File(this.ruta + this.empleados);
    try {
      FileWriter fw = new FileWriter(ruta + empleados + ".tmp");
      PrintWriter pw = new PrintWriter(fw);
      try {
        Scanner read = new Scanner(fl);
        while (read.hasNextLine()) {
          String linea = read.nextLine()/*.split("\\|")*/;
          String[] arr = linea.split("\\|");
          if (arr[0].equals(super.getCedula())) {
            pw.println(""
                    + super.getCedula() + this.separador //DUDAS DE MODIFICACION
                    + super.getNombre1() + this.separador
                    + super.getNombre2() + this.separador
                    + super.getApellido1() + this.separador
                    + super.getApellido2() + this.separador
                    + this.salarioHoras + this.separador
                    + this.horasTrabajadas + this.separador
            );
          } else {
            pw.println(linea);
          } //FIN DEL IF
        } //FIN DEL WHILE

        pw.close();
        fw.close();
        read.close();
        fl.delete();
        File newFile = new File(ruta + empleados + ".tmp");
        newFile.renameTo(fl);
        return true;
      } catch (FileNotFoundException e) {
        return false;
      }
    } catch (IOException e) {
      return false;
    }
  }//METODO ELIMINAR//

  public boolean EliminarEmpleado() {

    File fileRuta = new File(ruta);
    if (!fileRuta.exists()) {
      fileRuta.mkdir();
    }
    File fl = new File(ruta + empleados);

    try {
      FileWriter fw = new FileWriter(ruta + empleados + ".tmp");
      PrintWriter pw = new PrintWriter(fw);
      try {
        Scanner read = new Scanner(fl);
        while (read.hasNextLine()) {
          String linea = read.nextLine();
          String[] arr = linea.split("\\|");
          if (!arr[0].equals(super.getCedula())) {
            pw.println(linea);
          }
        }
        pw.close();
        fw.close();
        read.close();
        fl.delete();
        File newFile = new File(ruta + empleados + ".tmp");
        newFile.renameTo(fl);
        return true;
      } catch (FileNotFoundException e) {
        return false;
      }
    } catch (IOException e) {
      return false;
    }
  }

  //MICROMETODOS
    public  String SalarioBruto() {
    double bruto = horasTrabajadas * salarioHoras;
    return bruto+"";
    }

    public String SeguroSocial() {
     double Seguros = Double.parseDouble(SalarioBruto()) * 0.0975;
     return Seguros+"";
  }

    public String SeguroEducativo() {
    double SE = Double.parseDouble(SalarioBruto()) * 0.0125;
    return SE+"";
    }

    public String SalarioNeto() {
     double neto = Double.parseDouble(SalarioBruto()) - Double.parseDouble(SeguroEducativo()) - Double.parseDouble(SeguroSocial());
     return neto+"";
    }
  
  //METODO DE MOSTRAR USUARIO EN TABLA
    public ArrayList<Empelado> mostrarTodo() {
    ArrayList<Empelado> empleadoLista = new ArrayList<>();
    File fileRuta = new File(ruta);
    if(!fileRuta.exists())
        fileRuta.mkdir();
    
    File fl = new File(ruta + empleados);
    try{
    Scanner read = new Scanner(fl);
    while(read.hasNextLine()){
    String linea = read.nextLine();
    String[] arr = linea.split("\\|");
    //Double[] arr2 = linea.split("\\|");
    Empelado objEmpelado = new Empelado();
    objEmpelado.setCedula(arr[0]);
    objEmpelado.setNombre1(arr[1]);
    objEmpelado.setNombre2(arr[2]);
    objEmpelado.setApellido1(arr[3]);
    objEmpelado.setApellido2(arr[4]);
    objEmpelado.setHorasTrabajadas(Double.parseDouble(arr[5]));
    objEmpelado.setSalarioHoras(Double.parseDouble(arr[6]));
    arr[7] =  objEmpelado.SalarioBruto();
    arr[8] =  objEmpelado.SeguroSocial();
    arr[9] =  objEmpelado.SeguroEducativo();
    arr[10]=  objEmpelado.SalarioNeto();
    }
    read.close();
    return empleadoLista;
    }
    
    catch(FileNotFoundException e){
        return null;
    }
    }

    

    

    
  
  
  
  
  
}//FIN DE LA CLASE
