package CLASES;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Empleado extends Usuario {

  private String empleados = "empleados.txt";
  private String ruta = "C:\\proyecto\\";
  private String usuarios = "usuario.txt";
  private final String concat = "|";
  private final String splitter = "\\|";
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

  public Empleado() {
  }

  public Empleado(String Cedula, String password, String nombre1, String nombre2, String apellido1, String apellido2, String dia, String mes, String año, String direccion, String telefono) {
    super(Cedula, password, nombre1, nombre2, apellido1, apellido2, dia, mes, año, direccion, telefono);
  }

  //METODO DE CREAR/////
  public boolean CrearEmpleado() {
    boolean result = false;
    File fileRuta = new File(this.ruta);
    if (!fileRuta.exists()) {
      fileRuta.mkdir();
    }
    try {
      FileWriter fw = new FileWriter(this.ruta + this.empleados, true);
      PrintWriter pw = new PrintWriter(fw);
      if (Buscar() == false) {
        pw.println(
                super.getCedula() + this.concat
                + super.getNombre1() + this.concat
                + super.getNombre2() + this.concat
                + super.getApellido1() + this.concat
                + super.getApellido2() + this.concat
                + this.salarioHoras + this.concat
                + this.horasTrabajadas + this.concat
                + "");
        result = true;
      }
      pw.close();
      fw.close();
    } catch (IOException e) {
      System.err.println(e);
    }
    return result;
  }

  //***************************
  //METODO BUSCAR//// 
  public boolean Buscar() {
    boolean result = false;
    File fileRuta = new File(ruta);
    if (!fileRuta.exists()) {
      fileRuta.mkdir();
    }
    File fl = new File(this.ruta + this.empleados);
    try {
      Scanner read = new Scanner(fl);
      while (read.hasNextLine()) {
        String[] linea = read.nextLine().split(this.splitter);
        if (linea[0].equals(super.getCedula())) {
          linea[0] = super.getCedula();
          linea[1] = super.getNombre1();
          linea[2] = super.getNombre2();
          linea[3] = super.getApellido1();
          linea[4] = super.getApellido2();
          linea[5] = "" + this.getSalarioHoras();
          linea[6] = "" + this.getHorasTrabajadas();
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
          String[] arr = linea.split(this.splitter);
          if (arr[0].equals(super.getCedula())) {
            pw.println(""
                    + super.getCedula() + this.concat //DUDAS DE MODIFICACION
                    + super.getNombre1() + this.concat
                    + super.getNombre2() + this.concat
                    + super.getApellido1() + this.concat
                    + super.getApellido2() + this.concat
                    + this.salarioHoras + this.concat
                    + this.horasTrabajadas + this.concat
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
          String[] arr = linea.split(this.splitter);
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
  public double SalarioBruto() {
    double bruto = horasTrabajadas * salarioHoras;
    return bruto;
  }

  public double SeguroSocial() {
    double Seguros = SalarioBruto() * 0.0975;
    return Seguros;
  }

  public double SeguroEducativo() {
    double SE = SalarioBruto() * 0.0125;
    return SE;
  }

  public double SalarioNeto() {
    double neto = SalarioBruto() - SeguroEducativo() - SeguroSocial();
    return neto;
  }

  //METODO DE MOSTRAR USUARIO EN TABLA
  public ArrayList<Empleado> mostrarTodo() {
    ArrayList<Empleado> empleadoLista = new ArrayList<>();
    File fileRuta = new File(ruta);
    if (!fileRuta.exists()) {
      fileRuta.mkdir();
    }
    File fl = new File(ruta + empleados);
    try {
      Scanner read = new Scanner(fl);
      while (read.hasNextLine()) {
        String linea = read.nextLine();
        String[] arr = linea.split(this.splitter);
        //Double[] arr2 = linea.split("\\|");
        Empleado objEmpelado = new Empleado();
        objEmpelado.setCedula(arr[0]);
        objEmpelado.setNombre1(arr[1]);
        objEmpelado.setNombre2(arr[2]);
        objEmpelado.setApellido1(arr[3]);
        objEmpelado.setApellido2(arr[4]);
        objEmpelado.setHorasTrabajadas(Double.parseDouble(arr[5]));
        objEmpelado.setSalarioHoras(Double.parseDouble(arr[6]));
        objEmpelado.SalarioBruto();
        empleadoLista.add(objEmpelado);
        objEmpelado.SeguroSocial();
        objEmpelado.SeguroEducativo();
        objEmpelado.SalarioNeto();
      }
      read.close();
      return empleadoLista;
    } catch (FileNotFoundException e) {
      return null;
    }
  }
}//FIN DE LA CLASE
