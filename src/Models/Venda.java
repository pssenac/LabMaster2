
package Models;

import java.util.Date;


public class Venda {

    /**
     * @return the idVenda
     */
    public String getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
    }

    /**
     * @return the descontoVenda
     */
    public String getDescontoVenda() {
        return descontoVenda;
    }

    /**
     * @param descontoVenda the descontoVenda to set
     */
    public void setDescontoVenda(String descontoVenda) {
        this.descontoVenda = descontoVenda;
    }

    /**
     * @return the tipoDePagamentoVenda
     */
    public String getTipoDePagamentoVenda() {
        return tipoDePagamentoVenda;
    }

    /**
     * @param tipoDePagamentoVenda the tipoDePagamentoVenda to set
     */
    public void setTipoDePagamentoVenda(String tipoDePagamentoVenda) {
        this.tipoDePagamentoVenda = tipoDePagamentoVenda;
    }

    /**
     * @return the dataVenda
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the observacaoVenda
     */
    public String getObservacaoVenda() {
        return observacaoVenda;
    }

    /**
     * @param observacaoVenda the observacaoVenda to set
     */
    public void setObservacaoVenda(String observacaoVenda) {
        this.observacaoVenda = observacaoVenda;
    }

    /**
     * @return the fkFuncionarioVenda
     */
    public String getFkFuncionarioVenda() {
        return fkFuncionarioVenda;
    }

    /**
     * @param fkFuncionarioVenda the fkFuncionarioVenda to set
     */
    public void setFkFuncionarioVenda(String fkFuncionarioVenda) {
        this.fkFuncionarioVenda = fkFuncionarioVenda;
    }
    
    private String  idVenda;
    private String   descontoVenda;
    private String  tipoDePagamentoVenda;
    private String  dataVenda;
    private String  observacaoVenda;
    private String  fkFuncionarioVenda;

    

    
}
