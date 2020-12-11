/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockex.util;


public class Validates {
    
    public static String userValidate(String username) {
        return username.equals("") ? "Username is required" : "";
    }
    
    public static String passValidate(String password) {
        return password.equals("") ? "Password is required" : "";
    }
}
