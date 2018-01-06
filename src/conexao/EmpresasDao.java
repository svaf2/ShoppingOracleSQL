
package conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Empresas;
import model.Produtos;

public class EmpresasDao implements IEmpresasDao {
    
    private Connection con;
    
    public EmpresasDao(){
        IGenericDao gDao = new GenericDao();
        con = gDao.getConnection();
    }

    @Override
    public void insereEmpresas(Empresas emp) throws SQLException {
        String sql = "INSERT INTO empresa (nome_fantasia, razao_soc, cnpj, ramo, email, site) VALUES (?,?,?,?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, emp.getNomeFantasia());
            ps.setString(2, emp.getRazaoSoc());
            ps.setString(3, emp.getCnpj());
            ps.setString(4, emp.getRamo());
            ps.setString(5, emp.getEmail());
            ps.setString(6, emp.getSite());
            ps.execute();
        }
        con.close();
    }

    @Override
    public void atualizaEmpresas(Empresas emp) throws SQLException {
        String sql = "UPDATE empresa SET nome_fantasia = ?, razao_soc = ?, ramo = ?, email = ?, site = ? WHERE cnpj = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, emp.getNomeFantasia());
            ps.setString(2, emp.getRazaoSoc());
            ps.setString(3, emp.getRamo());
            ps.setString(4, emp.getEmail());
            ps.setString(5, emp.getSite());
            ps.setString(6, emp.getCnpj());
            ps.execute();
        }
        con.close();
    }

    @Override
    public void excluiEmpresas(Empresas emp) throws SQLException {
        String sql = "DELETE empresa WHERE cnpj = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, emp.getCnpj());
            ps.execute();
        }
        con.close();
    }

    @Override
    public Empresas consultaEmpresa(Empresas emp) throws SQLException {
        String sql = "SELECT nome_fantasia, razao_soc, cnpj, ramo, email, site FROM empresa WHERE cnpj = ?";
        ResultSet rs;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, emp.getCnpj());
            rs = ps.executeQuery();
        }
        rs.close();
        con.close();
        return emp;
    }

    @Override
    public List<Empresas> consultaEmpresas() throws SQLException {
        List<Empresas> listaEmpresas = new ArrayList<>();
        String sql = "SELECT nome_fantasia, razao_soc, cnpj, ramo, email, site FROM empresa";
        ResultSet rs;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            rs = ps.executeQuery();
            while (rs.next()){
                Empresas emp = new Empresas();
                emp.setNomeFantasia(rs.getString("nome_fantasia"));
                emp.setRazaoSoc(rs.getString("razao_soc"));
                emp.setCnpj(rs.getString("cnpj"));
                emp.setRamo(rs.getString("ramo"));
                emp.setEmail(rs.getString("email"));
                emp.setSite(rs.getString("site"));
                listaEmpresas.add(emp);
            }
        }
        rs.close();
        con.close();
        return listaEmpresas;
    }
    
    @Override
    public List<Empresas> consultaEmpresasNome(Empresas empresa) throws SQLException {
        List<Empresas> listaEmpresas = new ArrayList<>();
        String sql = "SELECT nome_fantasia, razao_soc, cnpj, ramo, email, site FROM empresa WHERE nome_fantasia LIKE ?";
        ResultSet rs;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, empresa.getNomeFantasia());
            rs = ps.executeQuery();
            while (rs.next()){
                Empresas emp = new Empresas();
                emp.setNomeFantasia(rs.getString("nome_fantasia"));
                emp.setRazaoSoc(rs.getString("razao_soc"));
                emp.setCnpj(rs.getString("cnpj"));
                emp.setRamo(rs.getString("ramo"));
                emp.setEmail(rs.getString("email"));
                emp.setSite(rs.getString("site"));
                listaEmpresas.add(emp);
            }
        }
        rs.close();
        con.close();
        return listaEmpresas;
    }

    @Override
    public List<Empresas> consultaEmpresasCnpj(Empresas empresa) throws SQLException {
        List<Empresas> listaEmpresas = new ArrayList<>();
        String sql = "SELECT nome_fantasia, razao_soc, cnpj, ramo, email, site FROM empresa WHERE cnpj LIKE ?";
        ResultSet rs;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, empresa.getCnpj());
            rs = ps.executeQuery();
            while (rs.next()){
                Empresas emp = new Empresas();
                emp.setNomeFantasia(rs.getString("nome_fantasia"));
                emp.setRazaoSoc(rs.getString("razao_soc"));
                emp.setCnpj(rs.getString("cnpj"));
                emp.setRamo(rs.getString("ramo"));
                emp.setEmail(rs.getString("email"));
                emp.setSite(rs.getString("site"));
                listaEmpresas.add(emp);
            }
        }
        rs.close();
        con.close();
        return listaEmpresas;
    }
    
    @Override
    public void criaEmpresas() throws SQLException {
            String sql = "CREATE TABLE empresa (" +
            "    nome_fantasia   VARCHAR2(30 CHAR) NOT NULL," +
            "    razao_soc       VARCHAR2(50 CHAR) NOT NULL," +
            "    cnpj            CHAR(14 BYTE) NOT NULL," +
            "    ramo            VARCHAR2(20 CHAR) NOT NULL," +
            "    email           VARCHAR2(50 CHAR) NOT NULL," +
            "    site            VARCHAR2(30 CHAR)," +
            "    CONSTRAINT empresa_pk PRIMARY KEY ( cnpj )" +
            ")";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.execute();
        }
        con.close();
    }
    
    @Override
    public void dropEmpresas() throws SQLException {
        String sql = "DROP TABLE empresa";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.execute();
        }
        con.close();
    }
    
    @Override
    public void insereProdutos(Produtos prod) throws SQLException {
        String sql = "INSERT INTO produto (nome, cod, marca) VALUES (?,?,?)";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, prod.getNome());
            ps.setString(2, prod.getCod());
            ps.setString(3, prod.getMarca());
            ps.execute();
        }
        con.close();
    }

    @Override
    public void atualizaProdutos(Produtos prod) throws SQLException {
         String sql = "UPDATE produto SET nome = ?, marca = ? WHERE cod = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, prod.getNome());
            ps.setString(2, prod.getMarca());
            ps.setString(3, prod.getCod());
            ps.execute();
        }
        con.close();
    }

    @Override
    public void excluiProdutos(Produtos prod) throws SQLException {
                 String sql = "DELETE produto WHERE cod = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, prod.getCod());
            ps.execute();
        }
        con.close();
    }

    @Override
    public Produtos consultaProduto(Produtos prod) throws SQLException {
        String sql = "SELECT nome, cod, marca FROM produto WHERE cod = ?";
        ResultSet rs;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, prod.getCod());
            rs = ps.executeQuery();
        }
        rs.close();
        con.close();
        return prod;
    }

    @Override
    public List<Produtos> consultaProdutos() throws SQLException {
        List<Produtos> listaProdutos = new ArrayList<>();
        String sql = "SELECT nome, cod, marca FROM produto";
        ResultSet rs;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            rs = ps.executeQuery();
            while (rs.next()){
                Produtos prod = new Produtos();
                prod.setNome(rs.getString("nome"));
                prod.setCod(rs.getString("cod"));
                prod.setMarca(rs.getString("marca"));
                listaProdutos.add(prod);
            }
        }
        rs.close();
        con.close();
        return listaProdutos;
    }
    
    public List<Produtos> consultaProdutosNome(Produtos produto) throws SQLException {
        List<Produtos> listaProdutos = new ArrayList<>();
        String sql = "SELECT nome, cod, marca FROM produto WHERE nome LIKE ?";
        ResultSet rs;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, produto.getNome());
            rs = ps.executeQuery();
            while (rs.next()){
                Produtos prod = new Produtos();
                prod.setNome(rs.getString("nome"));
                prod.setCod(rs.getString("cod"));
                prod.setMarca(rs.getString("marca"));
                listaProdutos.add(prod);
            }
        }
        rs.close();
        con.close();
        return listaProdutos;
    }
        
    public List<Produtos> consultaProdutosCnpj(Produtos produto) throws SQLException {
        List<Produtos> listaProdutos = new ArrayList<>();
        String sql = "SELECT nome, cod, marca FROM produto WHERE cod LIKE ?";
        ResultSet rs;
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, produto.getNome());
            rs = ps.executeQuery();
            while (rs.next()){
                Produtos prod = new Produtos();
                prod.setNome(rs.getString("nome"));
                prod.setCod(rs.getString("cod"));
                prod.setMarca(rs.getString("marca"));
                listaProdutos.add(prod);
            }
        }
        rs.close();
        con.close();
        return listaProdutos;
    }

    @Override
    public void criaProdutos() throws SQLException {
        String sql = "CREATE TABLE produto (" +
        "    nome       VARCHAR2(30 CHAR) NOT NULL," +
        "    cod        VARCHAR2(13 BYTE) NOT NULL," +
        "    marca      VARCHAR2(15 CHAR) NOT NULL," +
        "    CONSTRAINT produto_pk PRIMARY KEY ( cod )" +
        ")";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.execute();
        }
        con.close();
    }

    @Override
    public void dropProdutos() throws SQLException {
        String sql = "DROP TABLE produto";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.execute();
        }
        con.close();
    }

}
   
