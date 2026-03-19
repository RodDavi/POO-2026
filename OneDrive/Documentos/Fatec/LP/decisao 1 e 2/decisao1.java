import java.util.Scanner;

public class decisao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        System.out.println("Digite a renda da pessoa:");
        double renda = scanner.nextDouble();

        System.out.println("A pessoa é estudante? (true/false)");
        boolean eEstudante = scanner.nextBoolean();

        if (idade >= 65) {
            System.out.println("Gratuidade total (100%).");
        } else if (eEstudante) {
            System.out.println("Desconto de 30% (estudante).");
        } else if (renda <= 2000) {
            System.out.println("Desconto de 50% (baixa renda).");
        } else {
            System.out.println("Preço normal.");
        }

        scanner.close();
    }
}