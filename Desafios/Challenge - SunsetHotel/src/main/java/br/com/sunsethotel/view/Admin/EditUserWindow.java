package br.com.sunsethotel.view.admin;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.UserDao;
import br.com.sunsethotel.model.User;

import javax.persistence.EntityManager;
import javax.swing.*;

/**
 * @author Henrique
 */
public class EditUserWindow extends javax.swing.JFrame {

    private EntityManager dbConnection;
    private UserDao userDao;
    private User user;

    /**
     * Creates new form NewGuestWindow
     *
     * @param user user object.
     */
    public EditUserWindow(User user) {
        this.dbConnection = JPAUtil.getEntityManager();
        this.userDao = new UserDao(dbConnection);
        this.user = user;
        initComponents();
    }

    public EditUserWindow() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        editUserForm = new javax.swing.JPanel();
        userNameLabel = new javax.swing.JLabel();
        jtfUserName = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        jtfCPF = new javax.swing.JTextField();
        emailLabel = new javax.swing.JLabel();
        jtfUserEmail = new javax.swing.JTextField();
        birthDateLabel = new javax.swing.JLabel();
        jdcBirthDate = new com.toedter.calendar.JDateChooser();
        jcbxAdministrator = new javax.swing.JCheckBox();
        confirmButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Edit user");
        setBackground(new java.awt.Color(246, 246, 246));
        setMinimumSize(new java.awt.Dimension(400, 376));
        setName("New guest"); // NOI18N
        setResizable(false);

        editUserForm.setBackground(new java.awt.Color(246, 246, 246));
        editUserForm.setMaximumSize(new java.awt.Dimension(400, 376));
        editUserForm.setMinimumSize(new java.awt.Dimension(400, 376));
        editUserForm.setPreferredSize(new java.awt.Dimension(400, 376));

        userNameLabel.setText("Name");

        jtfUserName.setToolTipText("Insert guest name");

        cpfLabel.setText("CPF");

        jtfCPF.setToolTipText("Insert CPF number");

        emailLabel.setText("E-mail");

        jtfUserEmail.setToolTipText("Insert guest nationality");

        birthDateLabel.setText("Birth Date");

        jcbxAdministrator.setText("Administrator");

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(this::confirmButtonActionPerformed);

        javax.swing.GroupLayout editUserFormLayout = new javax.swing.GroupLayout(editUserForm);
        editUserForm.setLayout(editUserFormLayout);
        editUserFormLayout.setHorizontalGroup(
                editUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editUserFormLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(editUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(editUserFormLayout.createSequentialGroup()
                                                .addGroup(editUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(cpfLabel)
                                                        .addComponent(emailLabel)
                                                        .addComponent(birthDateLabel))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editUserFormLayout.createSequentialGroup()
                                                .addGroup(editUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(editUserFormLayout.createSequentialGroup()
                                                                .addComponent(jdcBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jcbxAdministrator))
                                                        .addComponent(confirmButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                                        .addComponent(jtfUserEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtfCPF, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jtfUserName, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, editUserFormLayout.createSequentialGroup()
                                                                .addComponent(userNameLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(60, 60, 60))))
        );
        editUserFormLayout.setVerticalGroup(
                editUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(editUserFormLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
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
                                .addGap(18, 18, 18)
                                .addComponent(birthDateLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(editUserFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jdcBirthDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcbxAdministrator))
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editUserForm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(editUserForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        String name = jtfUserName.getText();
        String email = jtfUserEmail.getText();
        String cpf = jtfCPF.getText();
        Boolean admin = jcbxAdministrator.isSelected();

        userDao.updateUser(user, name, email, admin, cpf, "");

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
            java.util.logging.Logger.getLogger(EditUserWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUserWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel birthDateLabel;
    private javax.swing.JButton confirmButton;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JPanel editUserForm;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JCheckBox jcbxAdministrator;
    private com.toedter.calendar.JDateChooser jdcBirthDate;
    private javax.swing.JTextField jtfCPF;
    private javax.swing.JTextField jtfUserEmail;
    private javax.swing.JTextField jtfUserName;
    private javax.swing.JLabel userNameLabel;
    // End of variables declaration//GEN-END:variables
}
