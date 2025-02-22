package tela;

import DAO.ClienteDAO;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import storeTech.Consultas;

/**
 *
 * @author Matheus
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public Login() throws IOException {
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        jbLogin = new javax.swing.JButton();
        psSenha = new javax.swing.JPasswordField();
        jbCriaConta = new javax.swing.JButton();
        jbTrocaSenha = new javax.swing.JButton();
        jbFechaTela = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 410));
        setUndecorated(true);
        setSize(new java.awt.Dimension(400, 410));

        jPanel1.setBackground(new java.awt.Color(0, 102, 51));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login de acesso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("E-mail");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Senha");

        tfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsuarioActionPerformed(evt);
            }
        });

        jbLogin.setBackground(new java.awt.Color(0, 102, 51));
        jbLogin.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbLogin.setForeground(new java.awt.Color(255, 255, 255));
        jbLogin.setText("Login");
        jbLogin.setBorderPainted(false);
        jbLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbLogin.setFocusPainted(false);
        jbLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbLoginMouseExited(evt);
            }
        });
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        psSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psSenhaActionPerformed(evt);
            }
        });

        jbCriaConta.setBackground(new java.awt.Color(51, 51, 51));
        jbCriaConta.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jbCriaConta.setForeground(new java.awt.Color(255, 255, 255));
        jbCriaConta.setText("Criar uma conta");
        jbCriaConta.setBorderPainted(false);
        jbCriaConta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCriaConta.setFocusPainted(false);
        jbCriaConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbCriaContaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbCriaContaMouseExited(evt);
            }
        });
        jbCriaConta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriaContaActionPerformed(evt);
            }
        });

        jbTrocaSenha.setBackground(new java.awt.Color(51, 51, 51));
        jbTrocaSenha.setForeground(new java.awt.Color(255, 255, 255));
        jbTrocaSenha.setText("Esqueceu a senha?");
        jbTrocaSenha.setBorder(null);
        jbTrocaSenha.setBorderPainted(false);
        jbTrocaSenha.setContentAreaFilled(false);
        jbTrocaSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbTrocaSenha.setFocusPainted(false);
        jbTrocaSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbTrocaSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbTrocaSenha)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jbCriaConta)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfUsuario)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(psSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(psSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbTrocaSenha)
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCriaConta)
                    .addComponent(jbLogin))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jbFechaTela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botao-x (2).png"))); // NOI18N
        jbFechaTela.setBorder(null);
        jbFechaTela.setBorderPainted(false);
        jbFechaTela.setContentAreaFilled(false);
        jbFechaTela.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbFechaTela.setFocusPainted(false);
        jbFechaTela.setFocusable(false);
        jbFechaTela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbFechaTelaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbFechaTelaMouseExited(evt);
            }
        });
        jbFechaTela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFechaTelaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jbFechaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbFechaTela, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsuarioActionPerformed


    
    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        String usuario = tfUsuario.getText();
        String senha = psSenha.getText();
        ClienteDAO cliente = new ClienteDAO();
        try {
            if(cliente.validaLogin(usuario, senha)){
                PrincipalUsuario p = new PrincipalUsuario();
                p.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Usuário ou Senha Inválidos!");
                tfUsuario.setText("");
                psSenha.setText("");
            }
        }catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbLoginActionPerformed

    private void psSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psSenhaActionPerformed

    private void jbCriaContaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriaContaActionPerformed
        CadastroCliente cadastro = new CadastroCliente();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jbCriaContaActionPerformed

    private void jbLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLoginMouseEntered
        jbLogin.setBackground(new Color(235,235,235));
        jbLogin.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jbLoginMouseEntered

    private void jbLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbLoginMouseExited
        jbLogin.setBackground(new Color(0,102,51));
        jbLogin.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbLoginMouseExited

    private void jbCriaContaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCriaContaMouseEntered
        jbCriaConta.setBackground(new Color(235,235,235));
        jbCriaConta.setForeground(new Color(58,65,84));
    }//GEN-LAST:event_jbCriaContaMouseEntered

    private void jbCriaContaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbCriaContaMouseExited
        jbCriaConta.setBackground(new Color(51,51,51));
        jbCriaConta.setForeground(Color.WHITE);
    }//GEN-LAST:event_jbCriaContaMouseExited

    private void jbTrocaSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbTrocaSenhaActionPerformed
        TrocaSenha ts = new TrocaSenha();
        ts.setVisible(true);
    }//GEN-LAST:event_jbTrocaSenhaActionPerformed

    private void jbFechaTelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFechaTelaActionPerformed
        this.dispose();
    }//GEN-LAST:event_jbFechaTelaActionPerformed

    private void jbFechaTelaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFechaTelaMouseEntered

    }//GEN-LAST:event_jbFechaTelaMouseEntered

    private void jbFechaTelaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbFechaTelaMouseExited

    }//GEN-LAST:event_jbFechaTelaMouseExited

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Login().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbCriaConta;
    private javax.swing.JButton jbFechaTela;
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbTrocaSenha;
    private javax.swing.JPasswordField psSenha;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
