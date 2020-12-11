/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockex.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class DateTime {
    private DateTimeFormatter dateFormatter;
    private LocalDateTime now;
    
    public DateTime() {
    }
    
    public String getCurrentDateTime() {
        dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        now = LocalDateTime.now();
        
        return dateFormatter.format(now);
    }
    
    public String getCurrentDate() {
        dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        now = LocalDateTime.now();
        
        return dateFormatter.format(now);
    }
    public static void main(String[] args) {
        DateTime dt = new DateTime();
        System.out.println(dt.getCurrentDate());
    }
}
