/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ClienteController;
import Controller.ModeloTabela;
import Models.DAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;

/**
 *
 * @author 03758479100
 */
public class ListasVendas_Compras_Ordem extends javax.swing.JInternalFrame {

    int aux;
    String sql = "";

    public ListasVendas_Compras_Ordem() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLista = new javax.swing.JTable();
        BtnPDF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisLista = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbLv = new javax.swing.JCheckBox();
        cbOs = new javax.swing.JCheckBox();
        cbLc = new javax.swing.JCheckBox();
        txtData1 = new javax.swing.JFormattedTextField();
        txtData2 = new javax.swing.JFormattedTextField();

        setClosable(true);
        setTitle("RELATÓRIOS");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lista.png"))); // NOI18N

        jLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jLista);

        BtnPDF.setText("PDF");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("Período :");

        jLabel2.setText("até");

        btnPesquisLista.setText("pesquisa");
        btnPesquisLista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisListaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Gerar PDF: ");

        cbLv.setText("Lista Vendas");
        cbLv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLvActionPerformed(evt);
            }
        });

        cbOs.setText("Listar Ordem de Serviço");
        cbOs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbOsActionPerformed(evt);
            }
        });

        cbLc.setText("Listar Compras");
        cbLc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLcActionPerformed(evt);
            }
        });

        try {
            txtData1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            txtData2.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1046, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbLv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPesquisLista)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnPDF))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbOs)
                                .addGap(63, 63, 63)
                                .addComponent(cbLc)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbLv)
                    .addComponent(cbOs)
                    .addComponent(cbLc))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(btnPesquisLista)
                    .addComponent(BtnPDF)
                    .addComponent(jLabel3)
                    .addComponent(txtData1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtData2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(436, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbOsActionPerformed
        if (cbOs.isSelected()) {
            cbLv.setSelected(false);
            cbLc.setSelected(false);
            aux = 1;
        }

    }//GEN-LAST:event_cbOsActionPerformed

    private void cbLvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLvActionPerformed
        if (cbLv.isSelected()) {
            cbOs.setSelected(false);
            cbLc.setSelected(false);
            aux = 2;
        }
    }//GEN-LAST:event_cbLvActionPerformed

    private void cbLcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLcActionPerformed
        if (cbLc.isSelected()) {
            cbOs.setSelected(false);
            cbLv.setSelected(false);
            aux = 3;
        }
    }//GEN-LAST:event_cbLcActionPerformed

    private void btnPesquisListaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisListaActionPerformed
        switch (aux) {
            case 1:

                if (txtData2.getText().equals("") || txtData2.getText().equals("  /  /    ")) {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;

                    sql = "SELECT * FROM vendas inner join lotevendas on FKvendas = codVenda "
                            + "inner join lote on FKlote = idLote inner join produtos on FKprodutos = idprodutos "
                            + "where dataVenda = '" + data1 + "'";
                    preencherTabela1(sql);

                } else {

                    String A = txtData1.getText().substring(0, 2);
                    String B = txtData1.getText().substring(3, 5);
                    String C = txtData1.getText().substring(6, 10);
                    String data1 = C + "-" + B + "-" + A;

                    String D = txtData2.getText().substring(0, 2);
                    String E = txtData2.getText().substring(3, 5);
                    String F = txtData2.getText().substring(6, 10);
                    String data2 = F + "-" + E + "-" + D;

                    String sql = "SELECT * FROM `lotevendas` INNER JOIN vendas on codVenda = FKvendas INNER JOIN lote on idLote = "
                            + "FKlote INNER join produtos on idprodutos = FKprodutos BETWEEN dataVenda = '" + txtData1.getText() + "' and datavenda = '" + txtData2.getText() + "'";

                    preencherTabela1(sql);

                }

                break;

            case 2:

                break;

            case 3:

                break;

        }
    }//GEN-LAST:event_btnPesquisListaActionPerformed

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA LISTAR VENDAS">
    public void preencherTabela1(String SQL) {
        DAO dao = new DAO();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"cod", "dataVenda", "nomeProduto", "qtd", "valorParcial", "coVenda"};
        dao.executaSQL(SQL);
        try {
            dao.resultSet.first();
            do {
                dados.add(new Object[]{dao.resultSet.getString("codVenda"), dao.resultSet.getString("dataVenda"), dao.resultSet.getString("nomeProduto"),
                    dao.resultSet.getString("qtd"), dao.resultSet.getString("valorParcial"), dao.resultSet.getString("codigoVenda")});
            } while (dao.resultSet.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "Ñ DEU");
        }

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jLista.setModel(model);

        jLista.getColumnModel().getColumn(0).setPreferredWidth(50);  // define o tamanho das colunas e se será redimensionado ou não
        jLista.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jLista.getColumnModel().getColumn(1).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(1).setResizable(false);
        jLista.getColumnModel().getColumn(2).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(2).setResizable(false);
        jLista.getColumnModel().getColumn(3).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(3).setResizable(false);
        jLista.getColumnModel().getColumn(4).setPreferredWidth(110);
        jLista.getColumnModel().getColumn(4).setResizable(false);
        jLista.getColumnModel().getColumn(5).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(5).setResizable(false);

        jLista.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jLista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA LISTAR ORDEM DE SERVIÇOS">
    public void preencherTabela2(String SQL) {
        DAO dao = new DAO();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Id", "nome", "Cpf", "Rg", "Telefone", "celular", "email", "fkend",
            "idEndereço", "Cep", "bairro", "logradouro", "complemento", "numero", "cidade", "estado"};
        dao.executaSQL(SQL);
        try {
            dao.resultSet.first();
            do {
                dados.add(new Object[]{dao.resultSet.getString("idcliente"), dao.resultSet.getString("nomeCliente"), dao.resultSet.getString("cpf"),
                    dao.resultSet.getString("rg"), dao.resultSet.getString("telefone"), dao.resultSet.getString("celular"),
                    dao.resultSet.getString("email"), dao.resultSet.getString("FKendereco"), dao.resultSet.getString("idendereco"),
                    dao.resultSet.getString("cep"), dao.resultSet.getString("bairro"), dao.resultSet.getString("logradouro"),
                    dao.resultSet.getString("complemento"), dao.resultSet.getString("numero"), dao.resultSet.getString("cidade"),
                    dao.resultSet.getString("estado")});
            } while (dao.resultSet.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "Ñ DEU");
        }

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jLista.setModel(model);

        jLista.getColumnModel().getColumn(0).setPreferredWidth(50);  // define o tamanho das colunas e se será redimensionado ou não
        jLista.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jLista.getColumnModel().getColumn(1).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(1).setResizable(false);
        jLista.getColumnModel().getColumn(2).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(2).setResizable(false);
        jLista.getColumnModel().getColumn(3).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(3).setResizable(false);
        jLista.getColumnModel().getColumn(4).setPreferredWidth(110);
        jLista.getColumnModel().getColumn(4).setResizable(false);
        jLista.getColumnModel().getColumn(5).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(5).setResizable(false);
        jLista.getColumnModel().getColumn(6).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(6).setResizable(false);
        jLista.getColumnModel().getColumn(7).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(7).setResizable(false);
        jLista.getColumnModel().getColumn(8).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(8).setResizable(false);
        jLista.getColumnModel().getColumn(9).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(9).setResizable(false);
        jLista.getColumnModel().getColumn(10).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(10).setResizable(false);
        jLista.getColumnModel().getColumn(11).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(11).setResizable(false);
        jLista.getColumnModel().getColumn(12).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(12).setResizable(false);
        jLista.getColumnModel().getColumn(13).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(13).setResizable(false);
        jLista.getColumnModel().getColumn(14).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(14).setResizable(false);
        jLista.getColumnModel().getColumn(15).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(15).setResizable(false);

        jLista.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jLista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO PREENCHER TABELA LISTAR COMPAS">
    public void preencherTabela3(String SQL) {
        DAO dao = new DAO();
        ArrayList dados = new ArrayList();
        String[] colunas = new String[]{"Id", "nome", "Cpf", "Rg", "Telefone", "celular", "email", "fkend",
            "idEndereço", "Cep", "bairro", "logradouro", "complemento", "numero", "cidade", "estado"};
        dao.executaSQL(SQL);
        try {
            dao.resultSet.first();
            do {
                dados.add(new Object[]{dao.resultSet.getString("idcliente"), dao.resultSet.getString("nomeCliente"), dao.resultSet.getString("cpf"),
                    dao.resultSet.getString("rg"), dao.resultSet.getString("telefone"), dao.resultSet.getString("celular"),
                    dao.resultSet.getString("email"), dao.resultSet.getString("FKendereco"), dao.resultSet.getString("idendereco"),
                    dao.resultSet.getString("cep"), dao.resultSet.getString("bairro"), dao.resultSet.getString("logradouro"),
                    dao.resultSet.getString("complemento"), dao.resultSet.getString("numero"), dao.resultSet.getString("cidade"),
                    dao.resultSet.getString("estado")});
            } while (dao.resultSet.next());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex + "Ñ DEU");
        }

        ModeloTabela model = new ModeloTabela(dados, colunas);
        jLista.setModel(model);

        jLista.getColumnModel().getColumn(0).setPreferredWidth(50);  // define o tamanho das colunas e se será redimensionado ou não
        jLista.getColumnModel().getColumn(0).setResizable(true);  // não permite alterar o tamanho da coluna
        jLista.getColumnModel().getColumn(1).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(1).setResizable(false);
        jLista.getColumnModel().getColumn(2).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(2).setResizable(false);
        jLista.getColumnModel().getColumn(3).setPreferredWidth(50);
        jLista.getColumnModel().getColumn(3).setResizable(false);
        jLista.getColumnModel().getColumn(4).setPreferredWidth(110);
        jLista.getColumnModel().getColumn(4).setResizable(false);
        jLista.getColumnModel().getColumn(5).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(5).setResizable(false);
        jLista.getColumnModel().getColumn(6).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(6).setResizable(false);
        jLista.getColumnModel().getColumn(7).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(7).setResizable(false);
        jLista.getColumnModel().getColumn(8).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(8).setResizable(false);
        jLista.getColumnModel().getColumn(9).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(9).setResizable(false);
        jLista.getColumnModel().getColumn(10).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(10).setResizable(false);
        jLista.getColumnModel().getColumn(11).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(11).setResizable(false);
        jLista.getColumnModel().getColumn(12).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(12).setResizable(false);
        jLista.getColumnModel().getColumn(13).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(13).setResizable(false);
        jLista.getColumnModel().getColumn(14).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(14).setResizable(false);
        jLista.getColumnModel().getColumn(15).setPreferredWidth(-1);
        jLista.getColumnModel().getColumn(15).setResizable(false);

        jLista.getTableHeader().setReorderingAllowed(false);  // Não permite reordenar as colunas
        jLista.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); // Não permite redimensionar a tabela
        jLista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); // permite selecionar apenas 1 elemento da tabela
    }
    //</editor-fold>


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnPDF;
    private javax.swing.JButton btnPesquisLista;
    private javax.swing.JCheckBox cbLc;
    private javax.swing.JCheckBox cbLv;
    private javax.swing.JCheckBox cbOs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTable jLista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField txtData1;
    private javax.swing.JFormattedTextField txtData2;
    // End of variables declaration//GEN-END:variables
}
