
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Produtos;

public class RadioProdutosController implements ActionListener {
    
    JTextField tfNome, tfCodigo, tfMarca;
    JLabel lbProduto, lbNome, lbCodigo, lbMarca;
    JComboBox<Produtos> pComboBox;
    JRadioButton bCadastraProd, bAtualizaProd, bExcluiProd;
    JButton bEnviarProd;
    
    public RadioProdutosController (JTextField tfNome, JTextField tfCodigo, 
            JTextField tfMarca, JLabel lbProduto, JLabel lbNome, JLabel lbCodigo,
            JLabel lbMarca, JComboBox<Produtos> pComboBox, JRadioButton bCadastraProd,
            JRadioButton bAtualizaProd, JRadioButton bExcluiProd, JButton bEnviarProd){
        
        this.tfNome = tfNome;
        this.tfCodigo = tfCodigo;
        this.tfMarca = tfMarca;
        this.lbProduto = lbProduto;
        this.lbNome = lbNome;
        this.lbCodigo = lbCodigo;
        this.lbMarca = lbMarca;
        this.pComboBox = pComboBox;
        this.bCadastraProd = bCadastraProd;
        this.bAtualizaProd = bAtualizaProd;
        this.bExcluiProd = bExcluiProd;
        this.bEnviarProd = bEnviarProd;
          
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        limpaCampos();
        if (bCadastraProd.isSelected()) {
            pMontaTelaCadastro();
        } else {
            IProdutosController pController = new ProdutosController(pComboBox);
            pController.listaProdutos();
            if (bAtualizaProd.isSelected()){
                montaTelaAtualiza();
            } else {
                montaTelaExclui();
            }
        }
    }

    private void limpaCampos() {
        
        tfNome.setText("");
        tfCodigo.setText("");
        tfMarca.setText("");
        
    }

    private void pMontaTelaCadastro() {
        
        tfNome.setVisible(true);
        tfCodigo.setVisible(true);
        tfMarca.setVisible(true);
        lbProduto.setVisible(false);
        lbNome.setVisible(true);
        lbCodigo.setVisible(true);
        lbMarca.setVisible(true);
        pComboBox.setVisible(false);
        bEnviarProd.setVisible(true);
        
    }

    private void montaTelaAtualiza() {
        
        tfNome.setVisible(true);
        tfCodigo.setVisible(true);
        tfMarca.setVisible(true);
        lbProduto.setVisible(true);
        lbNome.setVisible(true);
        lbCodigo.setVisible(true);
        lbMarca.setVisible(true);
        pComboBox.setVisible(true);
        bEnviarProd.setVisible(true);
        
    }

    private void montaTelaExclui() {
        
        tfNome.setVisible(false);
        tfCodigo.setVisible(false);
        tfMarca.setVisible(false);
        lbProduto.setVisible(true);
        lbNome.setVisible(false);
        lbCodigo.setVisible(false);
        lbMarca.setVisible(false);
        pComboBox.setVisible(true);
        bEnviarProd.setVisible(true);
        
    }
    
}
