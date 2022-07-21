/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.util.Base64;

/**
 *
 * @author Alessandro
 */
public class Util {

    public static String encode(String str) {
        //String pass = Base64.getEncoder().encodeToString(password.getBytes());
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encoded = encoder.encode(str.getBytes());
        return new String(encoded);
    }

    public static String decode(String str) {
        //String pass = Base64.getEncoder().encodeToString(password.getBytes());
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(str.getBytes());
        return new String(decoded);
    }
}
