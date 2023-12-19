/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rifal
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class createAccount extends javax.swing.JFrame {

    /**
     * Creates new form createAccount
     */
    public createAccount() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeForm = new javax.swing.JButton();
        backForm = new javax.swing.JButton();
        txt_int_entEmail = new javax.swing.JTextField();
        txt_int_entPass = new javax.swing.JTextField();
        txt_int_namaLengkap = new javax.swing.JTextField();
        txt_int_alamat = new javax.swing.JTextField();
        txt_int_gender = new javax.swing.JTextField();
        btn_createAcc = new javax.swing.JButton();
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
        getContentPane().add(closeForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 10, 30, 30));

        backForm.setText("<");
        backForm.setBorder(null);
        backForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFormActionPerformed(evt);
            }
        });
        getContentPane().add(backForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 10, 30, 30));

        txt_int_entEmail.setBackground(new java.awt.Color(82, 122, 130));
        txt_int_entEmail.setForeground(new java.awt.Color(255, 255, 255));
        txt_int_entEmail.setText("Enter Email");
        txt_int_entEmail.setBorder(null);
        txt_int_entEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_int_entEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_int_entEmailFocusLost(evt);
            }
        });
        txt_int_entEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_int_entEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txt_int_entEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 310, 40));

        txt_int_entPass.setBackground(new java.awt.Color(82, 122, 130));
        txt_int_entPass.setForeground(new java.awt.Color(255, 255, 255));
        txt_int_entPass.setText("Enter Password");
        txt_int_entPass.setBorder(null);
        txt_int_entPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_int_entPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_int_entPassFocusLost(evt);
            }
        });
        getContentPane().add(txt_int_entPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 330, 50));

        txt_int_namaLengkap.setBackground(new java.awt.Color(82, 122, 130));
        txt_int_namaLengkap.setForeground(new java.awt.Color(255, 255, 255));
        txt_int_namaLengkap.setText("Nama Lengkap");
        txt_int_namaLengkap.setBorder(null);
        txt_int_namaLengkap.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_int_namaLengkapFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_int_namaLengkapFocusLost(evt);
            }
        });
        txt_int_namaLengkap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_int_namaLengkapActionPerformed(evt);
            }
        });
        getContentPane().add(txt_int_namaLengkap, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, 320, 40));

        txt_int_alamat.setBackground(new java.awt.Color(82, 122, 130));
        txt_int_alamat.setForeground(new java.awt.Color(255, 255, 255));
        txt_int_alamat.setText("Alamat");
        txt_int_alamat.setToolTipText("");
        txt_int_alamat.setBorder(null);
        txt_int_alamat.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_int_alamatFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_int_alamatFocusLost(evt);
            }
        });
        txt_int_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_int_alamatActionPerformed(evt);
            }
        });
        getContentPane().add(txt_int_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 396, 320, 40));

        txt_int_gender.setBackground(new java.awt.Color(82, 122, 130));
        txt_int_gender.setForeground(new java.awt.Color(255, 255, 255));
        txt_int_gender.setText("Gender");
        txt_int_gender.setBorder(null);
        txt_int_gender.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_int_genderFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_int_genderFocusLost(evt);
            }
        });
        txt_int_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_int_genderActionPerformed(evt);
            }
        });
        getContentPane().add(txt_int_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 466, 320, 50));

        btn_createAcc.setBackground(new java.awt.Color(0, 83, 67));
        btn_createAcc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_createAcc.setForeground(new java.awt.Color(255, 255, 255));
        btn_createAcc.setText("Create");
        btn_createAcc.setBorder(null);
        btn_createAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createAccActionPerformed(evt);
            }
        });
        getContentPane().add(btn_createAcc, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 540, 350, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asset/createAkunPage.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeFormActionPerformed
        dispose();
    }//GEN-LAST:event_closeFormActionPerformed

    private void backFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFormActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backFormActionPerformed

    private void txt_int_namaLengkapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_int_namaLengkapActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_int_namaLengkapActionPerformed

    private void txt_int_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_int_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_int_alamatActionPerformed

    private void txt_int_entEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_int_entEmailActionPerformed
        
    }//GEN-LAST:event_txt_int_entEmailActionPerformed

    private void txt_int_entEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_entEmailFocusGained
        String email = txt_int_entEmail.getText();
        if(email.equals("Enter Email")){
            txt_int_entEmail.setText("");
        }
    }//GEN-LAST:event_txt_int_entEmailFocusGained

    private void txt_int_entEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_entEmailFocusLost
        String inEmail = txt_int_entEmail.getText();
        if(inEmail.equals("") || inEmail.equals("Enter Email")){
            txt_int_entEmail.setText("Enter Email");
        }
    }//GEN-LAST:event_txt_int_entEmailFocusLost

    private void txt_int_entPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_entPassFocusGained
        String pass = txt_int_entPass.getText();
        if(pass.equals("Enter Password")){
            txt_int_entPass.setText("");
        }
    }//GEN-LAST:event_txt_int_entPassFocusGained

    private void txt_int_entPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_entPassFocusLost
        String entPass = txt_int_entPass.getText();
        if(entPass.equals("") || entPass.equals("Enter Password")){
            txt_int_entPass.setText("Enter Password");
        }
    }//GEN-LAST:event_txt_int_entPassFocusLost

    private void txt_int_namaLengkapFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_namaLengkapFocusGained
        String nama = txt_int_namaLengkap.getText();
        if(nama.equals("Nama Lengkap")){
            txt_int_namaLengkap.setText("");
        }
    }//GEN-LAST:event_txt_int_namaLengkapFocusGained

    private void txt_int_namaLengkapFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_namaLengkapFocusLost
        String entNama = txt_int_namaLengkap.getText();
        if(entNama.equals("") || entNama.equals("Nama Lengkap")){
            txt_int_namaLengkap.setText("Nama Lengkap");
        }
    }//GEN-LAST:event_txt_int_namaLengkapFocusLost

    private void txt_int_alamatFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_alamatFocusGained
        String alamat = txt_int_alamat.getText();
        if(alamat.equals("Alamat")){
            txt_int_alamat.setText("");
        }
    }//GEN-LAST:event_txt_int_alamatFocusGained

    private void txt_int_alamatFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_alamatFocusLost
        String alamat = txt_int_alamat.getText();
        if(alamat.equals("") || alamat.equals("Alamat")){
            txt_int_alamat.setText("Alamat");
        }
    }//GEN-LAST:event_txt_int_alamatFocusLost

    private void txt_int_genderFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_genderFocusGained
        String gender = txt_int_gender.getText();
        if(gender.equals("Gender")){
            txt_int_gender.setText("");
        }
    }//GEN-LAST:event_txt_int_genderFocusGained

    private void txt_int_genderFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_int_genderFocusLost
        String entGender = txt_int_gender.getText();
        if(entGender.equals("") || entGender.equals("Gender")){
            txt_int_gender.setText("Gender");
        }
    }//GEN-LAST:event_txt_int_genderFocusLost

    private void txt_int_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_int_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_int_genderActionPerformed

    private void btn_createAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createAccActionPerformed
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        
        String enterEmail = txt_int_entEmail.getText();
        String enterPassword = txt_int_entPass.getText();
        String enterNama = txt_int_namaLengkap.getText();
        String enterAlamat = txt_int_alamat.getText();
        String enterGender = txt_int_gender.getText();
        
        registerAccount(enterEmail, enterPassword, enterNama, enterAlamat, enterGender);
        
        
    }//GEN-LAST:event_btn_createAccActionPerformed

    private void registerAccount (String enterEmail, String enterPassword, String enterNama,String enterAlamat, String enterGender){
        Connection connection = null;
        PreparedStatement preparedStatement = null;
       
        try{
            connection = Koneksi.getKoneksi();
            String query = "INSERT INTO users(email,password,nama_lengkap,alamat,gender) VALUES (?,?,?,?,?)";
            preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, enterEmail);
            preparedStatement.setString(2, enterPassword);
            preparedStatement.setString(3, enterNama);
            preparedStatement.setString(4, enterAlamat);
            preparedStatement.setString(5, enterGender);
            
            int rowAffected = preparedStatement.executeUpdate();
            
            if(rowAffected > 0){
                loginForm login = new loginForm();
                login.setVisible(true);
                this.dispose();
            }else{
                createAccount bikinAkun = new createAccount();
                bikinAkun.setVisible(true);
            }
        }catch(SQLException ex){
            ex.printStackTrace();
        }finally{
        }
    }
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
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backForm;
    private javax.swing.JButton btn_createAcc;
    private javax.swing.JButton closeForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txt_int_alamat;
    private javax.swing.JTextField txt_int_entEmail;
    private javax.swing.JTextField txt_int_entPass;
    private javax.swing.JTextField txt_int_gender;
    private javax.swing.JTextField txt_int_namaLengkap;
    // End of variables declaration//GEN-END:variables
}
