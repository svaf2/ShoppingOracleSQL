
package conexao;

import java.util.List;
import java.sql.SQLException;
import model.Empresas;
import model.Produtos;

public interface IEmpresasDao {
    
    public void insereEmpresas (Empresas emp) throws SQLException;
    public void atualizaEmpresas (Empresas emp) throws SQLException;
    public void excluiEmpresas (Empresas emp) throws SQLException;
    public Empresas consultaEmpresa (Empresas emp) throws SQLException;
    public List<Empresas> consultaEmpresas() throws SQLException;
    public List<Empresas> consultaEmpresasNome(Empresas emp) throws SQLException;
    public List<Empresas> consultaEmpresasCnpj(Empresas emp) throws SQLException;
    public void criaEmpresas() throws SQLException;
    public void dropEmpresas() throws SQLException;
    public void insereProdutos (Produtos prod) throws SQLException;
    public void atualizaProdutos (Produtos prod) throws SQLException;
    public void excluiProdutos (Produtos prod) throws SQLException;
    public Produtos consultaProduto (Produtos prod) throws SQLException;
    public List<Produtos> consultaProdutos() throws SQLException;
    public void criaProdutos() throws SQLException;
    public void dropProdutos() throws SQLException;
    
}
