import java.util.ArrayList;

public class ItemCarrinho {
    private int id;
    private float qtde;
    private Produto produto;

    public ItemCarrinho() {

    }

    // esse construtor caracteriza uma agregação, não composição
    // motivo: produto já veio criado é independente
    public ItemCarrinho(int id, float qtde, Produto produto) {
        this.id = id;
        this.qtde = qtde;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nItemCarrinho{" +
                "id=" + id +
                ", qtde=" + qtde +
                ", produto=" + produto +
                '}';
    }

}
