import java.util.Scanner;

public class decisao13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scanner.nextDouble();

        System.out.println("O aluno faltou a alguma prova? (true/false)");
        boolean faltou = scanner.nextBoolean();

        double media = (nota1 + nota2) / 2;

        if (faltou) {
            System.out.println("Reprovado: O aluno faltou a uma prova.");
        } else if (media >= 7) {
            System.out.println("Aprovado!");
        } else if (media >= 5) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado: Média abaixo de 5.");
        }

        scanner.close();
    }
}