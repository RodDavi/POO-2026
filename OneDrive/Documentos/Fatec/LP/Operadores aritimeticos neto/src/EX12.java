import java.util.Scanner;

public class EX12 {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // --- Leitura dos dados do cliente ---
        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo inicial: R$ ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Digite o valor do débito: R$ ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o valor do crédito: R$ ");
        double credito = scanner.nextDouble();

        // --- Cálculo do saldo atual ---
        double saldoAtual = saldoInicial - debito + credito;

        // --- Exibição dos resultados e verificação de saldo ---
        System.out.println("\n--- Resumo da Conta ---");
        System.out.println("Número da conta: " + numeroConta);
        System.out.printf("Saldo inicial: R$ %.2f%n", saldoInicial);
        System.out.printf("Débito: R$ %.2f%n", debito);
        System.out.printf("Crédito: R$ %.2f%n", credito);
        System.out.printf("Saldo atual: R$ %.2f%n", saldoAtual);

        // --- Teste e mensagem final ---
        if (saldoAtual >= 0) {
            System.out.println("Status: Saldo Positivo");
        } else {
            System.out.println("Status: Saldo Negativo");
        }

        // Fecha o Scanner
        scanner.close();
    }
}