import java.util.Random;
public class Ex5 {
    public static void main(String[] args) {
        Random rand = new Random();
        double litrosGas = 0, litrosEta = 0;
        double fatGas = 0, fatEta = 0;
        int i = 1;
        do {
            int tipo = rand.nextInt(2); // 0 - gasolina, 1 - etanol
            double litros = 1 + rand.nextDouble() * 39; // 1 a 40 litros

            if (tipo == 0) {
                litrosGas += litros;
                fatGas += litros * 5.0;
                System.out.printf("Venda %d: Gasolina %.2f L\n", i, litros);
            } else {
                litrosEta += litros;
                fatEta += litros * 4.0;
                System.out.printf("Venda %d: Etanol %.2f L\n", i, litros);
            }
            i++;
        } while (i <= 10); // pode mudar qtd de vendas
        double fatTotal = fatGas + fatEta;
        System.out.printf("\nTotal gasolina: %.2f L | Faturamento: R$ %.2f\n", litrosGas, fatGas);
        System.out.printf("Total etanol: %.2f L | Faturamento: R$ %.2f\n", litrosEta, fatEta);
        System.out.printf("Faturamento total: R$ %.2f\n", fatTotal);
    }
}
