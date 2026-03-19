import java.util.Scanner;

public class decisao16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da pessoa:");
        int idade = scanner.nextInt();

        System.out.println("Digite o IMC (Índice de Massa Corporal):");
        double imc = scanner.nextDouble();

        System.out.println("Possui doenças crônicas (hipertensão, diabetes ou cardíaca)? (true/false)");
        boolean temDoencaCronica = scanner.nextBoolean();

        if (idade < 18 || idade > 65) {
            System.out.println("Plano negado: Idade fora da faixa.");
        } else if (idade <= 40 && imc >= 18.5 && imc <= 29.9) {
            System.out.println("Plano aprovado.");
        } else if (imc < 18.5 || imc > 29.9 || temDoencaCronica) {
            System.out.println("Plano negado: Não atende aos critérios.");
        } else {
            System.out.println("Plano aprovado.");
        }

        scanner.close();
    }
}