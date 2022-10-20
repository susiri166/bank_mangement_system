/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DBConnection.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author HP
 */
public final class Home extends javax.swing.JFrame {
    
      Connection conn=null;
      PreparedStatement pst=null;
    ResultSet rs=null;
    public Home() {
        //getdetails();
        initComponents();
        conn=database.connect();
          jTabbedPane1.setSelectedIndex(3);
      
        //get(aa);
        
    }
    

   
      
  public void getdetails(String users,String account,int amount,String act){
      ss.setText(users);
     accunt.setText(account);
     aamunt.setText(Integer.toString(amount));
     combo.setText(act);
     
    
    
   
  } 
   
    
   
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        amount = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        submit = new javax.swing.JButton();
        accno = new javax.swing.JTextField();
        billaccno = new javax.swing.JTextField();
        billtype = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        acc = new javax.swing.JTextField();
        userr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        balnce = new javax.swing.JTextField();
        withdraw = new javax.swing.JButton();
        pword = new javax.swing.JPasswordField();
        jPanel8 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        aamunt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        combo = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        ss = new javax.swing.JLabel();
        accunt = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        yacc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        tacc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tt = new javax.swing.JTextField();
        aa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        transfer = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        getAcc = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        getpass = new javax.swing.JPasswordField();
        jPanel9 = new javax.swing.JPanel();
        hpanel = new javax.swing.JPanel();
        home = new javax.swing.JLabel();
        paypanel = new javax.swing.JPanel();
        paybills = new javax.swing.JLabel();
        wpanel = new javax.swing.JPanel();
        with = new javax.swing.JLabel();
        transfers = new javax.swing.JPanel();
        tmpanel = new javax.swing.JLabel();
        th = new javax.swing.JPanel();
        trhispanel = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("${iconImage}"), this, org.jdesktop.beansbinding.BeanProperty.create("iconImage"));
        bindingGroup.addBinding(binding);

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "AccountNo", "TransferName", "Amount", "Date and Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table1.setFocusable(false);
        table1.setRowHeight(25);
        table1.setSelectionForeground(new java.awt.Color(255, 204, 0));
        jScrollPane1.setViewportView(table1);

        jPanel6.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 205, 510, 130));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Withdraw History");
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(215, 134, 192, 23));

        jTabbedPane1.addTab("Witdraw Histroy", jPanel6);

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Pay bill");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Account NO");

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Bill Type");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bill Account No");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Amount");

        submit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });

        billaccno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billaccnoActionPerformed(evt);
            }
        });

        billtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Bill Type", "Electric Bill", "Water Bill", "Insurence", " " }));
        billtype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billtypeActionPerformed(evt);
            }
        });

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Pay Bill");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel12))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(jLabel29))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(submit))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(110, 110, 110)
                        .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(68, 68, 68)
                        .addComponent(billaccno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(110, 110, 110)
                        .addComponent(billtype, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(88, 88, 88)
                        .addComponent(accno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel12)
                .addGap(41, 41, 41)
                .addComponent(jLabel29)
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(accno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(billaccno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(49, 49, 49)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(72, 72, 72)
                .addComponent(submit))
        );

        jTabbedPane1.addTab("Pay Bil", jPanel5);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Withdraw Form");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Accounnt No");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");

        acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accActionPerformed(evt);
            }
        });

        userr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userrActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Amount");

        balnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balnceActionPerformed(evt);
            }
        });

        withdraw.setText("WithDraw");
        withdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                withdrawActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(balnce, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(pword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(77, 77, 77)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(userr, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(308, 308, 308)
                        .addComponent(withdraw))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(jLabel1)))
                .addContainerGap(433, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(acc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 94, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(balnce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(57, 57, 57)
                .addComponent(withdraw)
                .addGap(57, 57, 57))
        );

        jTabbedPane1.addTab("Withdraw Form", jPanel1);

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Customer Name");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Account No");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Amount");

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_100px.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(174, 43, 93));
        jLabel19.setText("Weclocome to ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(174, 43, 93));
        jLabel23.setText("AXIS Online");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(174, 43, 93));
        jLabel24.setText("Bank");

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/images (1).jpg"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Account type");

        combo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("This app can");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(0, 153, 0));
        jLabel32.setText("Withdraw money");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(51, 51, 255));
        jLabel33.setText("Transaction Money");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel34.setText("Pay your Bills");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 0));
        jLabel35.setText("Pay your Bills ");

        ss.setBackground(new java.awt.Color(255, 255, 255));
        ss.setForeground(new java.awt.Color(255, 255, 255));

        accunt.setBackground(new java.awt.Color(255, 255, 255));
        accunt.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(jLabel35))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(137, 137, 137))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addGap(95, 95, 95))
                                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(jLabel25)
                                        .addGap(6, 6, 6)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel21)))
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGap(148, 148, 148)
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel22))))
                                .addGap(49, 49, 49)))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(aamunt)
                            .addComponent(combo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ss, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                    .addComponent(accunt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel32)
                        .addGap(27, 27, 27))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel34))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(293, 293, 293)
                        .addComponent(jLabel33))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jLabel25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(ss, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(accunt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(aamunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))))
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(combo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel33)
                        .addGap(31, 31, 31)
                        .addComponent(jLabel35)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24)
                        .addGap(95, 95, 95)))
                .addComponent(jLabel34))
        );

        jTabbedPane1.addTab("Home", jPanel8);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Transfer Form");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 83, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Account No");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 168, -1, -1));
        jPanel4.add(yacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 166, 166, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Traget Account No");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 236, -1, -1));
        jPanel4.add(tacc, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 234, 166, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Transfer Name");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 320, -1, -1));
        jPanel4.add(tt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 318, 166, -1));
        jPanel4.add(aa, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 385, 166, -1));
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 260, -1, -1));

        transfer.setText("Transfer");
        transfer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transferActionPerformed(evt);
            }
        });
        jPanel4.add(transfer, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Amount");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 387, -1, -1));

        jButton2.setText("reset");
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 450, 68, -1));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 700, 590));

        jTabbedPane1.addTab("Transfer Name", jPanel3);

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "AccountNO", "TargetAccountNO", "TransferName", "Amount", "date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.setRowHeight(25);
        jScrollPane2.setViewportView(table2);
        if (table2.getColumnModel().getColumnCount() > 0) {
            table2.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel7.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 650, 150));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Transaction History");
        jPanel7.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 250, 23));

        jTabbedPane1.addTab("Transaction History", jPanel7);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setForeground(new java.awt.Color(255, 0, 0));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Enter Your Account NO");

        getAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAccActionPerformed(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Enter Your Password");

        delete.setBackground(new java.awt.Color(255, 255, 255));
        delete.setForeground(new java.awt.Color(255, 0, 0));
        delete.setText("Delete Your Account");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36)
                            .addComponent(jLabel37))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(getAcc, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(getpass)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(delete)))
                .addContainerGap(321, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getAcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel37))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(getpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addComponent(delete)
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Account", jPanel12);

        jPanel2.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -60, 950, 620));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 1, 710, 560));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hpanel.setBackground(new java.awt.Color(255, 102, 51));
        hpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hpanelMouseClicked(evt);
            }
        });
        hpanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                hpanelKeyPressed(evt);
            }
        });
        hpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/bank_48px.png"))); // NOI18N
        home.setText("Home");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        hpanel.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 60));

        jPanel9.add(hpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, -1));

        paypanel.setBackground(new java.awt.Color(255, 102, 51));
        paypanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paypanelMouseClicked(evt);
            }
        });
        paypanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paypanelKeyPressed(evt);
            }
        });
        paypanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paybills.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        paybills.setForeground(new java.awt.Color(255, 255, 255));
        paybills.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/paycheque_30px.png"))); // NOI18N
        paybills.setText("Pay Bill");
        paybills.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        paybills.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paybillsMouseClicked(evt);
            }
        });
        paybills.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paybillsKeyPressed(evt);
            }
        });
        paypanel.add(paybills, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 60));

        jPanel9.add(paypanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 240, 60));

        wpanel.setBackground(new java.awt.Color(255, 102, 51));
        wpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        wpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                wpanelMouseClicked(evt);
            }
        });
        wpanel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                wpanelKeyPressed(evt);
            }
        });
        wpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        with.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        with.setForeground(new java.awt.Color(255, 255, 255));
        with.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/withdrawal_limit_48px.png"))); // NOI18N
        with.setText("Withdraw");
        with.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                withMouseClicked(evt);
            }
        });
        wpanel.add(with, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jPanel9.add(wpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 240, -1));

        transfers.setBackground(new java.awt.Color(255, 102, 51));
        transfers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transfersMouseClicked(evt);
            }
        });
        transfers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                transfersKeyPressed(evt);
            }
        });
        transfers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tmpanel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tmpanel.setForeground(new java.awt.Color(255, 255, 255));
        tmpanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/get_cash_48px.png"))); // NOI18N
        tmpanel.setText("Transfer Money");
        tmpanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tmpanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tmpanelMouseClicked(evt);
            }
        });
        transfers.add(tmpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 60));

        jPanel9.add(transfers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 240, 60));

        th.setBackground(new java.awt.Color(255, 102, 51));
        th.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                thMouseClicked(evt);
            }
        });
        th.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trhispanel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        trhispanel.setForeground(new java.awt.Color(255, 255, 255));
        trhispanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check_48px.png"))); // NOI18N
        trhispanel.setText("Transfer Histroy");
        trhispanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        trhispanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                trhispanelMouseClicked(evt);
            }
        });
        th.add(trhispanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1, 240, 70));

        jPanel9.add(th, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 240, 70));

        jPanel10.setBackground(new java.awt.Color(255, 102, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check_48px.png"))); // NOI18N
        jLabel27.setText("Withdraw Histroy");
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 60));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 240, 60));

        jPanel13.setBackground(new java.awt.Color(255, 102, 51));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/denied_skin_type_7_48px.png"))); // NOI18N
        jLabel38.setText("Delete Account");
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 240, 60));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 500));

        jPanel11.setBackground(new java.awt.Color(255, 102, 51));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shutdown_48px.png"))); // NOI18N
        jLabel28.setText("EXIT");
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, -1, 70));

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accActionPerformed

    private void balnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balnceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balnceActionPerformed

    private void withdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_withdrawActionPerformed
        // TODO add your handling code here:
      
      withdarw();
          
      
        
    }//GEN-LAST:event_withdrawActionPerformed

    public void withdarw(){
   //
        String getacc=acc.getText();
         try {
             String sql="SELECT  `AccountNO`, `username`, `password`,`amount` FROM `createaccount` WHERE `AccountNO`='"+getacc+"'";
        PreparedStatement pst3=conn.prepareStatement(sql);
        rs=pst3.executeQuery(); 
     
        while (rs.next()) {
        String accName = rs.getString("AccountNO");
        String username = rs.getString("username");
        String password= rs.getString("password");
        int amountt = rs.getInt("amount");
        
        int getmoney= Integer.parseInt(balnce.getText());
        int balance=amountt-getmoney;
         String pass=pword.getText();
        
        String getuser=userr.getText();
          
      if(accName.equalsIgnoreCase(getacc)&& password.equalsIgnoreCase(pass) &&(username.equalsIgnoreCase(getuser))&& password.equals(pass)){
           if(balance>0 && amountt>1000 ){
               String update="UPDATE `createaccount` SET `amount`='"+balance+"' WHERE `AccountNO`='"+getacc+"'";
               PreparedStatement pst = conn.prepareStatement(update);
               pst.execute();  
               
               String update1="INSERT INTO `withdaraw history`(`AccountNO`, `username`, `amount`) VALUES ('"+getacc+"','"+getuser+"','"+getmoney+"')";
               PreparedStatement pst1 = conn.prepareStatement(update1);
               pst1.execute();
               
                try {
              String select="SELECT `AccountNO`, `username`, `amount`,`date` FROM `withdaraw history` WHERE AccountNO='"+getacc+"'";
              PreparedStatement pst2=conn.prepareStatement(select);
              rs=pst2.executeQuery();
              table1.setModel(DbUtils.resultSetToTableModel(rs));
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e);
          }
               
           }   
            JOptionPane.showMessageDialog(null, "Withdraw Sucessfully");   
       }
         else{
            JOptionPane.showMessageDialog(null, "Withdraw  not Sucessfully");
       }   
      }
       
        
    } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "not sucessfully");
    }
          
       // getdetails(sql, sql, ABORT, sql);
    }
    
    
    
    public void transaction(){
           String yaccno=yacc.getText();
        String taccno=tacc.getText();
        int getamount=Integer.parseInt(aa.getText());
        String transfername=tt.getText();
         String sql="SELECT `AccountNO`,`amount` FROM `createaccount`  WHERE `AccountNO`='"+yaccno+"'";
         String sql1="SELECT `AccountNO`,`amount` FROM `createaccount`  WHERE `AccountNO`='"+taccno+"'";
         //send money
           try  {
              PreparedStatement pst3=conn.prepareStatement(sql);
              rs=pst3.executeQuery(); 
            while (rs.next()) {
               String youraccno = rs.getString("AccountNO");
               int  amunt=rs.getInt("amount");
              int send=amunt-getamount;
                if(amunt<1000){
              if(youraccno.equalsIgnoreCase(yaccno)){
               String sendtaccno="UPDATE `createaccount` SET `amount`='"+send+"' WHERE `AccountNO`='"+yaccno+"'";
               PreparedStatement pst = conn.prepareStatement(sendtaccno);
              pst.execute();
        }
                }
                else{
                    JOptionPane.showMessageDialog(null,"you money is low can't transaction");
                }
      }
    } catch (Exception e) {
       JOptionPane.showMessageDialog(null,"not sucessfully tranansaction");
    }
     
    //get money
           try {
               PreparedStatement pst3=conn.prepareStatement(sql1);
              rs=pst3.executeQuery();
      while (rs.next()) {
        
        String targetno = rs.getString("AccountNO");
        
        int  amunt=rs.getInt("amount");
       int add=getamount+amunt;
          
       
       if( targetno.equalsIgnoreCase(targetno)){
            String getyaccno="UPDATE `createaccount` SET `amount`='"+add+"' WHERE `AccountNO`='"+taccno+"'";
          PreparedStatement pst = conn.prepareStatement(getyaccno);
          pst.execute();    
        }
         
      }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"not sucessfully");
        }
           
        
          try {
              String trans="INSERT INTO `transaction history`(`AccountNO`,`TragetaccountNo`,`transferName`,`Amount`) VALUES ('"+yaccno+"','"+taccno+"','"+transfername+"','"+getamount+"')";
              PreparedStatement pst3;
              pst3 = conn.prepareStatement(trans);
               pst3.execute();
          } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,e);
          }
          
           try {
              String select="SELECT `AccountNO`, `TragetaccountNo`, `transferName`, `Amount`, `date` FROM `transaction history` WHERE `AccountNO`='"+yaccno+"'";
              PreparedStatement pst2=conn.prepareStatement(select);
              rs=pst2.executeQuery();
              table2.setModel(DbUtils.resultSetToTableModel(rs));
          } catch (SQLException e) {
               JOptionPane.showMessageDialog(null, e);
          }
         JOptionPane.showMessageDialog(null,"sucessfully taransaction");
    }
    private void billaccnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billaccnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billaccnoActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        // TODO add your handling code here:
     paybill();
        
    }//GEN-LAST:event_submitActionPerformed

    public void paybill(){
          String getaccno=accno.getText();
       String getbilltype=billtype.getSelectedItem().toString();
       String getbillaccno=billaccno.getText();
       int getamount=Integer.parseInt(amount.getText());
       
       String sql="SELECT `AccountNO`,`amount` FROM `createaccount`  WHERE `AccountNO`='"+getaccno+"'";
        try {
            PreparedStatement pst3=conn.prepareStatement(sql);
              rs=pst3.executeQuery();
            while (rs.next()) {
                String accono=rs.getString("AccountNO");
                int  amunts=rs.getInt("amount");
                if(accono.equalsIgnoreCase(getaccno)){
                String quary="INSERT INTO `paybill`(`AccountNO`, `Bill Type`, `Bill Amount No`, `Amount`) VALUES ('"+getaccno+"','"+getbilltype+"','"+getbillaccno+"','"+getamount+"')";
                PreparedStatement pst = conn.prepareStatement(quary);
                pst.execute(); 
                
            }
                
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,e);
        }
        
        try (Statement stmt = conn.createStatement()) {
               ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String accono=rs.getString("AccountNO");
                int  amunts=rs.getInt("amount");
                if(accono.equalsIgnoreCase(getaccno)){
                   int update=amunts-getamount;
                String updateac="UPDATE `createaccount` SET `Amount`='"+update+"' WHERE `AccountNO`='"+accono+"';";
                PreparedStatement pst = conn.prepareStatement(updateac);
                pst.execute(); 
            }
            }
        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null,e);
        }
        JOptionPane.showMessageDialog(null,"sucessfully paybill");
    }
    private void userrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userrActionPerformed

    private void billtypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billtypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billtypeActionPerformed

    private void hpanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_hpanelKeyPressed
        // TODO add your handling code here:
        
      
    }//GEN-LAST:event_hpanelKeyPressed

    private void paypanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paypanelKeyPressed
        // TODO add your handling code here:
      
    }//GEN-LAST:event_paypanelKeyPressed

    private void wpanelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wpanelKeyPressed
        // TODO add your handling code here:
      
        
    }//GEN-LAST:event_wpanelKeyPressed

    private void transfersKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_transfersKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_transfersKeyPressed

    private void hpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hpanelMouseClicked
        // TODO add your handling code here:
      jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_hpanelMouseClicked

    private void wpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_wpanelMouseClicked
        // TODO add your handling code here:
       jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_wpanelMouseClicked

    private void withMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_withMouseClicked
        // TODO add your handling code here:
       jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_withMouseClicked

    private void transfersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transfersMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_transfersMouseClicked

    private void paypanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paypanelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_paypanelMouseClicked

    private void trhispanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_trhispanelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_trhispanelMouseClicked

    private void paybillsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paybillsKeyPressed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_paybillsKeyPressed

    private void paybillsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paybillsMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_paybillsMouseClicked

    private void thMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_thMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_thMouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        
    }//GEN-LAST:event_homeMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void tmpanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmpanelMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_tmpanelMouseClicked

    private void transferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transferActionPerformed
        // TODO add your handling code here:
        transaction();
        
    }//GEN-LAST:event_transferActionPerformed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
         int p = JOptionPane.showConfirmDialog(null, "Do You Want To Exit", "Exit", JOptionPane.YES_NO_OPTION);
        if (p == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel28MouseClicked

    private void getAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_getAccActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        delete();
    }//GEN-LAST:event_deleteActionPerformed

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        // TODO add your handling code here:
         jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jLabel38MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel11MouseClicked
    
    public void delete(){
        String accont=getAcc.getText();
        String password=getpass.getText();
        
        
       
         try {
             //String sqls="DELETE FROM `createaccount` WHERE `AccountNO`='"+accont+"'";
             String sqls="SELECT  `firstname`, `lastname`, `address`, `mobile`, `AccountNO`, `username`, `password`, `accounttype`, `amount`  FROM `createaccount` WHERE `AccountNO`='"+accont+"'";
            PreparedStatement pst3=conn.prepareStatement(sqls);
              rs=pst3.executeQuery();
             while(rs.next()){
                String passwords= rs.getString("password");
                
                if(passwords.equals(password)){
                     
                     String deletes="DELETE FROM `createaccount` WHERE `AccountNO`='"+accont+"'";
                PreparedStatement pst5 = conn.prepareStatement(deletes);
                pst5.execute(); 
                     
                }
             }
               
              
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null,e);
        }
         // JOptionPane.showMessageDialog(null,"Sucessfully deleted");
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
             
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aa;
    private javax.swing.JTextField aamunt;
    private javax.swing.JTextField acc;
    private javax.swing.JTextField accno;
    private javax.swing.JLabel accunt;
    private javax.swing.JTextField amount;
    private javax.swing.JTextField balnce;
    private javax.swing.JTextField billaccno;
    private javax.swing.JComboBox<String> billtype;
    private javax.swing.JLabel combo;
    private javax.swing.JButton delete;
    private javax.swing.JTextField getAcc;
    private javax.swing.JPasswordField getpass;
    private javax.swing.JLabel home;
    private javax.swing.JPanel hpanel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel paybills;
    private javax.swing.JPanel paypanel;
    private javax.swing.JPasswordField pword;
    private javax.swing.JLabel ss;
    private javax.swing.JButton submit;
    private javax.swing.JTable table1;
    private javax.swing.JTable table2;
    private javax.swing.JTextField tacc;
    private javax.swing.JPanel th;
    private javax.swing.JLabel tmpanel;
    private javax.swing.JButton transfer;
    private javax.swing.JPanel transfers;
    private javax.swing.JLabel trhispanel;
    private javax.swing.JTextField tt;
    private javax.swing.JTextField userr;
    private javax.swing.JLabel with;
    private javax.swing.JButton withdraw;
    private javax.swing.JPanel wpanel;
    private javax.swing.JTextField yacc;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

   

    
}
