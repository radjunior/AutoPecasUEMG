package DAO;

import Model.Categoria;
import Model.Entrada;
import Model.Fornecedor;
import Model.Marca;
import Model.Pessoa;
import Model.PessoaFisica;
import Model.PessoaJuridica;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroDAO {

    PreparedStatement stmt;
    String sql;
    ResultSet rs;

    public void salvarPessoa(Pessoa pes) throws SQLException {
        sql = "INSERT INTO Pessoa VALUES(?,?,?,?,?,?,?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, pes.getNome());
        stmt.setString(3, pes.getEndereco());
        stmt.setString(4, pes.getCidade());
        stmt.setString(5, pes.getBairro());
        stmt.setString(6, pes.getCep());
        stmt.setString(7, pes.getTelefone());
        stmt.setString(8, pes.getCelular());
        stmt.setString(9, pes.getEmail());
        stmt.execute();
        stmt.close();
    }

    public void salvarUsr(Usuario usr) throws SQLException {
        sql = "INSERT INTO funcionario VALUES(?,LAST_INSERT_ID(),?,?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, usr.getCargo());
        stmt.setInt(3, usr.getAcesso());
        stmt.setString(4, usr.getUsuario());
        stmt.setString(5, usr.getSenha());
        stmt.execute();
        stmt.close();
    }

    public void salvarPJ(PessoaJuridica pj) throws SQLException {
        sql = "INSERT INTO juridica VALUES(?,LAST_INSERT_ID(),?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, pj.getCnpj());
        stmt.setString(3, pj.getInscricaoSocial());
        stmt.setFloat(4, pj.getCredito());
        stmt.execute();
        stmt.close();
    }

    public void salvarPF(PessoaFisica pf) throws SQLException {
        sql = "INSERT INTO Fisica VALUES(?,LAST_INSERT_ID(),?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, pf.getCpf());
        stmt.setString(3, pf.getRg());
        stmt.setFloat(4, pf.getCredito());
        stmt.execute();
        stmt.close();
    }

    public void salvarForn(Fornecedor frn) throws SQLException {
        sql = "INSERT INTO fornecedor VALUES(?,LAST_INSERT_ID(),?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setString(2, frn.getCnpj());
        stmt.setString(3, frn.getInscricaoSocial());
        stmt.setString(4, frn.getRamoAtividade());
        stmt.execute();
        stmt.close();
    }

    public void salvarEntrada(Entrada etr) throws SQLException {
        sql = "INSERT INTO entrada VALUES(?,?,?,?,?,?,?,?,?,?)";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, 0);
        stmt.setInt(2, etr.getIdFornecedor());
        stmt.setInt(3, etr.getIdProduto());
        stmt.setString(4, etr.getChaveReceita());
        stmt.setInt(5, etr.getIdNota());
        stmt.setString(6, etr.getDataEmissao());
        stmt.setString(7, etr.getDataCadastro());
        stmt.setInt(8, etr.getQtdeTotal());
        stmt.setFloat(9, etr.getPrecoCusto());
        stmt.setFloat(10, etr.getPrecoVenda());
        stmt.execute();
        stmt.close();
    }

    public List<Usuario> pesquisarUsuarioLogin(String desc) {
        Connection con = Conexao.getInstance();
        List<Usuario> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa INNER JOIN funcionario ON funcionario.Pessoa_idPessoa = pessoa.idPessoa WHERE Login LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usr = new Usuario();
                usr.setNome(rs.getString("Nome"));
                usr.setUsuario(rs.getString("Login"));
                usr.setSenha(rs.getString("Senha"));
                usr.setAcesso(rs.getInt("Acesso"));
                usr.setCargo(rs.getString("Cargo"));
                lista.add(usr);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }
    public List<Entrada> pesquisarTabelaETR() {
        Connection con = Conexao.getInstance();
        List<Entrada> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT idNotaFiscal, Descricao, Nome, PrecoDeCusto  FROM entrada INNER JOIN produto on produto.idProduto = entrada.fkProduto INNER JOIN fornecedor on fornecedor.idFornecedor = entrada.fkFornecedor INNER JOIN pessoa on pessoa.idPessoa = fornecedor.Pessoa_idPessoa;");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Entrada etr = new Entrada();
                etr.setIdNota(rs.getInt("idNotaFiscal"));
                etr.setNomeFornecedor(rs.getString("Nome"));
                etr.setNomeProduto(rs.getString("Descricao"));
                etr.setPrecoCusto(rs.getFloat("PrecoDeCusto"));
                lista.add(etr);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<PessoaFisica> pesquisarTabelaPF(String desc) {
        Connection con = Conexao.getInstance();
        List<PessoaFisica> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa INNER JOIN fisica ON fisica.Pessoa_idPessoa = pessoa.idPessoa WHERE Nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                PessoaFisica pf = new PessoaFisica();
                pf.setFkPessoa(rs.getInt("fisica.Pessoa_idPessoa"));
                pf.setCpf(rs.getString("CPF"));
                pf.setRg(rs.getString("RG"));
                pf.setNome(rs.getString("Nome"));
                pf.setEndereco(rs.getString("Endereco"));
                pf.setCep(rs.getString("CEP"));
                pf.setCidade(rs.getString("Cidade"));
                pf.setTelefone(rs.getString("Telefone"));
                pf.setCredito(rs.getFloat("LimiteDeCredito"));
                pf.setBairro(rs.getString("Bairro"));
                pf.setCelular(rs.getString("Celular"));
                pf.setEmail(rs.getString("Email"));
                lista.add(pf);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Usuario> pesquisarTabelaUser(String desc) {
        Connection con = Conexao.getInstance();
        List<Usuario> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa INNER JOIN funcionario ON funcionario.Pessoa_idPessoa = pessoa.idPessoa WHERE Nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usr = new Usuario();
                usr.setIdPessoa(rs.getInt("idFuncionario"));
                usr.setFkPessoa(rs.getInt("funcionario.Pessoa_idPessoa"));
                usr.setNome(rs.getString("Nome"));
                usr.setEndereco(rs.getString("Endereco"));
                usr.setCep(rs.getString("CEP"));
                usr.setCidade(rs.getString("Cidade"));
                usr.setTelefone(rs.getString("Telefone"));
                usr.setBairro(rs.getString("Bairro"));
                usr.setCelular(rs.getString("Celular"));
                usr.setEmail(rs.getString("Email"));

                usr.setCargo(rs.getString("Cargo"));
                usr.setAcesso(rs.getInt("Acesso"));
                usr.setUsuario(rs.getString("Login"));
                usr.setSenha(rs.getString("Senha"));
                lista.add(usr);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<PessoaJuridica> pesquisarTabelaPJ(String desc) {
        Connection con = Conexao.getInstance();
        List<PessoaJuridica> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa INNER JOIN juridica ON juridica.Pessoa_idPessoa = pessoa.idPessoa WHERE Nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                PessoaJuridica pj = new PessoaJuridica();
                pj.setFkPessoa(rs.getInt("juridica.Pessoa_idPessoa"));
                pj.setCnpj(rs.getString("CNPJ"));
                pj.setInscricaoSocial(rs.getString("InscricaoEstadual"));
                pj.setNome(rs.getString("Nome"));
                pj.setEndereco(rs.getString("Endereco"));
                pj.setCep(rs.getString("CEP"));
                pj.setCidade(rs.getString("Cidade"));
                pj.setTelefone(rs.getString("Telefone"));
                pj.setCredito(rs.getFloat("LimiteDeCredito"));
                pj.setBairro(rs.getString("Bairro"));
                pj.setCelular(rs.getString("Celular"));
                pj.setEmail(rs.getString("Email"));
                lista.add(pj);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Fornecedor> pesquisarTabelaFRN(String desc) {
        Connection con = Conexao.getInstance();
        List<Fornecedor> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa INNER JOIN fornecedor ON fornecedor.Pessoa_idPessoa = pessoa.idPessoa WHERE Nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor frn = new Fornecedor();
                frn.setFkPessoa(rs.getInt("fornecedor.Pessoa_idPessoa"));
                frn.setIdPessoa(rs.getInt("idFornecedor"));
                frn.setCnpj(rs.getString("CNPJ"));
                frn.setInscricaoSocial(rs.getString("InscricaoEstadual"));
                frn.setNome(rs.getString("Nome"));
                frn.setEndereco(rs.getString("Endereco"));
                frn.setCep(rs.getString("CEP"));
                frn.setCidade(rs.getString("Cidade"));
                frn.setTelefone(rs.getString("Telefone"));
                frn.setRamoAtividade(rs.getString("RamoAtividade"));
                frn.setBairro(rs.getString("Bairro"));
                frn.setCelular(rs.getString("Celular"));
                frn.setEmail(rs.getString("Email"));
                lista.add(frn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Fornecedor> pesquisarTabelaFRNId(int desc) {
        Connection con = Conexao.getInstance();
        List<Fornecedor> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa INNER JOIN fornecedor ON fornecedor.Pessoa_idPessoa = pessoa.idPessoa WHERE idFornecedor LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor frn = new Fornecedor();
                frn.setFkPessoa(rs.getInt("fornecedor.Pessoa_idPessoa"));
                frn.setIdPessoa(rs.getInt("idFornecedor"));
                frn.setCnpj(rs.getString("CNPJ"));
                frn.setInscricaoSocial(rs.getString("InscricaoEstadual"));
                frn.setNome(rs.getString("Nome"));
                frn.setEndereco(rs.getString("Endereco"));
                frn.setCep(rs.getString("CEP"));
                frn.setCidade(rs.getString("Cidade"));
                frn.setTelefone(rs.getString("Telefone"));
                frn.setRamoAtividade(rs.getString("RamoAtividade"));
                frn.setBairro(rs.getString("Bairro"));
                frn.setCelular(rs.getString("Celular"));
                frn.setEmail(rs.getString("Email"));
                lista.add(frn);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public String verificarCPFClientePF(String desc) {
        Connection con = Conexao.getInstance();
        String cpf = null;
        try {
            stmt = con.prepareStatement("SELECT CPF FROM fisica WHERE CPF LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                PessoaFisica pf = new PessoaFisica();
                cpf = (rs.getString("CPF"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return cpf;
    }

    public String verificarCNPJClientePJ(String desc) {
        Connection con = Conexao.getInstance();
        String cnpj = null;
        try {
            stmt = con.prepareStatement("SELECT CNPJ FROM juridica WHERE CNPJ LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                PessoaJuridica pj = new PessoaJuridica();
                cnpj = (rs.getString("CNPJ"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return cnpj;
    }

    public List<Fornecedor> preenchendoCBFornecedor() {
        Connection con = Conexao.getInstance();
        List<Fornecedor> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa INNER JOIN fornecedor ON fornecedor.Pessoa_idPessoa = pessoa.idPessoa");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor forne = new Fornecedor();
                forne.setNome(rs.getString("Nome"));
                lista.add(forne);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Fornecedor> eventoCBFornecedor(String desc) {
        Connection con = Conexao.getInstance();
        List<Fornecedor> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM pessoa INNER JOIN fornecedor ON fornecedor.Pessoa_idPessoa = pessoa.idPessoa WHERE Nome LIKE ?;");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Fornecedor forne = new Fornecedor();
                forne.setNome(rs.getString("Nome"));
                forne.setCnpj(rs.getString("CNPJ"));
                forne.setRamoAtividade(rs.getString("RamoAtividade"));
                forne.setFkPessoa(rs.getInt("idFornecedor"));
                forne.setTelefone(rs.getString("Telefone"));
                lista.add(forne);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco\n" + ex);
        }
        return lista;
    }

    public List<Marca> eventoCBMarca(String desc) {
        Connection con = Conexao.getInstance();
        List<Marca> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Marca WHERE Nome LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Marca mrc = new Marca();
                mrc.setFkProduto(rs.getInt("idMarca"));
                lista.add(mrc);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco CB\n" + ex);
        }
        return lista;
    }

    public List<Categoria> eventoCBCategoria(String desc) {
        Connection con = Conexao.getInstance();
        List<Categoria> lista = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Categoria WHERE Categoria LIKE ?");
            stmt.setString(1, "%" + desc + "%");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Categoria cat = new Categoria();
                cat.setFkProduto(rs.getInt("idCategoria"));
                lista.add(cat);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar os dados do banco CB\n" + ex);
        }
        return lista;
    }

    public void alterarFornecedor(Fornecedor frn) throws SQLException {
        sql = "UPDATE fornecedor SET CNPJ = ?, InscricaoEstadual = ?, RamoAtividade = ? WHERE Pessoa_idPessoa LIKE ?;";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setString(1, frn.getCnpj());
        stmt.setString(2, frn.getInscricaoSocial());
        stmt.setString(3, frn.getRamoAtividade());
        stmt.setInt(4, frn.getFkPessoa());
        stmt.executeUpdate();
    }

    public void alterarPessoaJuridica(PessoaJuridica pj) throws SQLException {
        sql = "UPDATE juridica SET CNPJ = ?, InscricaoEstadual = ?, LimiteDeCredito = ? WHERE Pessoa_idPessoa LIKE ?;";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setString(1, pj.getCnpj());
        stmt.setString(2, pj.getInscricaoSocial());
        stmt.setFloat(3, pj.getCredito());
        stmt.setInt(4, pj.getFkPessoa());
        stmt.executeUpdate();
    }

    public void alterarPessoaFisica(PessoaFisica pf) throws SQLException {
        sql = "UPDATE fisica SET  CPF = ?, RG = ?, LimiteDeCredito = ? WHERE Pessoa_idPessoa LIKE ?;";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setString(1, pf.getCpf());
        stmt.setString(2, pf.getRg());
        stmt.setFloat(3, pf.getCredito());
        stmt.setInt(4, pf.getFkPessoa());
        stmt.executeUpdate();
    }

    public void alterarPessoa(Pessoa pes) throws SQLException {
        sql = "UPDATE pessoa SET  Nome = ?, Endereco = ?, Cidade = ?, Bairro = ?, CEP = ?, Telefone = ?, Celular = ?, Email = ? WHERE idPessoa = ?;";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setString(1, pes.getNome());
        stmt.setString(2, pes.getEndereco());
        stmt.setString(3, pes.getCidade());
        stmt.setString(4, pes.getBairro());
        stmt.setString(5, pes.getCep());
        stmt.setString(6, pes.getTelefone());
        stmt.setString(7, pes.getCelular());
        stmt.setString(8, pes.getEmail());
        stmt.setInt(9, pes.getIdPessoa());
        stmt.executeUpdate();
    }

    public void excluirPessoaFisica(PessoaFisica pf) throws SQLException {
        sql = "DELETE FROM fisica WHERE Pessoa_idPessoa = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, pf.getFkPessoa());
        stmt.execute();
        stmt.close();
    }

    public void excluirPessoa(Pessoa pes) throws SQLException {
        sql = "DELETE FROM pessoa WHERE idPessoa = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, pes.getIdPessoa());
        stmt.execute();
        stmt.close();
    }

    public void excluirPessoaJuridica(PessoaJuridica pj) throws SQLException {
        sql = "DELETE FROM juridica WHERE Pessoa_idPessoa = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, pj.getFkPessoa());
        stmt.execute();
        stmt.close();
    }

    public void excluirFornecedor(Fornecedor frn) throws SQLException {
        sql = "DELETE FROM fornecedor WHERE Pessoa_idPessoa = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, frn.getFkPessoa());
        stmt.execute();
        stmt.close();
    }

    public void excluirUsuario(Usuario usr) throws SQLException {
        sql = "DELETE FROM funcionario WHERE Pessoa_idPessoa = ?";
        stmt = Conexao.getInstance().prepareStatement(sql);
        stmt.setInt(1, usr.getFkPessoa());
        stmt.execute();
        stmt.close();
    }
}
