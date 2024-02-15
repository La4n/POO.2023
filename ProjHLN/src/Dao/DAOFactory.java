package Dao;

public class DAOFactory {
    
    public static ProdDAO criarProdDAO() {
        return new ProdutoDAOJDBC();
      }
}
