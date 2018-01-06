
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Produtos;

public class ComboProdutosController implements ActionListener {
    
    JTextField tfNome, tfCodigo, tfMarca;
    JComboBox<Produtos> pComboBox;
    JRadioButton bExcluiProd;
    
    public ComboProdutosController (JTextField tfNome, JTextField tfCodigo,
            JTextField tfMarca, JComboBox<Produtos> pComboBox, JRadioButton bExcluiProd) {
        this.tfNome = tfNome;
        this.tfCodigo = tfCodigo;
        this.tfMarca = tfMarca;
        this.pComboBox = pComboBox;
        this.bExcluiProd = bExcluiProd;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (pComboBox.getItemCount() > 0){
            if (!bExcluiProd.isSelected()){
                Produtos prod = (Produtos) pComboBox.getSelectedItem();
                preencheCampos(prod);
            }
        }
    }

    private void preencheCampos(Produtos prod) {
        
        tfNome.setText(prod.getNome());
        tfCodigo.setText(prod.getCod());
        tfMarca.setText(prod.getMarca());
        
    }
    
}
