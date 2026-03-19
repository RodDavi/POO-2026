import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inteiras = 0, meias = 0, i = 1;
        double total = 0;
        do {
            System.out.print("Aluno " + i + " é estudante? (1-Sim / 0-Não): ");
            int resp = sc.nextInt();

            if (resp == 1) {
                meias++;
                total += 10;
            } else {
                inteiras++;
                total += 20;
            }
            i++;
        } while (i <= 4); // depois pode aumentar para testar

        System.out.printf("Inteiras vendidas: %d\n", inteiras);
        System.out.printf("Meias vendidas: %d\n", meias);
        System.out.printf("Valor total arrecadado: R$ %.2f\n", total);
        sc.close();
    }
}

