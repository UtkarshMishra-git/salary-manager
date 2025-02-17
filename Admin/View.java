/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Utkarsh
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
          welcome.setText(""+Login.name.toUpperCase());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        resetPass = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        modData = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        adData = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        delData = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        viewData = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        logout = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        empid = new javax.swing.JTextField();
        alldata = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        emptbl = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator3.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 5));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, 2));

        resetPass.setBackground(new java.awt.Color(51, 51, 51));
        resetPass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        resetPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resetPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                resetPassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                resetPassMouseExited(evt);
            }
        });
        resetPass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("RESET PASSWORD");
        resetPass.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));

        jPanel2.add(resetPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 210, 60));

        modData.setBackground(new java.awt.Color(51, 51, 51));
        modData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        modData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                modDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                modDataMouseExited(evt);
            }
        });
        modData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("UPDATE RECORD");
        modData.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));

        jPanel2.add(modData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 210, 60));

        adData.setBackground(new java.awt.Color(51, 51, 51));
        adData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        adData.setForeground(new java.awt.Color(51, 51, 51));
        adData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adDataMouseExited(evt);
            }
        });
        adData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER RECORD");
        adData.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));

        jPanel2.add(adData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SALARY MANAGER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        welcome.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 255, 255));
        welcome.setText("WELCOME  ADMIN ");
        jPanel2.add(welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        delData.setBackground(new java.awt.Color(51, 51, 51));
        delData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        delData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                delDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delDataMouseExited(evt);
            }
        });
        delData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DELETE RECORD");
        delData.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 40));

        jPanel2.add(delData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 210, 60));

        viewData.setBackground(new java.awt.Color(102, 102, 102));
        viewData.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 2));
        viewData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewDataMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDataMouseExited(evt);
            }
        });
        viewData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("VIEW RECORD");
        viewData.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 140, 40));

        jPanel2.add(viewData, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 210, 60));

        jSeparator4.setForeground(new java.awt.Color(153, 153, 153));
        jSeparator4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 5));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, 210, 3));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        logout.setForeground(new java.awt.Color(51, 153, 255));
        logout.setText("CLICK HERE TO LOGOUT");
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 540));

        mini.setBackground(new java.awt.Color(204, 204, 204));
        mini.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mini.setForeground(new java.awt.Color(51, 153, 255));
        mini.setText("  -");
        mini.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        mini.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniMouseExited(evt);
            }
        });
        jPanel1.add(mini, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 40, 30));

        exit.setBackground(new java.awt.Color(255, 0, 51));
        exit.setFont(new java.awt.Font("MS UI Gothic", 1, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 0, 51));
        exit.setText("   X");
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 43, 30));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setText(" Employee No.                    :");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 200, 20));

        empid.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        empid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empidActionPerformed(evt);
            }
        });
        jPanel3.add(empid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 200, 25));

        alldata.setBackground(new java.awt.Color(51, 51, 51));
        alldata.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        alldata.setForeground(new java.awt.Color(255, 255, 255));
        alldata.setText("SHOW ALL");
        alldata.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        alldata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alldataActionPerformed(evt);
            }
        });
        jPanel3.add(alldata, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 100, 40));

        search.setBackground(new java.awt.Color(51, 51, 51));
        search.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 100, 40));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        emptbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        emptbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpNo", "EName", "Basic", "HRA", "DA", "PF", "NET"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        emptbl.setGridColor(new java.awt.Color(255, 255, 255));
        emptbl.setIntercellSpacing(new java.awt.Dimension(2, 2));
        emptbl.setSelectionBackground(new java.awt.Color(51, 153, 255));
        jScrollPane1.setViewportView(emptbl);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 508, 280));

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("VIEW EMPLOYEE DATA");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 550, 40));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 550, 4));

        error.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        jPanel3.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 210, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 532, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void resetPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetPassMouseClicked
        Reset r=new Reset();
        r.setVisible(true);
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_resetPassMouseClicked

    private void resetPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetPassMouseEntered
        resetPass.setBackground(new Color(102,102,102));// TODO add your handling code here:
    }//GEN-LAST:event_resetPassMouseEntered

    private void resetPassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resetPassMouseExited
        resetPass.setBackground(new Color(51,51,51));// TODO add your handling code here:
    }//GEN-LAST:event_resetPassMouseExited

    private void modDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modDataMouseClicked
         new Update().setVisible(true);
