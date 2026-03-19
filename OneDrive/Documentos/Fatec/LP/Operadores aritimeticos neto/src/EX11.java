import java.util.Scanner;

public class EX11 {

    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        // Pede e lê o salário fixo do vendedor
        System.out.print("Digite o salário fixo do vendedor: R$ ");
        double salarioFixo = scanner.nextDouble();
        // Pede e lê o valor das vendas efetuadas
        System.out.print("Digite o valor das vendas efetuadas: R$ ");
        double valorVendas = scanner.nextDouble();
        // Variável para armazenar a comissão
        double comissao;
        // Calcula a comissão com base no valor das vendas
        if (valorVendas <= 1500.00) {
            // Se as vendas forem até R$ 1.500,00, a comissão é de 3%
            comissao = valorVendas * 0.03;
        } else {
            // Se as vendas ultrapassarem R$ 1.500,00, a comissão é calculada em duas partes
            double comissao1500 = 1500.00 * 0.03; // 3% sobre os primeiros R$ 1.500,00
            double valorExcedente = valorVendas - 1500.00; // Valor que ultrapassou R$ 1.500,00
            double comissaoExcedente = valorExcedente * 0.05; // 5% sobre o valor excedente
            comissao = comissao1500 + comissaoExcedente;
        }
        // Calcula o salário total somando o salário fixo e a comissão
        double salarioTotal = salarioFixo + comissao;
        // Exibe o resultado para o usuário
        System.out.println("---");
        System.out.printf("Salário fixo: R$ %.2f%n", salarioFixo);
        System.out.printf("Comissão: R$ %.2f%n", comissao);
        System.out.printf("Salário total: R$ %.2f%n", salarioTotal);
        // Fecha o Scanner para liberar recursos
        scanner.close();
    }
}
