
package Controller;

import Models.DAO;


public class FornecedorController {
    
   
     public String salvarFornecedor( String cnpjFornecedor, String nomeFornecedor, 
            String emailFornecedor, String representanteFornecedor, String emailRepresentante, 
            String ramoFornecedor, String telFornecedor, String celFornecedor, int fkEnderecoFornecedor){
        DAO dao = new DAO();
        dao.fornecedor.setCnpjFornecedor(cnpjFornecedor);
        dao.fornecedor.setNomeFornecedor(nomeFornecedor);
        dao.fornecedor.setEmailFornecedor(emailFornecedor);
        dao.fornecedor.setRepresentanteFornecedor(representanteFornecedor);
        dao.fornecedor.setEmailRepresentante(emailRepresentante);
        dao.fornecedor.setRamoFornecedor(ramoFornecedor);
        dao.fornecedor.setTelFornecedor(telFornecedor);
        dao.fornecedor.setCelFornecedor(celFornecedor);
        dao.fornecedor.setFkEnderecoFornecedor(fkEnderecoFornecedor);
    
        String msgInclusao = dao.atualizar(DAO.INCLUSAOFORNECEDOR);
        return msgInclusao;
    }
     
    public String alterarFornecedor(String IdFornecedor, String cnpjFornecedor, String nomeFornecedor, 
            String emailFornecedor, String representanteFornecedor, String emailRepresentante, 
            String ramoFornecedor, String telFornecedor, String celFornecedor, int fkEnderecoFornecedor){
        DAO dao = new DAO();
        dao.fornecedor.setIdFornecedor(IdFornecedor);
        dao.fornecedor.setCnpjFornecedor(cnpjFornecedor);
        dao.fornecedor.setNomeFornecedor(nomeFornecedor);
        dao.fornecedor.setEmailFornecedor(emailFornecedor);
        dao.fornecedor.setRepresentanteFornecedor(representanteFornecedor);
        dao.fornecedor.setEmailRepresentante(emailRepresentante);
        dao.fornecedor.setRamoFornecedor(ramoFornecedor);
        dao.fornecedor.setTelFornecedor(telFornecedor);
        dao.fornecedor.setCelFornecedor(celFornecedor);
        dao.fornecedor.setFkEnderecoFornecedor(fkEnderecoFornecedor);
        
        String msgInclusao = dao.atualizar(DAO.ALTERACAOFORNECEDOR);
        return msgInclusao;
    }
}
    

