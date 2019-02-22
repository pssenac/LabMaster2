
package Controller;

import Models.DAO;


public class OrdemProdutosController {
    
   public String salvarOrdemProdutos(int fkOrdemServicoOrdProdutos, int fkprodutosOrdProdutos, int qtdProdutoOrdProdutos, 
            double valorParcialOrdProdutos, double descontoParcialOrdProdutos ){
        DAO dao = new DAO();
        dao.ordemProdutos.setFkOrdemServicoOrdProdutos(fkOrdemServicoOrdProdutos);
        dao.ordemProdutos.setFkOrdemServicoOrdProdutos(fkprodutosOrdProdutos);
        dao.ordemProdutos.setQtdProdutoOrdProdutos(qtdProdutoOrdProdutos);
        dao.ordemProdutos.setValorParcialOrdProdutos(valorParcialOrdProdutos);
        dao.ordemProdutos.setDescontoParcialOrdProdutos(descontoParcialOrdProdutos);
    
        String msgInclusao = dao.atualizar(DAO.INCLUSAOORDEMPRODUTO);
        return msgInclusao;
    }
     
    public String alterarOrdemProdutos(int fkOrdemServicoOrdProdutos, int fkprodutosOrdProdutos, int qtdProdutoOrdProdutos, 
            double valorParcialOrdProdutos, double descontoParcialOrdProdutos ){
        DAO dao = new DAO();
        dao.ordemProdutos.setFkOrdemServicoOrdProdutos(fkOrdemServicoOrdProdutos);
        dao.ordemProdutos.setFkOrdemServicoOrdProdutos(fkprodutosOrdProdutos);
        dao.ordemProdutos.setQtdProdutoOrdProdutos(qtdProdutoOrdProdutos);
        dao.ordemProdutos.setValorParcialOrdProdutos(valorParcialOrdProdutos);
        dao.ordemProdutos.setDescontoParcialOrdProdutos(descontoParcialOrdProdutos);
       
        String msgInclusao = dao.atualizar(DAO.ALTERACAOORDEMPRODUTO);
        return msgInclusao;
    }
    
}
