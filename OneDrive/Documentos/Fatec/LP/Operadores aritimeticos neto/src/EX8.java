import java.util.Scanner;

public class EX8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite a hora de início do jogo (0-23): ");
        int inicio = sc.nextInt();

        System.out.print("Digite a hora de fim do jogo (0-23): ");
        int fim = sc.nextInt();
        int duracao;
        // Se o jogo terminou no mesmo dia
        if (fim > inicio) {
            duracao = fim - inicio;
        } 
        // Se o jogo passou para o dia seguinte
        else if (fim < inicio) {
            duracao = (24 - inicio) + fim;
        } 
        // Se inicio == fim, significa que durou 24h
        else {
            duracao = 24;
        }
        // Saída
        System.out.println("A duração do jogo foi de " + duracao + " hora(s).");
        sc.close();
    }
}
