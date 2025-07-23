package frames;

import model.Cliente;
import dao.clienteDAO;
import javax.swing.JOptionPane;

public class cadastroCliente extends javax.swing.JFrame {

    public cadastroCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblDataNascimento = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        boxMasculino = new javax.swing.JRadioButton();
        boxFeminino = new javax.swing.JRadioButton();
        lblTituloInfoCliente = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        lblDataNascimento1 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        lblDataNascimento2 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblDataNascimento3 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        btnCadastrarCliente = new javax.swing.JButton();
        lblAlergia = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtCirurgia = new javax.swing.JTextArea();
        lblDoencaCronica = new javax.swing.JLabel();
        lblUsoMedicamentos = new javax.swing.JLabel();
        lblAlergia1 = new javax.swing.JLabel();
        txtdoencaCronica = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtCondicaoDermatologica = new javax.swing.JTextArea();
        lblTituloInfoAlergia = new javax.swing.JLabel();
        lblCondicaoDermatologica = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtUsoMedicamentos = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAlergia = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CADASTRO DE CLIENTE");

        jPanel1.setBackground(new java.awt.Color(22, 31, 48));
        jPanel1.setForeground(new java.awt.Color(22, 31, 48));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblNome.setForeground(new java.awt.Color(0, 181, 181));
        lblNome.setText("Nome");

        lblCPF.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCPF.setForeground(new java.awt.Color(0, 181, 181));
        lblCPF.setText("CPF");

        lblDataNascimento.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDataNascimento.setForeground(new java.awt.Color(0, 181, 181));
        lblDataNascimento.setText("Data de Nascimento");

