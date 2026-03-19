import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int contador = 0, codigo = 0, qtd = 0, unidades = 0;
        double valorUnit = 0.0, valorTotal = 0.0, totalItem = 0.0;
        Random random = new Random();

        while (contador < 4) {
            codigo = random.nextInt(5) + 1;
            qtd = random.nextInt(12) + 1;
            valorUnit = random.nextInt(5) + 1;
            valorTotal = qtd * valorUnit;
            totalItem += valorTotal;
            unidades += qtd;

            contador++; 

            System.out.println("Código: " + codigo + " - Qtd: " + qtd + " - Valor Unit: " + valorUnit +
                    " - Valor Total Item: " + valorTotal + " - Contador: " + contador +
                    " - Total Geral: " + totalItem + " - Unidades Totais: " + unidades);
        }
        System.out.println("Venda finalizada. Total de itens vendidos: " + totalItem);
    }
}
