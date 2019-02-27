package Controller;

import Models.DAO;
import java.util.Date;
import javax.swing.JOptionPane;

public class ProdutoController {

    public String salvarProduto(String nomeProduto, String descricao, String armazemLocal,
            String tipoProduto, String totalImposto, String icms, String iss,
            String ipi, String fkFornecedorProduto,
            String dataCompra, String qtdEstoque, String valorCusto, String valorVenda,
            String situacaoProduto, String marca, String lote) {

        DAO dao = new DAO();

        JOptionPane.showMessageDialog(null, dataCompra);
        dao.produto.setNomeProduto(nomeProduto);
        dao.produto.setDescricao(descricao);
        dao.produto.setArmazemLocal(armazemLocal);
        dao.produto.setTipoProduto(tipoProduto);
        dao.produto.setTotalImposto(totalImposto);
        dao.produto.setIcms(icms);
        dao.produto.setIss(iss);
        dao.produto.setIpi(ipi);
        dao.produto.setFKfornecedor(fkFornecedorProduto);
        
        dao.lote.setDataCompra(dataCompra);
        dao.lote.setQuantidade(qtdEstoque);
        dao.lote.setValorCusto(valorCusto);
        dao.lote.setValorVenda(valorVenda);
        dao.lote.setSituacaoProduto(situacaoProduto);
        dao.lote.setMarca(marca);
        dao.lote.setLote(lote);

        JOptionPane.showMessageDialog(null, dao.atualizarProduto(DAO.INCLUSAOPRODUTO));
        String msgInclusao = "";
        return msgInclusao;
    }

    public String alterarProduto(String idProduto, String nomeProduto, String fabricanteProduto,
            String marcaProduto, String descricaoProduto, Date dataCompraProduto, int qtdEstoqueProduto,
            Double valorCustoProduto, Double valorVendaProduto, int situaçaoProduto, String armazemLocalProduto, int fkFornecedorProduto) {

        DAO dao = new DAO();

        String msgInclusao = dao.atualizarProduto(DAO.ALTERACAOPRODUTO);
        return msgInclusao;
    }
}
