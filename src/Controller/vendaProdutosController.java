package Controller;

import Models.DAO;
import Models.Venda;
import javax.swing.JOptionPane;

public class vendaProdutosController {

    public void salvarVenda(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j, String k) {
        DAO dao = new DAO();
        
        dao.VendaCarrinho.setDesconto(a);
        dao.VendaCarrinho.setTipoPagamento(b);
        dao.VendaCarrinho.setDataVenda(c);
        dao.VendaCarrinho.setObservacao(d);
        dao.VendaCarrinho.setEstorno(e);
        dao.VendaCarrinho.setIcms(f);
        dao.VendaCarrinho.setIss(g);
        dao.VendaCarrinho.setIpi(h);
        dao.VendaCarrinho.setFKfuncionario(i);
        dao.VendaCarrinho.setCodVenda(j);
        dao.VendaCarrinho.setCodFuncionário(k);       

        JOptionPane.showMessageDialog(null, dao.Atualizarvendas(DAO.INCLUSAOVENDA));
    }

    public void salvarLoteVenda(String a, String b, String c, String d, String e) {
        DAO dao = new DAO();
        dao.vendaProdutos.setFkLoteVendas(a);
        dao.vendaProdutos.setQtd(b);
        dao.vendaProdutos.setDescontoItemVendProduto(c);
        dao.vendaProdutos.setValorParcialVendProduto(d);
        dao.vendaProdutos.setCodVenda(e);
        

        JOptionPane.showMessageDialog(null, dao.Atualizarvendas(DAO.INCLUSAOVENDAPRODUTO));
    }

    public Venda preencherCarrinho(String a,String b,String c,String d,String e,String f,String g,String h) {
            DAO dao = new DAO();

        dao.venda.setA(a);
        dao.venda.setB(b);
        dao.venda.setC(c);
        dao.venda.setD(d);
        dao.venda.setE(e);
        dao.venda.setF(f);
        dao.venda.setG(g);
        dao.venda.setH(h);
        
        
        return dao.venda;
    }

}
