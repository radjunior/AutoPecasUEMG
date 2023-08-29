package DAO;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Conexao implements Serializable {

    private static Conexao conexao = null;
    private static Connection connection;
    private String usuario;
    private String senha;
    private String url;
    private String driver;

    public Conexao() {
        usuario = "root";
        senha = "Juninho$2018";        
        url = "jdbc:mysql://localhost:3306/autopecas";
        driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException | SQLException exc) {
            JOptionPane.showMessageDialog(null, "Erro na conexão: \n"+exc);
            JOptionPane.showMessageDialog(null, "Conexão: \n"+connection);
        }
    }

    public static Connection getInstance() {
        if (conexao == null) {
            synchronized (Conexao.class) {
                conexao = new Conexao();
            }
        }
        return connection;
    }

    public static void closeInstance(Connection con, PreparedStatement stmt, ResultSet rs) throws SQLException {
        if (conexao != null) {
            connection.close();
        }
    }
    public static void closeInstance(PreparedStatement stmt, ResultSet rs) throws SQLException {
        if (conexao != null) {
            connection.close();
        }
    }
    public static void closeInstance(Connection con, PreparedStatement stmt) throws SQLException {
        if (conexao != null) {
            connection.close();
        }
    }

    public static void setAutoCommit(boolean vlr) throws SQLException {
        connection.setAutoCommit(vlr);
    }

    public static void commit() throws SQLException {
        connection.commit();
    }

    public static void rollback() throws SQLException {
        connection.rollback();
    }
}
