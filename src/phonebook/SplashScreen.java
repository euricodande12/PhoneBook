package phonebook;

import authentication.Login;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class SplashScreen extends javax.swing.JFrame {

    public SplashScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        
        prgProgressBar.setUI(new javax.swing.plaf.basic.BasicProgressBarUI() {
        @Override
        protected void paintDeterminate(Graphics g, JComponent c) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(Color.decode("#48D98D"));  // Set your desired progress color here

        // Calculate the size of the filled progress
        int width = progressBar.getWidth() * progressBar.getValue() / progressBar.getMaximum();
        int height = progressBar.getHeight();

        // Fill the progress with the custom color
        g2d.fillRect(0, 0, width, height);
    }
});
        
        int count = 0; //initialising the counter
        
        while(count<=100){
            prgProgressBar.setValue(count);//allowing the progressBar to iterate from 0 to 100
            
            // Optionally add a delay to keep it visible
            try {
                Thread.sleep(30); // Show for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
        
        this.dispose();
        new Login();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlMain = new javax.swing.JPanel();
        lblPhoneBook = new javax.swing.JLabel();
        prgProgressBar = new javax.swing.JProgressBar();
        lblTextPhoneBook = new javax.swing.JLabel();
        lblGroupNumber = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Splash Screen");
        setName("splashScreen"); // NOI18N
        setUndecorated(true);

        pnlMain.setBackground(new java.awt.Color(232, 248, 245));

        lblPhoneBook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phonebook.png"))); // NOI18N

        prgProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        prgProgressBar.setForeground(new java.awt.Color(0, 0, 0));
        prgProgressBar.setMaximumSize(new java.awt.Dimension(146, 5));
        prgProgressBar.setMinimumSize(new java.awt.Dimension(146, 5));
        prgProgressBar.setPreferredSize(new java.awt.Dimension(146, 5));

        lblTextPhoneBook.setForeground(new java.awt.Color(72, 217, 141));
        lblTextPhoneBook.setText("Phonebook");

        lblGroupNumber.setForeground(new java.awt.Color(72, 217, 141));
        lblGroupNumber.setText("Group 70");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblTextPhoneBook))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(prgProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addGap(141, 141, 141)
                                .addComponent(lblPhoneBook)))
                        .addGap(0, 117, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGroupNumber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(lblGroupNumber)
                .addGap(26, 26, 26)
                .addComponent(lblPhoneBook)
                .addGap(18, 18, 18)
                .addComponent(prgProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(lblTextPhoneBook))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGroupNumber;
    private javax.swing.JLabel lblPhoneBook;
    private javax.swing.JLabel lblTextPhoneBook;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JProgressBar prgProgressBar;
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * @author: < Eurico Dande - 223134902 />
 */