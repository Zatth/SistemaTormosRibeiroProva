/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClienteIar;
import bean.CompraProdutoIar;
import bean.ProdutoZht;
import dao.ClienteIarDAO;
import dao.ProdutoZhtDAO;
import java.util.List;
import tools.Util;

/**
 *
 * @author Zah
 */
public class JDlgCompraProdutoIar extends javax.swing.JDialog {

    /**
     * Creates new form JDlgCompraProdutoIar
     */
    
     private JDlgComprasIar jDlgComprasIar;
    ControllerCompraProdutoIar controllerCompraProdutoIar;
    public JDlgCompraProdutoIar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Cadastro Compra Produto");
        
        
        setLocationRelativeTo(null);
        ProdutoZhtDAO produtoDAO = new ProdutoZhtDAO();
        List lista = produtoDAO.listAll();
        for (int i = 0; i < lista.size(); i++) {
            jCboProduto.addItem((ProdutoZht) lista.get(i)); // for para chamar o list dos clientes PQ TA DANDO ERROOOOOOOOOO

        }
         Util.habilitar(false, jTxtQuant, jTxtTotal, jTxtValorUnitario);
    }
    public void setTelaAnterior(JDlgComprasIar jDlgComprasIar) {
        this.jDlgComprasIar = jDlgComprasIar;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxtQuant = new javax.swing.JTextField();
        jTxtValorUnitario = new javax.swing.JTextField();
        jTxtTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtnCancelar = new javax.swing.JButton();
        jBtnOk = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jCboProduto = new javax.swing.JComboBox<ProdutoZht>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTxtQuant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtQuantActionPerformed(evt);
            }
        });
        jTxtQuant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtQuantKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTxtQuantKeyTyped(evt);
            }
        });

        jTxtValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtValorUnitarioActionPerformed(evt);
            }
        });
        jTxtValorUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTxtValorUnitarioKeyReleased(evt);
            }
        });

        jLabel2.setText("Quantidade");

        jLabel3.setText("Valor unitário");

        jLabel4.setText("Total");

        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jBtnOk.setText("OK");
        jBtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnOkActionPerformed(evt);
            }
        });

        jLabel1.setText("Painel");

        jCboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCboProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jCboProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTxtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtnOk)
                .addGap(11, 11, 11)
                .addComponent(jBtnCancelar)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCboProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnOk)
                    .addComponent(jBtnCancelar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtQuantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtQuantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtQuantActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jBtnCancelarActionPerformed

    private void jBtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnOkActionPerformed
        // TODO add your handling code here:
        CompraProdutoIar compraProdutoIar = new CompraProdutoIar();
        compraProdutoIar.setProdutoZht((ProdutoZht) jCboProduto.getSelectedItem());
        
        compraProdutoIar.setQuantidadeIar(Util.strToInt(jTxtQuant.getText()));
        //compraProdutoIar.setPrecoProdutoZht(Util.strToDouble(jTxtValorUnitario.getText()));
      //  compraProdutoIar.setMeccTotal(Util.strToDouble(jTxtMecc_Total.getText()));
        //jDlgMecc_Compra.controllerCompraProduto.addBean(comprasProdutos);
        setVisible(false);

    }//GEN-LAST:event_jBtnOkActionPerformed


    private void jCboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCboProdutoActionPerformed
        // TODO add your handling code here:
        ProdutoZht produtos = (ProdutoZht) jCboProduto.getSelectedItem();
        jTxtQuant.setText("1");
        jTxtValorUnitario.setText(Util.doubleToStr(produtos.getPrecoProdutoZht()));
        jTxtTotal.setText(Util.doubleToStr(produtos.getPrecoProdutoZht()));
    }//GEN-LAST:event_jCboProdutoActionPerformed

    private void jTxtQuantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtQuantKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtQuantKeyTyped

    private void jTxtValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtValorUnitarioActionPerformed

    private void jTxtValorUnitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtValorUnitarioKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtValorUnitarioKeyReleased

    private void jTxtQuantKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTxtQuantKeyReleased
       if (jTxtQuant.getText().equals("")){
            jTxtTotal.setText("");
        } else {
            double unitario = Util.strToDouble((jTxtValorUnitario.getText()));
            int quant = Util.strToInt(jTxtQuant.getText());
            jTxtTotal.setText(Util.doubleToStr(quant * unitario));
       }
    }//GEN-LAST:event_jTxtQuantKeyReleased

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
            java.util.logging.Logger.getLogger(JDlgCompraProdutoIar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgCompraProdutoIar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgCompraProdutoIar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgCompraProdutoIar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgCompraProdutoIar dialog = new JDlgCompraProdutoIar(new javax.swing.JFrame(), true);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnOk;
    private javax.swing.JComboBox<ProdutoZht> jCboProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTxtQuant;
    private javax.swing.JTextField jTxtTotal;
    private javax.swing.JTextField jTxtValorUnitario;
    // End of variables declaration//GEN-END:variables
}
