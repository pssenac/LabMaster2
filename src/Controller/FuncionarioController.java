package Controller;

import Models.DAO;
import java.util.Date;

public class FuncionarioController {

    public String salvarFuncionario(String nomeFuncionario, String cpfFuncionario,
            String rgFuncionario, String telFuncionario, String celFuncionario, String emailFuncionario,
            Date dataNascFuncionario, String cep, String bairro, String logradouro, String complemento,
            String numero, String cidade, String estado) {
        
        
        DAO dao = new DAO();
        dao.funcionario.setNomeFuncionario(nomeFuncionario);
        dao.funcionario.setCpfFuncionario(cpfFuncionario);
        dao.funcionario.setRgFuncionario(rgFuncionario);
        dao.funcionario.setTelFuncionario(telFuncionario);
        dao.funcionario.setCelFuncionario(celFuncionario);
        dao.funcionario.setEmailFuncionario(emailFuncionario);
        dao.funcionario.setDataNascFuncionario(dataNascFuncionario);

        dao.endereco.setBairro(bairro);
        dao.endereco.setCep(cep);
        dao.endereco.setCidade(cidade);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setEstado(estado);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setNumero(numero);

        String msgInclusao = dao.atualizar(DAO.INCLUSAOFUNCIONARIO);
        return msgInclusao;
    }

    public String alterarFuncionario(String idFuncionario, String idEndereco, String nomeFuncionario, String cpfFuncionario,
            String rgFuncionario, String telFuncionario, String celFuncionario, String emailFuncionario,
            Date dataNascFuncionario, String cep, String bairro, String logradouro, String complemento,
            String numero, String cidade, String estado) {
        DAO dao = new DAO();

        dao.funcionario.setIdFuncionario(idFuncionario);
        dao.funcionario.setNomeFuncionario(nomeFuncionario);
        dao.funcionario.setCpfFuncionario(cpfFuncionario);
        dao.funcionario.setRgFuncionario(rgFuncionario);
        dao.funcionario.setTelFuncionario(telFuncionario);
        dao.funcionario.setCelFuncionario(celFuncionario);
        dao.funcionario.setEmailFuncionario(emailFuncionario);
        dao.funcionario.setDataNascFuncionario(dataNascFuncionario);

        dao.endereco.setIdendereco(idEndereco);
        dao.endereco.setBairro(bairro);
        dao.endereco.setCep(cep);
        dao.endereco.setCidade(cidade);
        dao.endereco.setComplemento(complemento);
        dao.endereco.setEstado(estado);
        dao.endereco.setLogradouro(logradouro);
        dao.endereco.setNumero(numero);

        String msgInclusao = dao.atualizar(DAO.ALTERACAOFUNCIONARIO);
        return msgInclusao;
    }

}
