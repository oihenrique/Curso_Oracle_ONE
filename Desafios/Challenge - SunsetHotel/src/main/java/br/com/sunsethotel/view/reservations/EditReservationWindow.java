package br.com.sunsethotel.view.reservations;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.ReservationDao;
import br.com.sunsethotel.dao.RoomDao;
import br.com.sunsethotel.model.Guest;
import br.com.sunsethotel.model.Reservation;
import br.com.sunsethotel.model.Room;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.*;

/**
 * @author Henrique
 */
public class EditReservationWindow extends javax.swing.JFrame {

    private EntityManager dbConnection;
    private ReservationDao reservationDao;
    private Guest guest;

    /**
     * Creates new form NewGuestWindow
     *
     * @param guest guest object.
     */
    public EditReservationWindow(Guest guest) {
        this.dbConnection = JPAUtil.getEntityManager();
        this.reservationDao = new ReservationDao(dbConnection);
        this.guest = guest;
        initComponents();
    }

    public EditReservationWindow() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editReservationForm = new javax.swing.JPanel();
        roomNumberLabel = new javax.swing.JLabel();
        reservationDateLabel = new javax.swing.JLabel();
        expirationDateLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        RoomDao roomDao = new RoomDao(dbConnection);
        jcbRoomNumber = new javax.swing.JComboBox<>();
        jdcReservationDate = new com.toedter.calendar.JDateChooser();
        jdcExpirationDate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit reservation");
        setBackground(new java.awt.Color(246, 246, 246));
        setMinimumSize(new java.awt.Dimension(400, 265));
        setName("New guest"); // NOI18N
        setPreferredSize(new java.awt.Dimension(400, 265));
        setResizable(false);

        editReservationForm.setBackground(new java.awt.Color(246, 246, 246));
        editReservationForm.setMaximumSize(new java.awt.Dimension(400, 265));
        editReservationForm.setMinimumSize(new java.awt.Dimension(400, 265));
        editReservationForm.setPreferredSize(new java.awt.Dimension(400, 265));

        roomNumberLabel.setText("Room Number");

        reservationDateLabel.setText("Reservation date");

        expirationDateLabel.setText("Expiration date");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(this::confirmButtonActionPerformed);

        List<Room> rooms = roomDao.listAvailableRooms();

        String[] availableRooms = new String[rooms.size()];
        int index = 0;

        for (Room room : rooms) {
            availableRooms[index] = room.getRoomNumber().toString();
            index++;
        }
        jcbRoomNumber.setModel(new javax.swing.DefaultComboBoxModel<>(availableRooms));

        javax.swing.GroupLayout editReservationFormLayout = new javax.swing.GroupLayout(editReservationForm);
        editReservationForm.setLayout(editReservationFormLayout);
        editReservationFormLayout.setHorizontalGroup(
                editReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editReservationFormLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(editReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(editReservationFormLayout.createSequentialGroup()
                                                .addComponent(roomNumberLabel)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(editReservationFormLayout.createSequentialGroup()
                                                .addGroup(editReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jcbRoomNumber, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(confirmButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(editReservationFormLayout.createSequentialGroup()
                                                                .addGroup(editReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(reservationDateLabel)
                                                                        .addComponent(jdcReservationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                                                .addGroup(editReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jdcExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(expirationDateLabel))
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(60, 60, 60))))
        );
        editReservationFormLayout.setVerticalGroup(
                editReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editReservationFormLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(roomNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(editReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(reservationDateLabel)
                                        .addComponent(expirationDateLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jdcReservationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jdcExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editReservationForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editReservationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        Reservation reservation = reservationDao.searchReservationsByGuest(guest).get(0);
        Room selectedRoom = new RoomDao(dbConnection).searchByRoomNumber(Integer.valueOf(jcbRoomNumber.getSelectedItem().toString()));

        int reservationDay = jdcReservationDate.getJCalendar().getDayChooser().getDay();
        int reservationMonth = jdcReservationDate.getJCalendar().getMonthChooser().getMonth() + 1;
        int reservationYear = jdcReservationDate.getJCalendar().getYearChooser().getYear();

        int expirationDay = jdcExpirationDate.getJCalendar().getDayChooser().getDay();
        int expirationMonth = jdcExpirationDate.getJCalendar().getMonthChooser().getMonth() + 1;
        int expirationYear = jdcExpirationDate.getJCalendar().getYearChooser().getYear();

        LocalDate reservationDate = LocalDate.of(reservationYear, reservationMonth, reservationDay);
        LocalDate expirationDate = LocalDate.of(expirationYear, expirationMonth, expirationDay);

        reservationDao.updateReservation(reservation, selectedRoom.getRoomNumber(), reservationDate, expirationDate);

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
            java.util.logging.Logger.getLogger(EditReservationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new EditReservationWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JPanel editReservationForm;
    private javax.swing.JLabel expirationDateLabel;
    private javax.swing.JComboBox<String> jcbRoomNumber;
    private com.toedter.calendar.JDateChooser jdcExpirationDate;
    private com.toedter.calendar.JDateChooser jdcReservationDate;
    private javax.swing.JLabel reservationDateLabel;
    private javax.swing.JLabel roomNumberLabel;
    // End of variables declaration//GEN-END:variables
}
