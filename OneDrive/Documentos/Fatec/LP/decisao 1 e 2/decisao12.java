import java.util.Scanner;

public class decisao12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        if (idade < 12) {
            System.out.println("Classificação: Criança.");
        } else if (idade <= 17) {
            System.out.println("Classificação: Adolescente.");
        } else if (idade <= 59) {
            System.out.println("Classificação: Adulto.");
        } else {
            System.out.println("Classificação: Idoso.");
        }

        scanner.close();
    }
}