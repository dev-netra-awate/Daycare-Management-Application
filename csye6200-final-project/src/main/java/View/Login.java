
package View;

import models.Daycare;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

    
    private Daycare daycare;
    
    public Login(Daycare daycare) {
        initComponents();
        this.daycare = daycare;

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainContainer = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        loginButton = new javax.swing.JButton();
        heading = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        userdetails = new javax.swing.JTextField();
        passwordDetails = new javax.swing.JPasswordField();
        banner = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        mainContainer.setBackground(new java.awt.Color(255, 255, 255));
        mainContainer.setForeground(new java.awt.Color(255, 255, 255));
        mainContainer.setMinimumSize(new java.awt.Dimension(1100, 800));
        mainContainer.setLayout(new java.awt.CardLayout());

        jLayeredPane1.setLayout(new javax.swing.BoxLayout(jLayeredPane1, javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));
        jLayeredPane1.add(jPanel1);

        loginPanel.setBackground(new java.awt.Color(255, 255, 255));
        loginPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loginButton.setBackground(new java.awt.Color(176, 226, 238));
        loginButton.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(51, 102, 255));
        loginButton.setText("Login");
        loginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        loginButton.setBorderPainted(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        loginPanel.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 620, 400, 40));

        heading.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 36)); // NOI18N
        heading.setForeground(new java.awt.Color(51, 102, 255));
        heading.setText("          Please Login!");
        loginPanel.add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 440, 50));

        user.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        user.setForeground(new java.awt.Color(51, 102, 255));
        user.setText("Username ");
        loginPanel.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 490, 130, -1));

        password.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        password.setForeground(new java.awt.Color(51, 102, 255));
        password.setText("Password");
        loginPanel.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 120, -1));

        userdetails.setBackground(new java.awt.Color(176, 226, 238));
        userdetails.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        userdetails.setCaretColor(new java.awt.Color(255, 255, 255));
        userdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userdetailsActionPerformed(evt);
            }
        });
        loginPanel.add(userdetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 490, 260, -1));

        passwordDetails.setBackground(new java.awt.Color(176, 226, 238));
        passwordDetails.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        passwordDetails.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordDetailsActionPerformed(evt);
            }
        });
        loginPanel.add(passwordDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 260, 40));

        banner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/banner5.jpeg"))); // NOI18N
        loginPanel.add(banner, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 680, 330));
        loginPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 1100, 800));

        jLayeredPane1.add(loginPanel);

        mainContainer.add(jLayeredPane1, "card2");

        getContentPane().add(mainContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed

        if(userdetails.getText().equals("admin") && passwordDetails.getText().equals("admin")){
            Home dashBoardPanel = new Home(mainContainer, daycare);
        CardLayout layout = (CardLayout) mainContainer.getLayout();
        mainContainer.add(dashBoardPanel);
        layout.next(mainContainer);
        }
        else
            JOptionPane.showMessageDialog(null, "Please Enter Correct Credentials");
        
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userdetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userdetailsActionPerformed

    private void passwordDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordDetailsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordDetailsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
          }
            
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel banner;
    public javax.swing.JLabel heading;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton loginButton;
    private javax.swing.JPanel loginPanel;
    public javax.swing.JPanel mainContainer;
    public javax.swing.JLabel password;
    public javax.swing.JPasswordField passwordDetails;
    public javax.swing.JLabel user;
    public javax.swing.JTextField userdetails;
    // End of variables declaration//GEN-END:variables

    
}