//        v.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_modDataMouseClicked

    private void modDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modDataMouseEntered
       modData.setBackground(new Color(102,102,102)); // TODO add your handling code here:
    }//GEN-LAST:event_modDataMouseEntered

    private void modDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modDataMouseExited
        modData.setBackground(new Color(51,51,51));// TODO add your handling code here:
    }//GEN-LAST:event_modDataMouseExited

    private void adDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adDataMouseClicked
        new MainMenu().setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_adDataMouseClicked

    private void adDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adDataMouseEntered
        adData.setBackground(new Color(102,102,102));  // adData.setBackground(new Color(102,102,102));         // TODO add your handling code here:
    }//GEN-LAST:event_adDataMouseEntered

    private void adDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adDataMouseExited
        adData.setBackground(new Color(51,51,51));// adData.setBackground(new Color(51,51,51)); // TODO add your handling code here:
    }//GEN-LAST:event_adDataMouseExited

    private void delDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delDataMouseClicked
        Delete del=new Delete();
        del.setVisible(true);
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_delDataMouseClicked

    private void delDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delDataMouseEntered
        delData.setBackground(new Color(102,102,102)); // TODO add your handling code here:
    }//GEN-LAST:event_delDataMouseEntered

    private void delDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delDataMouseExited
        delData.setBackground(new Color(51,51,51)); // TODO add your handling code here:
    }//GEN-LAST:event_delDataMouseExited

    private void viewDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDataMouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_viewDataMouseClicked

    private void viewDataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDataMouseEntered
       // TODO add your handling code here:
    }//GEN-LAST:event_viewDataMouseEntered

    private void viewDataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDataMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_viewDataMouseExited

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        new Login().setVisible(true);
        this.setVisible(false);// TODO add your handling code here:
    }//GEN-LAST:event_logoutMouseClicked

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(JFrame.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_miniMouseClicked

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered

        mini.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited

        mini.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));
    }//GEN-LAST:event_miniMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit.setBackground(Color.red);
        exit.setForeground(Color.red);
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255,0,0)));// TODO add your handling code here:
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setForeground(Color.red);
        exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204,204,204)));// TODO add your handling code here:
    }//GEN-LAST:event_exitMouseExited

    private void empidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empidActionPerformed

    private void alldataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alldataActionPerformed
        DefaultTableModel model=(DefaultTableModel) emptbl.getModel();
        int rows=model.getRowCount();

        try{
            Connector con=new Connector();
            Statement stmt=con.getConnection().createStatement();
            String sql="Select * from empdata;";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                
                model.addRow(new Object[]
                    {
                        rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getFloat(4),rs.getFloat(5),rs.getFloat(6),rs.getFloat(7)
                    });
                }
                rs.close();
                stmt.close();              
                error.setText(" ");

            }
            catch(Exception e)
            {
//                JOptionPane.showMessageDialog(null,"Something went wrong");
                error.setText("Something Went Wrong");
            }

            // TODO add your handling code here:
    }//GEN-LAST:event_alldataActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        DefaultTableModel model=(DefaultTableModel) emptbl.getModel();
        try{
//            String db="jdbc:mysql://localhost:3306/bank";
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            Connection conn = DriverManager.getConnection(db,"root","utkarsh@123");
             Connector con=new Connector();
               Statement stmt=con.getConnection().createStatement();
            int eno=Integer.parseInt(empid.getText());
            String sql="Select * from empdata where empno="+eno+";";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next())
            {
                model.addRow(new Object[]
                    {
                        rs.getInt(1),rs.getString(2),rs.getFloat(3),rs.getFloat(4),rs.getFloat(5),rs.getFloat(6),rs.getFloat(7)
                    });
                }
                rs.close();
                stmt.close();
               
                error.setText(" ");
            }
            catch(Exception e)
            {
//                JOptionPane.showMessageDialog(null,"Something went wrong");
                error.setText("Something Went Wrong");
            }
            // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adData;
    private javax.swing.JButton alldata;
    private javax.swing.JPanel delData;
    private javax.swing.JTextField empid;
    private javax.swing.JTable emptbl;
    private javax.swing.JLabel error;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel mini;
    private javax.swing.JPanel modData;
    private javax.swing.JPanel resetPass;
    private javax.swing.JButton search;
    private javax.swing.JPanel viewData;
    private javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
