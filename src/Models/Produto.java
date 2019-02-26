package Models;

import java.util.Date;

public class Produto {

    /**
     * @return the idProduto
     */
    public String getIdProduto() {
        return idProduto;
    }

    /**
     * @param idProduto the idProduto to set
     */
    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    /**
     * @return the nomeProduto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     * @param nomeProduto the nomeProduto to set
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the armazemLocal
     */
    public String getArmazemLocal() {
        return armazemLocal;
    }

    /**
     * @param armazemLocal the armazemLocal to set
     */
    public void setArmazemLocal(String armazemLocal) {
        this.armazemLocal = armazemLocal;
    }

    /**
     * @return the tipoProduto
     */
    public String getTipoProduto() {
        return tipoProduto;
    }

    /**
     * @param tipoProduto the tipoProduto to set
     */
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    /**
     * @return the totalImposto
     */
    public String getTotalImposto() {
        return totalImposto;
    }

    /**
     * @param totalImposto the totalImposto to set
     */
    public void setTotalImposto(String totalImposto) {
        this.totalImposto = totalImposto;
    }

    /**
     * @return the icms
     */
    public String getIcms() {
        return icms;
    }

    /**
     * @param icms the icms to set
     */
    public void setIcms(String icms) {
        this.icms = icms;
    }

    /**
     * @return the iss
     */
    public String getIss() {
        return iss;
    }

    /**
     * @param iss the iss to set
     */
    public void setIss(String iss) {
        this.iss = iss;
    }

    /**
     * @return the ipi
     */
    public String getIpi() {
        return ipi;
    }

    /**
     * @param ipi the ipi to set
     */
    public void setIpi(String ipi) {
        this.ipi = ipi;
    }

    /**
     * @return the FKfornecedor
     */
    public String getFKfornecedor() {
        return FKfornecedor;
    }

    /**
     * @param FKfornecedor the FKfornecedor to set
     */
    public void setFKfornecedor(String FKfornecedor) {
        this.FKfornecedor = FKfornecedor;
    }

    private String idProduto;
    private String nomeProduto;
    private String descricao;
    private String armazemLocal;
    private String tipoProduto;
    private String totalImposto;
    private String icms;
    private String iss;
    private String ipi;
    private String FKfornecedor;

}
