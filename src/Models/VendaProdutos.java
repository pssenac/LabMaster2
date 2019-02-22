

package Models;


public class VendaProdutos {
   
   private int fkProdutoVendProduto;
   private int  fkVendaVendProduto;
   private int  qtdItensVendProduto;
   private double descontoItemVendProduto;
   private double  valorParcialVendProduto;

    public int getFkProdutoVendProduto() {
        return fkProdutoVendProduto;
    }

    public void setFkProdutoVendProduto(int fkProdutoVendProduto) {
        this.fkProdutoVendProduto = fkProdutoVendProduto;
    }

    public int getFkVendaVendProduto() {
        return fkVendaVendProduto;
    }

    public void setFkVendaVendProduto(int fkVendaVendProduto) {
        this.fkVendaVendProduto = fkVendaVendProduto;
    }

    public int getQtdItensVendProduto() {
        return qtdItensVendProduto;
    }

    public void setQtdItensVendProduto(int qtdItensVendProduto) {
        this.qtdItensVendProduto = qtdItensVendProduto;
    }

    public double getDescontoItemVendProduto() {
        return descontoItemVendProduto;
    }

    public void setDescontoItemVendProduto(double descontoItemVendProduto) {
        this.descontoItemVendProduto = descontoItemVendProduto;
    }

    public double getValorParcialVendProduto() {
        return valorParcialVendProduto;
    }

    public void setValorParcialVendProduto(double valorParcialVendProduto) {
        this.valorParcialVendProduto = valorParcialVendProduto;
    }
   
   
   
   
   
}          