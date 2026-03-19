import java.util.Scanner;

public class decisao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do candidato:");
        int idade = scanner.nextInt();
        System.out.println("Digite a nota no teste de admissão(0 a 100):");
        int nota = scanner.nextInt();
        System.out.println("Anos de experiência em programação:");
        int experiencia = scanner.nextInt();
        System.out.println("Possui certificação reconhecida? (true/false)");
        boolean temCertificacao = scanner.nextBoolean();

        if (idade < 18 || idade > 35 || nota < 70) {
            System.out.println("Rejeitado: Não atende os critérios de idade ou nota mínima.");
        } else if (experiencia >= 2) {
            System.out.println("Aprovado com bônus de experiência.");
        } else if (temCertificacao) {
            System.out.println("Aprovado devido à certificação reconhecida.");
        } else {
            System.out.println("Permitido: Aprovado sem bônus adicionais.");
        }

        scanner.close();
    }
}
