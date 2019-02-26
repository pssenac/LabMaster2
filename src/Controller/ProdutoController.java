
package Controller;

import Models.DAO;
import java.util.Date;


public class ProdutoController {
    public String salvarProduto( String nomeProduto, String descricao, String armazemLocal, 
            String tipoProduto, String totalImposto, String icms, String iss, 
            String ipi, String fkFornecedorProduto){       
        DAO dao = new DAO();
        
        dao.produto.setNomeProduto(nomeProduto);
        dao.produto.setDescricao(descricao);
        dao.produto.setArmazemLocal(armazemLocal);
        dao.produto.setTipoProduto(tipoProduto);
        dao.produto.setTotalImposto(totalImposto);
        dao.produto.setIcms(icms);
        dao.produto.setIss(iss);
        dao.produto.setIpi(ipi);
        
    
        String msgInclusao = dao.atualizar(DAO.INCLUSAOPRODUTO);
        return msgInclusao;
    }
     
    public String alterarProduto(String idProduto, String nomeProduto, String fabricanteProduto, 
            String marcaProduto, String descricaoProduto, Date dataCompraProduto, int qtdEstoqueProduto, 
            Double valorCustoProduto, Double valorVendaProduto, int situaçaoProduto, String armazemLocalProduto, int fkFornecedorProduto ){
       
        DAO dao = new DAO();
       
        
        String msgInclusao = dao.atualizar(DAO.ALTERACAOPRODUTO);
        return msgInclusao;
    }
}
