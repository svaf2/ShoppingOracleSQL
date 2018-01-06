
package controller;

import conexao.EmpresasDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import model.Produtos;

public class BotaoProdutosController implements ActionListener {
    
    private JTextField tfNome, tfCodigo, tfMarca;
    private JComboBox<Produtos> pComboBox;
    private JRadioButton bCadastraProd, bAtualizaProd, bExcluiProd;
    private JTable tbProdutos;
    
    public BotaoProdutosController(JTextField tfNome, JTextField tfCodigo, 
            JTextField tfMarca, JComboBox<Produtos> pComboBox, 
            JRadioButton bCadastraProd, JRadioButton bAtualizaProd, 
            JRadioButton bExcluiProd, JTable tbProdutos) {
        
        this.tfNome = tfNome;
        this.tfCodigo = tfCodigo;
        this.tfMarca = tfMarca;
        this.pComboBox = pComboBox;
        this.bCadastraProd = bCadastraProd;
        this.bAtualizaProd = bAtualizaProd;
        this.bExcluiProd = bExcluiProd;
        this.tbProdutos = tbProdutos;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Produtos prod = new Produtos();
        if (pComboBox.getSelectedItem() != null){
            prod = (Produtos) pComboBox.getSelectedItem();
        }
        if (bExcluiProd.isSelected()) {
            exclui(prod);
        } else {
            prod.setNome(tfNome.getText());
            prod.setCod(tfCodigo.getText());
            prod.setMarca(tfMarca.getText());
            if (bCadastraProd.isSelected()) {
                cadastra(prod);
            } else {
                atualiza(prod);
            }
        }
        limpaCampos();
    }

    private void cadastra(Produtos prod) {
        try {
            EmpresasDao pDao = new EmpresasDao();
            pDao.insereProdutos(prod);
            JOptionPane.showMessageDialog(null, "Produto inserido com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            IProdutosController pController = new ProdutosController(tbProdutos);
            pController.tabelaProdutos();
            limpaCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void atualiza(Produtos prod) {
        try {
            EmpresasDao pDao = new EmpresasDao();
            pDao.atualizaProdutos(prod);
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            IProdutosController pController = new ProdutosController(pComboBox);
            pController.listaProdutos();
            pController = new ProdutosController(tbProdutos);
            pController.tabelaProdutos();
            limpaCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void exclui(Produtos prod) {
        try {
            EmpresasDao pDao = new EmpresasDao();
            pDao.excluiProdutos(prod);
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            IProdutosController pController = new ProdutosController(pComboBox);
            pController.listaProdutos();
            pController = new ProdutosController(tbProdutos);
            pController.tabelaProdutos();
            limpaCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpaCampos() {
        
        tfNome.setText("");
        tfCodigo.setText("");
        tfMarca.setText("");
    }
    
}
