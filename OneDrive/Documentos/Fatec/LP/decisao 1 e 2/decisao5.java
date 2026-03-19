import java.util.Scanner;

public class decisao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do candidato:");
        int idade = scanner.nextInt();

        System.out.println("Digite a nota de proficiência:");
        int notaProficiencia = scanner.nextInt();

        System.out.println("Possui recomendação de professor? (true/false)");
        boolean temRecomendacao = scanner.nextBoolean();

        if (idade < 6) {
            System.out.println("Inscrição negada: Idade mínima não atingida.");
        } else if (temRecomendacao) {
            System.out.println("Inscrição aprovada em nível superior devido à recomendação de professor.");
        } else if (notaProficiencia <= 30) {
            System.out.println("Inscrito no nível: Iniciante.");
        } else if (notaProficiencia >= 31 && notaProficiencia <= 70) {
            System.out.println("Inscrito no nível: Intermediário.");
        } else {
            System.out.println("Inscrito no nível: Avançado.");
        }

        scanner.close();
    }
}