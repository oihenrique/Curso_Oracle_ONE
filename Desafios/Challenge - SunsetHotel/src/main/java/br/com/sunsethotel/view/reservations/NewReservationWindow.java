package br.com.sunsethotel.view.reservations;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.GuestDao;
import br.com.sunsethotel.dao.ReservationDao;
import br.com.sunsethotel.dao.RoomDao;
import br.com.sunsethotel.model.Guest;
import br.com.sunsethotel.model.Reservation;
import br.com.sunsethotel.model.Room;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;
import javax.swing.*;

/**
 * @author Henrique
 */
public class NewReservationWindow extends javax.swing.JFrame {

    private final EntityManager dbConnection;
    private final ReservationDao reservationDao;

    /**
     * Creates new form NewGuestWindow
     */
    public NewReservationWindow() {
        this.dbConnection = JPAUtil.getEntityManager();
        this.reservationDao = new ReservationDao(dbConnection);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addReservationForm = new javax.swing.JPanel();
        guestNameLabel = new javax.swing.JLabel();
        roomNumberLabel = new javax.swing.JLabel();
        reservationDateLabel = new javax.swing.JLabel();
        expirationDateLabel = new javax.swing.JLabel();
        paymentMethodLabel = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        GuestDao guestDao = new GuestDao(dbConnection);
        jcbGuestName = new javax.swing.JComboBox<>();
        RoomDao roomDao = new RoomDao(dbConnection);
        jcbRoomNumber = new javax.swing.JComboBox<>();
        jdcReservationDate = new com.toedter.calendar.JDateChooser();
        jdcExpirationDate = new com.toedter.calendar.JDateChooser();
        jcbPaymentMethod = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New reservation");
        setBackground(new java.awt.Color(246, 246, 246));
        setMinimumSize(new java.awt.Dimension(400, 370));
        setName("New guest"); // NOI18N
        setResizable(false);

        addReservationForm.setBackground(new java.awt.Color(246, 246, 246));
        addReservationForm.setMaximumSize(new java.awt.Dimension(400, 370));
        addReservationForm.setMinimumSize(new java.awt.Dimension(400, 370));

        guestNameLabel.setText("Name");

        roomNumberLabel.setText("Room Number");

        reservationDateLabel.setText("Reservation date");

        expirationDateLabel.setText("Expiration date");

        paymentMethodLabel.setText("Payment method");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(this::confirmButtonActionPerformed);

        List<Guest> guests = guestDao.listAllGuests();

        String[] guestNames = new String[guests.size()];
        int index = 0;

        for (Guest guest : guests) {
            guestNames[index] = guest.getGuestName();
            index++;
        }
        jcbGuestName.setModel(new javax.swing.DefaultComboBoxModel<>(guestNames));

        List<Room> rooms = roomDao.listAvailableRooms();

        String[] availableRooms = new String[rooms.size()];
        index = 0;

        for (Room room : rooms) {
            availableRooms[index] = room.getRoomNumber().toString();
            index++;
        }
        jcbRoomNumber.setModel(new javax.swing.DefaultComboBoxModel<>(availableRooms));

        jcbPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"cash", "credit card", "debit card", "paypal", "installment payment"}));

        javax.swing.GroupLayout addReservationFormLayout = new javax.swing.GroupLayout(addReservationForm);
        addReservationForm.setLayout(addReservationFormLayout);
        addReservationFormLayout.setHorizontalGroup(
                addReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addReservationFormLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(addReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addReservationFormLayout.createSequentialGroup()
                                                .addComponent(jcbPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(addReservationFormLayout.createSequentialGroup()
                                                .addGroup(addReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jcbRoomNumber, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jcbGuestName, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(confirmButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addReservationFormLayout.createSequentialGroup()
                                                                .addComponent(guestNameLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(addReservationFormLayout.createSequentialGroup()
                                                                .addGroup(addReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(roomNumberLabel)
                                                                        .addComponent(reservationDateLabel)
                                                                        .addComponent(paymentMethodLabel)
                                                                        .addComponent(jdcReservationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                                                .addGroup(addReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jdcExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(expirationDateLabel))))
                                                .addGap(60, 60, 60))))
        );
        addReservationFormLayout.setVerticalGroup(
                addReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addReservationFormLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(guestNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbGuestName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(roomNumberLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(addReservationFormLayout.createSequentialGroup()
                                                .addComponent(jcbRoomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(addReservationFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(reservationDateLabel)
                                                        .addComponent(expirationDateLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jdcReservationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jdcExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(paymentMethodLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addReservationForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addReservationForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        Guest guest = new GuestDao(dbConnection).searchGuestByName(jcbGuestName.getSelectedItem().toString());
        String paymentMethod = jcbPaymentMethod.getSelectedItem().toString();
        Room selectedRoom = new RoomDao(dbConnection).searchByRoomNumber(Integer.valueOf(jcbRoomNumber.getSelectedItem().toString()));

        int reservationDay = jdcReservationDate.getJCalendar().getDayChooser().getDay();
        int reservationMonth = jdcReservationDate.getJCalendar().getMonthChooser().getMonth() + 1;
        int reservationYear = jdcReservationDate.getJCalendar().getYearChooser().getYear();

        int expirationDay = jdcExpirationDate.getJCalendar().getDayChooser().getDay();
        int expirationMonth = jdcExpirationDate.getJCalendar().getMonthChooser().getMonth() + 1;
        int expirationYear = jdcExpirationDate.getJCalendar().getYearChooser().getYear();

        LocalDate reservationDate = LocalDate.of(reservationYear, reservationMonth, reservationDay);
        LocalDate expirationDate = LocalDate.of(expirationYear, expirationMonth, expirationDay);

        BigDecimal reservationValue = reservationDao.calculateReservationValue(reservationDate, expirationDate);

        int confirmReservation = JOptionPane.showConfirmDialog(this, "Reservation value: R$  " + reservationValue + "\n\nConfirm?");
        if (confirmReservation != JOptionPane.YES_OPTION) {
            return;
        }

        Reservation reservation = new Reservation(guest, selectedRoom, reservationDate, expirationDate, reservationValue, paymentMethod);

        reservationDao.registerReservation(reservation);

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
            java.util.logging.Logger.getLogger(NewReservationWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewReservationWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addReservationForm;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel expirationDateLabel;
    private javax.swing.JLabel guestNameLabel;
    private javax.swing.JComboBox<String> jcbGuestName;
    private javax.swing.JComboBox<String> jcbPaymentMethod;
    private javax.swing.JComboBox<String> jcbRoomNumber;
    private com.toedter.calendar.JDateChooser jdcExpirationDate;
    private com.toedter.calendar.JDateChooser jdcReservationDate;
    private javax.swing.JLabel paymentMethodLabel;
    private javax.swing.JLabel reservationDateLabel;
    private javax.swing.JLabel roomNumberLabel;
    // End of variables declaration//GEN-END:variables
}
