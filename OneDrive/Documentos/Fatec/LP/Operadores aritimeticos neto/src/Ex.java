import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite a altura (em metros): ");
        double altura = sc.nextDouble();

        System.out.print("Digite o sexo (M/F): ");
        char sexo = sc.next().toUpperCase().charAt(0); // lê apenas a primeira letra

        double pesoIdeal;

        // Condição de acordo com o sexo
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        } else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else {
            System.out.println("Sexo inválido! Digite apenas M ou F.");
            sc.close();
            return;
        }

        // Saída
        System.out.println(nome + ", seu peso ideal é: " + pesoIdeal + " kg");

        sc.close();
    }
}
