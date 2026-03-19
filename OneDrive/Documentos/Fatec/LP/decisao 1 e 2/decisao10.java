import java.util.Scanner;
public class decisao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A condição do paciente é crítica? (true/false)");
        boolean condicaoCritica = scanner.nextBoolean();
        System.out.println("O paciente é gestante? (true/false)");
        boolean eGestante = scanner.nextBoolean();
        System.out.println("Digite a idade do paciente:");
        int idade = scanner.nextInt();
        System.out.println("Os sintomas são graves? (true/false)");
        boolean sintomasGraves = scanner.nextBoolean();
        System.out.println("O paciente possui doenças crônicas? (true/false)");
        boolean doencaCronica = scanner.nextBoolean();
        System.out.println("Os sintomas são moderados? (true/false)");
        boolean sintomasModerados = scanner.nextBoolean();

        if (condicaoCritica) {
            System.out.println("Prioridade: Máxima.");
        } else if (eGestante) {
            System.out.println("Prioridade: Alta.");
        } else if (idade > 65 && sintomasGraves) {
            System.out.println("Prioridade: Alta.");
        } else if (doencaCronica && sintomasModerados) {
            System.out.println("Prioridade: Média.");
        } else {
            System.out.println("Prioridade: Baixa.");
        }
        scanner.close();
    }
}
