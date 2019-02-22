
package Models;

import java.util.Date;


public class OrdemServiço {
    
   private String idServico;
   private String  tipoServico;
   private double valorServico;
   private int  formaDePamementoServico;
   private Date dataEntregaServico;
   private Date dataSolicitacaoServico;
   private int prioridadeServico;
   private String descricaoServico;
   private String respTecnicoServico;
   private String observacaoServico;
   private int fkclienteServico;
   private int fkfuncioanrioServico;

    public String getIdServico() {
        return idServico;
    }

    public void setIdServico(String idServico) {
        this.idServico = idServico;
    }

    public String getTipoServico() {
        return tipoServico;
    }

    public void setTipoServico(String tipoServico) {
        this.tipoServico = tipoServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public int getFormaDePamementoServico() {
        return formaDePamementoServico;
    }

    public void setFormaDePamementoServico(int formaDePamementoServico) {
        this.formaDePamementoServico = formaDePamementoServico;
    }

    public Date getDataEntregaServico() {
        return dataEntregaServico;
    }

    public void setDataEntregaServico(Date dataEntregaServico) {
        this.dataEntregaServico = dataEntregaServico;
    }

    public Date getDataSolicitacaoServico() {
        return dataSolicitacaoServico;
    }

    public void setDataSolicitacaoServico(Date dataSolicitacaoServico) {
        this.dataSolicitacaoServico = dataSolicitacaoServico;
    }

    public int getPrioridadeServico() {
        return prioridadeServico;
    }

    public void setPrioridadeServico(int prioridadeServico) {
        this.prioridadeServico = prioridadeServico;
    }

    public String getDescricaoServico() {
        return descricaoServico;
    }

    public void setDescricaoServico(String descricaoServico) {
        this.descricaoServico = descricaoServico;
    }

    public String getRespTecnicoServico() {
        return respTecnicoServico;
    }

    public void setRespTecnicoServico(String respTecnicoServico) {
        this.respTecnicoServico = respTecnicoServico;
    }

    public String getObservacaoServico() {
        return observacaoServico;
    }

    public void setObservacaoServico(String observacaoServico) {
        this.observacaoServico = observacaoServico;
    }

    public int getFkclienteServico() {
        return fkclienteServico;
    }

    public void setFkclienteServico(int fkclienteServico) {
        this.fkclienteServico = fkclienteServico;
    }

    public int getFkfuncioanrioServico() {
        return fkfuncioanrioServico;
    }

    public void setFkfuncioanrioServico(int fkfuncioanrioServico) {
        this.fkfuncioanrioServico = fkfuncioanrioServico;
    }
           
   

    
            
    
}
