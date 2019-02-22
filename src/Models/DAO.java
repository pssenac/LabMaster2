package Models;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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

    public ConexaoBD bd;
    private PreparedStatement statement;
    public Statement stm;
    public ResultSet resultSet;
    private String men, sql;

    public static final byte INCLUSAOCLIENTE = 1;
    public static final byte ALTERACAOCLIENTE = 2;
    public static final byte INCLUSAOFUNCIONARIO = 3;
    public static final byte ALTERACAOFUNCIONARIO = 4;
    public static final byte INCLUSAOUSUARIO = 5;
    public static final byte ALTERACAOUSUARIO = 6;
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
        men = "Operação realizada com sucesso!";
        try {
            switch (operacao) {
                // CLIENTE 
                case INCLUSAOCLIENTE:

                    sql = "select * from endereco where cep = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, endereco.getCep());
                    
                    ResultSet fk = statement.executeQuery(sql);

                    if (fk.next()) {
                        fk.first();
                        int FK = fk.getInt("idendereco");
                        if (fk.wasNull()) {

                            sql = "insert into endereco (cep, bairro, logradouro, complemento, numero, "
                                    + "cidade, estado) values(?,?,?,?,?,?,?)";

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

                            sql = "select * from endereco where cep = ? and logradouro = ? and numero = ?";
                            bd.getConnection();
                            statement.setString(1, endereco.getCep());
                            statement.setString(2, endereco.getLogradouro());
                            statement.setString(3, endereco.getNumero());
                            statement = bd.connection.prepareStatement(sql);
                            fk = statement.executeQuery();
                            FK = fk.getInt("idendereco");
                        }

                        try {
                            String x = Integer.toString(FK);

                            bd.getConnection();
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

                        } catch (SQLException erro) {
                            JOptionPane.showMessageDialog(null, erro);

                        }
                    }
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
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
        return men;
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

                // FUNCIONARIO
                case INCLUSAOFUNCIONARIO:
                    sql = "insert into Funcionario values(null,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, funcionario.getNomeFuncionario());
                    statement.setString(2, funcionario.getCpfFuncionario());
                    statement.setString(3, funcionario.getRgFuncionario());
                    statement.setString(4, funcionario.getTelFuncionario());
                    statement.setString(5, funcionario.getCelFuncionario());
                    statement.setString(6, funcionario.getEmailFuncionario());
                    statement.setDate(7, (Date) funcionario.getDataNascFuncionario());
                    statement.setInt(8, funcionario.getFkEnderecoFuncionario());

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOFUNCIONARIO:
                    sql = "update Funcionario set   = ?,  = ?,  = ?,  = ?,"
                            + "   = ?,   = ?,   = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(9, funcionario.getIdFuncionario());
                    statement.setString(1, funcionario.getNomeFuncionario());
                    statement.setString(2, funcionario.getCpfFuncionario());
                    statement.setString(3, funcionario.getRgFuncionario());
                    statement.setString(4, funcionario.getTelFuncionario());
                    statement.setString(5, funcionario.getCelFuncionario());
                    statement.setString(6, funcionario.getEmailFuncionario());
                    statement.setDate(7, (Date) funcionario.getDataNascFuncionario());
                    statement.setInt(8, funcionario.getFkEnderecoFuncionario());
                    statement.executeUpdate();
                    statement.close();
                    break;

                //USUARIO
                case INCLUSAOUSUARIO:
                    sql = "insert into Usuario values(null,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, usuario.getLoginUsuario());
                    statement.setInt(2, usuario.getPerfilUsuario());
                    statement.setString(3, usuario.getSenhaUsuario());
                    statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
                    statement.setInt(5, usuario.getFkFuncionarioUsuario());
                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOUSUARIO:
                    sql = "update Usuario set   = ?,  = ?,"
                            + "   = ?,   = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(6, usuario.getLoginUsuario());
                    statement.setString(1, usuario.getLoginUsuario());
                    statement.setInt(2, usuario.getPerfilUsuario());
                    statement.setString(3, usuario.getSenhaUsuario());
                    statement.setString(4, usuario.getConfirmacaoSenhaUsuario());
                    statement.setInt(5, usuario.getFkFuncionarioUsuario());
                    statement.executeUpdate();
                    statement.close();
                    break;
                case EXCLUSAOUSUARIO:
                    sql = "delete from Usuario where  = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, usuario.getIdUsuario());
                    statement.executeUpdate();
                    statement.close();
                    break;

                // FORNECEDOR
                case INCLUSAOFORNECEDOR:
                    sql = "insert into fornecedor values(null,?,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, fornecedor.getCnpjFornecedor());
                    statement.setString(2, fornecedor.getNomeFornecedor());
                    statement.setString(3, fornecedor.getEmailFornecedor());
                    statement.setString(4, fornecedor.getRepresentanteFornecedor());
                    statement.setString(5, fornecedor.getRamoFornecedor());
                    statement.setString(6, fornecedor.getTelFornecedor());
                    statement.setString(7, fornecedor.getCelFornecedor());
                    statement.setString(8, fornecedor.getEmailRepresentante());
                    statement.setInt(9, fornecedor.getFkEnderecoFornecedor());

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOFORNECEDOR:
                    sql = "update fornecedor set   = ?,  = ?,  = ?,  = ?,"
                            + "   = ?,   = ?,   = ?, = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(10, fornecedor.getIdFornecedor());
                    statement.setString(1, fornecedor.getCnpjFornecedor());
                    statement.setString(2, fornecedor.getNomeFornecedor());
                    statement.setString(3, fornecedor.getEmailFornecedor());
                    statement.setString(4, fornecedor.getRepresentanteFornecedor());
                    statement.setString(5, fornecedor.getRamoFornecedor());
                    statement.setString(6, fornecedor.getTelFornecedor());
                    statement.setString(7, fornecedor.getCelFornecedor());
                    statement.setString(8, fornecedor.getEmailRepresentante());
                    statement.setInt(9, fornecedor.getFkEnderecoFornecedor());
                    statement.executeUpdate();
                    statement.close();
                    break;

                // PROODUTO
                case INCLUSAOPRODUTO:
                    sql = "insert into produtos values(null,?,?,?,?,?,?,?,?,?,?,?)";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(1, produto.getNomeProduto());
                    statement.setString(2, produto.getFabricanteProduto());
                    statement.setString(3, produto.getMarcaProduto());
                    statement.setString(4, produto.getDescricaoProduto());
                    statement.setDate(5, (Date) produto.getDataCompraProduto());
                    statement.setInt(6, produto.getQtdEstoqueProduto());
                    statement.setDouble(7, produto.getValorCustoProduto());
                    statement.setDouble(8, produto.getValorVendaProduto());
                    statement.setInt(9, produto.getSituaçaoProduto());
                    statement.setString(10, produto.getArmazemLocalProduto());
                    statement.setInt(11, produto.getFkFornecedorProduto());

                    statement.executeUpdate();
                    statement.close();
                    break;
                case ALTERACAOPRODUTO:
                    sql = "update produtos set   = ?,  = ?,  = ?,  = ?,  = ?,"
                            + "   = ?,   = ?,   = ?, = ?,  = ? where = ?";
                    bd.getConnection();
                    statement = bd.connection.prepareStatement(sql);
                    statement.setString(12, produto.getIdProduto());
                    statement.setString(1, produto.getNomeProduto());
                    statement.setString(2, produto.getFabricanteProduto());
                    statement.setString(3, produto.getMarcaProduto());
                    statement.setString(4, produto.getDescricaoProduto());
                    statement.setDate(5, (Date) produto.getDataCompraProduto());
                    statement.setInt(6, produto.getQtdEstoqueProduto());
                    statement.setDouble(7, produto.getValorCustoProduto());
                    statement.setDouble(8, produto.getValorVendaProduto());
                    statement.setInt(9, produto.getSituaçaoProduto());
                    statement.setString(10, produto.getArmazemLocalProduto());
                    statement.setInt(11, produto.getFkFornecedorProduto());

                    statement.executeUpdate();
                    statement.close();
                    break;

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
}
