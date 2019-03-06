package Models;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DAO {

    public Cliente cliente;
    public Funcionario funcionario;
    public Usuario usuario;
    public Fornecedor fornecedor;
    public Produto produto;
    public Venda venda;
    public VendaProdutos vendaProdutos;
    public OrdemServiço ordemservico;
    public OrdemProdutos ordemProdutos;
    public Endereco endereco;
    public Lote lote;

    public ConexaoBD bd;
    private PreparedStatement statement;
    public Statement stm;
    public ResultSet resultSet;
    private String men, sql;
    public String Acesso;

    public String Perfil;

    public static final byte INCLUSAOCLIENTE = 1;
    public static final byte ALTERACAOCLIENTE = 2;
    public static final byte INCLUSAOFUNCIONARIO = 3;
    public static final byte ALTERACAOFUNCIONARIO = 4;
    public static final byte EXCLUSAOUSUARIO = 7;
    public static final byte INCLUSAOFORNECEDOR = 8;
    public static final byte ALTERACAOFORNECEDOR = 9;
    public static final byte INCLUSAOPRODUTO = 10;
    public static final byte ALTERACAOPRODUTO = 11;
    public static final byte INCLUSAOVENDA = 12;
    public static final byte ALTERACAOVENDA = 13;
    public static final byte INCLUSAOVENDAPRODUTO = 14;
    public static final byte ALTERACAOVENDAPRODUTO = 15;
    public static final byte INCLUSAOORDEMSERVICO = 16;
    public static final byte ALTERACAOORDEMSERVICO = 17;
    public static final byte INCLUSAOORDEMPRODUTO = 18;
    public static final byte ALTERACAOORDEMPRODUTO = 19;
    public static final byte INCLUSAOENDERECO = 20;
    public static final byte ALTERACAOENDERECO = 21;

    //<editor-fold defaultstate="collapsed" desc=" METODO DAO "> 
    public DAO() {
        bd = new ConexaoBD();
        cliente = new Cliente();
        funcionario = new Funcionario();
        usuario = new Usuario();
        fornecedor = new Fornecedor();
        produto = new Produto();
        venda = new Venda();
        vendaProdutos = new VendaProdutos();
        ordemservico = new OrdemServiço();
        ordemProdutos = new OrdemProdutos();
        endereco = new Endereco();
        lote = new Lote();

        if (!bd.getConnection()) {
            JOptionPane.showMessageDialog(null, "Falha ao conectar, o sistema será fechado");
            System.exit(0);
        }
    }

 
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc=" EXECUTAR SQL "> 
    public void executaSQL(String sql) {
        try {
            boolean resp;
            resp = bd.getConnection();
            if (resp == true) {
                // tipo case sensitive e pode percorrer tanto do início para o fim quanto do fim para o início
                stm = bd.connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
                resultSet = stm.executeQuery(sql);
            } else {
                JOptionPane.showMessageDialog(null, "Não conectou.");
            }
        } catch (SQLException erro) {
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR CLIENTE ">
    public void carregarTabela() {
        String sql = "select * from cliente";
        try {
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }

    public String atualizarCliente(int operacao) {
        String FK;
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // CLIENTE 
                case INCLUSAOCLIENTE:

                    sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    ResultSet fk = statement.executeQuery();
                    if (fk.next()) {
                        fk.getString("idendereco");

                    } else {

                        sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, "
                                + "cidade, estado) values(?,?,?,?,?,?,?)";

                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getBairro());
                        statement.setString(3, endereco.getLogradouro());
                        statement.setString(4, endereco.getComplemento());
                        statement.setString(5, endereco.getNumero());
                        statement.setString(6, endereco.getCidade());
                        statement.setString(7, endereco.getEstado());
                        statement.executeUpdate();

                        sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getLogradouro());
                        statement.setString(3, endereco.getNumero());
                        JOptionPane.showMessageDialog(null, endereco.getCep());
                        fk = statement.executeQuery();
                        fk.first();

                    }

                    String x = fk.getString("idendereco");

                    sql = "insert into cliente (nomeCliente, cpf, rg, telefone, celular, email,FKendereco) values(?,?,?,?,?,?,?)";
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, cliente.getNomeCliente());
                    statement.setString(2, cliente.getCpfCliente());
                    statement.setString(3, cliente.getRgCliente());
                    statement.setString(4, cliente.getTelCliente());
                    statement.setString(5, cliente.getCelCliente());
                    statement.setString(6, cliente.getEmailCliente());
                    statement.setString(7, x);
                    statement.executeUpdate();
                    statement.close();
                    break;

                case ALTERACAOCLIENTE:

                    sql = "select idendereco from endereco where cep = ? or logradouro = ? or numero = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    fk = statement.executeQuery();
                    if (fk.next()) {

                        sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, "
                                + "cidade, estado) values(?,?,?,?,?,?,?)";

                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getBairro());
                        statement.setString(3, endereco.getLogradouro());
                        statement.setString(4, endereco.getComplemento());
                        statement.setString(5, endereco.getNumero());
                        statement.setString(6, endereco.getCidade());
                        statement.setString(7, endereco.getEstado());
                        statement.executeUpdate();

                        sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getLogradouro());
                        statement.setString(3, endereco.getNumero());
                        JOptionPane.showMessageDialog(null, endereco.getCep());
                        fk = statement.executeQuery();
                        fk.first();

                    }

                    sql = "update Cliente set nomeCliente = ?, cpf = ?, rg = ?,"
                            + " telefone = ?,celular = ?,email = ?, FKendereco = ? where idcliente = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, cliente.getNomeCliente());
                    statement.setString(2, cliente.getCpfCliente());
                    statement.setString(3, cliente.getRgCliente());
                    statement.setString(4, cliente.getTelCliente());
                    statement.setString(5, cliente.getCelCliente());
                    statement.setString(6, cliente.getEmailCliente());
                    statement.setString(7, fk.getString("idendereco"));
                    statement.setString(8, cliente.getIdCliente());

                    statement.executeUpdate();
                    statement.close();
                    break;

            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return men;

    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR FORNECEDOR ">
    public String atualizarFornecedor(int operacao) {
        int FK;
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // CLIENTE 
                case INCLUSAOFORNECEDOR:

                    sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    ResultSet fk = statement.executeQuery();
                    if (fk.next()) {
                        FK = fk.getInt("idendereco");

                    } else {

                        sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, "
                                + "cidade, estado) values(?,?,?,?,?,?,?)";

                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getBairro());
                        statement.setString(3, endereco.getLogradouro());
                        statement.setString(4, endereco.getComplemento());
                        statement.setString(5, endereco.getNumero());
                        statement.setString(6, endereco.getCidade());
                        statement.setString(7, endereco.getEstado());
                        statement.executeUpdate();

                        sql = "select idendereco from endereco where cep = ? and logradouro = ? and numero = ?";
                        bd.getConnection();
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, endereco.getCep());
                        statement.setString(2, endereco.getLogradouro());
                        statement.setString(3, endereco.getNumero());
                        fk = statement.executeQuery();
                        fk.first();

                        FK = fk.getInt("idendereco");

                    }

                    String x = Integer.toString(FK);

                    sql = "insert into fornecedor values(null,?,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, fornecedor.getCnpjcpfFornecedor());
                    statement.setString(2, fornecedor.getNomeEmpresa());
                    statement.setString(3, fornecedor.getNomeFantasia());
                    statement.setString(4, fornecedor.getRamo());
                    statement.setString(5, fornecedor.getNomeRepresentante());
                    statement.setString(6, fornecedor.getContatoFixo());
                    statement.setString(7, fornecedor.getContatoCel());
                    statement.setString(8, fornecedor.getEmailRepresentante());
                    statement.setInt(9, FK);

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOFORNECEDOR:

                    sql = "update Endereco set cep = ?, bairro = ?,  logradouro = ?"
                            + ",  complemento = ?,  numero = ?,  cidade = ?,  estado = ?"
                            + "where idendereco = ?";

                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getBairro());
                    statement.setString(3, endereco.getLogradouro());
                    statement.setString(4, endereco.getComplemento());
                    statement.setString(5, endereco.getNumero());
                    statement.setString(6, endereco.getCidade());
                    statement.setString(7, endereco.getEstado());
                    statement.setString(8, endereco.getIdendereco());
                    statement.executeUpdate();

                    sql = "update fornecedor set cnpjCpf = ?, nomeEmpresa = ?, nomeFantasia = ?, ramo = ?,"
                            + " representante = ?, contatoFixo  = ?, contatoCel  = ?,emailRep = ? where idfornecedor = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, fornecedor.getCnpjcpfFornecedor());
                    statement.setString(2, fornecedor.getNomeEmpresa());
                    statement.setString(3, fornecedor.getNomeFantasia());
                    statement.setString(4, fornecedor.getRamo());
                    statement.setString(5, fornecedor.getNomeRepresentante());
                    statement.setString(6, fornecedor.getContatoFixo());
                    statement.setString(7, fornecedor.getContatoCel());
                    statement.setString(8, fornecedor.getEmailRepresentante());
                    statement.setString(9, fornecedor.getIdFornecedor());
                    statement.executeUpdate();
                    statement.close();
                    break;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return men;
    }
