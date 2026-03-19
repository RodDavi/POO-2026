import java.util.Scanner;

public class EX5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();

        System.out.print("Digite o ano de nascimento: ");
        int anoNasc = sc.nextInt();

        int idade = anoAtual - anoNasc;

        if (idade >= 18) {
            System.out.println("Você pode votar este ano.");
        } else {
            System.out.println("Você NÃO pode votar este ano.");
        }

        sc.close();
    }
}
