/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.CompraIar;
import bean.FuncionarioIar;
import dao.CompraIarDAO;
import dao.FuncionarioIarDAO;
import java.util.List;
import javax.swing.JOptionPane;
import tools.Util;

/**
 *
 * @author Zah
 */
public class JDlgComprasIar extends javax.swing.JDialog {
 
    boolean incluir; // criação de variavel global
    /**
     * Creates new form JDlgComprasIar
     */
    public JDlgComprasIar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Compras");
         Util.habilitar(false, jCboFuncionario, jTxtCodigo, jFmtData, jTxtCodigo,
                 jBtnConfirmar, jBtnCancelar, jCboPagamento);
          FuncionarioIarDAO funcionarioIarDao = new FuncionarioIarDAO();
        List lista = funcionarioIarDao.listAll();
        for (int i = 0; i < lista.size(); i++) {
            //jCboFuncionario.addItem((Funcionario)lista.get(i)); // for para chamar o list dos clientes 
            
        }
     
    }

    public CompraIar viewBean() {
    CompraIar compra = new CompraIar();
    compra.setIdCompraIar(Util.strToInt(jTxtCodigo.getText()));
    compra.setFuncionarioIar((FuncionarioIar)jCboFuncionario.getSelectedItem());
  // compra.setPagamentoCompraIarjCboPagamento.getSelectedItem());

    //  vendas.setClienteIar((ClienteIar) jCboClientes.getSelectedItem());
    
   // vendas.setTotal(Util.strToDouble(jTxtTotal.getText()));
        return null;
    
}
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFmtData = new javax.swing.JFormattedTextField();
        jButton3 = new javax.swing.JButton();
        jTxtCodigo = new javax.swing.JTextField();
        jCboFuncionario = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jBtnIncluir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtnConfirmar = new javax.swing.JButton();
        jBtnExcluir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jBtnAlterar3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnPesquisar = new javax.swing.JButton();
        jBtnCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jCboPagamento = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jFmtData.setText("jFormattedTextField1");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTxtCodigo.setText("jTextField2");

        jCboFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("ID. Compra");

        jBtnIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluir.png"))); // NOI18N
        jBtnIncluir.setText("Incluir");
        jBtnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnIncluirActionPerformed(evt);
            }
        });

        jLabel2.setText("Data");

        jBtnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confirmar.png"))); // NOI18N
        jBtnConfirmar.setText("Confirmar");
        jBtnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConfirmarActionPerformed(evt);
            }
        });

        jBtnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Excluir.png"))); // NOI18N
        jBtnExcluir.setText("Excluir");
        jBtnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExcluirActionPerformed(evt);
            }
        });

        jLabel4.setText("Funcionário");

        jBtnAlterar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterar.png"))); // NOI18N
        jBtnAlterar3.setText("Alterar");
        jBtnAlterar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAlterar3ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jBtnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisar.png"))); // NOI18N
        jBtnPesquisar.setText("Pesquisar");
        jBtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnPesquisarActionPerformed(evt);
            }
        });

        jBtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cancelar.png"))); // NOI18N
        jBtnCancelar.setText("Cancelar");
        jBtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCancelarActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de Pagamento");

        jCboPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBtnIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnAlterar3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnConfirmar)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCboFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCboPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(78, 78, 78)
                                        .addComponent(jLabel5))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1))
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFmtData, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCboPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBtnIncluir)
                            .addComponent(jBtnAlterar3)
                            .addComponent(jBtnExcluir)
                            .addComponent(jBtnCancelar)
                            .addComponent(jBtnConfirmar)
                            .addComponent(jBtnPesquisar)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: incluir, tem q chamar a tela de pedidos produtos
        JDlgCompraProdutoIar jDlgCompraProduto = new JDlgCompraProdutoIar(null, true);
        jDlgCompraProduto.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: tem q chamar a tela de produtos
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: excluir
        //JOptionPane.showInputDialog(null, "Deseja excluir o produto?");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jBtnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnIncluirActionPerformed
        //   Util.habilitar(true,jFtmtCpf, jTxtCodigo, jTxtDataNasc, jTxtNome,jPwfSenha, jTxtApelido, jChbAtivo, jCboNivel,
            //     jBtnConfirmar, jBtnCancelar);
        // Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir,jBtnPesquisar);
        //Util.limpar(jFtmtCpf, jTxtCodigo, jTxtDataNasc, jTxtNome, jPwfSenha, jTxtApelido, jChbAtivo, jCboNivel);
        //        habilitar();;

        // TODO add your handling code here:
        incluir = true;
        Util.habilitar(true, jCboFuncionario, jTxtCodigo, jCboPagamento, jCboFuncionario, jFmtData, jTxtCodigo,
            jBtnConfirmar, jBtnCancelar); // TEM Q COLOCAR AS ÁREAS CERTAS AQUI!!!
    }//GEN-LAST:event_jBtnIncluirActionPerformed

    private void jBtnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConfirmarActionPerformed
        //        UsuariosIar usuarios = new UsuariosIar();
        //        int cod = Integer.valueOf(jTxtCodigo.getText());
        //        usuarios.setIdusuarios(cod);
        //        usuarios.setNome(jTxtNome.getText());
        //        usuarios.setApelido(jTxtApelido.getText());
        //        usuarios.setCpf(jFtmtCpf.getText());
        //        usuarios.setDataNascimento(null);
        //        usuarios.setSenha(jPwfSenha.getText());
        //        usuarios.setNivel((int) jCboNivel.getSelectedIndex());
        //
        //        if (jChbAtivo.isSelected() == true){
            //        usuarios.setAtivo("S");
            //        }else{ usuarios.setAtivo("N");}
        //
        //        UsuariosIarDao usuariosDao = new UsuariosIarDao();
        //        usuariosDao.insert(usuarios);
        //
        // Util.habilitar(false,jFtmtCpf, jTxtCodigo, jTxtDataNasc, jTxtNome, jPwfSenha, jTxtApelido, jChbAtivo, jCboNivel,
            //    jBtnConfirmar, jBtnCancelar);
        // Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir,jBtnPesquisar);
        //        desabilitar();
        // limpar();
        CompraIar compra = viewBean();
        CompraIarDAO compraDAO = new CompraIarDAO();
         if (incluir == true) {
            compraDAO.insert(compra);
        } else {
            compraDAO.update(compra);
        }
        
       
    }//GEN-LAST:event_jBtnConfirmarActionPerformed

    private void jBtnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExcluirActionPerformed
        //int resp = JOptionPane.showConfirmDialog(null, "Confirma exclusão", "Deletar o registro", JOptionPane.YES_NO_OPTION);
        // if (resp == JOptionPane.YES_OPTION){
            //   UsuariosIar usuarios = new UsuariosIar();
            //  int cod = Integer.valueOf(jTxtCodigo.getText());
            //  usuarios.setIdusuarios(cod);
            // usuarios.setNome(jTxtNome.getText());
            // usuarios.setApelido(jTxtApelido.getText());
            // usuarios.setCpf(jFtmtCpf.getText());
            // usuarios.setDataNascimento(null);
            // usuarios.setSenha(jPwfSenha.getText());
            //usuarios.setNivel((int) jCboNivel.getSelectedIndex());

            //if (jChbAtivo.isSelected() == true){
                //     usuarios.setAtivo("S");
                //}else{ usuarios.setAtivo("N");}

            //   UsuariosIarDao usuariosDao = new UsuariosIarDao();
            //  usuariosDao.delete(usuarios);}
        //limpar();
        JOptionPane.showInputDialog(null, "Deseja excluir o produto?");
    }//GEN-LAST:event_jBtnExcluirActionPerformed

    private void jBtnAlterar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAlterar3ActionPerformed
        //Util.habilitar(true,jFtmtCpf, jTxtCodigo, jTxtDataNasc, jTxtNome, jPwfSenha, jTxtApelido, jChbAtivo, jCboNivel,
            // jBtnConfirmar, jBtnCancelar);
        //Util.habilitar(false, jBtnIncluir, jBtnAlterar, jBtnExcluir,jBtnPesquisar);
        /// TODO add your handling code here:
        // habilitar();
        incluir = false;
    }//GEN-LAST:event_jBtnAlterar3ActionPerformed

    private void jBtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnPesquisarActionPerformed
        // TODO add your handling code here:
        //  String cad = JOptionPane.showInputDialog(null, "Entre com o código");
        //if(cad==null){
            //JOptionPane.showMessageDialog(null, "Código em branco");
            // else{
                // UsuariosIarDao usuariosDao =new UsuariosIarDao();
                // int cod = Integer.valueOf(cad);
                // UsuariosIar usuarios = (UsuariosIar) usuariosDao.list(cod);
                //
                //  jTxtCodigo.setText(cad);
                // jTxtNome.setText(usuarios.getNome());
                //// jTxtApelido.setText(usuarios.getApelido());
                //jFtmtCpf.setText(usuarios.getCpf());
                // jPwfSenha.setText(usuarios.getSenha());
                // jCboNivel.setSelectedIndex(usuarios.getNivel());
                // if (usuarios.getAtivo().equals("S") == true){
                    // jChbAtivo.setSelected(true);

                    //  }else{jChbAtivo.setSelected(false);}

                // }
    }//GEN-LAST:event_jBtnPesquisarActionPerformed

    private void jBtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCancelarActionPerformed
        //  Util.habilitar(false,jFtmtCpf, jTxtCodigo, jTxtDataNasc, jTxtNome, jPwfSenha, jTxtApelido, jChbAtivo, jCboNivel,
            //    jBtnConfirmar, jBtnCancelar);
        // Util.habilitar(true, jBtnIncluir, jBtnAlterar, jBtnExcluir,jBtnPesquisar);
        // TODO add your handling code here:
        //9+        desabilitar();
    }//GEN-LAST:event_jBtnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgComprasIar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgComprasIar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgComprasIar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgComprasIar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgComprasIar dialog = new JDlgComprasIar(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jBtnAlterar;
    private javax.swing.JButton jBtnAlterar1;
    private javax.swing.JButton jBtnAlterar2;
    private javax.swing.JButton jBtnAlterar3;
    private javax.swing.JButton jBtnCancelar;
    private javax.swing.JButton jBtnConfirmar;
    private javax.swing.JButton jBtnExcluir;
    private javax.swing.JButton jBtnIncluir;
    private javax.swing.JButton jBtnPesquisar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jCboFuncionario;
    private javax.swing.JComboBox<String> jCboPagamento;
    private javax.swing.JFormattedTextField jFmtData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTxtCodigo;
    // End of variables declaration//GEN-END:variables
}