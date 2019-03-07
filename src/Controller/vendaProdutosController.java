package Controller;

import Models.DAO;
import Models.Venda;

public class vendaProdutosController {

    public String salvarVendaProdutos(int fkProdutoVendProduto, int fkVendaVendProduto,
            int qtdItensVendProduto, double descontoItemVendProduto, double valorParcialVendProduto) {
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
            int qtdItensVendProduto, double descontoItemVendProduto, double valorParcialVendProduto) {
        DAO dao = new DAO();
        dao.vendaProdutos.setDescontoItemVendProduto(fkProdutoVendProduto);
        dao.vendaProdutos.setFkProdutoVendProduto(fkVendaVendProduto);
        dao.vendaProdutos.setQtdItensVendProduto(qtdItensVendProduto);
        dao.vendaProdutos.setDescontoItemVendProduto(descontoItemVendProduto);
        dao.vendaProdutos.setValorParcialVendProduto(valorParcialVendProduto);

        String msgInclusao = dao.atualizar(DAO.ALTERACAOVENDAPRODUTO);
        return msgInclusao;
    }

    public Venda preencherCarrinho(String dataVenda, String descontoVenda, String FKfuncionario) {
            DAO dao = new DAO();

        dao.venda.setDataVenda(dataVenda);
        dao.venda.setDescontoVenda(descontoVenda);
        dao.venda.setFkFuncionarioVenda(FKfuncionario);
  
        return dao.venda;
    }

}
