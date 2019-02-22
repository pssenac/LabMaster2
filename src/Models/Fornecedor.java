
package Models;


public class Fornecedor {
    
    private String IdFornecedor;
    private String cnpjFornecedor;
    private String nomeFornecedor;
    private String emailFornecedor;
    private String representanteFornecedor;
    private String emailRepresentante;
    private String ramoFornecedor;
    private String telFornecedor;
    private String celFornecedor;
    private int fkEnderecoFornecedor;

    public String getIdFornecedor() {
        return IdFornecedor;
    }

    public void setIdFornecedor(String IdFornecedor) {
        this.IdFornecedor = IdFornecedor;
    }

    public String getCnpjFornecedor() {
        return cnpjFornecedor;
    }

    public void setCnpjFornecedor(String cnpjFornecedor) {
        this.cnpjFornecedor = cnpjFornecedor;
    }

    public String getNomeFornecedor() {
        return nomeFornecedor;
    }

    public void setNomeFornecedor(String nomeFornecedor) {
        this.nomeFornecedor = nomeFornecedor;
    }

    public String getEmailFornecedor() {
        return emailFornecedor;
    }

    public void setEmailFornecedor(String emailFornecedor) {
        this.emailFornecedor = emailFornecedor;
    }

    public String getRepresentanteFornecedor() {
        return representanteFornecedor;
    }

    public void setRepresentanteFornecedor(String representanteFornecedor) {
        this.representanteFornecedor = representanteFornecedor;
    }

    public String getEmailRepresentante() {
        return emailRepresentante;
    }

    public void setEmailRepresentante(String emailRepresentante) {
        this.emailRepresentante = emailRepresentante;
    }

    public String getRamoFornecedor() {
        return ramoFornecedor;
    }

    public void setRamoFornecedor(String ramoFornecedor) {
        this.ramoFornecedor = ramoFornecedor;
    }

    public String getTelFornecedor() {
        return telFornecedor;
    }

    public void setTelFornecedor(String telFornecedor) {
        this.telFornecedor = telFornecedor;
    }

    public String getCelFornecedor() {
        return celFornecedor;
    }

    public void setCelFornecedor(String celFornecedor) {
        this.celFornecedor = celFornecedor;
    }

    public int getFkEnderecoFornecedor() {
        return fkEnderecoFornecedor;
    }

    public void setFkEnderecoFornecedor(int fkEnderecoFornecedor) {
        this.fkEnderecoFornecedor = fkEnderecoFornecedor;
    }

   

    
}