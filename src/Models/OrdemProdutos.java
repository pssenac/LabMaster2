
package Models;


public class OrdemProdutos {
   private int fkOrdemServicoOrdProdutos;
   private int fkprodutosOrdProdutos;
   private int qtdProdutoOrdProdutos;
   private double valorParcialOrdProdutos;
   private double  descontoParcialOrdProdutos;

    public int getFkOrdemServicoOrdProdutos() {
        return fkOrdemServicoOrdProdutos;
    }

    public void setFkOrdemServicoOrdProdutos(int fkOrdemServicoOrdProdutos) {
        this.fkOrdemServicoOrdProdutos = fkOrdemServicoOrdProdutos;
    }

    public int getFkprodutosOrdProdutos() {
        return fkprodutosOrdProdutos;
    }

    public void setFkprodutosOrdProdutos(int fkprodutosOrdProdutos) {
        this.fkprodutosOrdProdutos = fkprodutosOrdProdutos;
    }

    public int getQtdProdutoOrdProdutos() {
        return qtdProdutoOrdProdutos;
    }

    public void setQtdProdutoOrdProdutos(int qtdProdutoOrdProdutos) {
        this.qtdProdutoOrdProdutos = qtdProdutoOrdProdutos;
    }

    public double getValorParcialOrdProdutos() {
        return valorParcialOrdProdutos;
    }

    public void setValorParcialOrdProdutos(double valorParcialOrdProdutos) {
        this.valorParcialOrdProdutos = valorParcialOrdProdutos;
    }

    public double getDescontoParcialOrdProdutos() {
        return descontoParcialOrdProdutos;
    }

    public void setDescontoParcialOrdProdutos(double descontoParcialOrdProdutos) {
        this.descontoParcialOrdProdutos = descontoParcialOrdProdutos;
    }
    
    
}
