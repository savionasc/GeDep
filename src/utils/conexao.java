package utils;
import java.sql.*;
import javax.swing.*;

public class conexao
{
       // final private String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
        // voces verão ainda como efetuar conexão com diversos bancos
        final private String url = "jdbc:odbc:gedep";
        final private String usuario = "root";
        final private String senha = "";
        private Connection conexao;
        public Statement statement;
        public ResultSet resultset;
        
       public boolean conecta()
       {
           boolean result = true;
           try {
               Class.forName("com.mysql.jdbc.Driver");
               try {
                   conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/gedep", "root", "");
                   //JOptionPane.showMessageDialog(null,"conectou");
               } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(null, "ocorrou um erro de sql");
               }
           } catch (ClassNotFoundException ex) {
               JOptionPane.showMessageDialog(null, "não deu certo");
               result = false;
           }
            return result; 
       }
       
       public void desconecta()
       {
            boolean result = true;
            try 
            {
                conexao.close();
                JOptionPane.showMessageDialog(null,"banco fechado");
            }
            catch(SQLException fecha) 
            {
                JOptionPane.showMessageDialog(null,"Não foi possivel "+
                        "fechar o banco de dados: "+fecha);
                result = false;
            }

       }
       
       public void executeSQL(String sql)
       {
            try 
            {
                statement = conexao.createStatement(
                        ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
                resultset = statement.executeQuery(sql);
            }
            catch(SQLException sqlex) 
            {
               JOptionPane.showMessageDialog(null,"Não foi possível "+
                       "executar o comando sql,"+sqlex+", o sql passado foi "+sql);
            }

       }
       
}
