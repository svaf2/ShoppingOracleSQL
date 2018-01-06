
package controller;

import conexao.EmpresasDao;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.Empresas;

public class EmpresasController implements IEmpresasController {
    
    private JComboBox<Empresas> comboBox;
    private JTable tbEmpresas;
    
    public EmpresasController(JComboBox<Empresas> comboBox) {
        this.comboBox = comboBox;
    }
    
    public EmpresasController(JTable tbEmpresas) {
        this.tbEmpresas = tbEmpresas;
    }

    @Override
    public void listaEmpresas() {
        
        try {
            EmpresasDao eDao = new EmpresasDao();
            List<Empresas> listaEmpresas = eDao.consultaEmpresas();
            if (comboBox.getItemCount() > 0) {
                comboBox.removeAllItems();
            }
            if (listaEmpresas != null) {
                for (Empresas e : listaEmpresas) {
                    comboBox.addItem(e);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    @Override
    public void tabelaEmpresas() {
        if (tbEmpresas != null) {
            DefaultTableModel modelo = (DefaultTableModel) tbEmpresas.getModel();
            if (modelo.getRowCount() > 0) {
                modelo.setRowCount(0);
            } try {
                EmpresasDao eDao = new EmpresasDao();
                List<Empresas> listaEmpresas = eDao.consultaEmpresas();
                for (Empresas e : listaEmpresas) {
                    Object[] linha = new Object[6];
                    linha[0] = e.getNomeFantasia();
                    linha[1] = e.getRazaoSoc();
                    linha[2] = e.getCnpj();
                    linha[3] = e.getRamo();
                    linha[4] = e.getEmail();
                    linha[5] = e.getSite();
                    modelo.addRow(linha);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }
    
    
}
