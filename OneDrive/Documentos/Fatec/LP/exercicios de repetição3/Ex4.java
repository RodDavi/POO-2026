import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1, totalAlunos = 0;
        double pesoTotal = 0;
        do {
            System.out.print("Digite o peso do aluno " + i + ": ");
            double peso = sc.nextDouble();
            pesoTotal += peso;
            totalAlunos++;
            i++;
        } while (i <= 5); // pode alterar o limite
        double media = pesoTotal / totalAlunos;

        System.out.println("Total de alunos: " + totalAlunos);
        System.out.printf("Peso total: %.2f kg\n", pesoTotal);
        System.out.printf("Média de peso: %.2f kg\n", media);
        sc.close();
    }
}

