import java.util.Scanner;

public class decisao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do aluno:");
        int idade = scanner.nextInt();

        System.out.println("Digite a nota de matemática do ano anterior:");
        int notaMatematica = scanner.nextInt();

        System.out.println("Participou de competições regionais? (true/false)");
        boolean participouCompeticao = scanner.nextBoolean();

        if (idade < 12 || idade > 18) {
            System.out.println("Inscrição negada: Idade fora da faixa permitida.");
        } else if (notaMatematica >= 70) {
            System.out.println("Inscrição aprovada.");
        } else if (participouCompeticao) {
            System.out.println("Inscrição aprovada devido à participação em competições regionais.");
        } else {
            System.out.println("Inscrição negada: Nota insuficiente e sem participação em competições.");
        }

        scanner.close();
    }
}