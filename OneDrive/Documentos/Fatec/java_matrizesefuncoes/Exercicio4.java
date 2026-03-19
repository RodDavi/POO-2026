import java.util.Random;

public class Exercicio4 {
    static Random rand = new Random();

    public static void main(String[] args) {
        String[] frutas = frutas();
        double[][] cont = gerarContagens();
        double[] preco = gerarPrecos();

        imprimirPlanilha(cont, preco, frutas);
        imprimirSegundaAnalise(cont, preco, frutas);
    }

    static String[] frutas() {
        return new String[]{"Laranja","Melão","Morango","Figo","Jaboticaba","Melancia"};
    }

    static double[][] gerarContagens() {
        double[][] c = new double[6][3];
        for (int i=0;i<6;i++)
            for (int j=0;j<3;j++)
                c[i][j] = 1 + rand.nextInt(20); // kg
        return c;
    }

    static double[] gerarPrecos() {
        double[] p = new double[6];
        for (int i=0;i<6;i++) p[i] = 2 + rand.nextInt(19); // R$
        return p;
    }

    static void imprimirPlanilha(double[][] cont, double[] preco, String[] frutas) {
        System.out.println("Planilha original:");
        for (int i=0;i<frutas.length;i++) {
            double soma = cont[i][0] + cont[i][1] + cont[i][2];
            System.out.printf("%-10s -> %.1f kg | R$ %.2f\n", frutas[i], soma, soma * preco[i]);
        }
    }

    static void imprimirSegundaAnalise(double[][] cont, double[] preco, String[] frutas) {
        System.out.println("\nSegunda análise (descartando pior contagem):");
        for (int i=0;i<frutas.length;i++) {
            int manj = menorIndice(cont[i]);
            double soma = 0;
            for (int j=0;j<3;j++) if (j != manj) soma += cont[i][j];
            System.out.printf("%-10s -> %.1f kg | R$ %.2f\n", frutas[i], soma, soma * preco[i]);
        }
    }

    static int menorIndice(double[] v) {
        int menor = 0;
        for (int i=1;i<v.length;i++) if (v[i] < v[menor]) menor = i;
        return menor;
    }
}
