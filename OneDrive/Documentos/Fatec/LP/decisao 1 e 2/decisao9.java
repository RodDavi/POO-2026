import java.util.Scanner;

public class decisao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do participante:");
        int idade = scanner.nextInt();
        System.out.println("Digite o peso do participante (kg):");
        double peso = scanner.nextDouble();
        System.out.println("Possui certificado de atividade física avançada? (true/false)");
        boolean temCertificado = scanner.nextBoolean();
        System.out.println("Anos de experiência em esportes de aventura:");
        int experiencia = scanner.nextInt();
        System.out.println("Possui problemas cardíacos? (true/false)");
        boolean problemasCardiologicos = scanner.nextBoolean();

        if (problemasCardiologicos) {
            System.out.println("Proibido de participar de atividades de alto risco devido a problemas cardíacos.");
        } else if (idade < 18) {
            System.out.println("Candidato não elegível: Idade mínima não atingida.");
        } else if (peso > 120 && !temCertificado) {
            System.out.println("Candidato não elegível para atividades de alto risco: Peso acima do limite.");
        } else if (experiencia >= 2) {
            System.out.println("Candidato elegível com alta prioridade devido à experiência prévia.");
        } else {
            System.out.println("Candidato elegível.");
        }

        scanner.close();
    }
}
