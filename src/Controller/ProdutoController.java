
package Controller;

import Models.DAO;
import java.util.Date;


public class ProdutoController {
    public String salvarProduto( String nomeProduto, String fabricanteProduto, String marcaProduto, 
            String descricaoProduto, Date dataCompraProduto, int qtdEstoqueProduto, Double valorCustoProduto, 
            Double valorVendaProduto, int situaçaoProduto, String armazemLocalProduto, int fkFornecedorProduto ){
        DAO dao = new DAO();
        dao.produto.setNomeProduto(nomeProduto);
        dao.produto.setFabricanteProduto(fabricanteProduto);
        dao.produto.setMarcaProduto(marcaProduto);
        dao.produto.setDescricaoProduto(descricaoProduto);
        dao.produto.setDataCompraProduto(dataCompraProduto);
        dao.produto.setQtdEstoqueProduto(qtdEstoqueProduto);
        dao.produto.setValorCustoProduto(valorCustoProduto);
        dao.produto.setValorVendaProduto(valorVendaProduto);
        dao.produto.setSituaçaoProduto(situaçaoProduto);
        dao.produto.setFkFornecedorProduto(fkFornecedorProduto);
    
        String msgInclusao = dao.atualizar(DAO.INCLUSAOPRODUTO);
        return msgInclusao;
    }
     
    public String alterarProduto(String idProduto, String nomeProduto, String fabricanteProduto, 
            String marcaProduto, String descricaoProduto, Date dataCompraProduto, int qtdEstoqueProduto, 
            Double valorCustoProduto, Double valorVendaProduto, int situaçaoProduto, String armazemLocalProduto, int fkFornecedorProduto ){
       
        DAO dao = new DAO();
        dao.produto.setIdProduto(idProduto);
        dao.produto.setNomeProduto(nomeProduto);
        dao.produto.setFabricanteProduto(fabricanteProduto);
        dao.produto.setMarcaProduto(marcaProduto);
        dao.produto.setDescricaoProduto(descricaoProduto);
        dao.produto.setDataCompraProduto(dataCompraProduto);
        dao.produto.setQtdEstoqueProduto(qtdEstoqueProduto);
        dao.produto.setValorCustoProduto(valorCustoProduto);
        dao.produto.setValorVendaProduto(valorVendaProduto);
        dao.produto.setSituaçaoProduto(situaçaoProduto);
        dao.produto.setFkFornecedorProduto(fkFornecedorProduto);
        
        String msgInclusao = dao.atualizar(DAO.ALTERACAOPRODUTO);
        return msgInclusao;
    }
}
