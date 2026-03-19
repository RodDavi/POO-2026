import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposito, taxa, saldo, jurosTotais = 0;

        System.out.print("Digite o valor do depósito inicial: ");
        deposito = sc.nextDouble();

        System.out.print("Digite a taxa de juros mensal (%): ");
        taxa = sc.nextDouble() / 100;

        saldo = deposito;
        int mes = 1;

        do {
            double juros = saldo * taxa;
            saldo += juros;
            jurosTotais += juros;

            System.out.printf("Mês %d: R$ %.2f\n", mes, saldo);
            mes++;
        } while (mes <= 24);

        System.out.printf("\nTotal ganho com juros em 24 meses: R$ %.2f\n", jurosTotais);
        sc.close();
    }
}

