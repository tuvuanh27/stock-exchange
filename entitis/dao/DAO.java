/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis.dao;
import entitis.Stock;
import entitis.Trader;
import entitis.TraderOrder;
import entitis.TraderOrderBuy;
import entitis.TraderOrderSell;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import entitis.MailBox;


public interface DAO {
    // TreeMap: Registed
    // TreeSet: Login
    // Mailbox: LinkedList
    // HashMap: Listed stocks
    // Sell Orders for each stocks: PriorityQueue (ascending price) 
    // Buy Orders for each stocks: PriorityQueue (descending price)
    
    //get init data
    public TreeSet<Trader> getTraderLogin();
    public TreeMap<String, Trader> getTraders();
    public HashMap<String, Stock> getStocks();
    public LinkedList<String> getListmailBox();
    public LinkedList<TraderOrder> getListStockOfTrader();
    public HashMap<String, PriorityQueue<TraderOrderSell>> getSellOrders();
    public HashMap<String, PriorityQueue<TraderOrderBuy>> getBuyOrrders();
    
    // insert data 
    public int insertTraderOrder(TraderOrder traderOrder);
    public int insertStock(Stock stock);
    public int insertTrader(Trader trader);
    public int insertMailbox(MailBox mail);
    
    // delete data
    public int deleteTraderOrder(TraderOrder traderOrder);
    
    // updatec data
    public int updateTraderOrder(TraderOrder traderOrder, int newQuantity);
    
}
