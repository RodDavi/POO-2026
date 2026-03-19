import java.util.Scanner;

public class EX6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();

        // Verificação e saída
        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }

        sc.close();
    }
}
