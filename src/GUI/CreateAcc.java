
package GUI;


import DBConnection.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;



public class CreateAcc extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    public CreateAcc() {
        initComponents();
        conn=database.connect();
        genarateAcc();
        genarateuser();
        
    }

    public void genarateAcc(){
    
        Random ran=new Random();
        int n=ran.nextInt(10000000)+1;
        String val=String.valueOf(n);
        acc.setText(val);
    }
    public void genarateuser(){
         Random ran=new Random();
        int n=ran.nextInt(100000)+1;
        String val=String.valueOf(n);
        uname.setText("AX"+val);
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        add = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        mobile = new javax.swing.JTextField();
        acc = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        acctype = new javax.swing.JComboBox<>();
        amunt = new javax.swing.JTextField();
        submit = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        fvali = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lvali = new javax.swing.JLabel();
        avali = new javax.swing.JLabel();
        mvali = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        amvali = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        pavali = new javax.swing.JLabel();
        covali = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 51));
        setForeground(new java.awt.Color(204, 204, 0));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Create Account");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 70));

        jPanel3.setBackground(new java.awt.Color(255, 0, 51));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setForeground(new java.awt.Color(255, 0, 51));
        jPanel3.setAutoscrolls(true);
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("LastName");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 10));

        fname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });
        jPanel3.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 170, 30));

        jLabel4.setText("Address");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        lname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameKeyReleased(evt);
            }
        });
        jPanel3.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 200, 30));

        jLabel5.setText("First Name");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, 10));

        add.setColumns(20);
        add.setRows(5);
        add.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                addKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(add);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 550, 60));

        jLabel6.setText("Account No");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));

        mobile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        mobile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileActionPerformed(evt);
            }
        });
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobileKeyReleased(evt);
            }
        });
        jPanel3.add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 160, 30));

        acc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        acc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accActionPerformed(evt);
            }
        });
        jPanel3.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 180, 30));

        jLabel8.setText("Password");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, -1, -1));

        jLabel7.setText("UserName");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        uname.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 160, 30));

        jLabel10.setText("AccountType");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));

        jLabel11.setText("Amount");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, -1, -1));

        acctype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Account Type", "Serving Account", "Current Account", " " }));
        acctype.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                acctypeMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                acctypeMouseReleased(evt);
            }
        });
        acctype.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                acctypeKeyReleased(evt);
            }
        });
        jPanel3.add(acctype, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, -1, -1));

        amunt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        amunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amuntActionPerformed(evt);
            }
        });
        amunt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amuntKeyReleased(evt);
            }
        });
        jPanel3.add(amunt, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 180, 30));

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel3.add(submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        pass.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        jPanel3.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 180, 30));

        jLabel9.setText("Mobile");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));
        jPanel3.add(fvali, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, 20));
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 100, 20));
        jPanel3.add(lvali, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 170, 20));
        jPanel3.add(avali, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 150, 20));

        mvali.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mvaliKeyReleased(evt);
            }
        });
        jPanel3.add(mvali, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 130, 20));
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 244, 110, 20));
        jPanel3.add(amvali, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 220, 20));
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 190, 20));
        jPanel3.add(pavali, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 130, 20));
        jPanel3.add(covali, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 150, 20));

        jLabel2.setText("Prefix");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mr.", "MRS.", "MS" }));
        jPanel3.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 790, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void mobileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       
       
        
        try {
            String sql="INSERT INTO createaccount(`firstname`,`lastname`,`address`,`mobile`,`AccountNo`,`username`,`password`,`accounttype`,`amount`)VALUES(?,?,?,?,?,?,?,?,?)";
                     pst=conn.prepareStatement(sql);
                     pst.setString(1,fname.getText());
                     pst.setString(2,lname.getText());
                     pst.setString(3,add.getText());
                     pst.setString(4,mobile.getText());
                     pst.setString(5,acc.getText());
                     pst.setString(6,uname.getText());
                     pst.setString(7,pass.getText());
                     pst.setString(8, (String)acctype.getSelectedItem());
                     pst.setInt(9,Integer.parseInt(amunt.getText()));
                     pst.execute();
                              
                     
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
            if(Integer.parseInt(amunt.getText())<1000){
              JOptionPane.showMessageDialog(null,"you should despostit 1000 or more than 1000");
                }
            else{
         int p = JOptionPane.showConfirmDialog(null, "Are you data is right", "Exit", JOptionPane.YES_NO_OPTION);
                        if (p == 0) {
                           JOptionPane.showMessageDialog(null, "Success! Account has been created");
                            login L1=new login();
                              L1.setVisible(true);
                             this.dispose();
                        }
            }
        
    }//GEN-LAST:event_submitActionPerformed

    public void reset(){
      
      fname.setText("");
      lname.setText("");
      uname.setText("");
      pass.getText();
     fname.getText();
      lname.getText();
      add.getText();
     amunt.setText("");        
     
        
        
    }
    
    
    
    private void amuntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amuntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amuntActionPerformed

    private void accActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_accActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnameActionPerformed

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased
        // TODO add your handling code here:
        String fpattarn="([a-zA-Z]{3,30}\\s*)+";
        Pattern patt=Pattern.compile(fpattarn);
        Matcher match=patt.matcher(fname.getText());
        
        if(!match.matches()){
            fvali.setText("Name incoreecrt");
        }
        else{
             fvali.setText("Name coreecrt");
        }
    }//GEN-LAST:event_fnameKeyReleased

    private void lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyReleased
        // TODO add your handling code here:
        String lpattarn="([a-zA-Z]{3,30}\\s*)+";
        Pattern patt=Pattern.compile(lpattarn);
        Matcher match=patt.matcher(lname.getText());
        
        if(!match.matches()){
            lvali.setText("Name incoreecrt");
        }
        else{
             lvali.setText("Name coreecrt");
        }
    }//GEN-LAST:event_lnameKeyReleased

    private void addKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addKeyReleased
        // TODO add your handling code here:
        if(add.getText()==null) {
          avali.setText("address not be empty");
    }//GEN-LAST:event_addKeyReleased
        else{
            avali.setText(null);
        }
    }
    
    private void mobileKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileKeyReleased
        // TODO add your handling code here:
         String lpattarn="^[0][1-9]{9}$";
        Pattern patt=Pattern.compile(lpattarn);
        Matcher match=patt.matcher(mobile.getText());
        
        if(!match.matches()){
            mvali.setText("invalid moblie no");
        }
        else{
             mvali.setText("valid moblie no");
        }
        
    }//GEN-LAST:event_mobileKeyReleased

    private void amuntKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amuntKeyReleased
        // TODO add your handling code here:
        
        if(Integer.parseInt(amunt.getText())<1000){
             amvali.setText("you should despostit 1000 or more than 1000");
        } else {
             amvali.setText("correct deposit");
        }
    }//GEN-LAST:event_amuntKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        // TODO add your handling code here:
      //  /(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}/
       String lpattarn="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,}";
        Pattern patt=Pattern.compile(lpattarn);
        Matcher match=patt.matcher(pass.getText());
        
        if(!match.matches()){
            pavali.setText(" No strong password");
        }
        else{
             pavali.setText("strong password");
        }
    }//GEN-LAST:event_passKeyReleased

    private void acctypeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_acctypeKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_acctypeKeyReleased

    private void acctypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acctypeMouseReleased
      
    }//GEN-LAST:event_acctypeMouseReleased

    private void acctypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acctypeMouseExited
        // TODO add your handling code here:
        
         
        if(acctype.getSelectedItem().toString()!=null){
             covali.setText(null);
        }
        else{
            covali.setText("please select your account type");
           
        }
    }//GEN-LAST:event_acctypeMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void mvaliKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mvaliKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_mvaliKeyReleased
    
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
            java.util.logging.Logger.getLogger(CreateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAcc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAcc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField acc;
    private javax.swing.JComboBox<String> acctype;
    private javax.swing.JTextArea add;
    private javax.swing.JTextField amunt;
    private javax.swing.JLabel amvali;
    private javax.swing.JLabel avali;
    private javax.swing.JLabel covali;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel fvali;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel lvali;
    private javax.swing.JTextField mobile;
    private javax.swing.JLabel mvali;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel pavali;
    private javax.swing.JButton submit;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
