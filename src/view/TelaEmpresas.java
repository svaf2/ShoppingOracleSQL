/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import conexao.EmpresasDao;
import conexao.IEmpresasDao;
import controller.BotaoEmpresasController;
import controller.BotaoProdutosController;
import controller.ComboEmpresasController;
import controller.ComboProdutosController;
import controller.EmpresasController;
import controller.IEmpresasController;
import controller.IProdutosController;
import controller.ProdutosController;
import controller.RadioEmpresasController;
import controller.RadioProdutosController;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Empresas;
import model.Produtos;

/**
 *
 * @author samirf
 */
public class TelaEmpresas extends javax.swing.JFrame {

    /**
     * Creates new form TelaEmpresas
     */
    public TelaEmpresas() {
        initComponents();
        buttonGroup1.add(bAtualizaEmp);
        buttonGroup1.add(bCadastraEmp);
        buttonGroup1.add(bExcluiEmp);
        buttonGroup2.add(bAtualizaProd);
        buttonGroup2.add(bCadastraProd);
        buttonGroup2.add(bExcluiProd);
        buttonGroup3.add(bListarEmp);
        buttonGroup3.add(bConsultaNome);
        buttonGroup3.add(bConsultaCnpj);
        buttonGroup4.add(bListarProd);
        buttonGroup4.add(bConsultaProd);
        buttonGroup4.add(bConsultaCod);
        lbEmpresa.setVisible(false);
        lbNomeFantasia.setVisible(false);
        lbRazaoSocial.setVisible(false);
        lbCNPJ.setVisible(false);
        lbRamo.setVisible(false);
        lbEmail.setVisible(false);
        lbSite.setVisible(false);
        tfNomeFantasia.setVisible(false);
        tfRazaoSocial.setVisible(false);
        tfCNPJ.setVisible(false);
        tfRamo.setVisible(false);
        tfEmail.setVisible(false);
        tfSite.setVisible(false);
        comboBox.setVisible(false);
        bEnviar.setVisible(false);
        lbProduto.setVisible(false);
        lbNome.setVisible(false);
        lbCodigo.setVisible(false);
        lbMarca.setVisible(false);
        tfNome.setVisible(false);
        tfCodigo.setVisible(false);
        tfMarca.setVisible(false);
        pComboBox.setVisible(false);
        bEnviarProd.setVisible(false);
        lbConsultaCNPJ.setVisible(false);
        lbConsultaNome.setVisible(false);
        tfConsultaCnpj.setVisible(false);
        tfConsultaNome.setVisible(false);
        bConsultaEmp.setVisible(false);
        lbNomeProd.setVisible(false);
        lbCodProd.setVisible(false);
        tfConsultaProd.setVisible(false);
        tfConsultaCod.setVisible(false);
        bEnviaProd.setVisible(false);
        
        RadioEmpresasController reController = new RadioEmpresasController(
                tfNomeFantasia, tfRazaoSocial, tfCNPJ, tfRamo, tfEmail, tfSite, 
                lbEmpresa, lbNomeFantasia, lbRazaoSocial, lbCNPJ, lbRamo, lbEmail, 
                lbSite, bCadastraEmp, bAtualizaEmp, bExcluiEmp, bEnviar, comboBox);
         
        bCadastraEmp.addActionListener(reController);
        bAtualizaEmp.addActionListener(reController);
        bExcluiEmp.addActionListener(reController);
        
        ComboEmpresasController ceController = new ComboEmpresasController(tfNomeFantasia,
                tfRazaoSocial, tfCNPJ, tfRamo, tfEmail, tfSite, comboBox, bExcluiEmp);
        
        comboBox.addActionListener(ceController);
        
        BotaoEmpresasController beController = new BotaoEmpresasController(tfNomeFantasia,
                tfRazaoSocial, tfCNPJ, tfRamo, tfEmail, tfSite, bCadastraEmp, bAtualizaEmp,
                bExcluiEmp, comboBox, tbEmpresas);
        
        bEnviar.addActionListener(beController);
        
        EmpresasController eController = new EmpresasController(tbEmpresas);
        eController.tabelaEmpresas();
        
        RadioProdutosController rpController = new RadioProdutosController(tfNome,
                tfCodigo, tfMarca, lbProduto, lbNome, lbCodigo, lbMarca, pComboBox,
                bCadastraProd, bAtualizaProd, bExcluiProd, bEnviarProd);
        
        bCadastraProd.addActionListener(rpController);
        bAtualizaProd.addActionListener(rpController);
        bExcluiProd.addActionListener(rpController);
        
        ComboProdutosController cpController = new ComboProdutosController(tfNome, 
                tfCodigo, tfMarca, pComboBox, bExcluiProd);
        
        pComboBox.addActionListener(cpController);
        
        BotaoProdutosController bpController = new BotaoProdutosController(tfNome, tfCodigo,
                tfMarca, pComboBox, bCadastraProd, bAtualizaProd, bExcluiProd, tbProdutos);
        
        bEnviarProd.addActionListener(bpController);
        
        ProdutosController pController = new ProdutosController(tbProdutos);
        pController.tabelaProdutos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bDropEmp = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bCreateProd = new javax.swing.JButton();
        bDropProd = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        bCreateEmp = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bCadastraEmp = new javax.swing.JRadioButton();
        bAtualizaEmp = new javax.swing.JRadioButton();
        bExcluiEmp = new javax.swing.JRadioButton();
        lbNomeFantasia = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        comboBox.setVisible(false);
        lbRazaoSocial = new javax.swing.JLabel();
        lbCNPJ = new javax.swing.JLabel();
        lbRamo = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbSite = new javax.swing.JLabel();
        tfNomeFantasia = new javax.swing.JTextField();
        tfRazaoSocial = new javax.swing.JTextField();
        tfCNPJ = new javax.swing.JTextField();
        tfRamo = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        tfSite = new javax.swing.JTextField();
        bEnviar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmpresas = new javax.swing.JTable();
        bListarEmp = new javax.swing.JRadioButton();
        bConsultaNome = new javax.swing.JRadioButton();
        bConsultaCnpj = new javax.swing.JRadioButton();
        lbConsultaNome = new javax.swing.JLabel();
        lbConsultaCNPJ = new javax.swing.JLabel();
        tfConsultaNome = new javax.swing.JTextField();
        tfConsultaCnpj = new javax.swing.JTextField();
        bConsultaEmp = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        bCadastraProd = new javax.swing.JRadioButton();
        bAtualizaProd = new javax.swing.JRadioButton();
        bExcluiProd = new javax.swing.JRadioButton();
        lbProduto = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        pComboBox = new javax.swing.JComboBox<>();
        tfNome = new javax.swing.JTextField();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbMarca = new javax.swing.JLabel();
        tfMarca = new javax.swing.JTextField();
        bEnviarProd = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        bListarProd = new javax.swing.JRadioButton();
        bConsultaProd = new javax.swing.JRadioButton();
        bConsultaCod = new javax.swing.JRadioButton();
        lbNomeProd = new javax.swing.JLabel();
        lbCodProd = new javax.swing.JLabel();
        tfConsultaCod = new javax.swing.JTextField();
        tfConsultaProd = new javax.swing.JTextField();
        bEnviaProd = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(197, 136, 234));

