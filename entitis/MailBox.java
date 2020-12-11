/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis;

/**
 *
 * @author vuanh
 */
public class MailBox {
    
    private String nameUserSell;
    private String nameUserBuy;
    private String timeEX;
    private String nameStock;
    private Float priceEX;
    
    public String getNameUserSell() {
        return nameUserSell;
    }

    public void setNameUserSell(String nameUserSell) {
        this.nameUserSell = nameUserSell;
    }

    public String getNameUserBuy() {
        return nameUserBuy;
    }

    public void setNameUserBuy(String nameUserBuy) {
        this.nameUserBuy = nameUserBuy;
    }

    public String getTimeEX() {
        return timeEX;
    }

    public void setTimeEX(String timeEX) {
        this.timeEX = timeEX;
    }

    public String getNameStock() {
        return nameStock;
    }

    public void setNameStock(String nameStock) {
        this.nameStock = nameStock;
    }

    

    public Float getPriceEX() {
        return priceEX;
    }

    public void setPriceEX(Float priceEX) {
        this.priceEX = priceEX;
    }

    public MailBox(String nameUserSell, String nameUserBuy, String timeEX, String nameStock, Float priceEX) {
        this.nameUserSell = nameUserSell;
        this.nameUserBuy = nameUserBuy;
        this.timeEX = timeEX;
        this.nameStock = nameStock;
        this.priceEX = priceEX;
    }

    @Override
    public String toString() {
        return "Seller: " + nameUserSell + "    Buyer: " + nameUserBuy + "    Time=" + timeEX + "   nameStock=" + nameStock + "   Price=" + priceEX;
    }

    
    
    

    
    
}
