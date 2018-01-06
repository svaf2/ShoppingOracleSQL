
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
import model.Empresas;

public class BotaoEmpresasController implements ActionListener {
    private JTextField tfNomeFantasia, tfRazaoSocial, tfCNPJ, tfRamo, tfEmail, tfSite;
    private JRadioButton bCadastraEmp, bAtualizaEmp, bExcluiEmp;
    private JComboBox<Empresas> comboBox;
    private JTable tbEmpresas;
    
    public BotaoEmpresasController(JTextField tfNomeFantasia, 
            JTextField tfRazaoSocial, JTextField tfCNPJ, JTextField tfRamo, 
            JTextField tfEmail, JTextField tfSite, JRadioButton bCadastraEmp, 
            JRadioButton bAtualizaEmp, JRadioButton bExcluiEmp,
            JComboBox<Empresas> comboBox, JTable tbEmpresas){
        
        this.tfNomeFantasia = tfNomeFantasia;
        this.tfRazaoSocial = tfRazaoSocial;
        this.tfCNPJ = tfCNPJ;
        this.tfRamo = tfRamo;
        this.tfEmail = tfEmail;
        this.tfSite = tfSite;
        this.bCadastraEmp = bCadastraEmp;
        this.bAtualizaEmp = bAtualizaEmp;
        this.bExcluiEmp = bExcluiEmp;
        this.comboBox = comboBox;
        this.tbEmpresas = tbEmpresas;
        
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Empresas emp = new Empresas();
        if (comboBox.getSelectedItem() != null){
            emp = (Empresas) comboBox.getSelectedItem();
        }
        if (bExcluiEmp.isSelected()) {
            exclui(emp);
        } else {
            emp.setNomeFantasia(tfNomeFantasia.getText());
            emp.setRazaoSoc(tfRazaoSocial.getText());
            emp.setCnpj(tfCNPJ.getText());
            emp.setRamo(tfRamo.getText());
            emp.setEmail(tfEmail.getText());
            emp.setSite(tfSite.getText());
            if (bCadastraEmp.isSelected()) {
                cadastra(emp);
            } else {
                atualiza(emp);
            }
        }
        limpaCampos();
    }
    
    private void limpaCampos() {
        
        tfNomeFantasia.setText("");
        tfRazaoSocial.setText("");
        tfCNPJ.setText("");
        tfRamo.setText("");
        tfEmail.setText("");
        tfSite.setText("");
        
    }

    private void cadastra(Empresas emp) {
        try {
            EmpresasDao eDao = new EmpresasDao();
            eDao.insereEmpresas(emp);
            JOptionPane.showMessageDialog(null, "Empresa inserida com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            IEmpresasController eController = new EmpresasController(tbEmpresas);
            eController.tabelaEmpresas();
            limpaCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualiza(Empresas emp) {
        try {
            EmpresasDao eDao = new EmpresasDao();
            eDao.atualizaEmpresas(emp);
            JOptionPane.showMessageDialog(null, "Empresa atualizada com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            IEmpresasController eController = new EmpresasController(comboBox);
            eController.listaEmpresas();
            eController = new EmpresasController(tbEmpresas);
            eController.tabelaEmpresas();
            limpaCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void exclui(Empresas emp) {
        try {
            EmpresasDao eDao = new EmpresasDao();
            eDao.excluiEmpresas(emp);
            JOptionPane.showMessageDialog(null, "Empresa excluída com sucesso!",
                    "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            IEmpresasController eController = new EmpresasController(comboBox);
            eController.listaEmpresas();
            eController = new EmpresasController(tbEmpresas);
            eController.tabelaEmpresas();
            limpaCampos();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}
