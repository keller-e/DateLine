package frames;

import model.Cliente;

public class DadosCliente extends javax.swing.JFrame {

    private Cliente clienteSelecionado;

    public DadosCliente() {
        initComponents();
    }

    public DadosCliente(Cliente cliente) {
        this.clienteSelecionado = cliente;
        initComponents(); // Primeiro monta a tela

        // Depois preenche os dados conforme selecionado
        lblNomeCliente.setText(clienteSelecionado.getNome());
        lblRespostaCPF.setText(clienteSelecionado.getCpf());
        lblRespostaData.setText(clienteSelecionado.getDataNascimento());
        lblRespostaTelefone.setText(clienteSelecionado.getTelefone());
        lblRespostaEmail.setText(clienteSelecionado.getEmail());
        lblRespostaEndereco.setText(clienteSelecionado.getEndereco());
        lblRespostaDoencaCronica.setText(clienteSelecionado.getDoencaCronica());
        lblRespostaMedicamento.setText(clienteSelecionado.getUsoMedimento());
        lblRespostaCirurgia.setText(clienteSelecionado.getCirurgia());
        lblRespostaAlergia.setText(clienteSelecionado.getAlergia());
        lblRespostaCondicaoDerma.setText(clienteSelecionado.getCondicaoDermatologica());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNomeCliente = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblEndereco = new javax.swing.JLabel();
        lblCondicaoDermatologica = new javax.swing.JLabel();
        lblCirurgia = new javax.swing.JLabel();
        lblAlergia = new javax.swing.JLabel();
        lblUsoMedicamentos = new javax.swing.JLabel();
        lblDoencaCronica = new javax.swing.JLabel();
        lblRespostaData = new javax.swing.JLabel();
        lblRespostaCPF = new javax.swing.JLabel();
        lblRespostaEmail = new javax.swing.JLabel();
        lblRespostaTelefone = new javax.swing.JLabel();
        lblRespostaEndereco = new javax.swing.JLabel();
        lblRespostaMedicamento = new javax.swing.JLabel();
        lblRespostaDoencaCronica = new javax.swing.JLabel();
        lblRespostaCirurgia = new javax.swing.JLabel();
        lblRespostaAlergia = new javax.swing.JLabel();
        lblRespostaCondicaoDerma = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CLIENTE");

        jPanel1.setBackground(new java.awt.Color(240, 200, 175));

        lblNomeCliente.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblNomeCliente.setForeground(new java.awt.Color(204, 108, 12));
        lblNomeCliente.setText("Nome Cliente");

        lblCPF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(90, 45, 20));
        lblCPF.setText("CPF:");

        lblDataNascimento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(90, 45, 20));
        lblDataNascimento.setText("Data de Nascimento:");

        lblTelefone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTelefone.setForeground(new java.awt.Color(90, 45, 20));
        lblTelefone.setText("Telefone:");

        lblEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEmail.setForeground(new java.awt.Color(90, 45, 20));
        lblEmail.setText("E-mail:");

        lblEndereco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblEndereco.setForeground(new java.awt.Color(90, 45, 20));
        lblEndereco.setText("Endereço:");

        lblCondicaoDermatologica.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCondicaoDermatologica.setForeground(new java.awt.Color(90, 45, 20));
        lblCondicaoDermatologica.setText("Condição dermatológica:");

        lblCirurgia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCirurgia.setForeground(new java.awt.Color(90, 45, 20));
        lblCirurgia.setText("Cirurgia:");

        lblAlergia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAlergia.setForeground(new java.awt.Color(90, 45, 20));
        lblAlergia.setText("Alergia a medicamento ou produto:");

        lblUsoMedicamentos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsoMedicamentos.setForeground(new java.awt.Color(90, 45, 20));
        lblUsoMedicamentos.setText("Medicamento de uso contínuo:");

        lblDoencaCronica.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDoencaCronica.setForeground(new java.awt.Color(90, 45, 20));
        lblDoencaCronica.setText("Doença crônica:");

        lblRespostaData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaData.setForeground(new java.awt.Color(153, 87, 50));

        lblRespostaCPF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaCPF.setForeground(new java.awt.Color(153, 87, 50));

        lblRespostaEmail.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaEmail.setForeground(new java.awt.Color(153, 87, 50));

        lblRespostaTelefone.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaTelefone.setForeground(new java.awt.Color(153, 87, 50));

        lblRespostaEndereco.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaEndereco.setForeground(new java.awt.Color(153, 87, 50));

        lblRespostaMedicamento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaMedicamento.setForeground(new java.awt.Color(153, 87, 50));

        lblRespostaDoencaCronica.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaDoencaCronica.setForeground(new java.awt.Color(153, 87, 50));

        lblRespostaCirurgia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaCirurgia.setForeground(new java.awt.Color(153, 87, 50));

        lblRespostaAlergia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaAlergia.setForeground(new java.awt.Color(153, 87, 50));

        lblRespostaCondicaoDerma.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblRespostaCondicaoDerma.setForeground(new java.awt.Color(153, 87, 50));

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Voltar");
        jButton1.setToolTipText("Clique aqui para voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCondicaoDermatologica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaCondicaoDerma))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCirurgia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaCirurgia))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDoencaCronica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaDoencaCronica))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaEndereco))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaCPF))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaEmail))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaTelefone))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaData))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsoMedicamentos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaMedicamento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblAlergia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblRespostaAlergia)))
                        .addContainerGap(346, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(71, 71, 71))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(lblRespostaCPF))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDataNascimento)
                    .addComponent(lblRespostaData))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(lblRespostaTelefone))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblRespostaEmail))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEndereco)
                    .addComponent(lblRespostaEndereco))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDoencaCronica)
                    .addComponent(lblRespostaDoencaCronica))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsoMedicamentos)
                    .addComponent(lblRespostaMedicamento))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCirurgia)
                    .addComponent(lblRespostaCirurgia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlergia)
                    .addComponent(lblRespostaAlergia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCondicaoDermatologica)
                    .addComponent(lblRespostaCondicaoDerma))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DadosCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAlergia;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCirurgia;
    private javax.swing.JLabel lblCondicaoDermatologica;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblDoencaCronica;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEndereco;
    private javax.swing.JLabel lblNomeCliente;
    private javax.swing.JLabel lblRespostaAlergia;
    private javax.swing.JLabel lblRespostaCPF;
    private javax.swing.JLabel lblRespostaCirurgia;
    private javax.swing.JLabel lblRespostaCondicaoDerma;
    private javax.swing.JLabel lblRespostaData;
    private javax.swing.JLabel lblRespostaDoencaCronica;
    private javax.swing.JLabel lblRespostaEmail;
    private javax.swing.JLabel lblRespostaEndereco;
    private javax.swing.JLabel lblRespostaMedicamento;
    private javax.swing.JLabel lblRespostaTelefone;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JLabel lblUsoMedicamentos;
    // End of variables declaration//GEN-END:variables
}
