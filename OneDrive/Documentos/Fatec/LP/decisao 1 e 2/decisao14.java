import java.util.Scanner;

public class decisao14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        System.out.println("Aprovado no curso teórico? (true/false)");
        boolean aprovadoTeorico = scanner.nextBoolean();

        System.out.println("Aprovado no curso prático? (true/false)");
        boolean aprovadoPratico = scanner.nextBoolean();

        if (idade >= 18 && aprovadoTeorico && aprovadoPratico) {
            System.out.println("Aprovado para tirar a carteira de motorista.");
        } else {
            System.out.println("Não aprovado para tirar a carteira de motorista.");
        }

        scanner.close();
    }
}
