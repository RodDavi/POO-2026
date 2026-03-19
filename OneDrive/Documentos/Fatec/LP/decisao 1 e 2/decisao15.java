import java.util.Scanner;

public class decisao15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do candidato:");
        int idade = scanner.nextInt();

        System.out.println("Digite a renda familiar mensal:");
        double rendaFamiliar = scanner.nextDouble();

        System.out.println("Digite a nota no exame:");
        double notaExame = scanner.nextDouble();

        if (idade < 18 || idade > 35) {
            System.out.println("Não tem direito à bolsa: Idade fora do intervalo permitido.");
        } else if (notaExame >= 9) {
            System.out.println("Tem direito à bolsa: Nota de 9 ou mais.");
        } else if (rendaFamiliar <= 3000 && notaExame >= 7) {
            System.out.println("Tem direito à bolsa.");
        } else {
            System.out.println("Não tem direito à bolsa.");
        }

        scanner.close();
    }
}