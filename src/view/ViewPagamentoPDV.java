/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFormaPagamento;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JComponent;
import javax.swing.JTextField;
import model.ModelFormaPagamento;
import util.BLMascaras;

/**
 *
 * @author Sávio
 */
public class ViewPagamentoPDV extends javax.swing.JDialog {
    ArrayList<ModelFormaPagamento> listaModelFormaPagamentos = new ArrayList<>();
    ControllerFormaPagamento controllerFormaPagamento = new ControllerFormaPagamento();
    private float valorTotal;
    private float desconto;
    private float valorRecebido;
    private float troco;
    private String formaPagamento;
    private boolean pago;
    private BLMascaras bl = new BLMascaras();
    ArrayList<JComponent> campos = new ArrayList<>();
    
    /**
     * Creates new form ViewPagamentoPDV
     */
    public ViewPagamentoPDV(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        listaFormaPagamento();
        this.setPago(false);
        campos.add(jtfSubtotal);
        campos.add(jcbPagamento);
        campos.add(jtfDesconto);
        campos.add(jtfValorRecebido);
        campos.add(jtfTroco);
        
        calcularPagamento();
        jcbPagamento.requestFocus();
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
        jtfTroco = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jlValorTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbOK = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtfSubtotal = new javax.swing.JFormattedTextField();
        jtfDesconto = new javax.swing.JFormattedTextField();
        jcbPagamento = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfValorRecebido = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtfTroco.setDisabledTextColor(new java.awt.Color(0, 255, 0));
        jtfTroco.setEnabled(false);
        jtfTroco.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtfTroco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfTrocoKeyReleased(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor Total a Pagar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jlValorTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlValorTotal.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlValorTotal)
                .addGap(275, 275, 275))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlValorTotal)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Troco:");

        jbOK.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jbOK.setText("OK");
        jbOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOKActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 255, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Subtotal:");

        jtfSubtotal.setEnabled(false);
        jtfSubtotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfSubtotal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfSubtotalKeyReleased(evt);
            }
        });

        jtfDesconto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfDescontoFocusLost(evt);
            }
        });
        jtfDesconto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescontoActionPerformed(evt);
            }
        });
        jtfDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDescontoKeyReleased(evt);
            }
        });

        jcbPagamento.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jcbPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcbPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPagamentoActionPerformed(evt);
            }
        });
        jcbPagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jcbPagamentoKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Pagamento:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Desconto:");

        jtfValorRecebido.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jtfValorRecebido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfValorRecebidoFocusLost(evt);
            }
        });
        jtfValorRecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfValorRecebidoActionPerformed(evt);
            }
        });
        jtfValorRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfValorRecebidoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Valor Recebido:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jcbPagamento, javax.swing.GroupLayout.Alignment.LEADING, 0, 381, Short.MAX_VALUE)
                    .addComponent(jtfDesconto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfValorRecebido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtfSubtotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jtfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jbOK, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jbOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
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
    }// </editor-fold>//GEN-END:initComponents

    private void jbOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOKActionPerformed
        // finaliza o pagamento
        finalizarPagamento();
        
    }//GEN-LAST:event_jbOKActionPerformed

    private void jtfDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfDescontoFocusLost
        // TODO add your handling code here:
        jtfDesconto.setText(bl.converterVirgulaParaPonto(jtfDesconto.getText()));
        calcularPagamento();
    }//GEN-LAST:event_jtfDescontoFocusLost

    private void jtfValorRecebidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfValorRecebidoFocusLost
        // TODO add your handling code here:
        jtfValorRecebido.setText(bl.converterVirgulaParaPonto(jtfValorRecebido.getText()));
        calcularPagamento();
    }//GEN-LAST:event_jtfValorRecebidoFocusLost

    private void jcbPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPagamentoActionPerformed
        // TODO add your handling code here:
        jtfDesconto.requestFocus();
    }//GEN-LAST:event_jcbPagamentoActionPerformed

    private void jtfDescontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescontoActionPerformed
        // TODO add your handling code here:
        jtfValorRecebido.requestFocus();
    }//GEN-LAST:event_jtfDescontoActionPerformed

    private void jtfValorRecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfValorRecebidoActionPerformed
        // TODO add your handling code here:
        finalizarPagamento();
    }//GEN-LAST:event_jtfValorRecebidoActionPerformed

    private void jtfSubtotalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfSubtotalKeyReleased
        // TODO add your handling code here:
        navegacao(0, evt);
    }//GEN-LAST:event_jtfSubtotalKeyReleased

    private void jcbPagamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jcbPagamentoKeyReleased
        // TODO add your handling code here:
        navegacao(1, evt);
    }//GEN-LAST:event_jcbPagamentoKeyReleased

    private void jtfDescontoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDescontoKeyReleased
        // TODO add your handling code here:
        navegacao(2, evt);
    }//GEN-LAST:event_jtfDescontoKeyReleased

    private void jtfValorRecebidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfValorRecebidoKeyReleased
        // TODO add your handling code here:
        navegacao(3, evt);
    }//GEN-LAST:event_jtfValorRecebidoKeyReleased

    private void jtfTrocoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfTrocoKeyReleased
        // TODO add your handling code here:
        navegacao(4, evt);
    }//GEN-LAST:event_jtfTrocoKeyReleased

    private void navegacao(int codCampo, KeyEvent evt) {
        JComponent c = campos.get(codCampo);
        //JOptionPane.showMessageDialog(null, c.getText());
        if(codCampo != 5 && evt.getKeyCode() == KeyEvent.VK_DELETE){
            ((JTextField) c).setText("");
        }
        
        try{
            if(evt.getKeyCode() == KeyEvent.VK_LEFT){
                JComponent campo = campos.get(codCampo-1);
                if(campo.isEnabled())
                    campos.get(codCampo-1).requestFocus();
            }
            
            if(evt.getKeyCode() == KeyEvent.VK_RIGHT){
                JComponent campo = campos.get(codCampo+1);
                if(campo.isEnabled())
                    campos.get(codCampo+1).requestFocus();
            }
        }catch(Exception e){
            campos.get(codCampo).requestFocus();
        }
    }
    
    private void finalizarPagamento(){
        this.desconto = Float.parseFloat(this.jtfDesconto.getText());
        this.valorRecebido = Float.parseFloat(this.jtfValorRecebido.getText());
        this.troco = Float.parseFloat(this.jtfTroco.getText());
        this.valorTotal = Float.parseFloat(this.jlValorTotal.getText());
        this.formaPagamento = jcbPagamento.getSelectedItem().toString();
        this.setPago(true);
        dispose();
    }
    
    //calcula o valor total a pagar e troco
    private void calcularPagamento(){
        float subTotal, desconto, recebido, pagar, troco;
        
        try{
            subTotal = Float.parseFloat(jtfSubtotal.getText());
        }catch(Exception e){
            subTotal = 0;
        }
        
        try{
            desconto = Float.parseFloat(jtfDesconto.getText());
        }catch(Exception e){
            desconto = 0;
            jtfDesconto.setText("0");
        }
        
        try{
            recebido = Float.parseFloat(jtfValorRecebido.getText());
        }catch(Exception e){
            recebido = 0;
            jtfValorRecebido.setText("0");
        }

        
        //calcular valor a pagar
        pagar = subTotal - desconto;
        jlValorTotal.setText(bl.arredondamentoComPontoDuasCasasString(pagar)+"");
        
        //calcular troco
        troco = recebido - pagar;
        
        jtfTroco.setText(bl.arredondamentoComPontoDuasCasasString(troco)+"");
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
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPagamentoPDV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewPagamentoPDV dialog = new ViewPagamentoPDV(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    /**
     * Preenche o combobox com todos as formas de pagamento
     */
    private void listaFormaPagamento(){
        listaModelFormaPagamentos = controllerFormaPagamento.getListaFormaPagamentoController();
        jcbPagamento.removeAllItems();
        for (int i = 0; i < listaModelFormaPagamentos.size(); i++) {
            jcbPagamento.addItem(listaModelFormaPagamentos.get(i).getForPagDescricao());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton jbOK;
    private javax.swing.JComboBox<String> jcbPagamento;
    private javax.swing.JLabel jlValorTotal;
    private javax.swing.JFormattedTextField jtfDesconto;
    private javax.swing.JFormattedTextField jtfSubtotal;
    private javax.swing.JFormattedTextField jtfTroco;
    private javax.swing.JFormattedTextField jtfValorRecebido;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the valorTotal
     */
    public float getValorTotal() {
        return valorTotal;
    }

    /**
     * @param valorTotal the valorTotal to set
     */
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    /**
     * @return the desconto
     */
    public float getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the valorRecebido
     */
    public float getValorRecebido() {
        return valorRecebido;
    }

    /**
     * @param valorRecebido the valorRecebido to set
     */
    public void setValorRecebido(float valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    /**
     * @return the troco
     */
    public float getTroco() {
        return troco;
    }

    /**
     * @param troco the troco to set
     */
    public void setTroco(float troco) {
        this.troco = troco;
    }
    
    public void setTextFildValorTotal(){
        this.jtfSubtotal.setText(this.valorTotal + "");
    }

    /**
     * @return the formaPagamento
     */
    public String getFormaPagamento() {
        return formaPagamento;
    }

    /**
     * @param formaPagamento the formaPagamento to set
     */
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    /**
     * @return the pago
     */
    public boolean isPago() {
        return pago;
    }

    /**
     * @param pago the pago to set
     */
    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
