import java.util.Random;

public class Exercicio2 {
    static Random rand = new Random();

    public static void main(String[] args) {
        double[][] mat = new double[2][10]; // [0]=preco, [1]=qtd
        String[] nomes = nomesProdutos();

        preencherMatriz(mat);
        imprimirResumo(mat, nomes);
    }

    static String[] nomesProdutos() {
        return new String[]{"Vaso","Quadro","Pulseira","Colar","Copo",
                           "Boneco","PortaChave","Sabonete","Pano","Enfeite"};
    }

    static void preencherMatriz(double[][] m) {
        for (int i=0;i<10;i++) {
            m[0][i] = 10 + rand.nextInt(191);
            m[1][i] = 1 + rand.nextInt(12);
        }
    }

    static int posMaisVendido(double[][] m) {
        int pos = 0;
        for (int i=1;i<10;i++) if (m[1][i] > m[1][pos]) pos = i;
        return pos;
    }

    static void imprimirResumo(double[][] m, String[] nomes) {
        double fatur = 0;
        for (int i=0;i<10;i++) {
            double tot = m[0][i] * m[1][i];
            fatur += tot;
            System.out.printf("%d - %s | R$ %.2f | qtd %.0f | total R$ %.2f\n", i, nomes[i], m[0][i], m[1][i], tot);
        }
        System.out.printf("\nFaturamento: R$ %.2f\n", fatur);
        System.out.println("Mais vendido: " + nomes[posMaisVendido(m)]);
    }
}
