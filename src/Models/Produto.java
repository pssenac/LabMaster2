
package Models;

import java.util.Date;


public class Produto {
  
   private String idProduto;
   private String  nomeProduto;
   private String  fabricanteProduto;
   private String marcaProduto;
   private String descricaoProduto;
   private Date dataCompraProduto;
   private int qtdEstoqueProduto;
   private Double valorCustoProduto;
   private Double valorVendaProduto;
   private int situaçaoProduto;
   private String armazemLocalProduto;
   private int fkFornecedorProduto;

   
   
    public String getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getFabricanteProduto() {
        return fabricanteProduto;
    }

    public void setFabricanteProduto(String fabricanteProduto) {
        this.fabricanteProduto = fabricanteProduto;
    }

    public String getMarcaProduto() {
        return marcaProduto;
    }

    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Date getDataCompraProduto() {
        return dataCompraProduto;
    }

    public void setDataCompraProduto(Date dataCompraProduto) {
        this.dataCompraProduto = dataCompraProduto;
    }

    public int getQtdEstoqueProduto() {
        return qtdEstoqueProduto;
    }

    public void setQtdEstoqueProduto(int qtdEstoqueProduto) {
        this.qtdEstoqueProduto = qtdEstoqueProduto;
    }

    public Double getValorCustoProduto() {
        return valorCustoProduto;
    }

    public void setValorCustoProduto(Double valorCustoProduto) {
        this.valorCustoProduto = valorCustoProduto;
    }

    public Double getValorVendaProduto() {
        return valorVendaProduto;
    }

    public void setValorVendaProduto(Double valorVendaProduto) {
        this.valorVendaProduto = valorVendaProduto;
    }

    public int getSituaçaoProduto() {
        return situaçaoProduto;
    }

    public void setSituaçaoProduto(int situaçaoProduto) {
        this.situaçaoProduto = situaçaoProduto;
    }

    public String getArmazemLocalProduto() {
        return armazemLocalProduto;
    }

    public void setArmazemLocalProduto(String armazemLocalProduto) {
        this.armazemLocalProduto = armazemLocalProduto;
    }

    public int getFkFornecedorProduto() {
        return fkFornecedorProduto;
    }

    public void setFkFornecedorProduto(int fkFornecedorProduto) {
        this.fkFornecedorProduto = fkFornecedorProduto;
    }
   
   
   
   
   
   

}  