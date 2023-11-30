
package Dao;

import java.util.List;
import projhln.ClassProd;
import Conexao.ConexaoSql;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



public class ProdutoDAOJDBC implements ProdDAO{
    
     Connection conexao = null;
    PreparedStatement sql = null;
    ResultSet rset = null;
 
     @Override
    public int inserir(ClassProd Produto) {
    
         StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("insert into produtoo(Produto, Quantidade, Preco, Codigo)").append("values(?, ?, ?, ?)");
     
        String insert = sqlBuilder.toString();
        int linha = 0;
        try {
            conexao = ConexaoSql.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(insert);
            
            sql.setInt(1, Produto.getPosicao());
            sql.setString(2, Produto.getProduto());
            sql.setInt(3, Produto.getQuantidade());
            sql.setFloat(4,Produto.getPreco());
            sql.setInt(5, Produto.getCodigo());
            
            linha = sql.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }
        
        return linha;
    }
        
    

     @Override
    public int editar(ClassProd Produto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     @Override
    public int apagar(int id) {
       StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("DELETE FROM produtoo ").append("Posicao id = ?");
        
        String delete = sqlBuilder.toString();
        int linha = 0;
        
        try {
            conexao = ConexaoSql.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(delete);
            sql.setInt(1, id);
            linha = sql.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return linha;
    }

     @Override
    public List<ClassProd> listar() {
     
           
        String select = "SELECT * FROM Produtoo";

        List<ClassProd> produtos = new ArrayList<ClassProd>();

        try {
            conexao = ConexaoSql.getConexao();

            sql = (PreparedStatement) conexao.prepareStatement(select);

            rset = sql.executeQuery();

            while (rset.next()) {

                ClassProd Produto = new ClassProd();
                
                Produto.setPosicao(rset.getInt("Posicao"));
                Produto.setProduto(rset.getString("Produto"));
                Produto.setQuantidade(rset.getInt("Quantidade"));
                Produto.setPreco(rset.getFloat("Preco"));
                Produto.setCodigo(rset.getInt("Codigo"));
          

                produtos.add(Produto);

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            fecharConexao();
        }

        return produtos;
    }

     @Override
    public ClassProd listar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void fecharConexao() {
        try {
            if (rset != null) {
                rset.close();
            }
            if (sql != null) {
                sql.close();
            }

            if (conexao != null) {
                conexao.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    }

