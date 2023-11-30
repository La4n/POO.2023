
package projhln;

import java.util.Objects;

public class ClassProd {
    private String Produto;
    private float preco;
    private int Quantidade,Codigo,Posicao;

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getPosicao() {
        return Posicao;
    }

    public void setPosicao(int Posicao) {
        this.Posicao = Posicao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.Produto);
        hash = 67 * hash + Float.floatToIntBits(this.preco);
        hash = 67 * hash + this.Quantidade;
        hash = 67 * hash + this.Codigo;
        hash = 67 * hash + this.Posicao;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ClassProd other = (ClassProd) obj;
        if (Float.floatToIntBits(this.preco) != Float.floatToIntBits(other.preco)) {
            return false;
        }
        if (this.Quantidade != other.Quantidade) {
            return false;
        }
        if (this.Codigo != other.Codigo) {
            return false;
        }
        if (this.Posicao != other.Posicao) {
            return false;
        }
        if (!Objects.equals(this.Produto, other.Produto)) {
            return false;
        }
        return true;
    }

   

    
    
}
