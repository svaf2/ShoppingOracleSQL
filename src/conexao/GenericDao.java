
package conexao;

import java.sql.Connection;
import oracle.jdbc.pool.OracleDataSource;


public class GenericDao implements IGenericDao {
    

    public static Connection con;
    public static String url;
    public static String user;
    public static String password;

    @Override
    public Connection getConnection() {
        
        url = "jdbc:oracle:thin:@oracle11g.cin.ufpe.br:1521:Instance01"; 
        user = "u_svaf2";
        password = "hjeeobui";
        
        try{
            
           OracleDataSource ds = new OracleDataSource();
           ds.setURL(url);
           ds.getConnection(user,password);
           con = ds.getConnection(user,password);
           System.out.println("Conexao Realizada");
           
        } catch(Exception e) {

           System.out.println("Ocorreu um erro " + e.getMessage());
           System.exit(0);
        }
        return con;
    }
    
}
