
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Empresas;

public class RadioEmpresasController implements ActionListener {
    
    JTextField tfNomeFantasia, tfRazaoSocial, tfCNPJ, tfRamo, tfEmail, tfSite;
    JLabel lbEmpresa, lbNomeFantasia, lbRazaoSocial, lbCNPJ, lbRamo, lbEmail, lbSite;
    JRadioButton bCadastraEmp, bAtualizaEmp, bExcluiEmp;
    JButton bEnviar;
    JComboBox<Empresas> comboBox;
    
    public RadioEmpresasController (JTextField tfNomeFantasia, JTextField tfRazaoSocial, JTextField tfCNPJ, 
            JTextField tfRamo, JTextField tfEmail, JTextField tfSite, JLabel lbEmpresa, JLabel lbNomeFantasia, 
            JLabel lbRazaoSocial, JLabel lbCNPJ, JLabel lbRamo, JLabel lbEmail, JLabel lbSite, 
            JRadioButton bCadastraEmp, JRadioButton bAtualizaEmp, JRadioButton bExcluiEmp,
            JButton bEnviar, JComboBox<Empresas> comboBox){
        
        this.tfNomeFantasia = tfNomeFantasia;
        this.tfRazaoSocial = tfRazaoSocial;
        this.tfCNPJ = tfCNPJ;
        this.tfRamo = tfRamo;
        this.tfEmail = tfEmail;
        this.tfSite = tfSite;
        this.lbEmpresa = lbEmpresa;
        this.lbNomeFantasia = lbNomeFantasia;
        this.lbRazaoSocial = lbRazaoSocial;
        this.lbCNPJ = lbCNPJ;
        this.lbRamo = lbRamo;
        this.lbEmail = lbEmail;
        this.lbSite = lbSite;
        this.bCadastraEmp = bCadastraEmp;
        this.bAtualizaEmp = bAtualizaEmp;
        this.bExcluiEmp = bExcluiEmp;
        this.bEnviar = bEnviar;
        this.comboBox = comboBox;
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        limpaCampos();
        if (bCadastraEmp.isSelected()) {
            montaTelaCadastro();
        } else {
            IEmpresasController eController = new EmpresasController(comboBox);
            eController.listaEmpresas();
            if (bAtualizaEmp.isSelected()){
                montaTelaAtualiza();
            } else {
                montaTelaExclui();
            }
        }
    }
    
    private void limpaCampos() {
        
        tfNomeFantasia.setText("");
        tfRazaoSocial.setText("");
        tfCNPJ.setText("");
        tfRamo.setText("");
        tfEmail.setText("");
        tfSite.setText("");
        
    }
    
    private void montaTelaCadastro() {
        
        lbEmpresa.setVisible(false);
        lbNomeFantasia.setVisible(true);
        lbRazaoSocial.setVisible(true);
        lbCNPJ.setVisible(true);
        lbRamo.setVisible(true);
        lbEmail.setVisible(true);
        lbSite.setVisible(true);
        tfNomeFantasia.setVisible(true);
        tfRazaoSocial.setVisible(true);
        tfCNPJ.setVisible(true);
        tfRamo.setVisible(true);
        tfEmail.setVisible(true);
        tfSite.setVisible(true);
        comboBox.setVisible(false);
        bEnviar.setVisible(true);
       
    }

    private void montaTelaAtualiza() {
        
        lbNomeFantasia.setVisible(true);
        lbRazaoSocial.setVisible(true);
        lbCNPJ.setVisible(true);
        lbRamo.setVisible(true);
        lbEmail.setVisible(true);
        lbSite.setVisible(true);
        lbEmpresa.setVisible(true);
        tfNomeFantasia.setVisible(true);
        tfRazaoSocial.setVisible(true);
        tfCNPJ.setVisible(true);
        tfRamo.setVisible(true);
        tfEmail.setVisible(true);
        tfSite.setVisible(true);
        comboBox.setVisible(true);
        bEnviar.setVisible(true);
        
    }

    private void montaTelaExclui() {
        
        lbNomeFantasia.setVisible(false);
        lbRazaoSocial.setVisible(false);
        lbCNPJ.setVisible(false);
        lbRamo.setVisible(false);
        lbEmail.setVisible(false);
        lbSite.setVisible(false);
        lbEmpresa.setVisible(false);
        tfNomeFantasia.setVisible(false);
        tfRazaoSocial.setVisible(false);
        tfCNPJ.setVisible(false);
        tfRamo.setVisible(false);
        tfEmail.setVisible(false);
        tfSite.setVisible(false);
        comboBox.setVisible(true);
        bEnviar.setVisible(true);
        
    }
    
}
