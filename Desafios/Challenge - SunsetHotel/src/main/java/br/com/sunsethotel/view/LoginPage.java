/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.sunsethotel.view;

import br.com.sunsethotel.Util.JPAUtil;
import br.com.sunsethotel.dao.UserDao;

import javax.persistence.EntityManager;
import javax.swing.*;

/**
 * @author Henrique
 */
public class LoginPage extends javax.swing.JFrame {

    private final EntityManager dbConnection;

    public LoginPage() {
        this.dbConnection = JPAUtil.getEntityManager();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginUI = new javax.swing.JPanel();
        labelLoginTitle = new javax.swing.JLabel();
        labelWelcomeLogin = new javax.swing.JLabel();
        jtfAcessCode = new javax.swing.JTextField();
        jpfPassword = new javax.swing.JPasswordField();
        labelAcessCode = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        recoverPasswordButton = new javax.swing.JButton();
        signInButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        creditsLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login - Sunset Hotel");
        setBackground(new java.awt.Color(106, 154, 217));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        setMinimumSize(new java.awt.Dimension(900, 720));
        setName("LoginPage"); // NOI18N
        setSize(new java.awt.Dimension(900, 720));

        LoginUI.setBackground(new java.awt.Color(250, 250, 250));
        LoginUI.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 0, true));
        LoginUI.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        LoginUI.setMinimumSize(new java.awt.Dimension(420, 500));
        LoginUI.setName("LoginUI"); // NOI18N
        LoginUI.setPreferredSize(new java.awt.Dimension(420, 500));

        labelLoginTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelLoginTitle.setForeground(new java.awt.Color(22, 22, 22));
        labelLoginTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelLoginTitle.setText("Login");

        labelWelcomeLogin.setForeground(new java.awt.Color(105, 105, 105));
        labelWelcomeLogin.setText("Hello, please enter your access code and password to log in.");
        labelWelcomeLogin.setAlignmentX(0.5F);
        labelWelcomeLogin.setFocusable(false);
        labelWelcomeLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jtfAcessCode.setHighlighter(null);
        jtfAcessCode.setMinimumSize(new java.awt.Dimension(64, 30));
        jtfAcessCode.setPreferredSize(new java.awt.Dimension(64, 30));

        jpfPassword.setHighlighter(null);
        jpfPassword.setMinimumSize(new java.awt.Dimension(64, 30));
        jpfPassword.setPreferredSize(new java.awt.Dimension(64, 30));

        labelAcessCode.setBackground(new java.awt.Color(105, 105, 105));
        labelAcessCode.setForeground(new java.awt.Color(105, 105, 105));
        labelAcessCode.setText("Access code");

        labelPassword.setForeground(new java.awt.Color(105, 105, 105));
        labelPassword.setText("Password");

        recoverPasswordButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        recoverPasswordButton.setForeground(new java.awt.Color(0, 153, 255));
        recoverPasswordButton.setText("Forgot password?");
        recoverPasswordButton.setBorder(null);
        recoverPasswordButton.setBorderPainted(false);
        recoverPasswordButton.setContentAreaFilled(false);
        recoverPasswordButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        signInButton.setBackground(new java.awt.Color(22, 70, 89));
        signInButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        signInButton.setForeground(new java.awt.Color(255, 255, 255));
        signInButton.setText("Sign in");
        signInButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInButton.setMaximumSize(new java.awt.Dimension(67, 40));
        signInButton.setMinimumSize(new java.awt.Dimension(67, 40));
        signInButton.setPreferredSize(new java.awt.Dimension(67, 40));
        signInButton.addActionListener(this::signInButtonActionPerformed);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo-64px.png"))); // NOI18N

        javax.swing.GroupLayout LoginUILayout = new javax.swing.GroupLayout(LoginUI);
        LoginUI.setLayout(LoginUILayout);
        LoginUILayout.setHorizontalGroup(
                LoginUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginUILayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(LoginUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(LoginUILayout.createSequentialGroup()
                                                .addGroup(LoginUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginUILayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(recoverPasswordButton))
                                                        .addComponent(jpfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jtfAcessCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelWelcomeLogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(labelPassword)
                                                        .addComponent(labelAcessCode)
                                                        .addComponent(signInButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(LoginUILayout.createSequentialGroup()
                                                .addComponent(labelLoginTitle)
                                                .addGap(155, 155, 155))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginUILayout.createSequentialGroup()
                                .addGap(178, 178, 178)
                                .addComponent(jLabel1)
                                .addGap(178, 178, 178))
        );
        LoginUILayout.setVerticalGroup(
                LoginUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(LoginUILayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel1)
                                .addGap(37, 37, 37)
                                .addComponent(labelLoginTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelWelcomeLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                                .addGap(26, 26, 26)
                                .addComponent(labelAcessCode)
                                .addGap(5, 5, 5)
                                .addComponent(jtfAcessCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(labelPassword)
                                .addGap(5, 5, 5)
                                .addComponent(jpfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(recoverPasswordButton)
                                .addGap(20, 20, 20)
                                .addComponent(signInButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(80, Short.MAX_VALUE))
        );

        creditsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        creditsLabel.setForeground(new java.awt.Color(22, 22, 22));
        creditsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        creditsLabel.setText("Developed by Henrique Gomes, 2023");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(346, Short.MAX_VALUE)
                                .addComponent(creditsLabel)
                                .addContainerGap(346, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(LoginUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(238, 238, 238))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(93, Short.MAX_VALUE)
                                .addComponent(LoginUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(creditsLabel)
                                .addGap(25, 25, 25))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void signInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signInButtonActionPerformed
        UserDao userDao = new UserDao(dbConnection);

        Integer accessCode = Integer.valueOf(jtfAcessCode.getText());
        char[] passwordChar = jpfPassword.getPassword();
        String password = new String(passwordChar);

        boolean authentication = userDao.authenticateUser(accessCode, password);

        if (authentication) {
            HomePage homePage = new HomePage();
            homePage.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_signInButtonActionPerformed

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginUI;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField jpfPassword;
    private javax.swing.JTextField jtfAcessCode;
    private javax.swing.JLabel labelAcessCode;
    private javax.swing.JLabel labelLoginTitle;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelWelcomeLogin;
    private javax.swing.JButton recoverPasswordButton;
    private javax.swing.JButton signInButton;
    // End of variables declaration//GEN-END:variables
}
