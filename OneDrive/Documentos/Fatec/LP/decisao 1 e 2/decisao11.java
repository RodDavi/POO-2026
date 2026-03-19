import java.util.Scanner;

public class decisao11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do candidato:");
        int idade = scanner.nextInt();
        System.out.println("Digite a nota do teste:");
        int nota = scanner.nextInt();
        System.out.println("Anos de experiência em programação:");
        int experiencia = scanner.nextInt();
        System.out.println("Possui certificação reconhecida? (true/false)");
        boolean temCertificacao = scanner.nextBoolean();

        if (idade < 18 || idade > 40) {
            System.out.println("Reprovado: Idade fora da faixa permitida.");
        } else if (nota >= 75) {
            System.out.println("Aprovado.");
            if (experiencia >= 2) {
                System.out.println("Bônus de experiência concedido.");
            }
        } else if (nota < 75 && !temCertificacao) {
            System.out.println("Reprovado: Nota insuficiente e sem certificação.");
        } else if (temCertificacao) {
            System.out.println("Aprovado: Certificação reconhecida substitui a experiência.");
        }

        scanner.close();
    }
}