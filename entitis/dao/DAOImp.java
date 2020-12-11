/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entitis.dao;

import entitis.MailBox;
import entitis.Stock;
import entitis.Trader;
import entitis.TraderOrder;
import entitis.TraderOrderBuy;
import entitis.TraderOrderSell;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;
import stockex.util.Common;



public class DAOImp implements DAO {

    private final ConnectDB connect;
    private Statement stat;
    private PreparedStatement preStat;

    public DAOImp() {
        connect = new ConnectDB();
    }
    
    @Override
    public TreeSet<Trader> getTraderLogin() {
        TreeSet<Trader> listTraderLogin = new TreeSet<>();
        
        ResultSet rs;
        String sql = "select * from trader";

        try {
            stat = connect.getConnect().createStatement();
            rs = stat.executeQuery(sql);

            while (rs.next()) {
                Trader trader = new Trader(rs.getString(1), rs.getString(2));
                listTraderLogin.add(trader);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " getAccount method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statement");
            }
            connect.closeConnect();
        }
        
        return listTraderLogin;
    }
    
    // Register
    @Override
    public TreeMap<String, Trader> getTraders() {
        TreeMap<String, Trader> listTrader = new TreeMap<>();
        ResultSet rs;
        Trader trader;

        String sql = "select * from trader";

        try {
            stat = connect.getConnect().createStatement();
            rs = stat.executeQuery(sql);

            while (rs.next()) {
                trader = new Trader(rs.getString(1), rs.getString(2));
                listTrader.put(rs.getString(1), trader); // key la username
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " getTrader method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statement");
            }
            connect.closeConnect();
        }

        return listTrader;
    }

    @Override
    public HashMap<String, Stock> getStocks() {
        HashMap<String, Stock> listStock = new HashMap<>();
        ResultSet rs;
        Stock stock;

        String sql = "select * from stock";

        try {
            stat = connect.getConnect().createStatement();
            rs = stat.executeQuery(sql);

            while (rs.next()) {
                stock = new Stock(rs.getString(1), rs.getString(2));
                listStock.put(rs.getString(1), stock);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " getStocks method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statement");
            }
            connect.closeConnect();
        }

        return listStock;
    }
    @Override
    public LinkedList<String> getListmailBox() {
        LinkedList<String> ListmailBox = new LinkedList<>();
        ResultSet rs;
        MailBox mailbox;

        String sql = "select * from MailBox";
        try {
            stat = connect.getConnect().createStatement();
            rs = stat.executeQuery(sql);

            while (rs.next()) {
                mailbox = new MailBox(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getFloat(5));
                ListmailBox.add(mailbox.toString()); 
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " getTrader method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statement");
            }
            connect.closeConnect();
        }

        return ListmailBox;
    }
    
    @Override
    public LinkedList<TraderOrder> getListStockOfTrader(){
        LinkedList<TraderOrder> ListStockOfTrader = new LinkedList<>();
        ResultSet rs;
        TraderOrder trader;

        String sql = "select * from trader_order";

        try {
            stat = connect.getConnect().createStatement();
            rs = stat.executeQuery(sql);

            while (rs.next()) {
                trader = new TraderOrder(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getInt(5));
                ListStockOfTrader.add(trader);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " getTraderNoOrder method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statment");
            }
            connect.closeConnect();
        }
        return ListStockOfTrader;
    }
    @Override
    public HashMap<String, PriorityQueue<TraderOrderSell>> getSellOrders() {
        HashMap<String, PriorityQueue<TraderOrderSell>> sellOrders = new HashMap<>();
        PriorityQueue<TraderOrderSell> orderEarchCompany = null;

        ResultSet rs;
        TraderOrderSell traderOrder;

        String sql = "select * from trader_order where state = 0";

        try {
            stat = connect.getConnect().createStatement();
            rs = stat.executeQuery(sql);

            while (rs.next()) {
                traderOrder = new TraderOrderSell(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getInt(5));
                // Neu chua chua key thi tao queue moi sau do add vao queue
                if (!sellOrders.containsKey(rs.getString(2))) {
                    orderEarchCompany = new PriorityQueue<>();
                    sellOrders.put(rs.getString(2), orderEarchCompany);
                }
                sellOrders.get(rs.getString(2)).add(traderOrder);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " getSellOrder method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statment");
            }
            connect.closeConnect();
        }

        return sellOrders;
    }

    @Override
    public HashMap<String, PriorityQueue<TraderOrderBuy>> getBuyOrrders() {
        HashMap<String, PriorityQueue<TraderOrderBuy>> buyOrders = new HashMap<>();

        PriorityQueue<TraderOrderBuy> orderEarchCompany = null;
        ResultSet rs;
        TraderOrderBuy traderOrder;

        String sql = "select * from trader_order where state = 1";

        try {
            stat = connect.getConnect().createStatement();
            rs = stat.executeQuery(sql);

            while (rs.next()) {
                traderOrder = new TraderOrderBuy(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getFloat(4), rs.getInt(5));
                if (!buyOrders.containsKey(rs.getString(2))) {
                    orderEarchCompany = new PriorityQueue<>();
                    buyOrders.put(rs.getString(2), orderEarchCompany);
                }
                buyOrders.get(rs.getString(2)).add(traderOrder);
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " getBuyOrder method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statment");
            }
            connect.closeConnect();
        }

        return buyOrders;
    }

    @Override
    public int insertTrader(Trader trader) {
        int hasRow = 0;
        String sql = "insert into trader (username, password) values (?, ?) ";

        try {
            preStat = connect.getConnect().prepareStatement(sql);
            preStat.setString(1, trader.getUsername());
            preStat.setString(2, trader.getPassword());

            hasRow = preStat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " insertTrader method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statment");
            }
            connect.closeConnect();
        }

        return hasRow;
    }
    public Boolean checkContains(TraderOrder traderOrder){
        for (int i = 0; i < Common.listStockOfTrader.size(); i++) {
            if(Common.listStockOfTrader.get(i).getTraderUsername().equals(traderOrder.getTraderUsername())
                    && Common.listStockOfTrader.get(i).getStockName().equals(traderOrder.getStockName())
                    && Common.listStockOfTrader.get(i).getPrice() == (traderOrder.getPrice())
                    && Common.listStockOfTrader.get(i).getState()== (traderOrder.getState())
                    )
                return true;
        }
        return false;
    }
    @Override
    public int insertTraderOrder(TraderOrder traderOrder) {
        int hasRow = 0;
        if (checkContains(traderOrder) == true){
            System.out.println(Common.listStockOfTrader);
            String sql = "{call updateStockAfterBuyed (?, ?, ?, ?, ?)}";
            try {
                preStat = connect.getConnect().prepareStatement(sql);
                preStat.setString(1, traderOrder.getTraderUsername());
                preStat.setString(2, traderOrder.getStockName());
                preStat.setInt(3, traderOrder.getQuantity());
                preStat.setFloat(4, traderOrder.getPrice());
                preStat.setInt(5, traderOrder.getState());
                if(preStat.execute() == true){
                    hasRow = 1;
                    return hasRow;
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " insertTraderOrder method");
            }
        }
        else{
            String sql = "insert into trader_order (traderUsername, stockName, quantity, price, state) "
                    + "values (?, ?, ?, ?, ?) ";

            try {
                preStat = connect.getConnect().prepareStatement(sql);
                preStat.setString(1, traderOrder.getTraderUsername());
                preStat.setString(2, traderOrder.getStockName());
                preStat.setInt(3, traderOrder.getQuantity());
                preStat.setFloat(4, traderOrder.getPrice());
                preStat.setInt(5, traderOrder.getState());

                hasRow = preStat.executeUpdate();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage() + " insertTraderOrder method");
            } finally {
                try {
                    stat.close();
                } catch (SQLException ex) {
                    System.err.println(ex.getMessage() + " close statment");
                }
                connect.closeConnect();
            }
        }

        return hasRow;
    }

    @Override
    public int insertStock(Stock stock) {
    int hasRow = 0;
        String sql = "insert into stock (stockName, createDate) values (?, ?) ";

        try {
            preStat = connect.getConnect().prepareStatement(sql);
            preStat.setString(1, stock.getStockName());
            preStat.setString(2, stock.getCreateDate());
            
            hasRow = preStat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " insertStock method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statment");
            }
            connect.closeConnect();
        }

        return hasRow;    
    }
    @Override
    public int insertMailbox(MailBox mail){
        int hasRow = 0;
        String sql = "insert into MailBox (nameUserSell, nameUserBuy, timeEX, nameStock, priceEX) values (?, ?, ?, ?, ?) ";

        try {
            preStat = connect.getConnect().prepareStatement(sql);
            preStat.setString(1, mail.getNameUserSell());
            preStat.setString(2, mail.getNameUserBuy());
            preStat.setString(3, mail.getTimeEX());
            preStat.setString(4, mail.getNameStock());
            preStat.setFloat(5, mail.getPriceEX());
            hasRow = preStat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " insert Mail method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statment");
            }
            connect.closeConnect();
        }

        return hasRow;
    }
    
    @Override
    public int deleteTraderOrder(TraderOrder traderOrder){
        int hasRow = 0;
        String stockName = traderOrder.getStockName();
        String traderUsername = traderOrder.getTraderUsername();
        int quantity = traderOrder.getQuantity();
        float price = traderOrder.getPrice();
        int state = traderOrder.getState();
        String sql = "delete from trader_order "
                + "where stockName = '" + stockName 
                + "'and traderUsername = '" + traderUsername 
                + "' and state = " + state 
                + " and quantity = " + quantity
                + " and price = " + price;

        try {
            preStat = connect.getConnect().prepareStatement(sql);
            hasRow = preStat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " delete traderOrder method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statment");
            }
            connect.closeConnect();
        }

        return hasRow;
    } 
    
    // update
    @Override
    public int updateTraderOrder(TraderOrder traderOrder, int newQuantity ){
        int hasRow = 0;
        String stockName = traderOrder.getStockName();
        String traderUsername = traderOrder.getTraderUsername();
        int quantity = traderOrder.getQuantity();
        float price = traderOrder.getPrice();
        int state = traderOrder.getState();
        String sql = "update trader_order "
                + "set traderUsername = '" + traderUsername + "'"
                + ",stockName = '" + stockName + "'"
                + ",quantity = " + newQuantity
                + ",price = " + price 
                + ",state = " + state
                
                + "where stockName = '" + stockName 
                + "'and traderUsername = '" + traderUsername 
                + "' and state = " + state 
                + " and quantity = " + quantity
                + " and price = " + price;

        try {
            preStat = connect.getConnect().prepareStatement(sql);
          
            hasRow = preStat.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage() + " update traderOrder method");
        } finally {
            try {
                stat.close();
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " close statment");
            }
            connect.closeConnect();
        }

        return hasRow;
    }
    
    
    public static void main(String[] args) {
        DAOImp a = new DAOImp();
        
//        HashMap<String, PriorityQueue<TraderOrderSell>> sellOrders = a.getSellOrders();
//        Iterator<String> itr = sellOrders.keySet().iterator();
//        while (itr.hasNext()) {
//            System.out.println(sellOrders.get(itr.next()));
//        }
        System.out.println("ban");
        HashMap<String, PriorityQueue<TraderOrderSell>> sellOrders = a.getSellOrders();
        Iterator<String> itr1 = sellOrders.keySet().iterator();
        PriorityQueue<TraderOrderSell> orderEarchCompany;
        while (itr1.hasNext()) {
            orderEarchCompany = sellOrders.get(itr1.next());
            while (!orderEarchCompany.isEmpty()) {            
                System.out.println("=="+ orderEarchCompany.remove());
            }
        }
        
        System.out.println("mua");
        HashMap<String, PriorityQueue<TraderOrderBuy>> buyOrders = a.getBuyOrrders();
        Iterator<String> itr2 = buyOrders.keySet().iterator();
        PriorityQueue<TraderOrderBuy> orderEarchCompany2;
        while (itr2.hasNext()) {
            orderEarchCompany2 = buyOrders.get(itr2.next());
            while (!orderEarchCompany2.isEmpty()) {            
                System.out.println("=="+ orderEarchCompany2.remove());
            }
        }
        
    }
}