        jLabel4.setFont(new java.awt.Font("Courier 10 Pitch", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Ayrton Fernando");

        jLabel5.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Projeto Banco de Dados");

        jLabel6.setFont(new java.awt.Font("Courier 10 Pitch", 1, 18)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Samir Ferreira");

        jLabel7.setFont(new java.awt.Font("Courier 10 Pitch", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Vanessa Vieira");

        jLabel8.setFont(new java.awt.Font("Courier 10 Pitch", 1, 18)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Johnny Mayron");

        jLabel9.setIcon(new javax.swing.ImageIcon("/home/samirf/Downloads/db.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/samirf/Downloads/Oracle_Database.png")); // NOI18N

        jLabel11.setText("Use por sua conta e risco >.>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(375, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(362, 362, 362))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(178, 178, 178)
                        .addComponent(jLabel11)
                        .addGap(0, 254, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Inicio", jPanel1);

        jPanel2.setBackground(new java.awt.Color(197, 136, 234));

        bDropEmp.setFont(new java.awt.Font("Courier 10 Pitch", 0, 15)); // NOI18N
        bDropEmp.setText("DROP TABLE");
        bDropEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDropEmpActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Empresas");

        bCreateProd.setFont(new java.awt.Font("Courier 10 Pitch", 0, 15)); // NOI18N
        bCreateProd.setText("CREATE TABLE");
        bCreateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreateProdActionPerformed(evt);
            }
        });

        bDropProd.setFont(new java.awt.Font("Courier 10 Pitch", 0, 15)); // NOI18N
        bDropProd.setText("DROP TABLE");
        bDropProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDropProdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Produtos");

        bCreateEmp.setFont(new java.awt.Font("Courier 10 Pitch", 0, 15)); // NOI18N
        bCreateEmp.setText("CREATE TABLE");
        bCreateEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCreateEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1)
                        .addGap(223, 223, 223)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDropEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(136, 136, 136)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bDropProd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCreateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(286, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCreateEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCreateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bDropProd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bDropEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(400, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Criar Tabelas", jPanel2);

        jPanel3.setBackground(new java.awt.Color(197, 136, 234));

        bCadastraEmp.setForeground(java.awt.Color.white);
        bCadastraEmp.setText("Cadastrar");

        bAtualizaEmp.setForeground(new java.awt.Color(255, 255, 255));
        bAtualizaEmp.setText("Atualizar");

        bExcluiEmp.setForeground(new java.awt.Color(255, 255, 255));
        bExcluiEmp.setText("Excluir");

        lbNomeFantasia.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeFantasia.setText("Nome Fantasia:");

        lbEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        lbEmpresa.setText("Empresa:");

        lbRazaoSocial.setForeground(new java.awt.Color(255, 255, 255));
        lbRazaoSocial.setText("Razão Social:");

        lbCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        lbCNPJ.setText("CNPJ:");

        lbRamo.setForeground(new java.awt.Color(255, 255, 255));
        lbRamo.setText("Ramo:");

        lbEmail.setForeground(new java.awt.Color(255, 255, 255));
        lbEmail.setText("E-mail:");

        lbSite.setForeground(new java.awt.Color(255, 255, 255));
        lbSite.setText("Site:");

        tfRamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRamoActionPerformed(evt);
            }
        });

        bEnviar.setFont(new java.awt.Font("Courier 10 Pitch", 0, 15)); // NOI18N
        bEnviar.setText("Enviar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lbEmpresa)
                                .addGap(18, 18, 18)
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(bCadastraEmp)
                                .addGap(125, 125, 125)
                                .addComponent(bAtualizaEmp)
                                .addGap(125, 125, 125)
                                .addComponent(bExcluiEmp))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGap(59, 59, 59)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbRamo)
                                                .addComponent(lbEmail)
                                                .addComponent(lbSite)))
                                        .addComponent(lbRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(lbCNPJ, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbNomeFantasia)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNomeFantasia)
                            .addComponent(tfRazaoSocial)
                            .addComponent(tfCNPJ)
                            .addComponent(tfRamo)
                            .addComponent(tfEmail)
                            .addComponent(tfSite)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)))
                .addGap(416, 416, 416))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadastraEmp)
                    .addComponent(bAtualizaEmp)
                    .addComponent(bExcluiEmp))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmpresa)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNomeFantasia))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRazaoSocial))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCNPJ))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfRamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRamo))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbSite)
                    .addComponent(tfSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(262, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Empresas", jPanel3);

        jPanel4.setBackground(new java.awt.Color(197, 136, 234));

        tbEmpresas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome Fantasia", "Razão Social", "CNPJ", "Ramo", "E-mail", "Site"
            }
        ));
        jScrollPane1.setViewportView(tbEmpresas);

        bListarEmp.setForeground(new java.awt.Color(255, 255, 255));
        bListarEmp.setText("Listar Empresas");
        bListarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarEmpActionPerformed(evt);
            }
        });

        bConsultaNome.setForeground(new java.awt.Color(255, 255, 255));
        bConsultaNome.setText("Consultar por Nome");
        bConsultaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaNomeActionPerformed(evt);
            }
        });

        bConsultaCnpj.setForeground(new java.awt.Color(255, 255, 255));
        bConsultaCnpj.setText("Consultar por CNPJ");
        bConsultaCnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaCnpjActionPerformed(evt);
            }
        });

        lbConsultaNome.setForeground(new java.awt.Color(255, 255, 255));
        lbConsultaNome.setText("Nome:");

        lbConsultaCNPJ.setForeground(new java.awt.Color(255, 255, 255));
        lbConsultaCNPJ.setText("CNPJ:");

        bConsultaEmp.setFont(new java.awt.Font("Courier 10 Pitch", 0, 15)); // NOI18N
        bConsultaEmp.setText("Consultar");
        bConsultaEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaEmpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(bListarEmp)
                                .addGap(113, 113, 113)
                                .addComponent(bConsultaNome))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbConsultaNome)
                                    .addComponent(lbConsultaCNPJ))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfConsultaCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bConsultaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bConsultaCnpj))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bListarEmp)
                            .addComponent(bConsultaNome)
                            .addComponent(bConsultaCnpj))
                        .addGap(48, 48, 48)
                        .addComponent(lbConsultaNome))
                    .addComponent(tfConsultaNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbConsultaCNPJ)
                            .addComponent(tfConsultaCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bConsultaEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta Empresas", jPanel4);

        jPanel5.setBackground(new java.awt.Color(197, 136, 234));

        bCadastraProd.setForeground(new java.awt.Color(255, 255, 255));
        bCadastraProd.setText("Cadastrar");
        bCadastraProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastraProdActionPerformed(evt);
            }
        });

        bAtualizaProd.setForeground(new java.awt.Color(255, 255, 255));
        bAtualizaProd.setText("Atualizar");

        bExcluiProd.setForeground(new java.awt.Color(255, 255, 255));
        bExcluiProd.setText("Excluir");

        lbProduto.setForeground(new java.awt.Color(255, 255, 255));
        lbProduto.setText("Produto:");

        lbNome.setForeground(new java.awt.Color(255, 255, 255));
        lbNome.setText("Nome:");

        lbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigo.setText("Código:");

        lbMarca.setForeground(new java.awt.Color(255, 255, 255));
        lbMarca.setText("Marca:");

        bEnviarProd.setFont(new java.awt.Font("Courier 10 Pitch", 0, 15)); // NOI18N
        bEnviarProd.setText("Enviar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(bCadastraProd)
                        .addGap(97, 97, 97)
                        .addComponent(bAtualizaProd)
                        .addGap(109, 109, 109)
                        .addComponent(bExcluiProd))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbProduto)
                            .addComponent(lbNome, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbMarca, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bEnviarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                                    .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNome, javax.swing.GroupLayout.Alignment.LEADING))))))
                .addContainerGap(460, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCadastraProd)
                    .addComponent(bAtualizaProd)
                    .addComponent(bExcluiProd))
                .addGap(48, 48, 48)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbProduto)
                    .addComponent(pComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCodigo)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbMarca))
                .addGap(35, 35, 35)
                .addComponent(bEnviarProd, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Produtos", jPanel5);

        jPanel6.setBackground(new java.awt.Color(197, 136, 234));

        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Código", "Marca"
            }
        ));
        jScrollPane2.setViewportView(tbProdutos);

        bListarProd.setForeground(new java.awt.Color(255, 255, 255));
        bListarProd.setText("Listar Produtos");
        bListarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bListarProdActionPerformed(evt);
            }
        });

        bConsultaProd.setForeground(new java.awt.Color(255, 255, 255));
        bConsultaProd.setText("Consultar por Nome");
        bConsultaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaProdActionPerformed(evt);
            }
        });

        bConsultaCod.setForeground(new java.awt.Color(255, 255, 255));
        bConsultaCod.setText("Consultar por Código");
        bConsultaCod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConsultaCodActionPerformed(evt);
            }
        });

        lbNomeProd.setForeground(new java.awt.Color(255, 255, 255));
        lbNomeProd.setText("Nome:");

        lbCodProd.setForeground(new java.awt.Color(255, 255, 255));
        lbCodProd.setText("Código:");

        tfConsultaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfConsultaProdActionPerformed(evt);
            }
        });

        bEnviaProd.setFont(new java.awt.Font("Courier 10 Pitch", 0, 15)); // NOI18N
        bEnviaProd.setText("Consultar");
        bEnviaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEnviaProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 907, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(bListarProd)
                                .addGap(139, 139, 139)
                                .addComponent(bConsultaProd)
                                .addGap(122, 122, 122)
                                .addComponent(bConsultaCod))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbNomeProd)
                                    .addComponent(lbCodProd))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(tfConsultaCod, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(110, 110, 110)))
                                .addGap(54, 54, 54)
                                .addComponent(bEnviaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bListarProd)
                    .addComponent(bConsultaProd)
                    .addComponent(bConsultaCod))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNomeProd)
                            .addComponent(tfConsultaProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbCodProd)
                            .addComponent(tfConsultaCod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(bEnviaProd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Consulta Produtos", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfRamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRamoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRamoActionPerformed

    private void bDropEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDropEmpActionPerformed
        try {
            IEmpresasDao eDao = new EmpresasDao();
            eDao.dropEmpresas();
            JOptionPane.showMessageDialog(null, "Tabela Empresa detonada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bDropEmpActionPerformed

    private void bCreateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreateProdActionPerformed
        try {
            IEmpresasDao pDao = new EmpresasDao();
            pDao.criaProdutos();
            JOptionPane.showMessageDialog(null, "Tabela Produto criada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCreateProdActionPerformed

    private void bDropProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDropProdActionPerformed
        try {
            IEmpresasDao pDao = new EmpresasDao();
            pDao.dropProdutos();
            JOptionPane.showMessageDialog(null, "Tabela Produto detonada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bDropProdActionPerformed

    private void bCadastraProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastraProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCadastraProdActionPerformed

    private void bCreateEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCreateEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bCreateEmpActionPerformed

    private void bListarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarEmpActionPerformed
        lbConsultaCNPJ.setVisible(false);
        lbConsultaNome.setVisible(false);
        tfConsultaCnpj.setVisible(false);
        tfConsultaNome.setVisible(false);
        bConsultaEmp.setVisible(false);
        tfConsultaNome.setText("");
        tfConsultaCnpj.setText("");
        IEmpresasController eController = new EmpresasController(tbEmpresas);
        eController.tabelaEmpresas();
    }//GEN-LAST:event_bListarEmpActionPerformed

    private void bConsultaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaNomeActionPerformed
        lbConsultaCNPJ.setVisible(false);
        lbConsultaNome.setVisible(true);
        tfConsultaCnpj.setVisible(false);
        tfConsultaNome.setVisible(true);
        bConsultaEmp.setVisible(true);
    }//GEN-LAST:event_bConsultaNomeActionPerformed

    private void bConsultaCnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaCnpjActionPerformed
        lbConsultaCNPJ.setVisible(true);
        lbConsultaNome.setVisible(false);
        tfConsultaCnpj.setVisible(true);
        tfConsultaNome.setVisible(false);
        bConsultaEmp.setVisible(true);
    }//GEN-LAST:event_bConsultaCnpjActionPerformed

    private void bConsultaEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaEmpActionPerformed
        Empresas emp = new Empresas();
        if (bConsultaNome.isSelected()){
            emp.setNomeFantasia(tfConsultaNome.getText()+"%");
            if (tbEmpresas != null) {
                DefaultTableModel modelo = (DefaultTableModel) tbEmpresas.getModel();
                if (modelo.getRowCount() > 0) {
                    modelo.setRowCount(0);
                } try {
                    EmpresasDao eDao = new EmpresasDao();
                    List<Empresas> listaEmpresas = eDao.consultaEmpresasNome(emp);
                    for (Empresas e : listaEmpresas) {
                        Object[] linha = new Object[6];
                        linha[0] = e.getNomeFantasia();
                        linha[1] = e.getRazaoSoc();
                        linha[2] = e.getCnpj();
                        linha[3] = e.getRamo();
                        linha[4] = e.getEmail();
                        linha[5] = e.getSite();
                        modelo.addRow(linha);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            
            }
        } else {
            emp.setCnpj(tfConsultaCnpj.getText()+"%");
            if (tbEmpresas != null) {
                DefaultTableModel modelo = (DefaultTableModel) tbEmpresas.getModel();
                if (modelo.getRowCount() > 0) {
                    modelo.setRowCount(0);
                } try {
                    EmpresasDao eDao = new EmpresasDao();
                    List<Empresas> listaEmpresas = eDao.consultaEmpresasCnpj(emp);
                    for (Empresas e : listaEmpresas) {
                        Object[] linha = new Object[6];
                        linha[0] = e.getNomeFantasia();
                        linha[1] = e.getRazaoSoc();
                        linha[2] = e.getCnpj();
                        linha[3] = e.getRamo();
                        linha[4] = e.getEmail();
                        linha[5] = e.getSite();
                        modelo.addRow(linha);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        tfConsultaNome.setText("");
        tfConsultaCnpj.setText("");
    }//GEN-LAST:event_bConsultaEmpActionPerformed

    private void tfConsultaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfConsultaProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfConsultaProdActionPerformed

    private void bListarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bListarProdActionPerformed
        lbNomeProd.setVisible(false);
        lbCodProd.setVisible(false);
        tfConsultaProd.setVisible(false);
        tfConsultaCod.setVisible(false);
        bEnviaProd.setVisible(false);
        tfConsultaProd.setText("");
        tfConsultaCod.setText("");
        
        IProdutosController pController = new ProdutosController(tbProdutos);
        pController.tabelaProdutos();
    }//GEN-LAST:event_bListarProdActionPerformed

    private void bConsultaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaProdActionPerformed
        lbNomeProd.setVisible(true);
        lbCodProd.setVisible(false);
        tfConsultaProd.setVisible(true);
        tfConsultaCod.setVisible(false);
        bEnviaProd.setVisible(true);
    }//GEN-LAST:event_bConsultaProdActionPerformed

    private void bConsultaCodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConsultaCodActionPerformed
        lbNomeProd.setVisible(false);
        lbCodProd.setVisible(true);
        tfConsultaProd.setVisible(false);
        tfConsultaCod.setVisible(true);
        bEnviaProd.setVisible(true);
    }//GEN-LAST:event_bConsultaCodActionPerformed

    private void bEnviaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEnviaProdActionPerformed
        Produtos prod = new Produtos();
        if (bConsultaProd.isSelected()){
            prod.setNome(tfConsultaProd.getText()+"%");
            if (tbProdutos != null) {
                DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
                if (modelo.getRowCount() > 0) {
                    modelo.setRowCount(0);
                } try {
                    EmpresasDao eDao = new EmpresasDao();
                    List<Produtos> listaProdutos = eDao.consultaProdutosNome(prod);
                    for (Produtos p : listaProdutos) {
                        Object[] linha = new Object[3];
                        linha[0] = p.getNome();
                        linha[1] = p.getCod();
                        linha[2] = p.getMarca();
                        modelo.addRow(linha);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            
            }
        } else {
            prod.setCod(tfConsultaCod.getText()+"%");
            if (tbProdutos != null) {
                DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
                if (modelo.getRowCount() > 0) {
                    modelo.setRowCount(0);
                } try {
                    EmpresasDao eDao = new EmpresasDao();
                    List<Produtos> listaProdutos = eDao.consultaProdutosCnpj(prod);
                    for (Produtos p : listaProdutos) {
                        Object[] linha = new Object[3];
                        linha[0] = p.getNome();
                        linha[1] = p.getCod();
                        linha[2] = p.getMarca();
                        modelo.addRow(linha);
                    }
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_bEnviaProdActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEmpresas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TelaEmpresas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bAtualizaEmp;
    private javax.swing.JRadioButton bAtualizaProd;
    private javax.swing.JRadioButton bCadastraEmp;
    private javax.swing.JRadioButton bCadastraProd;
    private javax.swing.JRadioButton bConsultaCnpj;
    private javax.swing.JRadioButton bConsultaCod;
    private javax.swing.JButton bConsultaEmp;
    private javax.swing.JRadioButton bConsultaNome;
    private javax.swing.JRadioButton bConsultaProd;
    private javax.swing.JButton bCreateEmp;
    private javax.swing.JButton bCreateProd;
    private javax.swing.JButton bDropEmp;
    private javax.swing.JButton bDropProd;
    private javax.swing.JButton bEnviaProd;
    private javax.swing.JButton bEnviar;
    private javax.swing.JButton bEnviarProd;
    private javax.swing.JRadioButton bExcluiEmp;
    private javax.swing.JRadioButton bExcluiProd;
    private javax.swing.JRadioButton bListarEmp;
    private javax.swing.JRadioButton bListarProd;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JComboBox<Empresas> comboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbCNPJ;
    private javax.swing.JLabel lbCodProd;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbConsultaCNPJ;
    private javax.swing.JLabel lbConsultaNome;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbMarca;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNomeFantasia;
    private javax.swing.JLabel lbNomeProd;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbRamo;
    private javax.swing.JLabel lbRazaoSocial;
    private javax.swing.JLabel lbSite;
    private javax.swing.JComboBox<Produtos> pComboBox;
    private javax.swing.JTable tbEmpresas;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfCNPJ;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfConsultaCnpj;
    private javax.swing.JTextField tfConsultaCod;
    private javax.swing.JTextField tfConsultaNome;
    private javax.swing.JTextField tfConsultaProd;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfMarca;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNomeFantasia;
    private javax.swing.JTextField tfRamo;
    private javax.swing.JTextField tfRazaoSocial;
    private javax.swing.JTextField tfSite;
    // End of variables declaration//GEN-END:variables
}
