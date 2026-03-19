import java.util.Scanner;

public class EX7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        // Saída em ordem crescente
        if (valor1 < valor2) {
            System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2);
        } else {
            System.out.println("Valores em ordem crescente: " + valor2 + ", " + valor1);
        }

        sc.close();
    }
}
