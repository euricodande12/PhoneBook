package authentication;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSignUp = new javax.swing.JPanel();
        lblPhoneBook = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        chkShowPassword = new javax.swing.JCheckBox();
        btnSign = new javax.swing.JToggleButton();
        lblDoNotHaveAnAccount = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JPasswordField();
        lblConfirmPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sign up");
        setName("signUp"); // NOI18N

        pnlSignUp.setBackground(new java.awt.Color(232, 248, 245));

        lblPhoneBook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPhoneBook.setForeground(new java.awt.Color(93, 58, 155));
        lblPhoneBook.setText("PhoneBook");

        lblUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(93, 58, 155));
        lblUsername.setText("Username");

        txtUsername.setBackground(new java.awt.Color(250, 250, 250));
        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setForeground(new java.awt.Color(72, 217, 141));
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 3, true));

        lblPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(93, 58, 155));
        lblPassword.setText("Password");

        txtPassword.setBackground(new java.awt.Color(250, 250, 250));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(72, 217, 141));
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 3, true));

        chkShowPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chkShowPassword.setForeground(new java.awt.Color(93, 58, 155));
        chkShowPassword.setText("Show passwords");
        chkShowPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnSign.setBackground(new java.awt.Color(255, 111, 97));
        btnSign.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSign.setForeground(new java.awt.Color(250, 250, 250));
        btnSign.setText("Sign Up");
        btnSign.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        lblDoNotHaveAnAccount.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDoNotHaveAnAccount.setForeground(new java.awt.Color(93, 58, 155));
        lblDoNotHaveAnAccount.setText("Already have an account?");

        lblLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 111, 97));
        lblLogin.setText("Login");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        lblFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblFirstName.setForeground(new java.awt.Color(93, 58, 155));
        lblFirstName.setText("First name");

        txtFirstName.setBackground(new java.awt.Color(250, 250, 250));
        txtFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFirstName.setForeground(new java.awt.Color(72, 217, 141));
        txtFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 3, true));

        txtLastName.setBackground(new java.awt.Color(250, 250, 250));
        txtLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLastName.setForeground(new java.awt.Color(72, 217, 141));
        txtLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 3, true));

        lblLastName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(93, 58, 155));
        lblLastName.setText("Last name");

        txtConfirmPassword.setBackground(new java.awt.Color(250, 250, 250));
        txtConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtConfirmPassword.setForeground(new java.awt.Color(72, 217, 141));
        txtConfirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(250, 250, 250), 3, true));

        lblConfirmPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(93, 58, 155));
        lblConfirmPassword.setText("Confirm password");

        javax.swing.GroupLayout pnlSignUpLayout = new javax.swing.GroupLayout(pnlSignUp);
        pnlSignUp.setLayout(pnlSignUpLayout);
        pnlSignUpLayout.setHorizontalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignUpLayout.createSequentialGroup()
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkShowPassword)
                            .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(pnlSignUpLayout.createSequentialGroup()
                                    .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblFirstName)
                                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblLastName)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(lblUsername)
                                .addComponent(lblPhoneBook)
                                .addComponent(txtUsername)
                                .addGroup(pnlSignUpLayout.createSequentialGroup()
                                    .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblPassword)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblConfirmPassword)
                                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(btnSign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(lblDoNotHaveAnAccount)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblLogin)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        pnlSignUpLayout.setVerticalGroup(
            pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSignUpLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblPhoneBook)
                .addGap(12, 12, 12)
                .addComponent(lblUsername)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlSignUpLayout.createSequentialGroup()
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblFirstName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlSignUpLayout.createSequentialGroup()
                                .addComponent(lblLastName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlSignUpLayout.createSequentialGroup()
                        .addComponent(lblConfirmPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(chkShowPassword)
                .addGap(18, 18, 18)
                .addComponent(btnSign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(pnlSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoNotHaveAnAccount)
                    .addComponent(lblLogin))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked
        this.dispose();
        new Login();
    }//GEN-LAST:event_lblLoginMouseClicked

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignActionPerformed

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
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSign;
    private javax.swing.JCheckBox chkShowPassword;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblDoNotHaveAnAccount;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneBook;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JPanel pnlSignUp;
    private javax.swing.JPasswordField txtConfirmPassword;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */