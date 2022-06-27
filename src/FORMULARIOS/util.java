/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FORMULARIOS;

import java.util.Base64;

/**
 *
 * @author mike
 */
class util {
    public static String cifrar(String password){
    String pass = Base64.getEncoder().encodeToString(password.getBytes());
    return pass ;
    }
}
