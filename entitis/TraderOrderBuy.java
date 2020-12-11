/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis;

public class TraderOrderBuy extends TraderOrder implements Comparable<TraderOrder> {


    public TraderOrderBuy(String traderUsername, String stockName, int quantity, float price, int state) {
        super(traderUsername, stockName, quantity, price, state);
    }

    @Override
    public int compareTo(TraderOrder t) {
        float num = t.getPrice() - this.getPrice();
        return num == 0 ? 0 : num > 0 ? 1 : -1;
    }

}
