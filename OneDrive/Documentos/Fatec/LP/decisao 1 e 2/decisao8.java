import java.util.Scanner;

public class decisao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do candidato:");
        int idade = scanner.nextInt();

        System.out.println("Anos de experiência em pesquisa:");
        int experiencia = scanner.nextInt();

        System.out.println("Possui publicações em revistas internacionais? (true/false)");
        boolean temPublicacoes = scanner.nextBoolean();

        System.out.println("Possui pendências acadêmicas? (true/false)");
        boolean temPendencias = scanner.nextBoolean();

        if (temPendencias) {
            System.out.println("Não elegível: Possui pendências acadêmicas.");
        } else if (idade > 35) {
            System.out.println("Não elegível: Idade máxima excedida.");
        } else if (experiencia >= 2) {
            System.out.println("Elegível para a bolsa.");
        } else if (temPublicacoes) {
            System.out.println("Elegível para a bolsa devido às publicações.");
        } else {
            System.out.println("Não elegível: Não atende aos critérios.");
        }

        scanner.close();
    }
}
