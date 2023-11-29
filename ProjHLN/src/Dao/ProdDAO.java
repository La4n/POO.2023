
package Dao;

import java.util.List;
import projhln.ClassProd;

public interface ProdDAO {
    
    public int inserir(ClassProd Produto);
    public int editar(ClassProd Produto);
    public int apagar(int id);
    public List<ClassProd> listar();
    public ClassProd listar(int id);
}
