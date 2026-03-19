import java.util.Random;
 
public class TratarMatrizEVetor {
    public static void main(String[] args) {
        int[][] matriz = popularMatrizAleatoria(5, 5);
        int[] vetorRepeticoes = contarRepeticoes(matriz);
 
        System.out.println("Matriz gerada:");
        escreverMatriz(matriz);
 
        System.out.println("\nQuantidade de repetições (números 1 a 5):");
        for (int i = 0; i < vetorRepeticoes.length; i++) {
            System.out.println("Número " + (i + 1) + " aparece " + vetorRepeticoes[i] + " vezes.");
        }
    }

    // 🔹 Função para preencher a matriz com números aleatórios de 1 a 5
    public static int[][] popularMatrizAleatoria(int linhas, int colunas) {
        Random aleatorio = new Random();
        int[][] matriz = new int[linhas][colunas];
 
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = aleatorio.nextInt(5) + 1; // gera número de 1 a 5
            }
        }
        return matriz;
    }
 
    // 🔹 Função para mostrar a matriz no terminal
    public static void escreverMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
 
    // 🔹 Função para contar quantas vezes cada número aparece (1 a 5)
    public static int[] contarRepeticoes(int[][] matriz) {
        int[] contagem = new int[5]; // posições: 0→1, 1→2, 2→3, 3→4, 4→5
 
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int valor = matriz[i][j];
                contagem[valor - 1]++; // soma 1 na posição correspondente
            }
        }
        return contagem;
    }
}