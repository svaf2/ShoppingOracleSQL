
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Empresas;

public class ComboEmpresasController implements ActionListener {

    JTextField tfNomeFantasia, tfRazaoSocial, tfCNPJ, tfRamo, tfEmail, tfSite;
    JComboBox<Empresas> comboBox;
    JRadioButton bExcluiEmp;
    
    public ComboEmpresasController (JTextField tfNomeFantasia, JTextField tfRazaoSocial, 
            JTextField tfCNPJ, JTextField tfRamo, JTextField tfEmail, JTextField tfSite,
            JComboBox<Empresas> comboBox, JRadioButton bExcluiEmp){
        
        this.tfNomeFantasia = tfNomeFantasia;
        this.tfRazaoSocial = tfRazaoSocial;
        this.tfCNPJ = tfCNPJ;
        this.tfRamo = tfRamo;
        this.tfEmail = tfEmail;
        this.tfSite = tfSite;
        this.comboBox = comboBox;
        this.bExcluiEmp = bExcluiEmp;
        
    }
       
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (comboBox.getItemCount() > 0){
            if (!bExcluiEmp.isSelected()){
                Empresas emp = (Empresas) comboBox.getSelectedItem();
                preencheCampos(emp);
            }
        }

    }

    private void preencheCampos(Empresas emp) {
        
        tfNomeFantasia.setText(emp.getNomeFantasia());
        tfRazaoSocial.setText(emp.getRazaoSoc());
        tfCNPJ.setText(emp.getCnpj());
        tfRamo.setText(emp.getRamo());
        tfEmail.setText(emp.getEmail());
        tfSite.setText(emp.getSite());
        
    }
    
    
}
