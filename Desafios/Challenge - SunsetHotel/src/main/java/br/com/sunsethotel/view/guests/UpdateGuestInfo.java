package br.com.sunsethotel.view.guests;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.GuestDao;
import br.com.sunsethotel.model.Guest;

import javax.persistence.EntityManager;
import javax.swing.*;

/**
 * @author Henrique
 */
public class UpdateGuestInfo extends javax.swing.JFrame {

    private EntityManager dbConnection;
    private Guest guest;

    /**
     * Creates new form NewGuestWindow
     *
     * @param guest guest object.
     */
    public UpdateGuestInfo(Guest guest) {
        this.dbConnection = JPAUtil.getEntityManager();
        this.guest = guest;
        initComponents();
    }

    public UpdateGuestInfo() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addGuestForm = new javax.swing.JPanel();
        guestNameLabel = new javax.swing.JLabel();
        jtfGuestName = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        phoneNumberLabel = new javax.swing.JLabel();
        jtfPhoneNumber = new javax.swing.JTextField();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit guest information");
        setBackground(new java.awt.Color(246, 246, 246));
        setMinimumSize(new java.awt.Dimension(400, 310));
        setName("Update guest"); // NOI18N
        setResizable(false);

        addGuestForm.setBackground(new java.awt.Color(246, 246, 246));
        addGuestForm.setMaximumSize(new java.awt.Dimension(400, 310));
        addGuestForm.setMinimumSize(new java.awt.Dimension(400, 310));

        guestNameLabel.setText("Guest name");

        jtfGuestName.setToolTipText("Insert guest name");

        cpfLabel.setText("CPF");

        jtfCPF.setToolTipText("Insert CPF number");

        phoneNumberLabel.setText("Phone number");

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
                                                .addComponent(phoneNumberLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(addGuestFormLayout.createSequentialGroup()
                                                .addComponent(cpfLabel)
                                                .addContainerGap(319, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addGuestFormLayout.createSequentialGroup()
                                                .addGroup(addGuestFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(confirmButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                                        .addComponent(jtfPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
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
                                .addComponent(phoneNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addGuestForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addGuestForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        GuestDao guestDao = new GuestDao(dbConnection);

        String guestName = this.jtfGuestName.getText();
        String guestCPF = this.jtfCPF.getText();
        String guestPhoneNumber = this.jtfPhoneNumber.getText();

        guestDao.updateGuest(guest, guestName, guestCPF, guestPhoneNumber);
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
            java.util.logging.Logger.getLogger(UpdateGuestInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateGuestInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addGuestForm;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel guestNameLabel;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfGuestName;
    private javax.swing.JTextField jtfPhoneNumber;
    private javax.swing.JLabel phoneNumberLabel;
    // End of variables declaration//GEN-END:variables
}
