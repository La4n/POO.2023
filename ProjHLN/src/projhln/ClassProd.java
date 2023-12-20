
package projhln;

import java.util.Objects;

public class ClassProd {
    private String Produto;
    private float preco,PrecoVenda;
    private int Quantidade,Posicao;

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

    public float getPrecoVenda() {
        return PrecoVenda;
    }

    public void setPrecoVenda(float PrecoVenda) {
        this.PrecoVenda = PrecoVenda;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
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
        hash = 53 * hash + Objects.hashCode(this.Produto);
        hash = 53 * hash + Float.floatToIntBits(this.preco);
        hash = 53 * hash + Float.floatToIntBits(this.PrecoVenda);
        hash = 53 * hash + this.Quantidade;
        hash = 53 * hash + this.Posicao;
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
        if (Float.floatToIntBits(this.PrecoVenda) != Float.floatToIntBits(other.PrecoVenda)) {
            return false;
        }
        if (this.Quantidade != other.Quantidade) {
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