        lblGenero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(0, 181, 181));
        lblGenero.setText("Gênero");

        txtNome.setBackground(new java.awt.Color(236, 236, 236));
        txtNome.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 0, 0));
        txtNome.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNome.setToolTipText("Digite o nome do cliente");
        txtNome.setBorder(null);
        txtNome.setCaretColor(new java.awt.Color(0, 0, 0));
        txtNome.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txtCPF.setBackground(new java.awt.Color(236, 236, 236));
        txtCPF.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtCPF.setForeground(new java.awt.Color(0, 0, 0));
        txtCPF.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtCPF.setToolTipText("Digite numero do seu CPF (XXX.XXX.XXX-XX)");
        txtCPF.setBorder(null);
        txtCPF.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        boxMasculino.setBackground(new java.awt.Color(22, 31, 48));
        boxMasculino.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        boxMasculino.setForeground(new java.awt.Color(0, 181, 181));
        boxMasculino.setText("Masculino");

        boxFeminino.setBackground(new java.awt.Color(22, 31, 48));
        boxFeminino.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        boxFeminino.setForeground(new java.awt.Color(0, 181, 181));
        boxFeminino.setText("Feminino");

        lblTituloInfoCliente.setFont(new java.awt.Font("Dubai", 1, 32)); // NOI18N
        lblTituloInfoCliente.setForeground(new java.awt.Color(132, 198, 7));
        lblTituloInfoCliente.setText("Informações do cliente");

        txtDataNascimento.setBackground(new java.awt.Color(236, 236, 236));
        txtDataNascimento.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtDataNascimento.setForeground(new java.awt.Color(0, 0, 0));
        txtDataNascimento.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDataNascimento.setToolTipText("Digite a data de nascimento (dd/mm/aaaa)");
        txtDataNascimento.setBorder(null);
        txtDataNascimento.setCaretColor(new java.awt.Color(0, 0, 0));
        txtDataNascimento.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblDataNascimento1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDataNascimento1.setForeground(new java.awt.Color(0, 181, 181));
        lblDataNascimento1.setText("Telefone");

        txtTelefone.setBackground(new java.awt.Color(236, 236, 236));
        txtTelefone.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(0, 0, 0));
        txtTelefone.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTelefone.setToolTipText("Digite o telefone para contato | (DDD) 99999-9999");
        txtTelefone.setBorder(null);
        txtTelefone.setCaretColor(new java.awt.Color(0, 0, 0));
        txtTelefone.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblDataNascimento2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDataNascimento2.setForeground(new java.awt.Color(0, 181, 181));
        lblDataNascimento2.setText("E-mail");

        txtEmail.setBackground(new java.awt.Color(236, 236, 236));
        txtEmail.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 0, 0));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setToolTipText("Informe um e-mail");
        txtEmail.setBorder(null);
        txtEmail.setCaretColor(new java.awt.Color(0, 0, 0));
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblDataNascimento3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDataNascimento3.setForeground(new java.awt.Color(0, 181, 181));
        lblDataNascimento3.setText("Endereço");

        txtEndereco.setBackground(new java.awt.Color(236, 236, 236));
        txtEndereco.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(0, 0, 0));
        txtEndereco.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEndereco.setToolTipText("Informe o endereço do cliente");
        txtEndereco.setBorder(null);
        txtEndereco.setCaretColor(new java.awt.Color(0, 0, 0));
        txtEndereco.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnCadastrarCliente.setBackground(new java.awt.Color(40, 163, 0));
        btnCadastrarCliente.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setText("Finalizar cadastro");
        btnCadastrarCliente.setToolTipText("Finalizar cadastro do clliente");
        btnCadastrarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        lblAlergia.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAlergia.setForeground(new java.awt.Color(0, 181, 181));
        lblAlergia.setText("Tem alergia a algum medicamento ou produto?");

        txtCirurgia.setBackground(new java.awt.Color(236, 236, 236));
        txtCirurgia.setColumns(20);
        txtCirurgia.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtCirurgia.setForeground(new java.awt.Color(0, 0, 0));
        txtCirurgia.setLineWrap(true);
        txtCirurgia.setRows(3);
        txtCirurgia.setToolTipText("Infrome se o cliente ja fez alguma cirurgia");
        txtCirurgia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtCirurgia.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCirurgia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(txtCirurgia);

        lblDoencaCronica.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblDoencaCronica.setForeground(new java.awt.Color(0, 181, 181));
        lblDoencaCronica.setText("Possui alguma doença crônica? Se sim, qual?");

        lblUsoMedicamentos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblUsoMedicamentos.setForeground(new java.awt.Color(0, 181, 181));
        lblUsoMedicamentos.setText("Medicamento de uso contínuo? Se sim, qual?");

        lblAlergia1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblAlergia1.setForeground(new java.awt.Color(0, 181, 181));
        lblAlergia1.setText("Realizou alguma cirurgia? Se sim, qual?");

        txtdoencaCronica.setBackground(new java.awt.Color(236, 236, 236));
        txtdoencaCronica.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtdoencaCronica.setForeground(new java.awt.Color(0, 0, 0));
        txtdoencaCronica.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtdoencaCronica.setToolTipText("Infrome se o cliente possui alguma doença crônica");
        txtdoencaCronica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtdoencaCronica.setCaretColor(new java.awt.Color(0, 0, 0));

        txtCondicaoDermatologica.setBackground(new java.awt.Color(236, 236, 236));
        txtCondicaoDermatologica.setColumns(20);
        txtCondicaoDermatologica.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtCondicaoDermatologica.setForeground(new java.awt.Color(0, 0, 0));
        txtCondicaoDermatologica.setLineWrap(true);
        txtCondicaoDermatologica.setRows(3);
        txtCondicaoDermatologica.setToolTipText("Infrome se o cliente possui alguma condição dermatológica");
        txtCondicaoDermatologica.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtCondicaoDermatologica.setCaretColor(new java.awt.Color(0, 0, 0));
        txtCondicaoDermatologica.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(txtCondicaoDermatologica);

        lblTituloInfoAlergia.setFont(new java.awt.Font("Dubai", 1, 32)); // NOI18N
        lblTituloInfoAlergia.setForeground(new java.awt.Color(132, 198, 7));
        lblTituloInfoAlergia.setText("Informações de saúde");

        lblCondicaoDermatologica.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblCondicaoDermatologica.setForeground(new java.awt.Color(0, 181, 181));
        lblCondicaoDermatologica.setText("Possui alguma condição dermatológica?");

        txtUsoMedicamentos.setBackground(new java.awt.Color(236, 236, 236));
        txtUsoMedicamentos.setColumns(20);
        txtUsoMedicamentos.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtUsoMedicamentos.setForeground(new java.awt.Color(0, 0, 0));
        txtUsoMedicamentos.setLineWrap(true);
        txtUsoMedicamentos.setRows(3);
        txtUsoMedicamentos.setToolTipText("Infrome se o cliente utiliza medicamentos e quais");
        txtUsoMedicamentos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtUsoMedicamentos.setCaretColor(new java.awt.Color(0, 0, 0));
        txtUsoMedicamentos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtUsoMedicamentos);

        txtAlergia.setBackground(new java.awt.Color(236, 236, 236));
        txtAlergia.setColumns(20);
        txtAlergia.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        txtAlergia.setForeground(new java.awt.Color(0, 0, 0));
        txtAlergia.setLineWrap(true);
        txtAlergia.setRows(3);
        txtAlergia.setToolTipText("Infrome se o cliente possui alguma alergia");
        txtAlergia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        txtAlergia.setCaretColor(new java.awt.Color(0, 0, 0));
        txtAlergia.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(txtAlergia);

        jSeparator1.setBackground(new java.awt.Color(132, 198, 7));
        jSeparator1.setForeground(new java.awt.Color(132, 198, 7));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btnCancelar.setBackground(new java.awt.Color(255, 0, 0));
        btnCancelar.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setToolTipText("Cancela o cadastro");
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar)
                        .addGap(263, 263, 263)
                        .addComponent(btnCadastrarCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTituloInfoCliente)
                            .addComponent(lblNome)
                            .addComponent(lblDataNascimento3)
                            .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCPF)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDataNascimento2)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDataNascimento1)
                                    .addComponent(lblDataNascimento)
                                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxMasculino)
                                    .addComponent(boxFeminino)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblGenero)))))
                        .addGap(107, 107, 107)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTituloInfoAlergia)
                                .addGap(107, 107, 107))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblAlergia1)
                                    .addComponent(jScrollPane4)
                                    .addComponent(jScrollPane3)
                                    .addComponent(lblCondicaoDermatologica)
                                    .addComponent(jScrollPane1)
                                    .addComponent(jScrollPane2)
                                    .addComponent(lblAlergia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsoMedicamentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtdoencaCronica)
                                    .addComponent(lblDoencaCronica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTituloInfoAlergia, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTituloInfoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDoencaCronica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtdoencaCronica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblUsoMedicamentos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addComponent(lblAlergia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(lblAlergia1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCondicaoDermatologica))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCPF)
                        .addGap(5, 5, 5)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblDataNascimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblDataNascimento1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblGenero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxMasculino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(boxFeminino)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDataNascimento2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDataNascimento3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        if (!validarDados()) {
            return;
        } else {
            cadastrarDadosCliente();
        }
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

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
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroCliente().setVisible(true);
            }
        });
    }

    public void cadastrarDadosCliente() {
        try {

            Cliente cliente = new Cliente(); //armazena no novo cliente

            //INFORMAÇOES DO CLIENTE
            cliente.setNome(txtNome.getText());
            cliente.setCpf(txtCPF.getText());
            cliente.setDataNascimento(txtDataNascimento.getText());
            cliente.setTelefone(txtTelefone.getText());
            cliente.setEmail(txtEmail.getText());
            cliente.setEndereco(txtEndereco.getText());
            cliente.setGenero(boxMasculino.isSelected() ? "Masculino" : "Feminino");

            //INFORMAÇOES SOBRE A SAUDE
            cliente.setDoencaCronica(txtdoencaCronica.getText());
            cliente.setUsoMedimento(txtUsoMedicamentos.getText());
            cliente.setAlergia(txtAlergia.getText());
            cliente.setCirurgia(txtCirurgia.getText());
            cliente.setCondicaoDermatologica(txtCondicaoDermatologica.getText());

            clienteDAO dao = new clienteDAO();
            dao.cadastrarCliente(cliente);

            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!", "SUCESSO!", 1);
            dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente!\nVerifique as informações preenchidas", "ERRO", 3);
            System.out.println("Erro: " + e.getMessage());
        }
    }

    //VALIDANDO TODOS OS CAMPOS OBRIGATORIOS
    public boolean validarDados() {

        //VALIDAÇÃO DOS DADOS PESSOAIS DO CLIENTE
        if (txtNome.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "O campo 'NOME' é obrigatório", "ATENÇÃO", 2);
            return false;
        } else if (txtCPF.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "O campo 'CPF' é obrigatório", "ATENÇÃO", 2);
            return false;
        } else if (txtDataNascimento.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "O campo 'DATA DE NASCIMENTO' é obrigatório", "ATENÇÃO", 2);
            return false;
        } else if (txtTelefone.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "Informe um número telefone válido para contato", "ATENÇÃO", 2);
            return false;
        } else if (txtDataNascimento.getText().trim().isBlank()) {
            JOptionPane.showMessageDialog(null, "O campo 'DATA DE NASCIMENTO' é obrigatório", "ATENÇÃO", 2);
            return false;
        } else if (boxMasculino.isSelected() == false & boxFeminino.isSelected() == false) {
            JOptionPane.showMessageDialog(null, "Selecionar o gênero pode ajudar a escolher\no profissional mais adequado para o atendimento", "ATENÇÃO", 1);
            return false;
        }

        //VALIDAÇÃO DOS DADOS DE SAUDE DO CLIENTE
        if (txtdoencaCronica.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo de informações sobre alguma doença crônica é OBRIGATÓRIO", "ATENÇÃO", 2);
            return false;
        } else if (txtUsoMedicamentos.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo sobre uso de medicamentos é OBRIGATÓRIO", "ATENÇÃO", 2);
            return false;
        } else if (txtAlergia.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo sobre alergias é OBRIGATÓRIO", "ATENÇÃO", 2);
            return false;
        } else if (txtCirurgia.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo para informações de cirurgias é OBRIGATÓRIO", "ATENÇÃO", 2);
            return false;
        } else if (txtCondicaoDermatologica.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo sobre condição dermatológica é OBRIGATÓRIO", "ATENÇÃO", 2);
            return false;
        }

        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton boxFeminino;
    private javax.swing.JRadioButton boxMasculino;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAlergia;
    private javax.swing.JLabel lblAlergia1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCondicaoDermatologica;
    private javax.swing.JLabel lblDataNascimento;
    private javax.swing.JLabel lblDataNascimento1;
    private javax.swing.JLabel lblDataNascimento2;
    private javax.swing.JLabel lblDataNascimento3;
    private javax.swing.JLabel lblDoencaCronica;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblTituloInfoAlergia;
    private javax.swing.JLabel lblTituloInfoCliente;
    private javax.swing.JLabel lblUsoMedicamentos;
    private javax.swing.JTextArea txtAlergia;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextArea txtCirurgia;
    private javax.swing.JTextArea txtCondicaoDermatologica;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextArea txtUsoMedicamentos;
    private javax.swing.JTextField txtdoencaCronica;
    // End of variables declaration//GEN-END:variables
}
