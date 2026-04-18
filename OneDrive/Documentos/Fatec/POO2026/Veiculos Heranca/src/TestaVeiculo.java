import java.util.ArrayList;

public class TestaVeiculo {
    public static void exibeDados(Veiculo camaleao){
        camaleao.mover();
    }
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Boeing", "737 MAX", 500, 1000);
        exibeDados(aviao);

        CarroEletrico carroEletrico = new CarroEletrico("Byd","Seal", 200, 100);
        exibeDados(carroEletrico);

        ArrayList<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(aviao);
        veiculos.add(carroEletrico);
    }
}