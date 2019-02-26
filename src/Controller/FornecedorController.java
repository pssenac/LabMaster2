package Controller;

import Models.DAO;

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

        String msgInclusao = dao.atualizarFornecedor(DAO.INCLUSAOFORNECEDOR);
        return msgInclusao;
    }

    public String alterarFornecedor(String idfornecedor,String idendereco, String cnpjFornecedor, String nomeEmpresa, String nomeFantasia,
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

        String msgInclusao = dao.atualizarFornecedor(DAO.ALTERACAOFORNECEDOR);
        return msgInclusao;
    }

    public boolean verificarEndcliente(String idendereco) {

        DAO dao = new DAO();
        boolean vffor = true;

        dao.endereco.setIdendereco(idendereco);
        boolean vf = dao.verificarEnderecoFornecedor(vffor);
        return vf;
    }
}
