package Controller;

import Models.DAO;
import javax.swing.JOptionPane;

public class FornecedorController {

    public String salvarFornecedor(String cnpjFornecedor, String nomeEmpresa, String nomeFantasia,
            String ramoRepresentante, String telRepresentante, String nomeRepresentante,
            String celRepresentante, String emailRepresenante,
            String cep, String bairro, String logradouro, String complemento,
            String numero, String cidade, String estado) {

        DAO dao = new DAO();
        dao.fornecedor.setCnpjcpfFornecedor(cnpjFornecedor);
        dao.fornecedor.setNomeEmpresa(nomeEmpresa);
        dao.fornecedor.setNomeFantasia(nomeFantasia);
        dao.fornecedor.setNomeRepresentante(nomeRepresentante);
        dao.fornecedor.setRamo(ramoRepresentante);
        dao.fornecedor.setContatoFixo(telRepresentante);
        dao.fornecedor.setContatoCel(celRepresentante);
        dao.fornecedor.setEmailRepresentante(emailRepresenante);

        dao.endereco.setBairro(bairro);
        dao.endereco.setCep(cep);
        dao.endereco.setCidade(cidade);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setEstado(estado);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setNumero(numero);
         JOptionPane.showMessageDialog(null, dao.atualizarFornecedor(DAO.INCLUSAOFORNECEDOR));
        String msgInclusao = "";
        return msgInclusao;
    }

    public String alterarFornecedor(String idfornecedor, String idendereco, String cnpjFornecedor, String nomeEmpresa, String nomeFantasia,
            String ramoRepresentante, String telRepresentante, String nomeRepresentante,
            String celRepresentante, String emailRepresenante,
            String cep, String bairro, String logradouro, String complemento,
            String numero, String cidade, String estado) {

        DAO dao = new DAO();
        dao.fornecedor.setIdFornecedor(idfornecedor);
        dao.fornecedor.setCnpjcpfFornecedor(cnpjFornecedor);
        dao.fornecedor.setNomeEmpresa(nomeEmpresa);
        dao.fornecedor.setNomeFantasia(nomeFantasia);
        dao.fornecedor.setNomeRepresentante(nomeRepresentante);
        dao.fornecedor.setRamo(ramoRepresentante);
        dao.fornecedor.setContatoFixo(telRepresentante);
        dao.fornecedor.setContatoCel(celRepresentante);
        dao.fornecedor.setEmailRepresentante(emailRepresenante);

        dao.endereco.setIdendereco(idendereco);
        dao.endereco.setBairro(bairro);
        dao.endereco.setCep(cep);
        dao.endereco.setCidade(cidade);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setEstado(estado);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setNumero(numero);

         JOptionPane.showMessageDialog(null, dao.atualizarFornecedor(DAO.ALTERACAOFORNECEDOR));
         String msgInclusao = "";
        return msgInclusao;
    }
    
    public boolean logarBD(){
         DAO dao = new DAO();
         boolean resp = dao.bd.getConnection();
         return resp;      
    }
    
    
  
}
