package frames;

import model.Atendimento;
import model.Cliente;
import dao.atendimentoDAO;
import javax.swing.JOptionPane;

public class cadastroAtendimento extends javax.swing.JFrame {

    private Cliente clienteSelecionado;

    public cadastroAtendimento() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblTituloInfoAlergia2 = new javax.swing.JLabel();
        btnFinalizar2 = new javax.swing.JButton();
        lblData = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        boxProcedimento = new javax.swing.JComboBox<>();
        lblProcedimento = new javax.swing.JLabel();
        lblPagamento = new javax.swing.JLabel();
        boxFormaPagamento = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        txtData = new javax.swing.JFormattedTextField();
        txtHora = new javax.swing.JFormattedTextField();
        btnSelecionarCliente = new javax.swing.JButton();
        lblClienteSelecionado = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE AGENDAMENTO");

        jPanel3.setBackground(new java.awt.Color(240, 200, 175));
        jPanel3.setForeground(new java.awt.Color(20, 135, 135));

        lblTituloInfoAlergia2.setFont(new java.awt.Font("Dubai", 1, 32)); // NOI18N
        lblTituloInfoAlergia2.setForeground(new java.awt.Color(204, 108, 12));
        lblTituloInfoAlergia2.setText("Cadastrar novo agendamento");

