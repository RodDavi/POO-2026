import java.util.Scanner;

public class decisao18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do cliente:");
        int idade = scanner.nextInt();
        System.out.println("Digite a renda mensal do cliente:");
        double rendaMensal = scanner.nextDouble();
        System.out.println("O nome do cliente está sujo (negativado)? (true/false)");
        boolean nomeSujo = scanner.nextBoolean();
        System.out.println("O valor do empréstimo solicitado:");
        double valorSolicitado = scanner.nextDouble();
        System.out.println("O cliente é servidor público? (true/false)");
        boolean eServidorPublico = scanner.nextBoolean();

        if (idade < 21 || idade > 65 || nomeSujo) {
            System.out.println("Empréstimo negado: Critérios básicos não atendidos.");
        } else if (eServidorPublico && rendaMensal >= 2000) {
            System.out.println("Empréstimo aprovado: Cliente é servidor público.");
        } else if (rendaMensal >= 2500 && valorSolicitado <= (rendaMensal * 10)) {
            System.out.println("Empréstimo aprovado.");
        } else {
            System.out.println("Empréstimo negado.");
        }

        scanner.close();
    }
}