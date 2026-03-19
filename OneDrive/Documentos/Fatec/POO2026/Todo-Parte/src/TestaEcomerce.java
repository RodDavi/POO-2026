import java.util.Date;

public class TestaEcomerce {
    public static void main (String[] args){
        Cliente cli1 = new Cliente("123", "fulano", "rua chile");
        CarrinhoCompra car1 = new CarrinhoCompra(1, new Date(), cli1);

        System.out.println(car1.toString());

        Produto pro1 = new Produto(1, "maçã", "quatro portas", 10000);
        car1.adicionaItemCarrinho(1, 50, pro1);

        System.out.println(car1.toString());
        car1.calculatotaldacompra();


    }

}
