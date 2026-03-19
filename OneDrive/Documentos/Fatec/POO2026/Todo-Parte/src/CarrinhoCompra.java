import java.util.ArrayList;
import java.util.Date;

public class CarrinhoCompra {
    private int id;
    private Date data;
    private Cliente cliente;
    private ArrayList <ItemCarrinho> itensCarrinho;

    public CarrinhoCompra() {
        this.itensCarrinho = new ArrayList<>();
    }

// esse construtor caracteriza uma agregação, não composição
// motivo: cliente já veio criado é independente
    public CarrinhoCompra(int id, Date data, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.itensCarrinho = new ArrayList<>();
    }

    public void adicionaItemCarrinho(int id, float qtde, Produto produto){
        ItemCarrinho aux = new ItemCarrinho(id, qtde, produto);
        this.itensCarrinho.add(aux);
    }

    public void calculatotaldacompra(){
       float valorTotal = 0;
       for(ItemCarrinho aux: this.itensCarrinho){
           valorTotal += aux.getQtde() * aux.getProduto().getPreco();

       }
        System.out.println("VAlor total da compra R$ " + valorTotal);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "CarrinhoCompra{" +
                "id=" + id +
                ", data=" + data +
                ", cliente=\n" + cliente +
                ", itens do carriinho=\n" + itensCarrinho +
                '}';
    }

}
