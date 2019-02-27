/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javafx.scene.paint.Color;

/**
 *
 * @author Marcio
 */
public class TelaAdmin extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaAdmin() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setUndecorated(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrincipal = new javax.swing.JDesktopPane();
        btnFuncionario = new javax.swing.JButton();
        btnFornecedor = new javax.swing.JButton();
        btnRelatorio = new javax.swing.JButton();
        btnProduto = new javax.swing.JButton();
        btnXXX = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        JM_cadastro = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jpPrincipal.setLayout(new javax.swing.BoxLayout(jpPrincipal, javax.swing.BoxLayout.LINE_AXIS));

        btnFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/User-Group-icon.png"))); // NOI18N
        btnFuncionario.setToolTipText("Cadastrar Funcionário");
        btnFuncionario.setBorderPainted(false);
        btnFuncionario.setMaximumSize(new java.awt.Dimension(115, 115));
        btnFuncionario.setMinimumSize(new java.awt.Dimension(115, 115));
        btnFuncionario.setPreferredSize(new java.awt.Dimension(115, 115));
        btnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionarioActionPerformed(evt);
            }
        });

        btnFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/telaForn.png"))); // NOI18N
        btnFornecedor.setToolTipText("Fornecedor");
        btnFornecedor.setMaximumSize(new java.awt.Dimension(115, 115));
        btnFornecedor.setMinimumSize(new java.awt.Dimension(115, 115));
        btnFornecedor.setPreferredSize(new java.awt.Dimension(115, 115));
        btnFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFornecedorActionPerformed(evt);
            }
        });

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lista.png"))); // NOI18N
        btnRelatorio.setToolTipText("Relatórios");
        btnRelatorio.setMaximumSize(new java.awt.Dimension(115, 115));
        btnRelatorio.setMinimumSize(new java.awt.Dimension(115, 115));
        btnRelatorio.setPreferredSize(new java.awt.Dimension(115, 115));
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });

        btnProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/voltar.png"))); // NOI18N
        btnProduto.setToolTipText("Voltar");
        btnProduto.setMaximumSize(new java.awt.Dimension(115, 115));
        btnProduto.setMinimumSize(new java.awt.Dimension(115, 115));
        btnProduto.setPreferredSize(new java.awt.Dimension(115, 115));
        btnProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutoActionPerformed(evt);
            }
        });

        btnXXX.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos_tela.png"))); // NOI18N
        btnXXX.setToolTipText("Produtos");
        btnXXX.setMaximumSize(new java.awt.Dimension(115, 115));
        btnXXX.setMinimumSize(new java.awt.Dimension(115, 115));
        btnXXX.setPreferredSize(new java.awt.Dimension(115, 115));
        btnXXX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXXXActionPerformed(evt);
            }
        });

        JM_cadastro.setText("Cadastros");
        jMenuBar1.add(JM_cadastro);

        jMenu2.setText("Relatórios");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Vendas");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Ordem de Serviço");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("Sair");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXXX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRelatorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrincipal)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnXXX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRelatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                .addComponent(btnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setSize(new java.awt.Dimension(735, 932));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed


    }//GEN-LAST:event_jMenu5ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu5MouseClicked

    private void btnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionarioActionPerformed
        TelaFuncionario obj = new TelaFuncionario();
        if (jpPrincipal.getAllFrames().length == 0){
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
        else{
            jpPrincipal.removeAll();
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnFuncionarioActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
       ListasVendas_Compras_Ordem obj = new ListasVendas_Compras_Ordem();
        if (jpPrincipal.getAllFrames().length == 0){
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
        else{
            jpPrincipal.removeAll();
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnXXXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXXXActionPerformed
        TelaProduto obj = new TelaProduto();

        if (jpPrincipal.getAllFrames().length == 0){
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
        else{
            jpPrincipal.removeAll();
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnXXXActionPerformed

    private void btnFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFornecedorActionPerformed
        TelaFornecedor obj = new TelaFornecedor();
        if (jpPrincipal.getAllFrames().length == 0){
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
        else{
            jpPrincipal.removeAll();
            jpPrincipal.add(obj);
            obj.setVisible(true);
        }
    }//GEN-LAST:event_btnFornecedorActionPerformed

    private void btnProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutoActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdmin().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JM_cadastro;
    private javax.swing.JButton btnFornecedor;
    private javax.swing.JButton btnFuncionario;
    private javax.swing.JButton btnProduto;
    private javax.swing.JButton btnRelatorio;
    private javax.swing.JButton btnXXX;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jpPrincipal;
    // End of variables declaration//GEN-END:variables
}
