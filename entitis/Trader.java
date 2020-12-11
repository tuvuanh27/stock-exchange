/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis;


public class Trader implements Comparable<Trader>{
    private String username;
    private String password;

    public Trader(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean equals(String username, String password) {
        return this.username.equals(username) 
            && this.password.equals(password);
    }

    @Override
    public int compareTo(Trader o) {
        return username.compareTo(o.username);
    }
    

    @Override
    public String toString() {
        return "Trader{" + "username=" + username + ", password=" + password + '}';
    }
    
}
