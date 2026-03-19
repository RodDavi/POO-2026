import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        double taxa, saldo = 0, jurosTotais = 0;
        int mes = 1;

        System.out.print("Digite a taxa de juros mensal (%): ");
        taxa = sc.nextDouble() / 100;

        do {
            double deposito = 100 + rand.nextInt(301); // 100 a 400
            saldo += deposito;
            double juros = saldo * taxa;
            saldo += juros;
            jurosTotais += juros;

            System.out.printf("Mês %d: Depósito = R$ %.2f | Saldo = R$ %.2f\n", mes, deposito, saldo);
            mes++;
        } while (mes <= 24);

        System.out.printf("\nTotal ganho com juros em 24 meses: R$ %.2f\n", jurosTotais);
        sc.close();
    }
}

