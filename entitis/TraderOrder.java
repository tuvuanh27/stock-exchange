/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis;

public class TraderOrder {
 
    private String traderUsername;
    private String stockName;
    private int quantity;
    private float price;
    private int state; // 0-selling, 1-Buying, 2-thuoc so hu cua trader

    public String getTraderUsername() {
        return traderUsername;
    }

    public void setTraderUsername(String traderUsername) {
        this.traderUsername = traderUsername;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }


    public TraderOrder( String traderUsername, String stockName, int quantity, float price, int state) {
        this.traderUsername = traderUsername;
        this.stockName = stockName;
        this.quantity = quantity;
        this.price = price;
        this.state = state;
    }

    @Override
    public String toString() {
        return "TraderOrder{" + " traderUsername=" + traderUsername + ", stockName=" + stockName + ", quantity=" + quantity + ", price=" + price + ", state=" + state + '}';
    }

    
}
