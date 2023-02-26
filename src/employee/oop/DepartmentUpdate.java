/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee.oop;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author nradl
 */
public class DepartmentUpdate extends javax.swing.JFrame {

    /**
     * Creates new form DepartmentUpdate
     */
    public DepartmentUpdate() {
        initComponents();
    }
// connect to database 
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;

    public void myConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/oop?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DepartmentUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DepartmentUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DepartName = new javax.swing.JTextField();
        DepartCode = new javax.swing.JTextField();
        update = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        NewDepartName = new javax.swing.JTextField();
        search = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(77, 137, 99));

        jLabel1.setBackground(new java.awt.Color(77, 137, 99));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EMPLOYEE INFORMATION SYSTEM");

        jPanel2.setBackground(new java.awt.Color(224, 204, 151));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Update Department Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText(" Department Name :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Department Code :");

        DepartName.setEditable(false);

        DepartCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DepartCodeKeyPressed(evt);
            }
        });

        update.setBackground(new java.awt.Color(236, 121, 154));
        update.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(236, 121, 154));
        back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        back.setText("Go Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Enter new Department Name :");
        jLabel5.setToolTipText("");

        NewDepartName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                NewDepartNameKeyPressed(evt);
            }
        });

        search.setBackground(new java.awt.Color(236, 121, 154));
        search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(DepartCode, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(search))
                            .addComponent(DepartName, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(update)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(back))
                                .addComponent(NewDepartName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(search)
                    .addComponent(jLabel4)
                    .addComponent(DepartCode, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DepartName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NewDepartName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back)
                    .addComponent(update))
                .addGap(28, 28, 28))
        );

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

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        //connect to database
        myConnection();
        
        //get new name and code
        String NewName = NewDepartName.getText();
        String Code = DepartCode.getText();
        
        //update to database
        try {
            String SQL="UPDATE Department SET DepartName=? WHERE DepartCode=?";
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, NewName);
            pstmt.setString(2, Code);
            
            //check for name validation
            if (NewName.matches("^[A-Z][A-Za-z-&\\s]{2,14}$")==true){
                

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Department Name Successfully Update");
                new DepartmentMM().setVisible(true);
                dispose();
                conn.close();}
            else{
                JOptionPane.showMessageDialog(this, "Department Name can only contain - and &. The first letter must be Uppercase");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new DepartmentMM().setVisible(true);
        dispose();
    }//GEN-LAST:event_backActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // Connection from database
        myConnection();
        try {

            String sql = "Select * from Department where DepartCode=?";
            pstmt = conn.prepareStatement(sql);
            //get the code
            int c = Integer.parseInt(DepartCode.getText());
            pstmt.setInt(1, c);
            ResultSet rs = pstmt.executeQuery();
            
            //compare from database
            if (rs.next()) {
                DepartCode.setText(rs.getString("DepartCode"));
                DepartName.setText(rs.getString("DepartName"));
            } else if (rs.next() == false) {
                JOptionPane.showMessageDialog(this, "Invalid Departcode. Please reenter the code");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchActionPerformed

    private void DepartCodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DepartCodeKeyPressed
        // TODO add your handling code here:
       //pressed keyboard enter key action 
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             
             //connect to database
           myConnection();
        try {
            //get from database
            String sql = "Select * from Department where DepartCode=?";
            pstmt = conn.prepareStatement(sql);
            //get the code
            int c = Integer.parseInt(DepartCode.getText());
            pstmt.setInt(1, c);
            ResultSet rs = pstmt.executeQuery();
            
            //compare the code with database

            if (rs.next()) {
                DepartCode.setText(rs.getString("DepartCode"));
                DepartName.setText(rs.getString("DepartName"));
            } else if (rs.next() == false) {
                JOptionPane.showMessageDialog(this, "Invalid Departcode. Please reenter the code");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        } 
    }//GEN-LAST:event_DepartCodeKeyPressed

    private void NewDepartNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NewDepartNameKeyPressed
        // pressed keyboard enter key action
         if(evt.getKeyCode()==KeyEvent.VK_ENTER){
             //set the connection
           myConnection();
           
           //get new depart name and depart code
        String NewName = NewDepartName.getText();
        String Code = DepartCode.getText();
        
        //update the new depart name to database
        try {
            String SQL="UPDATE department SET DepartName=? WHERE DepartCode=?";
            pstmt = conn.prepareStatement(SQL);
            pstmt.setString(1, NewName);
            pstmt.setString(2, Code);
            
            //checking the validation of new depart name
            if (NewName.matches("^[A-Z][A-Za-z-&\\s]{2,14}$")==true){
                

                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(this, "Department Name Successfully Update");
                new DepartmentMM().setVisible(true);
                dispose();
                conn.close();}
            else{
                JOptionPane.showMessageDialog(this, "Department Name can only contain - and &. The first letter must be Uppercase");
            }

        } catch (SQLException ex) {
            Logger.getLogger(DepartmentUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_NewDepartNameKeyPressed

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
            java.util.logging.Logger.getLogger(DepartmentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepartmentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepartmentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepartmentUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepartmentUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DepartCode;
    private javax.swing.JTextField DepartName;
    private javax.swing.JTextField NewDepartName;
    private javax.swing.JButton back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton search;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
