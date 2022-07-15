/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;


import java.sql.*;
public class conexion {

public static Connection getConnection (){
    Connection con;
    try{
        try{    
        Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
        return null;
        }
        con = DriverManager.getConnection("JDBC:MYSQL://localhost/planilla","root","");
        return con;
    }catch(SQLException e){
        System.out.println("NO SE ENCONTRÓ LA BASE DE DATOS");
        return null;
    }
}



}
