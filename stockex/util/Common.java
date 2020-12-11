/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockex.util;
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


public class Common {

    public static final int SELL_STOCK = 0;
    public static final int BUY_STOCK = 1;
    public static final int NoEX_STOCK = 2;
    
    public static TreeSet<Trader> loginAccount;
    public static TreeMap<String, Trader> registedTraders;
    public static HashMap<String, Stock> listStock;
    public static LinkedList<String> listmailBox;
    public static LinkedList<TraderOrder> listStockOfTrader;
    public static HashMap<String, PriorityQueue<TraderOrderSell>> sellOrders;
    public static HashMap<String, PriorityQueue<TraderOrderBuy>> buyOrrders;
}
