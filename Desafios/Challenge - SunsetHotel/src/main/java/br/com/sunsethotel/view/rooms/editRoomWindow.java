/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.sunsethotel.view.rooms;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.RoomDao;
import br.com.sunsethotel.model.Room;

import javax.persistence.EntityManager;

/**
 * @author Henrique
 */
public class EditRoomWindow extends javax.swing.JFrame {

    private EntityManager dbConnection;
    private RoomDao roomDao;
    private Integer roomNumber;
    private String roomType;
    private Boolean availableRoom;
    private Room roomToEdit;

    /**
     * Creates new form NewGuestWindow
     */
    public EditRoomWindow(Room room) {
        this.dbConnection = JPAUtil.getEntityManager();
        this.roomDao = new RoomDao(dbConnection);
        this.roomToEdit = room;
        initComponents();
    }

    public EditRoomWindow() {
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editRoomForm = new javax.swing.JPanel();
        roomNumberLabel = new javax.swing.JLabel();
        jtfRoomNumber = new javax.swing.JTextField();
        roomTypeLabel = new javax.swing.JLabel();
        confirmEditRoomButton = new javax.swing.JButton();
        jcbRoomType = new javax.swing.JComboBox<>();
        jcbxRoomAvailable = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit room");
        setBackground(new java.awt.Color(246, 246, 246));
        setMinimumSize(new java.awt.Dimension(400, 265));
        setName("New guest"); // NOI18N
        setResizable(false);

        editRoomForm.setBackground(new java.awt.Color(246, 246, 246));
        editRoomForm.setMaximumSize(new java.awt.Dimension(400, 265));
        editRoomForm.setMinimumSize(new java.awt.Dimension(400, 265));
        editRoomForm.setPreferredSize(new java.awt.Dimension(400, 265));

        roomNumberLabel.setText("Room number");

        jtfRoomNumber.setToolTipText("Insert guest name");
        jtfRoomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfRoomNumberActionPerformed(evt);
            }
        });

        roomTypeLabel.setText("Room type");

        confirmEditRoomButton.setText("Confirm");
        confirmEditRoomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmEditRoomButtonActionPerformed(evt);
            }
        });

        jcbRoomType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single Room Standard", "Double Single Standard", "Couple Room Standard", "Triple Room" }));
        jcbRoomType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbRoomTypeActionPerformed(evt);
            }
        });

        jcbxRoomAvailable.setText("Available");
        jcbxRoomAvailable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbxRoomAvailableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout editRoomFormLayout = new javax.swing.GroupLayout(editRoomForm);
        editRoomForm.setLayout(editRoomFormLayout);
        editRoomFormLayout.setHorizontalGroup(
            editRoomFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRoomFormLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(editRoomFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(editRoomFormLayout.createSequentialGroup()
                        .addComponent(roomTypeLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editRoomFormLayout.createSequentialGroup()
                        .addGroup(editRoomFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(confirmEditRoomButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfRoomNumber, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editRoomFormLayout.createSequentialGroup()
                                .addComponent(roomNumberLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(editRoomFormLayout.createSequentialGroup()
                                .addComponent(jcbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jcbxRoomAvailable)))
                        .addGap(60, 60, 60))))
        );
        editRoomFormLayout.setVerticalGroup(
            editRoomFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editRoomFormLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(roomNumberLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(roomTypeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(editRoomFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbRoomType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbxRoomAvailable))
                .addGap(11, 11, 11)
                .addComponent(confirmEditRoomButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editRoomForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(editRoomForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtfRoomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfRoomNumberActionPerformed
        String roomNumberString = jtfRoomNumber.getText();
        if (roomNumberString.isEmpty()) {
            roomNumberString = roomToEdit.getRoomNumber().toString();
        }
        
        roomNumber = Integer.valueOf(roomNumberString);
    }//GEN-LAST:event_jtfRoomNumberActionPerformed

    private void confirmEditRoomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmEditRoomButtonActionPerformed
    roomDao.updateRoom(roomToEdit, roomNumber, roomType, availableRoom);

    dbConnection.getTransaction().begin();
    dbConnection.getTransaction().commit();
    this.dispose();
    }//GEN-LAST:event_confirmEditRoomButtonActionPerformed

    private void jcbRoomTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbRoomTypeActionPerformed
        roomType = jcbRoomType.getSelectedItem().toString();
    }//GEN-LAST:event_jcbRoomTypeActionPerformed

    private void jcbxRoomAvailableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbxRoomAvailableActionPerformed
        availableRoom = jcbxRoomAvailable.isSelected();
    }//GEN-LAST:event_jcbxRoomAvailableActionPerformed

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
            java.util.logging.Logger.getLogger(EditRoomWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditRoomWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditRoomWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditRoomWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditRoomWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmEditRoomButton;
    private javax.swing.JPanel editRoomForm;
    private javax.swing.JComboBox<String> jcbRoomType;
    private javax.swing.JCheckBox jcbxRoomAvailable;
    private javax.swing.JTextField jtfRoomNumber;
    private javax.swing.JLabel roomNumberLabel;
    private javax.swing.JLabel roomTypeLabel;
    // End of variables declaration//GEN-END:variables
}
