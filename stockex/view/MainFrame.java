/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stockex.view;
import entitis.*;
import entitis.dao.DAOImp;
import java.util.PriorityQueue;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import stockex.util.Common;
import stockex.util.DateTime;
/**
 *
 * @author vuanh
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private DAOImp dao = new DAOImp();
    private DateTime dateTime;
    private Trader currentTrader;
    private int numStock = 0;
            
    public Trader getCurrentTrader() {
        return currentTrader;
    }

    public void setCurrentTrader(Trader currentTrader) {
        this.currentTrader = currentTrader;
    }

    public JLabel getLblUsernameCr() {
        return lblUsernameCr;
    }

    public void setLblUsernameCr(JLabel lblUsernameCr) {
        this.lblUsernameCr = lblUsernameCr;
    }
    
    
    public MainFrame() {
        initComponents();
        this.initData();
        dateTime = new DateTime();

        
        this.setLocationRelativeTo(null);
    }
    
    private void initData() {
        Common.registedTraders = dao.getTraders();
        Common.listStock = dao.getStocks();
        Common.listmailBox = dao.getListmailBox();
        Common.listStockOfTrader = dao.getListStockOfTrader();
        Common.buyOrrders = dao.getBuyOrrders();
        Common.sellOrders = dao.getSellOrders();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        lblUsernameCr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStockOfUserCr = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SellComboBox = new javax.swing.JComboBox<>();
        BuyComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtQuantitySell = new javax.swing.JTextField();
        txtPriceSell = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtQuantityBuy = new javax.swing.JTextField();
        txtPriceBuy = new javax.swing.JTextField();
        btnSell = new javax.swing.JButton();
        btnBuy = new javax.swing.JButton();
        btnMailbox = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        lblUsernameCr.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblUsernameCr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsernameCr.setText("Hi, ");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("STOCK EXCHANGE");

        tblStockOfUserCr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblStockOfUserCr);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SELL");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("BUY");

        SellComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        BuyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Quantity");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Price");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Quantity");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Price");

        btnSell.setBackground(new java.awt.Color(51, 255, 51));
        btnSell.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnSell.setText("SELL");
        btnSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSellActionPerformed(evt);
            }
        });

        btnBuy.setBackground(new java.awt.Color(51, 255, 51));
        btnBuy.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btnBuy.setText("BUY");
        btnBuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuyActionPerformed(evt);
            }
        });

        btnMailbox.setText("Mail box");
        btnMailbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMailboxActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnLogout.setText("Log out");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblUsernameCr, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SellComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtQuantitySell))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPriceSell))
                            .addComponent(btnSell, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnLogout)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(BuyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtQuantityBuy))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPriceBuy))
                                        .addComponent(btnBuy, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnMailbox)
                        .addGap(104, 104, 104)
                        .addComponent(btnRefresh)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblUsernameCr, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SellComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtQuantitySell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtQuantityBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPriceSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txtPriceBuy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSell, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuy, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMailbox)
                            .addComponent(btnRefresh)
                            .addComponent(btnLogout))
                        .addGap(9, 9, 9))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        LoginFrame flogin = new LoginFrame();
        flogin.setVisible(true);
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnMailboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMailboxActionPerformed
        // TODO add your handling code here:
        MailBoxFrame fmail = new MailBoxFrame();
        // fmail.setTrader(currentTrader);
        fmail.setVisible(true);
        
        
    }//GEN-LAST:event_btnMailboxActionPerformed
   
    
    private boolean validateSellStock(int quantity, String stockName) {
        // Lay quantity cua stockName(state = 2) 
        for (int i = 0; i < Common.listStockOfTrader.size(); i++){
            if(Common.listStockOfTrader.get(i).getTraderUsername().equals(currentTrader.getUsername())){
                if(Common.listStockOfTrader.get(i).getState() == 2 && Common.listStockOfTrader.get(i).getStockName().equals(stockName)){
                    numStock = Common.listStockOfTrader.get(i).getQuantity();
                }
            }
        }
        return quantity <= numStock;
    }
    // Sell Button
    private void btnSellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSellActionPerformed
        // TODO add your handling code here:
        
        // dk1: Tao trader_order Sell neu quantity <= totalStock
        String stockName = (String) SellComboBox.getSelectedItem();
        int quantity = Integer.parseInt(txtQuantitySell.getText());
        float price = Float.parseFloat(txtPriceSell.getText());
        boolean dk1 = false;
        if(! this.validateSellStock(quantity, stockName)){
            JOptionPane.showMessageDialog(null, "Stock quantity sell > total stock");
            dk1 = false;
        }
        else{
            TraderOrderSell newSellOrder = new TraderOrderSell(currentTrader.getUsername(), stockName, quantity, price, Common.SELL_STOCK);
            if (dao.insertTraderOrder(newSellOrder) > 0) {
                System.out.println(newSellOrder);
                // dao.insertTraderOrder(newSellOrder);
                Ban(newSellOrder);
                JOptionPane.showMessageDialog(this, "Sell success");
                txtQuantitySell.setText("");
                txtPriceSell.setText("");
                dk1 = true;
            }
        }
        // update lai so luong stock da ban va chuyen so luong ban sang trang thai selling
        if(dk1){ // Neu tao traderSellOrder thanh cong
            for (int i = 0; i < Common.listStockOfTrader.size(); i++){
                if(Common.listStockOfTrader.get(i).getTraderUsername().equals(currentTrader.getUsername())){
                    if(Common.listStockOfTrader.get(i).getState() == 2 && Common.listStockOfTrader.get(i).getStockName().equals(stockName)){

                        if(numStock > quantity ){
                            TraderOrder traderOrderUpdate = new TraderOrder(currentTrader.getUsername(), stockName, numStock, 0, Common.NoEX_STOCK);
                            System.out.println(traderOrderUpdate.toString());
                            dao.updateTraderOrder(traderOrderUpdate, numStock - quantity);
                        }
                        else {     // Neu ban tat ca so luong cua stock                       
                            TraderOrder traderOrderDelete = new TraderOrder(currentTrader.getUsername(), stockName, quantity, 0, Common.NoEX_STOCK);
                            dao.deleteTraderOrder(traderOrderDelete);
                        }
                    }
                }
            }
        }
        
        
        
    }//GEN-LAST:event_btnSellActionPerformed

    
    // buy button
    private void btnBuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuyActionPerformed

        // them vao trader_order 
        String stockName = (String) BuyComboBox.getSelectedItem();
        int quantity = Integer.parseInt(txtQuantityBuy.getText());
        float price = Float.parseFloat(txtPriceBuy.getText());
        TraderOrderBuy newBuyOrder = new TraderOrderBuy(currentTrader.getUsername(), stockName, quantity, price, Common.BUY_STOCK);
        
        if (dao.insertTraderOrder(newBuyOrder) > 0) {
            System.out.println(newBuyOrder);
            Mua(newBuyOrder);
            JOptionPane.showMessageDialog(this, "Buy success");
            txtQuantityBuy.setText("");
            txtPriceBuy.setText("");     
        }
        
    }//GEN-LAST:event_btnBuyActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:


        this.showTblStock();
        this.showListSell();
        this.showListBuy();

       
    }//GEN-LAST:event_btnRefreshActionPerformed
    //Button Mua: Neu dang co hang doi ban => mua duoc luon, neu ko vao hang doi mua
    //Button Ban: Neu dang co hang doi mua => ban duoc luon, neu ko vao hang doi ban
    
    // ------------------------------------------
    // Mua stock:
    // Tim queue dang ban voi key la nameStock dang mua
    // => truong hop xay ra dua vao phan tu dau tien cua hang doi ban
    //  1. gia mua >= gia ban khop lenh
    //  1.1 mua du - > delete ca 2, sau do them stock cho nguoi mua, tao MailBox
    //  1.2 mua it hon -> remove mua; tru ben ban, sau do them stock cho nguoi mua, tao MailBox
    //  1.3 mua nhieu hon:
    //          remove nguoi ban dau tien, tao MailBox, tru so luong da mua duoc -> kiem tra nguoi ban tiep theo, quay tro lai buoc dau
    //  2. gia mua < gia ban khong thuc hien
    private void Mua(TraderOrderBuy dangmua){
        PriorityQueue<TraderOrderSell> queueSell_stockname = null;
        if (Common.sellOrders.get(dangmua.getStockName()) == null) {
            return;
        }
        else {
            queueSell_stockname = Common.sellOrders.get(dangmua.getStockName());

            //        System.out.println("ds ban:");
            //        while (!queueSell_stockname.isEmpty()) {            
            //            System.out.println("=="+ queueSell_stockname.remove());
            //        }
            // lay phan tu dau tien gan vao dangban
            TraderOrderSell dangban = queueSell_stockname.poll();

            if (dangban != null && dangmua != null && dangmua.getPrice() >= dangban.getPrice()) {
                // 1.1 mua du - > delete ca 2, sau do them stock cho nguoi mua, tao MailBox
                if(dangmua.getQuantity() == dangban.getQuantity()){
                    dao.deleteTraderOrder(dangban);
                    dao.deleteTraderOrder(dangmua);
                    // them stock cho nguoi mua
                    TraderOrder buyedStock = new TraderOrder(dangmua.getTraderUsername(), dangmua.getStockName(), dangmua.getQuantity(), 0, Common.NoEX_STOCK);
                    System.out.println("mua 11 = " + buyedStock);
                    dao.insertTraderOrder(buyedStock);
                    // tao Mailbox
                    MailBox mail = new MailBox(dangban.getTraderUsername(), dangmua.getTraderUsername(), dateTime.getCurrentDateTime(), dangmua.getStockName(), dangban.getPrice());
                    System.out.println("mail 11 = " + mail);
                    dao.insertMailbox(mail);
                }
                // 1.2 mua it hon -> remove mua; tru ben ban, sau do them stock cho nguoi mua, tao MailBox
                else if(dangmua.getQuantity() < dangban.getQuantity()){
                    dao.deleteTraderOrder(dangmua);
                    // update ben ban:
                    dao.updateTraderOrder(dangban, dangban.getQuantity() - dangmua.getQuantity());
                    // them stock cho nguoi mua
                    TraderOrder buyedStock = new TraderOrder(dangmua.getTraderUsername(), dangmua.getStockName(), dangmua.getQuantity(), 0, Common.NoEX_STOCK);
                    System.out.println("mua 12 = " + buyedStock);
                    dao.insertTraderOrder(buyedStock);
                    // tao Mailbox
                    MailBox mail = new MailBox(dangban.getTraderUsername(), dangmua.getTraderUsername(), dateTime.getCurrentDateTime(), dangmua.getStockName(), dangban.getPrice());
                    dao.insertMailbox(mail);
                    System.out.println("mail 12 = " + mail);
                }
                // 1.3 mua nhieu hon:
                // remove nguoi ban dau tien, tao MailBox, them so luong da mua cho nguoi mua
                // tru so luong da mua duoc trong dang mua -> kiem tra nguoi ban tiep theo, quay tro lai buoc dau
                else {
                    dao.deleteTraderOrder(dangban);
                    TraderOrder buyedStock = new TraderOrder(dangmua.getTraderUsername(), dangmua.getStockName(), dangban.getQuantity(), 0, Common.NoEX_STOCK);
                    System.out.println("mua 13 = " + buyedStock);
                    dao.insertTraderOrder(buyedStock);
                    // tao Mailbox
                    MailBox mail = new MailBox(dangban.getTraderUsername(), dangmua.getTraderUsername(), dateTime.getCurrentDateTime(), dangban.getStockName(), dangban.getPrice());
                    dao.insertMailbox(mail);
                    System.out.println("mail 13 = " + mail);
                    int newQty = dangmua.getQuantity() - dangban.getQuantity();
                    dao.updateTraderOrder(dangmua, newQty);
                    TraderOrderBuy newbuy =new TraderOrderBuy(dangmua.getTraderUsername(), dangmua.getStockName(), newQty, dangmua.getPrice(), Common.BUY_STOCK);

                    Mua(newbuy);
                }

            } 
        }
    }
    
    // ------------------------------------------
    // Ban stock:
    // Tim queue dang mua voi key la nameStock dang ban
    // => truong hop xay ra dua vao phan tu dau tien cua hang doi mua
    //  1. gia ban <= gia mua khop lenh
    //  1.1 ban du - > delete ca 2, sau do them stock cho nguoi mua, tao MailBox
    //  1.2 ban it hon -> remove ban; tru ben mua, sau do them stock cho nguoi mua, tao MailBox
    //  1.3 ban nhieu hon:
    //      remove nguoi mua dau tien, tao MailBox, them so luong da mua cho nguoi mua 
    //      tru so luong da ban duoc trong dang ban -> kiem tra nguoi mua tiep theo, quay tro lai buoc dau
    //  2. gia ban > gia mua khong thuc hien
    private void Ban(TraderOrderSell dangban){
        PriorityQueue<TraderOrderBuy> queueBuy_stockname = null;
        if (Common.buyOrrders.get(dangban.getStockName()) == null) {
            return;
        }
        else {
            queueBuy_stockname = Common.buyOrrders.get(dangban.getStockName());

            //        System.out.println("ds ban:");
            //        while (!queueSell_stockname.isEmpty()) {            
            //            System.out.println("=="+ queueSell_stockname.remove());
            //        }
            // lay phan tu dau tien gan vao dangban
            TraderOrderBuy dangmua = queueBuy_stockname.poll();

            if (dangban != null && dangmua != null && dangban.getPrice() <= dangmua.getPrice()) {
                // 1.1 ban du - > delete ca 2, sau do them stock cho nguoi mua, tao MailBox
                if(dangban.getQuantity() == dangmua.getQuantity()){
                    dao.deleteTraderOrder(dangban);
                    dao.deleteTraderOrder(dangmua);
                    // them stock cho nguoi mua
                    TraderOrder buyedStock = new TraderOrder(dangmua.getTraderUsername(), dangmua.getStockName(), dangmua.getQuantity(), 0, Common.NoEX_STOCK);
                    System.out.println("ban 11 = " + buyedStock);
                    dao.insertTraderOrder(buyedStock);
                    // tao Mailbox
                    MailBox mail = new MailBox(dangban.getTraderUsername(), dangmua.getTraderUsername(), dateTime.getCurrentDateTime(), dangmua.getStockName(), dangmua.getPrice());
                    System.out.println("ban 11 = " + mail);
                    dao.insertMailbox(mail);
                }
                // 1.2 ban it hon -> remove ban; tru ben mua, sau do them stock cho nguoi mua, tao MailBox
                else if(dangban.getQuantity() < dangmua.getQuantity()){
                    dao.deleteTraderOrder(dangban);
                    // update ben mua:
                    dao.updateTraderOrder(dangmua, dangmua.getQuantity() - dangban.getQuantity());
                    // them stock cho nguoi mua
                    TraderOrder buyedStock = new TraderOrder(dangmua.getTraderUsername(), dangmua.getStockName(), dangban.getQuantity(), 0, Common.NoEX_STOCK);
                    System.out.println("ban 12 = " + buyedStock);
                    dao.insertTraderOrder(buyedStock);
                    // tao Mailbox
                    MailBox mail = new MailBox(dangban.getTraderUsername(), dangmua.getTraderUsername(), dateTime.getCurrentDateTime(), dangmua.getStockName(), dangmua.getPrice());
                    dao.insertMailbox(mail);
                    System.out.println("ban 12 = " + mail);
                }
                //  1.3 ban nhieu hon:
                //      remove nguoi mua dau tien, tao MailBox, them so luong da mua cho nguoi mua 
                //      tru so luong da ban duoc trong dang ban -> kiem tra nguoi mua tiep theo, quay tro lai buoc dau
                else {
                    dao.deleteTraderOrder(dangmua);
                    TraderOrder buyedStock = new TraderOrder(dangmua.getTraderUsername(), dangmua.getStockName(), dangmua.getQuantity(), 0, Common.NoEX_STOCK);
                    System.out.println("mua 13 = " + buyedStock);
                    dao.insertTraderOrder(buyedStock);
                    // tao Mailbox
                    MailBox mail = new MailBox(dangban.getTraderUsername(), dangmua.getTraderUsername(), dateTime.getCurrentDateTime(), dangban.getStockName(), dangmua.getPrice());
                    dao.insertMailbox(mail);
                    System.out.println("ban mail 13 = " + mail);
                    int newQty = dangban.getQuantity() - dangmua.getQuantity();
                    dao.updateTraderOrder(dangban, newQty);
                    TraderOrderSell newsell =new TraderOrderSell(dangban.getTraderUsername(), dangban.getStockName(), newQty, dangban.getPrice(), Common.BUY_STOCK);

                    Ban(newsell);
                }

            } 
        }
    }
    
    
    // Hien stock dang co cua current Trader
    private void showTblStock(){
        DefaultTableModel model = (DefaultTableModel) tblStockOfUserCr.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
        model.setColumnIdentifiers(new Object[]{
            "Name", "Quantity", "Price","Status"
        });
        
        for (int i = 0; i < Common.listStockOfTrader.size(); i++){
            if(Common.listStockOfTrader.get(i).getTraderUsername().equals(currentTrader.getUsername())){
                String status ="";
                if(Common.listStockOfTrader.get(i).getState() == 2){
                    status = "Owned";
                }
                else if(Common.listStockOfTrader.get(i).getState() == 0){
                    status = "Selling";
                }
                else {
                    status = "Buying";
                }
                model.addRow(new Object[]{
                    Common.listStockOfTrader.get(i).getStockName(), Common.listStockOfTrader.get(i).getQuantity(), Common.listStockOfTrader.get(i).getPrice(),status
                });
            }
        }
    
    }
     // Show List Sell
    public void showListSell(){
        SellComboBox.removeAllItems();
        for (int i = 0; i < Common.listStockOfTrader.size(); i++){
            if(Common.listStockOfTrader.get(i).getTraderUsername().equals(currentTrader.getUsername()) && Common.listStockOfTrader.get(i).getState() == 2){
                SellComboBox.addItem(Common.listStockOfTrader.get(i).getStockName());
            }
        }
    }
    // Show List Buy
    public void showListBuy(){
        BuyComboBox.removeAllItems();
       Common.listStock.keySet().forEach((stockName) -> {
            BuyComboBox.addItem(stockName);
        });
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BuyComboBox;
    private javax.swing.JComboBox<String> SellComboBox;
    private javax.swing.JButton btnBuy;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnMailbox;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnSell;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblUsernameCr;
    private javax.swing.JTable tblStockOfUserCr;
    private javax.swing.JTextField txtPriceBuy;
    private javax.swing.JTextField txtPriceSell;
    private javax.swing.JTextField txtQuantityBuy;
    private javax.swing.JTextField txtQuantitySell;
    // End of variables declaration//GEN-END:variables
}
