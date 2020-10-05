package Classes;

/**
 * Classe contendo os dados do produto
 *
 * @author Juliano
 */
public class Produto {

    private int codigo;
    private String nome;
    private float precoCompra;
    private float precoVenda;
    private int quantidade;

    public Produto() {
        this.codigo = 0;
        this.nome = "";
        this.precoCompra = (float) 0.0;
        this.precoVenda = (float) 0.0;
        this.quantidade = 0;
    }

    public Produto(int codProduto) {
        this.codigo = codProduto;
        this.nome = "";
        this.precoCompra = (float) 0.0;
        this.precoVenda = (float) 0.0;
        this.quantidade = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Produto) {
            Produto p = (Produto) o;
            if (p.getCodigo() == this.getCodigo()) {
                return true;
            }
        }
        return false;
    }
}
