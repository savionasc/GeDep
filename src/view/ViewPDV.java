/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProdutos;
import controller.ControllerVendas;
import controller.ControllerVendasProdutos;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelProdutos;
import model.ModelSessaoUsuario;
import model.ModelVendas;
import model.ModelVendasProdutos;
import utils.BLDatas;

/**
 *
 * @author Sávio
 */
public class ViewPDV extends javax.swing.JFrame {

    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    ModelVendas modelVendas = new ModelVendas();
    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
    ArrayList<ModelVendasProdutos> listaModelVendasProdutos = new ArrayList<>();
    BLDatas bLDatas = new BLDatas();
    ControllerVendas controllerVendas = new ControllerVendas();
    ControllerVendasProdutos controllerVendasProdutos = new ControllerVendasProdutos();
    ModelSessaoUsuario modelSessaoUsuario = new ModelSessaoUsuario();
    int quantidade;
    private ViewPagamentoPDV viewPagamentoPDV;
            
    /**
     * Creates new form ViewPDV
     */
    public ViewPDV() {
        initComponents();
        setLocationRelativeTo(null);
        quantidade = 1;
        setarOperador();
        this.viewPagamentoPDV = new ViewPagamentoPDV(this, true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlOperador = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jtfValorBruto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtProdutos = new javax.swing.JTable();
        jtfCodigoProduto = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmiExcluir = new javax.swing.JMenuItem();
        jmiAddQuantidade = new javax.swing.JMenuItem();
        jmiVenda = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmiSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PDV");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Sitka Banner", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 51, 51));
        jLabel13.setText("GeDep");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Caixa:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Operador:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Status");

        jLabel4.setText("jLabel4");

