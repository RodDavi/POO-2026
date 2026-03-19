import java.util.Scanner;

public class decisao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade do motorista:");
        int idade = scanner.nextInt();
        System.out.println("Possui histórico de acidentes? (true/false)");
        boolean historicoAcidentes = scanner.nextBoolean();
        System.out.println("Possui curso de direção defensiva? (true/false)");
        boolean cursoDefensiva = scanner.nextBoolean();

        String taxa = "";

        if (idade < 21) {
            taxa = "alta";
        } else if (idade <= 30) {
            taxa = "média";
        } else {
            taxa = "baixa";
        }
        if (historicoAcidentes) {
            if (taxa.equals("baixa")) {
                taxa = "média";
            } else if (taxa.equals("média")) {
                taxa = "alta";
            }
        }
        if (cursoDefensiva) {
            if (taxa.equals("alta")) {
                taxa = "média";
            } else if (taxa.equals("média")) {
                taxa = "baixa";
            }
        }
        System.out.println("A taxa do seguro será: " + taxa + ".");
        scanner.close();
    }
}