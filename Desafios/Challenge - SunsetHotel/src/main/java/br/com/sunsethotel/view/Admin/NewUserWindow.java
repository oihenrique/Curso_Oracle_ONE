package br.com.sunsethotel.view.admin;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.UserDao;
import br.com.sunsethotel.model.User;

import java.time.LocalDate;
import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.swing.JOptionPane;

/**
 * @author Henrique
 */
public class NewUserWindow extends javax.swing.JFrame {

    private final EntityManager dbConnection;
    private UserDao userDao;
    private String password;

    /**
     * Creates new form NewGuestWindow
     */
    public NewUserWindow() {
        this.dbConnection = JPAUtil.getEntityManager();
        this.userDao = new UserDao(dbConnection);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addUserForm = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        jtfUserEmail = new javax.swing.JTextField();
        passwordLabel = new javax.swing.JLabel();
        jtfPassword = new javax.swing.JPasswordField();
        birthDateLabel = new javax.swing.JLabel();
        jdcBirthDate = new com.toedter.calendar.JDateChooser();
        jcbxAdministrator = new javax.swing.JCheckBox();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("New user");
        setBackground(new java.awt.Color(246, 246, 246));
        setMinimumSize(new java.awt.Dimension(400, 450));
        setName("New guest"); // NOI18N
        setResizable(false);

        addUserForm.setBackground(new java.awt.Color(246, 246, 246));
        addUserForm.setMaximumSize(new java.awt.Dimension(400, 480));
        addUserForm.setMinimumSize(new java.awt.Dimension(400, 450));

        userNameLabel.setText("Name");

        jtfUserName.setToolTipText("Insert guest name");

        cpfLabel.setText("CPF");

        jtfCPF.setToolTipText("Insert CPF number");

        emailLabel.setText("E-mail");

        jtfUserEmail.setToolTipText("Insert guest nationality");

        passwordLabel.setText("Password");

        jtfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfPasswordActionPerformed(evt);
            }
        });

        birthDateLabel.setText("Birth Date");

        jcbxAdministrator.setText("Administrator");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addUserFormLayout = new javax.swing.GroupLayout(addUserForm);
        addUserForm.setLayout(addUserFormLayout);
        addUserFormLayout.setHorizontalGroup(
                addUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserFormLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(addUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(addUserFormLayout.createSequentialGroup()
                                                .addGroup(addUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cpfLabel)
                                                        .addComponent(emailLabel)
                                                        .addComponent(birthDateLabel))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(addUserFormLayout.createSequentialGroup()
                                                .addComponent(passwordLabel)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addUserFormLayout.createSequentialGroup()
                                                .addGroup(addUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jtfPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(confirmButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jtfUserEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtfCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtfUserName, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addUserFormLayout.createSequentialGroup()
                                                                .addComponent(userNameLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(addUserFormLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jdcBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(82, 82, 82)
                                                                .addComponent(jcbxAdministrator)))
                                                .addGap(60, 60, 60))))
        );
        addUserFormLayout.setVerticalGroup(
                addUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(addUserFormLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(userNameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpfLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emailLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfUserEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(birthDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jdcBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbxAdministrator))
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(75, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addUserForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(addUserForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        int day = jdcBirthDate.getJCalendar().getDayChooser().getDay();
        int month = jdcBirthDate.getJCalendar().getMonthChooser().getMonth() + 1;
        int year = jdcBirthDate.getJCalendar().getYearChooser().getYear();

        String name = jtfUserName.getText();
        String email = jtfUserEmail.getText();
        String cpf = jtfCPF.getText();
        Boolean admin = jcbxAdministrator.isSelected();

        LocalDate birthDate = LocalDate.of(year, month, day);
        User user = new User(name, email, admin, cpf, birthDate, password);

        userDao.createUser(user);

        dbConnection.getTransaction().begin();
        dbConnection.getTransaction().commit();

        JOptionPane.showMessageDialog(this, "User access code:  " + user.getAccessCode());

        this.dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void jtfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfPasswordActionPerformed
        char[] userPassword = jtfPassword.getPassword();
        password = userDao.generateHashPassword(Arrays.toString(userPassword));
    }//GEN-LAST:event_jtfPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(NewUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUserWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addUserForm;
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JCheckBox jcbxAdministrator;
    private com.toedter.calendar.JDateChooser jdcBirthDate;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JPasswordField jtfPassword;
    private javax.swing.JTextField jtfUserEmail;
    private javax.swing.JTextField jtfUserName;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
