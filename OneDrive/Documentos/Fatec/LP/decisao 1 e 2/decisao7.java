import java.util.Scanner;

public class decisao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do espectador:");
        int idade = scanner.nextInt();

        if (idade < 10) {
            System.out.println("Classificação: Livre.");
        } else if (idade <= 13) {
            System.out.println("Classificação: 10+.");
        } else if (idade <= 17) {
            System.out.println("Classificação: 14+.");
        } else {
            System.out.println("Classificação: 18+.");
        }

        scanner.close();
    }
}