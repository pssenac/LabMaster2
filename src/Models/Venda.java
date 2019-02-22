
package Models;

import java.util.Date;


public class Venda {
    
    private String  idVenda;
    private double   descontoVenda;
    private int  tipoDePagamentoVenda;
    private Date  dataVenda;
    private String  observacaoVenda;
    private int  fkFuncionarioVenda;

    public String getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(String idVenda) {
        this.idVenda = idVenda;
    }

    public double getDescontoVenda() {
        return descontoVenda;
    }

    public void setDescontoVenda(double descontoVenda) {
        this.descontoVenda = descontoVenda;
    }

    public int getTipoDePagamentoVenda() {
        return tipoDePagamentoVenda;
    }

    public void setTipoDePagamentoVenda(int tipoDePagamentoVenda) {
        this.tipoDePagamentoVenda = tipoDePagamentoVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String getObservacaoVenda() {
        return observacaoVenda;
    }

    public void setObservacaoVenda(String observacaoVenda) {
        this.observacaoVenda = observacaoVenda;
    }

    public int getFkFuncionarioVenda() {
        return fkFuncionarioVenda;
    }

    public void setFkFuncionarioVenda(int fkFuncionarioVenda) {
        this.fkFuncionarioVenda = fkFuncionarioVenda;
    }

    
}