//</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR FUNCIONARIO E USUARIO">
    public String atualizarFuncionarioUsuario(int operacao) {

        try {
            switch (operacao) {

                // ENDERECO
                case INCLUSAOFUNCIONARIO:

                    sql = "insert into endereco values(null,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getBairro());
                    statement.setString(3, endereco.getLogradouro());
                    statement.setString(4, endereco.getComplemento());
                    statement.setString(5, endereco.getNumero());
                    statement.setString(6, endereco.getCidade());
                    statement.setString(7, endereco.getEstado());
                    statement.executeUpdate();

                    sql = "select* from endereco where cep =? and logradouro =? and numero =?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getLogradouro());
                    statement.setString(3, endereco.getNumero());
                    ResultSet fk = statement.executeQuery();
                    fk.next();
                    String FKend = fk.getString("idendereco");

                    // FUNCIONARIO
                    sql = "insert into funcionario values(null,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, funcionario.getNomeFuncionario());
                    statement.setString(2, funcionario.getCpfFuncionario());
                    statement.setString(3, funcionario.getRgFuncionario());
                    statement.setString(4, funcionario.getTelFuncionario());
                    statement.setString(5, funcionario.getCelFuncionario());
                    statement.setString(6, funcionario.getEmailFuncionario());
                    statement.setString(7, funcionario.getDataNascFuncionario());
                    statement.setString(8, FKend);

                    statement.executeUpdate();

                    sql = "select* from funcionario where cpf =? and rg =?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, funcionario.getCpfFuncionario());
                    statement.setString(2, funcionario.getRgFuncionario());
                    ResultSet fk2 = statement.executeQuery();
                    fk2.next();
                    String FKfcn = fk2.getString("idfuncionario");

                    // USUARIO
                    sql = "insert into usuario values(null,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, usuario.getLoginUsuario());
                    statement.setInt(2, usuario.getPerfilUsuario());
                    statement.setString(3, usuario.getSenhaUsuario());
                    statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
                    statement.setString(5, FKfcn);

                    statement.executeUpdate();
                    statement.close();

                    break;

                case ALTERACAOFUNCIONARIO:

                    sql = "SELECT idfuncionario FROM funcionario INNER JOIN endereco ON "
                            + "endereco.idendereco = funcionario.FKendereco INNER JOIN usuario ON "
                            + "usuario.idUsuario = usuario.FKfuncionario WHERE cpf =? and rg =? ";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, funcionario.getCpfFuncionario());
                    statement.setString(2, funcionario.getRgFuncionario());
                    ResultSet cv = statement.executeQuery();
                    cv.next();
                    String cvf = cv.getString("idfuncionario");

                    sql = "update funcionario set  nomeFuncionario = ?,  cpf = ?, rg = ?, telefone = ?,"
                            + "  celular = ?,  email = ?,  dataNascimento= ? where idfuncionario = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(8, cvf);
                    statement.setString(1, funcionario.getNomeFuncionario());
                    statement.setString(2, funcionario.getCpfFuncionario());
                    statement.setString(3, funcionario.getRgFuncionario());
                    statement.setString(4, funcionario.getTelFuncionario());
                    statement.setString(5, funcionario.getCelFuncionario());
                    statement.setString(6, funcionario.getEmailFuncionario());
                    statement.setString(7, funcionario.getDataNascFuncionario());
                    statement.executeUpdate();

                    sql = "update endereco set cep  = ?, bairro = ?, logradouro = ?, complemento = ?,"
                            + "  numero = ?,  cidade = ?,  estado = ?  where idendereco = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(8, cvf);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getBairro());
                    statement.setString(3, endereco.getLogradouro());
                    statement.setString(4, endereco.getComplemento());
                    statement.setString(5, endereco.getNumero());
                    statement.setString(6, endereco.getCidade());
                    statement.setString(7, endereco.getEstado());
                    statement.executeUpdate();

                    sql = "update usuario set  login = ?,  perfil= ?,"
                            + "  senha = ?,  confiSenha = ? where idUsuario= ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(5, cvf);
                    statement.setString(1, usuario.getLoginUsuario());
                    statement.setInt(2, usuario.getPerfilUsuario());
                    statement.setString(3, usuario.getSenhaUsuario());
                    statement.setString(4, usuario.getConfirmacaoSenhaUsuario());

                    statement.executeUpdate();

                    statement.close();

                    break;

                case EXCLUSAOUSUARIO:
                    sql = "delete from usuario where  = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, usuario.getIdUsuario());
                    statement.executeUpdate();
                    statement.close();
                    break;

                default:
                    men = "Falha na operação!";
                    break;
            }
        } catch (SQLException erro) {
            men = "Falha na operação: \n" + erro.toString();
        }
        return men;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR PRODUTO ">
    public String atualizarProduto(int operacao) {
        int FK;
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // Produto
                case INCLUSAOPRODUTO:

                    sql = "insert into produtos values(null,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, produto.getNomeProduto());
                    statement.setString(2, produto.getDescricao());
                    statement.setString(3, produto.getArmazemLocal());
                    statement.setString(4, produto.getTipoProduto());                    
                    statement.executeUpdate();
                    sql = "SELECT idprodutos FROM produtos ORDER BY idprodutos DESC LIMIT 1";
                    statement = bd.connection.prepareStatement(sql);

                    ResultSet fk = statement.executeQuery();
                    while (fk.next()) {
                        FK = fk.getInt("idprodutos");
                        sql = "insert into lote values(null,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        statement = bd.connection.prepareStatement(sql);
                        statement.setString(1, lote.getDataCompra());
                        statement.setString(2, lote.getQuantidade());
                        statement.setString(3, lote.getQtdInicial());
                        statement.setString(4, lote.getValorCusto());
                        statement.setString(5, lote.getValorVenda());
                        statement.setString(6, lote.getSituacaoProduto());
                        statement.setString(7, lote.getMarca());
                        statement.setString(8, lote.getLote());
                        statement.setInt(9, fk.getInt("idprodutos"));
                        statement.setString(10, lote.getIcms());
                        statement.setString(11, lote.getIss());
                        statement.setString(12, lote.getIpi());
                        statement.setString(13, lote.getTotalImposto());
                        statement.setString(14, lote.getFkFornecedor());
                        statement.executeUpdate();
                    }

                    statement.close();
                    break;
                case ALTERACAOPRODUTO:

                    bd.getConnection();
                    sql = "update lote set dataCompra = ?, qtdEstoque = ?, qtdInicial = ?, valorCusto = ?, valorVenda = ?, situacaoProduto = ?,"
                            + "marca = ?, lote = ?, icms = ?, iss = ?, ipi = ?, totalImpoasto = ? where FKprodutos = ?";
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, lote.getDataCompra());
                        statement.setString(2, lote.getQuantidade());
                        statement.setString(3, lote.getQtdInicial());
                        statement.setString(4, lote.getValorCusto());
                        statement.setString(5, lote.getValorVenda());
                        statement.setString(6, lote.getSituacaoProduto());
                        statement.setString(7, lote.getMarca());
                        statement.setString(8, lote.getLote());                       
                        statement.setString(9, lote.getIcms());
                        statement.setString(10, lote.getIss());
                        statement.setString(11, lote.getIpi());
                        statement.setString(12, lote.getTotalImposto());
                        statement.setString(13, lote.getFkFornecedor());
                        statement.setString(14, produto.getIdProduto());
                    statement.executeUpdate();

                    sql = "update produtos set nomeProduto = ?, descricao = ?, armazemLocal = ?, tipoProduto = ? where idprodutos = ?";
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, produto.getNomeProduto());
                    statement.setString(2, produto.getDescricao());
                    statement.setString(3, produto.getArmazemLocal());
                    statement.setString(4, produto.getTipoProduto());
                    statement.setString(5, produto.getIdProduto());
                    statement.executeUpdate();
                    break;
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return men;
    }

    public List<Fornecedor> read() {
        men = "operação realizada com sucesso";
        String sql = "SELECT * FROM fornecedor";
        List<Fornecedor> nomeFor = new ArrayList<>();
        try {
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Fornecedor nomeFornecedor = new Fornecedor();
                nomeFornecedor.setIdFornecedor(resultSet.getString("idfornecedor"));
                nomeFornecedor.setNomeEmpresa(resultSet.getString("nomeEmpresa"));
                nomeFor.add(nomeFornecedor);
                statement.close();
            }

        } catch (SQLException erro) {
            men = "Falha na operação: \n" + erro.toString();

        }
        return nomeFor;
    }

    //</editor-fold>   
    //<editor-fold defaultstate="collapsed" desc=" MÉTODO ATUALIZAR ">
    public String atualizar(int operacao) {
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // CLIENTE 
                case 1:
                    sql = "insert into Cliente values(null,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, cliente.getNomeCliente());
                    statement.setString(2, cliente.getCpfCliente());
                    statement.setString(3, cliente.getRgCliente());
                    statement.setString(4, cliente.getTelCliente());
                    statement.setString(5, cliente.getCelCliente());
                    statement.setString(6, cliente.getEmailCliente());
                    statement.executeUpdate();
                    statement.close();
                    break;

                case ALTERACAOCLIENTE:
                    sql = "update Cliente set   = ?,  = ?,   = ?,"
                            + "   = ?,   = ?,   = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(8, cliente.getIdCliente());
                    statement.setString(1, cliente.getNomeCliente());
                    statement.setString(2, cliente.getCpfCliente());
                    statement.setString(3, cliente.getRgCliente());
                    statement.setString(4, cliente.getTelCliente());
                    statement.setString(5, cliente.getCelCliente());
                    statement.setString(6, cliente.getEmailCliente());
                    statement.executeUpdate();
                    statement.close();
                    break;

                // FORNECEDOR
                // PROODUTO
                // VENDA
                case INCLUSAOVENDA:
                    sql = "insert into Vendas values(null,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setDouble(1, venda.getDescontoVenda());
                    statement.setInt(2, venda.getTipoDePagamentoVenda());
                    statement.setDate(3, (Date) venda.getDataVenda());
                    statement.setString(4, venda.getObservacaoVenda());
                    statement.setInt(5, venda.getFkFuncionarioVenda());

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOVENDA:
                    sql = "update Vendas set   = ?,  = ?,  = ?, "
                            + "   = ?,   = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(6, venda.getIdVenda());
                    statement.setDouble(1, venda.getDescontoVenda());
                    statement.setInt(2, venda.getTipoDePagamentoVenda());
                    statement.setDate(3, (Date) venda.getDataVenda());
                    statement.setString(4, venda.getObservacaoVenda());
                    statement.setInt(5, venda.getFkFuncionarioVenda());

                    statement.executeUpdate();
                    statement.close();
                    break;

                // VENDA PRODUTO
                case INCLUSAOVENDAPRODUTO:
                    sql = "insert into VendaProduto values(?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setInt(1, vendaProdutos.getFkProdutoVendProduto());
                    statement.setInt(2, vendaProdutos.getFkVendaVendProduto());
                    statement.setInt(3, vendaProdutos.getQtdItensVendProduto());
                    statement.setDouble(4, vendaProdutos.getDescontoItemVendProduto());
                    statement.setDouble(5, vendaProdutos.getValorParcialVendProduto());
                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOVENDAPRODUTO:
                    sql = "update VendaProduto set   = ?,  = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setInt(1, vendaProdutos.getFkProdutoVendProduto());
                    statement.setInt(2, vendaProdutos.getFkVendaVendProduto());
                    statement.setInt(3, vendaProdutos.getQtdItensVendProduto());
                    statement.setDouble(4, vendaProdutos.getDescontoItemVendProduto());
                    statement.setDouble(5, vendaProdutos.getValorParcialVendProduto());

                    statement.executeUpdate();
                    statement.close();
                    break;

                // ORDEM SERVICO
                case INCLUSAOORDEMSERVICO:
                    sql = "insert into OrdemServico  values(null,?,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, ordemservico.getTipoServico());
                    statement.setDouble(2, ordemservico.getValorServico());
                    statement.setDate(3, (Date) ordemservico.getDataEntregaServico());
                    statement.setDate(4, (Date) ordemservico.getDataSolicitacaoServico());
                    statement.setInt(5, ordemservico.getPrioridadeServico());
                    statement.setString(6, ordemservico.getDescricaoServico());
                    statement.setString(7, ordemservico.getRespTecnicoServico());
                    statement.setString(8, ordemservico.getObservacaoServico());
                    statement.setInt(9, ordemservico.getFkclienteServico());
                    statement.setInt(10, ordemservico.getFkfuncioanrioServico());

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOORDEMSERVICO:
                    sql = "update OrdemServico set   = ?,  = ?,  = ?,  = ?,  = ?,"
                            + "   = ?,   = ?,   = ?, = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(11, ordemservico.getIdServico());
                    statement.setString(1, ordemservico.getTipoServico());
                    statement.setDouble(2, ordemservico.getValorServico());
                    statement.setDate(3, (Date) ordemservico.getDataEntregaServico());
                    statement.setDate(4, (Date) ordemservico.getDataSolicitacaoServico());
                    statement.setInt(5, ordemservico.getPrioridadeServico());
                    statement.setString(6, ordemservico.getDescricaoServico());
                    statement.setString(7, ordemservico.getRespTecnicoServico());
                    statement.setString(8, ordemservico.getObservacaoServico());
                    statement.setInt(9, ordemservico.getFkclienteServico());
                    statement.setInt(10, ordemservico.getFkfuncioanrioServico());
                    statement.executeUpdate();
                    statement.close();
                    break;

                // ORDEM PRODUTO
                case INCLUSAOORDEMPRODUTO:
                    sql = "insert into OrdemProdutos values(?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setInt(1, ordemProdutos.getFkOrdemServicoOrdProdutos());
                    statement.setInt(2, ordemProdutos.getFkprodutosOrdProdutos());
                    statement.setInt(3, ordemProdutos.getQtdProdutoOrdProdutos());
                    statement.setDouble(4, ordemProdutos.getValorParcialOrdProdutos());
                    statement.setDouble(5, ordemProdutos.getDescontoParcialOrdProdutos());

                    statement.executeUpdate();
                    statement.close();

                    break;
                case ALTERACAOORDEMPRODUTO:
                    sql = "update OrdemProdutos set   = ?,  = ?, = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setInt(1, ordemProdutos.getFkOrdemServicoOrdProdutos());
                    statement.setInt(2, ordemProdutos.getFkprodutosOrdProdutos());
                    statement.setInt(3, ordemProdutos.getQtdProdutoOrdProdutos());
                    statement.setDouble(4, ordemProdutos.getValorParcialOrdProdutos());
                    statement.setDouble(5, ordemProdutos.getDescontoParcialOrdProdutos());

                    statement.executeUpdate();
                    statement.close();
                    break;

                // ENDERECO
                case INCLUSAOENDERECO:
                    sql = "insert into endereco values(null,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getBairro());
                    statement.setString(3, endereco.getLogradouro());
                    statement.setString(4, endereco.getComplemento());
                    statement.setString(5, endereco.getNumero());
                    statement.setString(6, endereco.getCidade());
                    statement.setString(7, endereco.getEstado());

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOENDERECO:
                    sql = "update endereco set   = ?,  = ?, = ?, = ?,"
                            + "   = ?,   = ?,   = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(8, endereco.getCep());
                    statement.setString(1, endereco.getCep());
                    statement.setString(2, endereco.getBairro());
                    statement.setString(3, endereco.getLogradouro());
                    statement.setString(4, endereco.getComplemento());
                    statement.setString(5, endereco.getNumero());
                    statement.setString(6, endereco.getCidade());
                    statement.setString(7, endereco.getEstado());

                    statement.executeUpdate();
                    statement.close();
                    break;

                default:
                    men = "Falha na operação!";
                    break;
            }
        } catch (SQLException erro) {
            men = "Falha na operação: \n" + erro.toString();
        }
        return men;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" PESQUISAR  CEP FUNCIONARIO ">
    public boolean cslEndereco(String cep) {
        boolean autenticado = false;

        try {

            sql = "select * from endereco where cep= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cep);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Acesso = rs.getString("cep");
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" PESQUISA CPF FUNCIONARIO">
    public boolean cslcpf(String cpf) {
        boolean autenticado = false;

        try {

            sql = "select * from funcionario where cpf= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, cpf);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Acesso = rs.getString("cpf");
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" PESQUISA USUARIO FUNCIONARIO">
    public boolean csluser(String login) {
        boolean autenticado = false;

        try {

            sql = "select * from usuario where login= ?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, login);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                Acesso = rs.getString("login");
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc=" METODO LOGAR USUARIO">
    public boolean LogarUsuario(String login, String Senha) {
        boolean autenticado = false;

        try {

            sql = "select * from usuario where login= ? and senha=?";
            bd.getConnection();
            statement = bd.connection.prepareStatement(sql);
            statement.setString(1, login);
            statement.setString(2, Senha);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {

                Perfil = rs.getString("perfil");
                autenticado = true;
            } else {
                rs.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return autenticado;
    }
    //</editor-fold>

}
