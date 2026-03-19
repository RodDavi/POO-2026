import java.util.Scanner;

public class decisao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota de desempenho do funcionário:");
        int nota = scanner.nextInt();

        if (nota >= 90) {
            System.out.println("Avaliação: Excelente.");
        } else if (nota >= 70) {
            System.out.println("Avaliação: Bom.");
        } else if (nota >= 50) {
            System.out.println("Avaliação: Regular.");
        } else {
            System.out.println("Avaliação: Insatisfatório.");
        }

        scanner.close();
    }
}
