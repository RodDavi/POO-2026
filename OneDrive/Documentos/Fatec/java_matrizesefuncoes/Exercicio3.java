import java.util.Random;
import java.util.Arrays;

public class Exercicio3 {
    static Random rand = new Random();

    public static void main(String[] args) {
        int[] a = new int[10];
        int[] b = new int[10];
        int[] res = new int[20];

        preencher(a);
        preencher(b);
        intercalar(a, b, res);
        System.out.println("A: " + Arrays.toString(a));
        System.out.println("B: " + Arrays.toString(b));
        System.out.println("Intercalado: " + Arrays.toString(res));
    }

    static void preencher(int[] v) {
        for (int i=0;i<v.length;i++) v[i] = rand.nextInt(20);
    }

    static void intercalar(int[] a, int[] b, int[] out) {
        int k=0;
        for (int i=0;i<10;i++) {
            out[k++] = a[i];
            out[k++] = b[i];
        }
    }
}
