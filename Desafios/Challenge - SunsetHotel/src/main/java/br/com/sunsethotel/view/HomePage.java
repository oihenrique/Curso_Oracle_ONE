/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.sunsethotel.view;

import java.awt.*;

/**
 *
 * @author Henrique
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    public HomePage() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        Dimension frameSize = this.getSize();

        int x = (screenSize.width - frameSize.width) / 4;
        int y = (screenSize.height - frameSize.height) / 6;

        this.setLocation(x, y);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homePagePanel = new javax.swing.JPanel();
        jbGuests = new javax.swing.JButton();
        jbSearch = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jbReservations = new javax.swing.JButton();
        jbAdmin = new javax.swing.JButton();
        jLogo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 720));
        setName("homePage"); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 720));
        setResizable(false);

        homePagePanel.setBackground(new java.awt.Color(253, 253, 253));
        homePagePanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbGuests.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbGuests.setForeground(new java.awt.Color(32, 32, 32));
        jbGuests.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/person.png"))); // NOI18N
        jbGuests.setText("Guests");
        jbGuests.setBorderPainted(false);
        jbGuests.setContentAreaFilled(false);
        jbGuests.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbGuests.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);

        jbSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbSearch.setForeground(new java.awt.Color(32, 32, 32));
        jbSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/searching-magnifying-glass.png"))); // NOI18N
        jbSearch.setText("Search");
        jbSearch.setBorderPainted(false);
        jbSearch.setContentAreaFilled(false);
        jbSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbSearch.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSearchActionPerformed(evt);
            }
        });

        jbReservations.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbReservations.setForeground(new java.awt.Color(32, 32, 32));
        jbReservations.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calendar.png"))); // NOI18N
        jbReservations.setText("Reservations");
        jbReservations.setBorderPainted(false);
        jbReservations.setContentAreaFilled(false);
        jbReservations.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbReservations.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbReservations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbReservationsActionPerformed(evt);
            }
        });

        jbAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbAdmin.setForeground(new java.awt.Color(32, 32, 32));
        jbAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/admin-tools.png"))); // NOI18N
        jbAdmin.setText("Administration");
        jbAdmin.setBorderPainted(false);
        jbAdmin.setContentAreaFilled(false);
        jbAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jbAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdminActionPerformed(evt);
            }
        });

        jLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-180px.png"))); // NOI18N

        javax.swing.GroupLayout homePagePanelLayout = new javax.swing.GroupLayout(homePagePanel);
        homePagePanel.setLayout(homePagePanelLayout);
        homePagePanelLayout.setHorizontalGroup(
            homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(homePagePanelLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuests, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbReservations, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(homePagePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLogo)
                .addGap(40, 40, 40))
        );
        homePagePanelLayout.setVerticalGroup(
            homePagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homePagePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLogo)
                .addGap(40, 40, 40)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGuests)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbReservations)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAdmin)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(246, 246, 246));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 720));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Sunset Hotel reservation system");

        jLabel2.setText("Today is 03/09/2023");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Welcome!");

        jLabel4.setText("Hotel booking system. Efficiently and easily control and manage the flow of hotel reservations and guests.");

        jLabel5.setText("This system will allow you to maintain complete and detailed control of your reservations and guests.");

        jLabel6.setText("You will have access to special tools for specific tasks, such as:");

        jLabel7.setText("- Guest and reservation registration ");

        jLabel8.setText("- Editing of existing guests and reservations");

        jLabel9.setText("- Deletion of all types of records");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(82, 82, 82)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap(309, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(homePagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(homePagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbSearchActionPerformed

    private void jbReservationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbReservationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbReservationsActionPerformed

    private void jbAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbAdminActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel homePagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLogo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAdmin;
    private javax.swing.JButton jbGuests;
    private javax.swing.JButton jbReservations;
    private javax.swing.JButton jbSearch;
    // End of variables declaration//GEN-END:variables
}
