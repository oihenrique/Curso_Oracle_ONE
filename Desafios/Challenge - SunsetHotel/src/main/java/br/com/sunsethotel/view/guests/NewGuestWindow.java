package br.com.sunsethotel.view.guests;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.GuestDao;
import br.com.sunsethotel.model.Guest;

import javax.persistence.EntityManager;
import javax.swing.*;

/**
 * @author Henrique
 */
public class NewGuestWindow extends javax.swing.JFrame {

    private final EntityManager dbConnection;

    /**
     * Creates new form NewGuestWindow
     */
    public NewGuestWindow() {
        this.dbConnection = JPAUtil.getEntityManager();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addGuestForm = new javax.swing.JPanel();
        guestNameLabel = new javax.swing.JLabel();
        jtfGuestName = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        nationalityLabel = new javax.swing.JLabel();
        jtfNationality = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        jtfPhoneNumber = new javax.swing.JTextField();
        birthDateLabel = new javax.swing.JLabel();
        jtfBirthDate = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New guest");
        setBackground(new java.awt.Color(246, 246, 246));
        setMaximumSize(new java.awt.Dimension(400, 450));
        setMinimumSize(new java.awt.Dimension(400, 450));
        setName("New guest"); // NOI18N
        setResizable(false);

        addGuestForm.setBackground(new java.awt.Color(246, 246, 246));
        addGuestForm.setMaximumSize(new java.awt.Dimension(400, 480));
        addGuestForm.setMinimumSize(new java.awt.Dimension(400, 450));

        guestNameLabel.setText("Guest name");

        jtfGuestName.setToolTipText("Insert guest name");
        jtfGuestName.addActionListener(this::jtfGuestNameActionPerformed);

        cpfLabel.setText("CPF");

        jtfCPF.setToolTipText("Insert CPF number");

        nationalityLabel.setText("Nationality");

        jtfNationality.setToolTipText("Insert guest nationality");

        phoneNumberLabel.setText("Phone number");

        birthDateLabel.setText("Birth date");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(this::confirmButtonActionPerformed);

        javax.swing.GroupLayout addGuestFormLayout = new javax.swing.GroupLayout(addGuestForm);
        addGuestForm.setLayout(addGuestFormLayout);
        addGuestFormLayout.setHorizontalGroup(
                addGuestFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addGuestFormLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(addGuestFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addGuestFormLayout.createSequentialGroup()
                                                .addGroup(addGuestFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cpfLabel)
                                                        .addComponent(nationalityLabel)
                                                        .addComponent(phoneNumberLabel)
                                                        .addComponent(birthDateLabel))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addGuestFormLayout.createSequentialGroup()
                                                .addGroup(addGuestFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(confirmButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                                        .addComponent(jtfBirthDate, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtfPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtfNationality, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtfCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addGuestFormLayout.createSequentialGroup()
                                                                .addComponent(guestNameLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(jtfGuestName, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addGap(60, 60, 60))))
        );
        addGuestFormLayout.setVerticalGroup(
                addGuestFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addGuestFormLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(guestNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpfLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nationalityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(birthDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addGuestForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addGuestForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfGuestNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfGuestNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfGuestNameActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        GuestDao guestDao = new GuestDao(dbConnection);

        String guestName = this.jtfGuestName.getText();
        String guestCPF = this.jtfCPF.getText();
        String guestNationality = this.jtfNationality.getText();
        String guestPhoneNumber = this.jtfPhoneNumber.getText();

        Guest guest = new Guest(guestName, guestCPF, guestNationality, guestPhoneNumber);
        guestDao.registerGuest(guest);
        dbConnection.getTransaction().begin();
        dbConnection.getTransaction().commit();
        this.dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewGuestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewGuestWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addGuestForm;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel guestNameLabel;
    private javax.swing.JTextField jtfBirthDate;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfGuestName;
    private javax.swing.JTextField jtfNationality;
    private javax.swing.JTextField jtfPhoneNumber;
    private javax.swing.JLabel nationalityLabel;
    private javax.swing.JLabel phoneNumberLabel;
    // End of variables declaration//GEN-END:variables
}
