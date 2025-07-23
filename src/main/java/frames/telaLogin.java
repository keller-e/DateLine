package frames;

import model.Usuario;
import javax.swing.JOptionPane;
import jpa.UsuarioJPA;

public class telaLogin extends javax.swing.JFrame {

    public telaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBlue = new javax.swing.JPanel();
        lblIconUser = new javax.swing.JLabel();
        lblIconPassword = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lblEsqueceuSenha = new javax.swing.JLabel();
        lblCliqueAqui = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        PanelBlue.setBackground(new java.awt.Color(22, 31, 48));

        lblIconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/IconUserLogin.png"))); // NOI18N

        lblIconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/lockPass.png"))); // NOI18N

        txtUser.setBackground(new java.awt.Color(242, 242, 242));
        txtUser.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtUser.setForeground(new java.awt.Color(0, 153, 0));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtUser.setCaretColor(new java.awt.Color(0, 102, 102));

        txtPassword.setBackground(new java.awt.Color(242, 242, 242));
        txtPassword.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 153, 0));
        txtPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        txtPassword.setCaretColor(new java.awt.Color(0, 102, 102));

        btnEntrar.setBackground(new java.awt.Color(94, 187, 1));
        btnEntrar.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("Entrar");
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lblEsqueceuSenha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblEsqueceuSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblEsqueceuSenha.setText("Esqueceu sua senha?");

        lblCliqueAqui.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCliqueAqui.setForeground(new java.awt.Color(132, 176, 38));
        lblCliqueAqui.setText("Clique aqui");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/DateLine_resized_1280x760.png"))); // NOI18N

        javax.swing.GroupLayout PanelBlueLayout = new javax.swing.GroupLayout(PanelBlue);
        PanelBlue.setLayout(PanelBlueLayout);
        PanelBlueLayout.setHorizontalGroup(
            PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBlueLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBlueLayout.createSequentialGroup()
                        .addComponent(lblIconPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBlueLayout.createSequentialGroup()
                        .addComponent(lblIconUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBlueLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBlueLayout.createSequentialGroup()
                                .addGroup(PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEsqueceuSenha)
                                    .addGroup(PanelBlueLayout.createSequentialGroup()
                                        .addComponent(lblCliqueAqui)
                                        .addGap(39, 39, 39)))
                                .addGap(28, 28, 28))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBlueLayout.createSequentialGroup()
                                .addComponent(btnEntrar)
                                .addGap(60, 60, 60)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelBlueLayout.setVerticalGroup(
            PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBlueLayout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addGroup(PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUser)
                    .addComponent(lblIconUser))
                .addGap(18, 18, 18)
                .addGroup(PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIconPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(btnEntrar)
                .addGap(124, 124, 124)
                .addComponent(lblEsqueceuSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCliqueAqui)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        Usuario u = new Usuario();

        //PEGUEI OS DADOS QUE IRÁ SER COLOCADO NO TXTFIELD
        u.setLogin(txtUser.getText());
        u.setSenha(txtPassword.getText());

        // E JOGUEI PARA A VARIAVEL VALIDAR
        u = UsuarioJPA.validarUsuario(u);

        if (u != null) {

            txtUser.setText("");
            txtPassword.setText("");

            menuPrincipal menu = new menuPrincipal();
            menu.setVisible(true);
            dispose();

        } else {
            JOptionPane.showMessageDialog(null, "Informe suas credencias de login corretamente");
        }
    }//GEN-LAST:event_btnEntrarActionPerformed

    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBlue;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCliqueAqui;
    private javax.swing.JLabel lblEsqueceuSenha;
    private javax.swing.JLabel lblIconPassword;
    private javax.swing.JLabel lblIconUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