        jlOperador.setText("Operador");

        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jlOperador))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlOperador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Valor Bruto");

        jtfValorBruto.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Comandos:");

        jLabel9.setText("F3 Quantidade");

        jLabel10.setText("F4 Finalizar Venda");

        jLabel11.setText("F5 Pesquisar Produto");

        jLabel12.setText("F8 Sair");

        jLabel14.setText("F2 Excluir");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtfValorBruto))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel8)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfValorBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addGap(15, 15, 15)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jtProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Código", "Nome", "Quantidade", "Valor Unit.", "Valor Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtProdutos);
        if (jtProdutos.getColumnModel().getColumnCount() > 0) {
            jtProdutos.getColumnModel().getColumn(0).setPreferredWidth(20);
            jtProdutos.getColumnModel().getColumn(1).setPreferredWidth(20);
            jtProdutos.getColumnModel().getColumn(2).setPreferredWidth(300);
            jtProdutos.getColumnModel().getColumn(3).setPreferredWidth(20);
            jtProdutos.getColumnModel().getColumn(4).setPreferredWidth(40);
            jtProdutos.getColumnModel().getColumn(5).setPreferredWidth(40);
        }

        jtfCodigoProduto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfCodigoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfCodigoProdutoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtfCodigoProduto)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jtfCodigoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        jMenu1.setText("Arquivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, 0));
        jMenuItem1.setText("Sair");
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Comandos");

        jmiExcluir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jmiExcluir.setText("Excluir F2");
        jmiExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExcluirActionPerformed(evt);
            }
        });
        jMenu2.add(jmiExcluir);

        jmiAddQuantidade.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        jmiAddQuantidade.setText("Quantidade F3");
        jmiAddQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAddQuantidadeActionPerformed(evt);
            }
        });
        jMenu2.add(jmiAddQuantidade);

        jmiVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        jmiVenda.setText("Finalizar Venda F4");
        jmiVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVendaActionPerformed(evt);
            }
        });
        jMenu2.add(jmiVenda);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem4.setText("Pesquisar Produtos F5");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jmiSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        jmiSair.setText("Sair F8");
        jmiSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSairActionPerformed(evt);
            }
        });
        jMenu2.add(jmiSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiAddQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAddQuantidadeActionPerformed
        // TODO add your handling code here:
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade:"));
        System.out.println("quantidade é: "+quantidade);
    }//GEN-LAST:event_jmiAddQuantidadeActionPerformed

    private void jmiVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVendaActionPerformed
        // TODO add your handling code here:
        viewPagamentoPDV.setValorTotal(Float.parseFloat(jtfValorBruto.getText()));
        viewPagamentoPDV.setTextFildValorTotal();
        viewPagamentoPDV.setVisible(true);
        
        
        
        System.out.println(viewPagamentoPDV.getValorTotal());
        System.out.println(viewPagamentoPDV.getDesconto());
        System.out.println(viewPagamentoPDV.getFormaPagamento());
        System.out.println(viewPagamentoPDV.getTroco());
        System.out.println(viewPagamentoPDV.getValorRecebido());
        if(viewPagamentoPDV.isPago()){
            salvarVenda();
        }else{
            JOptionPane.showMessageDialog(this, "Você cancelou o pagamento!");
        }

    }//GEN-LAST:event_jmiVendaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jmiSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jmiSairActionPerformed

    private void jmiExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExcluirActionPerformed
        // TODO add your handling code here:
        int quantLinha = jtProdutos.getRowCount();
        if(quantLinha < 1){
            JOptionPane.showMessageDialog(this, "Não existe itens para excluir!");
        }else{        
            DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
            int linha = Integer.parseInt(JOptionPane.showInputDialog("Informe o item que deseja excluir"));
            modelo.removeRow(linha-1);
            jtfValorBruto.setText(somaValorTotal() + "");

            for (int i = 0; i < jtProdutos.getRowCount(); i++) {
                modelo.setValueAt(i+1, i, 0);
            }
        }
    }//GEN-LAST:event_jmiExcluirActionPerformed

    private void jtfCodigoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfCodigoProdutoKeyReleased
        // TODO add your handling code here:
        pegarConteudo(evt);
    }//GEN-LAST:event_jtfCodigoProdutoKeyReleased
    private void salvarVenda(){
        int codigoProduto = 0, codigoVenda = 0;
        modelVendas = new ModelVendas();
        modelVendas.setCliente(1);
        try {
            modelVendas.setVenDataVenda(bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
        } catch (Exception ex) {
            Logger.getLogger(ViewPDV.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        modelVendas.setVenValorBruto(Double.parseDouble(jtfValorBruto.getText()));
        modelVendas.setVenDesconto(viewPagamentoPDV.getDesconto());
        modelVendas.setVenValorLiquido(viewPagamentoPDV.getValorTotal());

        //Salvar venda
        codigoVenda = controllerVendas.salvarVendasController(modelVendas);
        
        int count = jtProdutos.getRowCount();
        for (int i = 0; i < count; i++) {
            codigoProduto = (int) jtProdutos.getValueAt(i, 1);

            modelVendasProdutos = new ModelVendasProdutos();
            modelProdutos = new ModelProdutos();
            modelVendasProdutos.setProduto(codigoProduto);
            modelVendasProdutos.setVendas(codigoVenda);
            modelVendasProdutos.setVenProValor((double) jtProdutos.getValueAt(i, 4));
            modelVendasProdutos.setVenProQuantidade(Integer.parseInt(jtProdutos.getValueAt(i, 3).toString()));

            //produto
            modelProdutos.setIdProduto(codigoProduto);
            modelProdutos.setProEstoque(controllerProdutos.retornarProdutoController(codigoProduto).getProEstoque()
                            - Integer.parseInt(jtProdutos.getValueAt(i, 3).toString()));
            listaModelVendasProdutos.add(modelVendasProdutos);
            listaModelProdutos.add(modelProdutos);
        }
        
        //salvar os produtos da venda
        if(controllerVendasProdutos.salvarVendasProdutosController(listaModelVendasProdutos)){
            //alterar o estoque de produtos
            controllerProdutos.alterarEstoqueProdutoController(listaModelProdutos);
            JOptionPane.showMessageDialog(this, "Deu certo a venda!");
            quantidade = 1;
            limparTela();
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao salvar os produtos da venda!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Efetua a limpeza da tela após terminar a venda
     */
    private void limparTela(){
        jtfValorBruto.setText("");
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        modelo.setNumRows(0);
    }
    
    private void pegarConteudo(java.awt.event.KeyEvent e){
        DefaultTableModel modelo = (DefaultTableModel) jtProdutos.getModel();
        if(e.getKeyCode() == java.awt.event.KeyEvent.VK_ENTER){
            try {
                modelProdutos = controllerProdutos.retornarProdutoController(Integer.parseInt(jtfCodigoProduto.getText()));
            
                modelo.addRow(new Object[]{
                    modelo.getRowCount()+1,
                    modelProdutos.getIdProduto(),
                    modelProdutos.getProNome(),
                    quantidade,
                    modelProdutos.getProValor(),
                    modelProdutos.getProValor() * quantidade
                });
                jtfValorBruto.setText(somaValorTotal()+"");
                jtfCodigoProduto.setText("");
                quantidade = 1;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Você deve informar apenas números nesse campo", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private float somaValorTotal(){
        float soma = 0, valor = 0;
        int count = jtProdutos.getRowCount();
        
        for (int i = 0; i < count; i++) {
            valor = Float.parseFloat(String.valueOf(jtProdutos.getValueAt(i, 5)));
            soma += valor;
        }
        return soma;
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
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPDV().setVisible(true);
            }
        });
    }
    
    private void setarOperador(){
         jlOperador.setText(ModelSessaoUsuario.nome);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlOperador;
    private javax.swing.JMenuItem jmiAddQuantidade;
    private javax.swing.JMenuItem jmiExcluir;
    private javax.swing.JMenuItem jmiSair;
    private javax.swing.JMenuItem jmiVenda;
    private javax.swing.JTable jtProdutos;
    private javax.swing.JFormattedTextField jtfCodigoProduto;
    private javax.swing.JTextField jtfValorBruto;
    // End of variables declaration//GEN-END:variables
}
