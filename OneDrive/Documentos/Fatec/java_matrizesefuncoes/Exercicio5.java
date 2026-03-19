import java.util.Random;
import java.util.Arrays;

public class Exercicio5 {
    static Random rand = new Random();

    public static void main(String[] args) {
        char[] gabarito = {'B','C','A','C','A','B','B','C','A','A'};
        char[][] respostas = gerarRespostas();
        int[] notas = corrigirProvas(respostas, gabarito);
        mostrarEstatisticas(notas);
    }

    static char[][] gerarRespostas() {
        char[] op = {'A','B','C'};
        char[][] r = new char[10][10];
        for (int i=0;i<10;i++)
            for (int j=0;j<10;j++)
                r[i][j] = op[rand.nextInt(op.length)];
        return r;
    }

    static int[] corrigirProvas(char[][] resp, char[] gabarito) {
        int[] notas = new int[10];
        for (int i=0;i<10;i++)
            for (int j=0;j<10;j++)
                if (resp[i][j] == gabarito[j]) notas[i]++;
        return notas;
    }

    static void mostrarEstatisticas(int[] notas) {
        double soma = 0;
        int aprov = 0;
        double somaAprov = 0;
        for (int n : notas) {
            soma += n;
            if (n >= 6) { aprov++; somaAprov += n; }
        }
        System.out.printf("Média geral: %.2f\n", soma / notas.length);
        System.out.println("Aprovados: " + aprov);
        if (aprov > 0) System.out.printf("Média dos aprovados: %.2f\n", somaAprov / aprov);
    }
}
