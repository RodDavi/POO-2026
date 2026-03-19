import java.util.Random;

public class Testedemesa {

    static void substituirValores(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] <= 30) {
                vetor[i] = 1;
            } else {
                vetor[i] = 0;
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[30];
        int somaMenores = 0;
        int somaMaiores = 0;

        System.out.println("Vetor gerado:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(60) + 1;
            System.out.print(numeros[i] + " ");
            if (numeros[i] <= 30) somaMenores += numeros[i];
            else somaMaiores += numeros[i];
        }

        System.out.println("\n\nSoma dos menores ou iguais a 30: " + somaMenores);
        System.out.println("Soma dos maiores que 30: " + somaMaiores);

        substituirValores(numeros);

        System.out.println("\nVetor após substituição:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}