package frames;

import javax.swing.JOptionPane;

public class menuPrincipal extends javax.swing.JFrame {

    public menuPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelBlue = new javax.swing.JPanel();
        btnListaCliente = new javax.swing.JButton();
        btnCadastrarConsulta = new javax.swing.JButton();
        btnCadastrarNovoCliente = new javax.swing.JButton();
        btnAgendamentos = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MENU PRINCIPAL");

        PanelBlue.setBackground(new java.awt.Color(227, 176, 139));

        btnListaCliente.setBackground(new java.awt.Color(179, 84, 0));
        btnListaCliente.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        btnListaCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnListaCliente.setText("Lista de Clientes");
        btnListaCliente.setToolTipText("Clique aqui para ver todos os clientes");
        btnListaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaClienteActionPerformed(evt);
            }
        });

        btnCadastrarConsulta.setBackground(new java.awt.Color(0, 140, 102));
        btnCadastrarConsulta.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnCadastrarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/calendar.png"))); // NOI18N
        btnCadastrarConsulta.setText("Cadastrar agendamento");
        btnCadastrarConsulta.setToolTipText("Cadastrar novo agendamento");
        btnCadastrarConsulta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrarConsulta.setFocusPainted(false);
        btnCadastrarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarConsultaActionPerformed(evt);
            }
        });

        btnCadastrarNovoCliente.setBackground(new java.awt.Color(0, 140, 102));
        btnCadastrarNovoCliente.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        btnCadastrarNovoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/userAdd.png"))); // NOI18N
        btnCadastrarNovoCliente.setText("Cadastrar cliente");
        btnCadastrarNovoCliente.setToolTipText("Cadastrar novo cliente");
        btnCadastrarNovoCliente.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCadastrarNovoCliente.setFocusPainted(false);
        btnCadastrarNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarNovoClienteActionPerformed(evt);
            }
        });

        btnAgendamentos.setBackground(new java.awt.Color(179, 84, 0));
        btnAgendamentos.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        btnAgendamentos.setForeground(new java.awt.Color(255, 255, 255));
        btnAgendamentos.setText("Agendamentos");
        btnAgendamentos.setToolTipText("Clique aqui para ver todos os agendamentos");
        btnAgendamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendamentosActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(190, 30, 45));
        btnSair.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setToolTipText("Deslogar do usuário atual");
        btnSair.setFocusable(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelBlueLayout = new javax.swing.GroupLayout(PanelBlue);
        PanelBlue.setLayout(PanelBlueLayout);
        PanelBlueLayout.setHorizontalGroup(
            PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBlueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBlueLayout.createSequentialGroup()
                        .addComponent(btnCadastrarNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBlueLayout.createSequentialGroup()
                        .addComponent(btnAgendamentos)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBlueLayout.createSequentialGroup()
                        .addComponent(btnCadastrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
            .addGroup(PanelBlueLayout.createSequentialGroup()
                .addGroup(PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelBlueLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btnListaCliente))
                    .addGroup(PanelBlueLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnSair)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelBlueLayout.setVerticalGroup(
            PanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelBlueLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnSair)
                .addGap(154, 154, 154)
                .addComponent(btnCadastrarNovoCliente)
                .addGap(18, 18, 18)
                .addComponent(btnListaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(btnCadastrarConsulta)
                .addGap(18, 18, 18)
                .addComponent(btnAgendamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/icon/TelaMenuPrincipal.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 853, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(343, 343, 343)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelBlue, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 775, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        dispose();

        telaLogin telaLogin = new telaLogin();
        telaLogin.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnAgendamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendamentosActionPerformed
        listaAgendamentos lista = new listaAgendamentos();
        lista.setVisible(true);
    }//GEN-LAST:event_btnAgendamentosActionPerformed

    private void btnCadastrarNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarNovoClienteActionPerformed
        cadastroCliente infoCliente = new cadastroCliente();
        infoCliente.setVisible(true);

        JOptionPane.showMessageDialog(null, "IMPORTANTE: O preenchimento correto dos dados a seguir é essencial."
            + "\nInforme com atenção para que não haja nenhum risco a saúde do cliente\n"
            + "e garanta a melhor experiência e segurança de todos.", "IMPORTANTE", 1);
    }//GEN-LAST:event_btnCadastrarNovoClienteActionPerformed

    private void btnCadastrarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarConsultaActionPerformed
        cadastroAtendimento cadastro = new cadastroAtendimento();
        cadastro.setVisible(true);
    }//GEN-LAST:event_btnCadastrarConsultaActionPerformed

    private void btnListaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaClienteActionPerformed

        listaClientes lisCliente = new listaClientes();
        lisCliente.setVisible(true);
    }//GEN-LAST:event_btnListaClienteActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelBlue;
    private javax.swing.JButton btnAgendamentos;
    private javax.swing.JButton btnCadastrarConsulta;
    private javax.swing.JButton btnCadastrarNovoCliente;
    private javax.swing.JButton btnListaCliente;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
