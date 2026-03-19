import java.util.Scanner;
public class decisao17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do candidato:");
        int idade = scanner.nextInt();
        System.out.println("Concluiu o ensino superior? (true/false)");
        boolean ensinoSuperior = scanner.nextBoolean();
        System.out.println("Anos de experiência:");
        int experiencia = scanner.nextInt();
        System.out.println("Nível de inglês (intermediario, avancado, basico):");
        String nivelIngles = scanner.next();
        System.out.println("Possui pós-graduação? (true/false)");
        boolean posGraduacao = scanner.nextBoolean();

        if (idade < 21 || idade > 55 || !ensinoSuperior) {
            System.out.println("Não será contratado: Não atende aos critérios básicos de idade ou formação.");
        } else if (experiencia >= 2 && (nivelIngles.equals("intermediario") || nivelIngles.equals("avancado"))) {
            System.out.println("Candidato contratado.");
        } else if (experiencia < 2 && nivelIngles.equals("avancado") && posGraduacao) {
            System.out.println("Candidato contratado.");
        } else {
            System.out.println("Não será contratado: Não atende aos critérios de experiência/qualificação.");
        }

        scanner.close();
    }
}