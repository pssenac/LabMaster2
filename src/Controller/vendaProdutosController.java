
package Controller;

import Models.DAO;


public class vendaProdutosController {
    public String salvarVendaProdutos(int fkProdutoVendProduto, int fkVendaVendProduto, 
            int qtdItensVendProduto, double descontoItemVendProduto, double valorParcialVendProduto){
        DAO dao = new DAO();
        dao.vendaProdutos.setDescontoItemVendProduto(fkProdutoVendProduto);
        dao.vendaProdutos.setFkProdutoVendProduto(fkVendaVendProduto);
        dao.vendaProdutos.setQtdItensVendProduto(qtdItensVendProduto);
        dao.vendaProdutos.setDescontoItemVendProduto(descontoItemVendProduto);
        dao.vendaProdutos.setValorParcialVendProduto(valorParcialVendProduto);
        
    
        String msgInclusao = dao.atualizar(DAO.INCLUSAOVENDAPRODUTO);
        return msgInclusao;
    }
     
    public String alterarVendaProdutos(int fkProdutoVendProduto, int fkVendaVendProduto, 
            int qtdItensVendProduto, double descontoItemVendProduto, double valorParcialVendProduto){
        DAO dao = new DAO();
        dao.vendaProdutos.setDescontoItemVendProduto(fkProdutoVendProduto);
        dao.vendaProdutos.setFkProdutoVendProduto(fkVendaVendProduto);
        dao.vendaProdutos.setQtdItensVendProduto(qtdItensVendProduto);
        dao.vendaProdutos.setDescontoItemVendProduto(descontoItemVendProduto);
        dao.vendaProdutos.setValorParcialVendProduto(valorParcialVendProduto);
      
        String msgInclusao = dao.atualizar(DAO.ALTERACAOVENDAPRODUTO);
        return msgInclusao;
    }
    
    
}
