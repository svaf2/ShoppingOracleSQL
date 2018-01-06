
package controller;

import conexao.EmpresasDao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Produtos;

public class ProdutosController implements IProdutosController {
    
    private JComboBox<Produtos> comboBox;
    private JTable tbProdutos;
    
    public ProdutosController (JComboBox<Produtos> comboBox) {
        this.comboBox = comboBox;
    }
    
    public ProdutosController (JTable tabelaProdutos) {
        this.tbProdutos = tabelaProdutos;
    }

    @Override
    public void listaProdutos() {
        try {
            EmpresasDao pDao = new EmpresasDao();
            List<Produtos> listaProdutos = pDao.consultaProdutos();
            if (comboBox.getItemCount() > 0) {
                comboBox.removeAllItems();
            }
            if (listaProdutos != null) {
                for (Produtos e : listaProdutos) {
                    comboBox.addItem(e);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void tabelaProdutos() {
        if (tbProdutos != null) {
            DefaultTableModel modelo = (DefaultTableModel) tbProdutos.getModel();
            if (modelo.getRowCount() > 0) {
                modelo.setRowCount(0);
            } try {
                EmpresasDao pDao = new EmpresasDao();
                List<Produtos> listaProdutos = pDao.consultaProdutos();
                for (Produtos p : listaProdutos) {
                    Object[] linha = new Object[3];
                    linha[0] = p.getNome();
                    linha[1] = p.getCod();
                    linha[2] = p.getMarca();
                    modelo.addRow(linha);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    
    
}
