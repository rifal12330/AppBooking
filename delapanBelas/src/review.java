
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rifal
 */
public class review extends javax.swing.JFrame {

    /**
     * Creates new form homePage
     */
    public review() {
        initComponents();
    }
    
    int xx, xy;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeForm = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_booknow = new javax.swing.JButton();
        txt_review = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeForm.setText("X");
        closeForm.setBorder(null);
        closeForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeFormActionPerformed(evt);
            }
        });
        getContentPane().add(closeForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 20, 30, 30));

        btn_back.setText("<");
        btn_back.setBorder(null);
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, 30, 30));

        btn_booknow.setBackground(new java.awt.Color(70, 105, 111));
        btn_booknow.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        btn_booknow.setForeground(new java.awt.Color(255, 255, 255));
        btn_booknow.setText("SEND");
        btn_booknow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_booknowActionPerformed(evt);
            }
        });
        getContentPane().add(btn_booknow, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 460, 270, 80));

        txt_review.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_reviewActionPerformed(evt);
            }
        });
        getContentPane().add(txt_review, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 450, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/review.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel1MousePressed(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFormActionPerformed
        dispose();
    }//GEN-LAST:event_closeFormActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        homePage homepage = new homePage();
        homepage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void jLabel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jLabel1MousePressed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jLabel1MouseDragged

    private void btn_booknowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_booknowActionPerformed
        String enterReview = txt_review.getText();
        Connection connection = null;
        PreparedStatement preparedStatement = null;


        try {
            connection = Koneksi.getKoneksi(); // Assuming Koneksi is a class that provides a database connection

            String query = "INSERT INTO review (Review) VALUES (?)";

            preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, enterReview);

            preparedStatement.executeUpdate();


            // Optionally, show a success message or perform other actions
            System.out.println("Review terkirim");
            
            terkirim kirim = new terkirim();
            kirim.setVisible(true);
            
            

        } catch (SQLException e) {
            // Handle any database-related errors
            e.printStackTrace();
        } finally {
           
        }
        
    }//GEN-LAST:event_btn_booknowActionPerformed

    private void txt_reviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_reviewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_reviewActionPerformed

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
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(homePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new homePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_booknow;
    private javax.swing.JButton closeForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_review;
    // End of variables declaration//GEN-END:variables
}
