/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis;

public class Stock {

    private String stockName;
    private String createDate;

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public Stock(String stockName, String createDate) {
        this.stockName = stockName;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockName=" + stockName + ", createDate=" + createDate + '}';
    }

    

    


}
