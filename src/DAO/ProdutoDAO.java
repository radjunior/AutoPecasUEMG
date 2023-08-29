package DAO;

import Model.Categoria;
import Model.Marca;
import Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutoDAO {

    PreparedStatement stmt;
    String sql;
    ResultSet rs;

    public void salvarProduto(Produto pro) throws SQLException {
        sql = "INSERT INTO produto VALUES(?,?,?,?,?,?,?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setInt(2, pro.getFkCategoria());
        stmt.setInt(3, pro.getFkMarca());
        stmt.setFloat(4, pro.getCodBarras());
        stmt.setString(5, pro.getDescricao());
        stmt.setString(6, pro.getUnidade());
        stmt.setFloat(7, pro.getPrecoCusto());
        stmt.setFloat(8, pro.getPrecoVenda());
        stmt.setFloat(9, pro.getQtde());
        stmt.execute();
        stmt.close();
    }

    public void salvarMarca(Marca mrc) throws SQLException {
        sql = "INSERT INTO Marca VALUES(?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, mrc.getNome());
        stmt.execute();
        stmt.close();
    }

    public void salvarCategoria(Categoria cat) throws SQLException {
        sql = "INSERT INTO Categoria VALUES(?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, cat.getNome());
        stmt.execute();
        stmt.close();
    }

    public List<Produto> pesquisarProduto(String desc) {
        Connection con = Conexao.getInstance();
        List<Produto> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE Descricao LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto prd = new Produto();
                prd.setIdProduto(rs.getInt("idProduto"));
                prd.setCodBarras(rs.getInt("CodigoDeBarras"));
                prd.setFkCategoria(rs.getInt("Categoria_idCategoria"));
                prd.setFkMarca(rs.getInt("Marca_idMarca"));
                prd.setDescricao(rs.getString("Descricao"));
                prd.setPrecoVenda(rs.getFloat("PrecoDeVenda"));
                prd.setPrecoCusto(rs.getFloat("PrecoDeCusto"));
                prd.setUnidade(rs.getString("Unidade"));
                prd.setQtde(rs.getFloat("QuantidadeDeProduto"));
                lista.add(prd);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Produto> pesquisarProdutoID(int desc) {
        Connection con = Conexao.getInstance();
        List<Produto> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM produto WHERE idProduto LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto prd = new Produto();
                prd.setIdProduto(rs.getInt("idProduto"));
                prd.setCodBarras(rs.getInt("CodigoDeBarras"));
                prd.setFkCategoria(rs.getInt("Categoria_idCategoria"));
                prd.setFkMarca(rs.getInt("Marca_idMarca"));
                prd.setDescricao(rs.getString("Descricao"));
                prd.setPrecoVenda(rs.getFloat("PrecoDeVenda"));
                prd.setPrecoCusto(rs.getFloat("PrecoDeCusto"));
                prd.setUnidade(rs.getString("Unidade"));
                prd.setQtde(rs.getFloat("QuantidadeDeProduto"));
                lista.add(prd);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Marca> pesquisarMarca(String desc) {
        Connection con = Conexao.getInstance();
        List<Marca> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Marca WHERE Nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Marca mrc = new Marca();
                mrc.setFkProduto(rs.getInt("idMarca"));
                mrc.setNome(rs.getString("Nome"));
                lista.add(mrc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Categoria> pesquisarCategoria(String desc) {
        Connection con = Conexao.getInstance();
        List<Categoria> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Categoria WHERE Categoria LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setFkProduto(rs.getInt("idCategoria"));
                cat.setNome(rs.getString("Categoria"));
                lista.add(cat);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Marca> preenchendoCBMarca() {
        Connection con = Conexao.getInstance();
        List<Marca> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Marca");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Marca mrc = new Marca();
                mrc.setNome(rs.getString("Nome"));
                mrc.setFkProduto(rs.getInt("idMarca"));
                lista.add(mrc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Categoria> preenchendoCBCategoria() {
        Connection con = Conexao.getInstance();
        List<Categoria> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Categoria");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setNome(rs.getString("Categoria"));
                cat.setFkProduto(rs.getInt("idCategoria"));
                lista.add(cat);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }
    public List<Produto> pesquisarIdProdutoMrcCat(int desc) {
        Connection con = Conexao.getInstance();
        List<Produto> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Produto WHERE idProduto LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Produto prd = new Produto();
                prd.setFkCategoria(rs.getInt("Categoria_idCategoria"));
                prd.setFkMarca(rs.getInt("Marca_idMarca"));
                prd.setPrecoCusto(rs.getFloat("PrecoDeCusto"));
                prd.setPrecoVenda(rs.getFloat("PrecoDeVenda"));
                lista.add(prd);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }
    public List<Categoria> pesquisarCategoriaID(int desc) {
        Connection con = Conexao.getInstance();
        List<Categoria> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Categoria WHERE IdCategoria LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setFkProduto(rs.getInt("idCategoria"));
                cat.setNome(rs.getString("Categoria"));
                lista.add(cat);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Marca> pesquisarMarcaID(int desc) {
        Connection con = Conexao.getInstance();
        List<Marca> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Marca WHERE IdMarca LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Marca mrc = new Marca();
                mrc.setFkProduto(rs.getInt("idMarca"));
                mrc.setNome(rs.getString("Nome"));
                lista.add(mrc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public void editarCategoria(Categoria cat) throws SQLException {
        sql = "UPDATE Categoria SET Categoria = ? WHERE idCategoria LIKE ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setString(1, cat.getNome());
        stmt.setInt(2, cat.getFkProduto());
        stmt.execute();
        stmt.close();
    }

    public void editarMarca(Marca mrc) throws SQLException {
        sql = "UPDATE Marca SET Nome = ? WHERE idMarca LIKE ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setString(1, mrc.getNome());
        stmt.setInt(2, mrc.getFkProduto());
        stmt.execute();
        stmt.close();
    }

    public void editarProduto(Marca mrc) throws SQLException {
        sql = "UPDATE Marca SET Nome = ? Where Nome LIKE ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, mrc.getNome());
        stmt.execute();
        stmt.close();
    }

    public void excluirCategoria(Categoria cat) throws SQLException {
        sql = "DELETE FROM Categoria WHERE idCategoria = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, cat.getFkProduto());
        stmt.execute();
        stmt.close();
    }

    public void excluirProduto(Produto prd) throws SQLException {
        sql = "DELETE FROM produto WHERE idProduto = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, prd.getIdProduto());
        stmt.execute();
        stmt.close();
    }

    public void excluirMarca(Marca mrc) throws SQLException {
        sql = "DELETE FROM Marca WHERE idMarca = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, mrc.getFkProduto());
        stmt.execute();
        stmt.close();
    }

    public Iterable<Produto> pesquisarProdutoFornecedor(String desc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