        btnFinalizar2.setBackground(new java.awt.Color(0, 140, 102));
        btnFinalizar2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFinalizar2.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar2.setText("Cadastrar agendamento");
        btnFinalizar2.setToolTipText("Cadastrar novo agendamento");
        btnFinalizar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizar2ActionPerformed(evt);
            }
        });

        lblData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblData.setForeground(new java.awt.Color(90, 45, 20));
        lblData.setText("Data");

        lblHora.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblHora.setForeground(new java.awt.Color(90, 45, 20));
        lblHora.setText("Hora");

        boxProcedimento.setBackground(new java.awt.Color(240, 200, 175));
        boxProcedimento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boxProcedimento.setForeground(new java.awt.Color(0, 140, 102));
        boxProcedimento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione o procedimento", "Depilação (Laser)", "Depilação com cera", "Manicure", "Pedicure", "Liberação facial", "Massagem corporal" }));
        boxProcedimento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProcedimento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblProcedimento.setForeground(new java.awt.Color(90, 45, 20));
        lblProcedimento.setText("Procedimento");

        lblPagamento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblPagamento.setForeground(new java.awt.Color(90, 45, 20));
        lblPagamento.setText("Forma de pagamento");

        boxFormaPagamento.setBackground(new java.awt.Color(240, 200, 175));
        boxFormaPagamento.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        boxFormaPagamento.setForeground(new java.awt.Color(0, 140, 102));
        boxFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione a forma de pagamento", "PIX", "Débito", "Crédito" }));
        boxFormaPagamento.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jSeparator1.setBackground(new java.awt.Color(204, 108, 12));
        jSeparator1.setForeground(new java.awt.Color(204, 108, 12));

        txtData.setBackground(new java.awt.Color(255, 250, 240));
        txtData.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtData.setForeground(new java.awt.Color(0, 0, 0));
        txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));
        txtData.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtData.setToolTipText("Informe a data | Ex: 01/01/2000");
        txtData.setCaretColor(new java.awt.Color(0, 0, 0));
        txtData.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtData.setSelectionColor(new java.awt.Color(102, 102, 102));

        txtHora.setBackground(new java.awt.Color(255, 250, 240));
        txtHora.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtHora.setForeground(new java.awt.Color(0, 0, 0));
        txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        txtHora.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtHora.setToolTipText("Informe a hora | Ex: hh:mm");
        txtHora.setCaretColor(new java.awt.Color(0, 0, 0));
        txtHora.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtHora.setSelectionColor(new java.awt.Color(102, 102, 102));

        btnSelecionarCliente.setBackground(new java.awt.Color(0, 153, 153));
        btnSelecionarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSelecionarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnSelecionarCliente.setText("Selecionar cliente");
        btnSelecionarCliente.setToolTipText("Selecionar um cliente já cadastrado");
        btnSelecionarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelecionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelecionarClienteActionPerformed(evt);
            }
        });

        lblClienteSelecionado.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        lblClienteSelecionado.setForeground(new java.awt.Color(0, 102, 102));
        lblClienteSelecionado.setText("Nenhum cliente selecionado");

        btnCancelar.setBackground(new java.awt.Color(190, 30, 45));
        btnCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancelar cadastro de agendamento");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnCancelar)
                        .addGap(144, 144, 144)
                        .addComponent(btnFinalizar2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloInfoAlergia2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblClienteSelecionado)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblPagamento)
                                        .addComponent(boxFormaPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblProcedimento)
                                        .addComponent(boxProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblHora)
                                        .addComponent(lblData)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtHora, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))))))
                .addGap(0, 236, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(314, 314, 314)
                .addComponent(btnSelecionarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTituloInfoAlergia2)
                .addGap(33, 33, 33)
                .addComponent(btnSelecionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblClienteSelecionado)
                .addGap(29, 29, 29)
                .addComponent(lblData)
                .addGap(8, 8, 8)
                .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProcedimento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxProcedimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPagamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boxFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFinalizar2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinalizar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizar2ActionPerformed

        if (!validarDados()) {
            return;
        }
        cadastrarDadosAtendimento();
    }//GEN-LAST:event_btnFinalizar2ActionPerformed

    private void btnSelecionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelecionarClienteActionPerformed
        selecionarCliente selecionarCliente = new selecionarCliente(this);
        selecionarCliente.setVisible(true);
    }//GEN-LAST:event_btnSelecionarClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroAtendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroAtendimento().setVisible(true);
            }
        });
    }

    public void cadastrarDadosAtendimento() {

        Atendimento atendimento = new Atendimento();

        try {

            atendimento.setData(txtData.getText());
            atendimento.setHora(txtHora.getText());
            atendimento.setProcedimento(boxProcedimento.getSelectedItem().toString());
            atendimento.setFormaPagamento(boxFormaPagamento.getSelectedItem().toString());

            //cliente selecionado no JFRAME selecionarCliente
            atendimento.setCliente(clienteSelecionado);

            atendimentoDAO dao = new atendimentoDAO();
            dao.cadastrarAtendimento(atendimento); // aqui salva

            JOptionPane.showMessageDialog(null, "Atendimento cadastrado com sucesso!", "SUCESSO!", 1);
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar agendamento", "ERRO!", 3);
        }
    }

    public boolean validarDados() {

        if (txtData.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Obrigatório informar uma data", "ATENÇÃO", 2);
            return false;
        } else if (txtHora.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Obrigatório informar o horário para o agendamento", "ATENÇÃO", 2);
            return false;
        } else if (boxProcedimento.getSelectedItem().toString() == "Selecione o procedimento") {
            JOptionPane.showMessageDialog(null, "Selecione o procedimento válido", "ATENÇÃO", 2);
            return false;
        } else if (boxFormaPagamento.getSelectedItem().toString() == "Selecione a forma de pagamento") {
            JOptionPane.showMessageDialog(null, "Selecione uma forma de pagamento válida", "ATENÇÃO", 2);
            return false;
        }
        return true;
    }

    public void setClienteSelecionado(Cliente cliente) {
        this.clienteSelecionado = cliente;
        lblClienteSelecionado.setText("Cliente: " + cliente.getNome());
        // preenche o  JLabel informando qual cliente selecionado
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> boxFormaPagamento;
    private javax.swing.JComboBox<String> boxProcedimento;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnFinalizar2;
    private javax.swing.JButton btnSelecionarCliente;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblClienteSelecionado;
    private javax.swing.JLabel lblData;
    private javax.swing.JLabel lblHora;
    private javax.swing.JLabel lblPagamento;
    private javax.swing.JLabel lblProcedimento;
    private javax.swing.JLabel lblTituloInfoAlergia2;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JFormattedTextField txtHora;
    // End of variables declaration//GEN-END:variables
}
