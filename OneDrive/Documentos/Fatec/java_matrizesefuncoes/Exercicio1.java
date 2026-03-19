import java.util.Random;

public class Exercicio1 {
    static final int TAM = 10;
    static Random rand = new Random();

    public static void main(String[] args) {
        double[] preco = new double[TAM];
        int[] qtd = new int[TAM];
        String[] nome = gerarNomesProdutos();

        gerarPrecos(preco);
        gerarQuantidades(qtd);

        mostrarResumo(preco, qtd, nome);
    }

    static String[] gerarNomesProdutos() {
        return new String[]{
                "Vaso", "Quadro", "Pulseira", "Colar", "Copo", 
                "Boneco", "PortaChave", "Sabonete", "Pano", "Enfeite"
        };
    }

    static void gerarPrecos(double[] preco) {
        for (int i = 0; i < preco.length; i++)
            preco[i] = 10 + rand.nextInt(191);
    }

    static void gerarQuantidades(int[] qtd) {
        for (int i = 0; i < qtd.length; i++)
            qtd[i] = 1 + rand.nextInt(12);
    }

    static void mostrarResumo(double[] preco, int[] qtd, String[] nome) {
        double faturamento = 0;
        int totalItens = 0;

        System.out.println("=== RESUMO DAS VENDAS ===");

        for (int i = 0; i < preco.length; i++) {
            double total = preco[i] * qtd[i];
            faturamento += total;
            totalItens += qtd[i];

            System.out.printf("%d - %s | Preço: R$ %.2f | Qtd: %d | Total: R$ %.2f\n",
                    i, nome[i], preco[i], qtd[i], total);
        }

        int posMaior = posicaoMaior(qtd);

        System.out.println("\nTotal de itens vendidos: " + totalItens);
        System.out.printf("Faturamento total: R$ %.2f\n", faturamento);
        System.out.printf("Comissão: R$ %.2f\n", faturamento * 0.5);
        System.out.printf("Produto mais vendido: %s (posição %d)\n",
                nome[posMaior], posMaior);
    }

    static int posicaoMaior(int[] vetor) {
        int pos = 0;
        for (int i = 1; i < vetor.length; i++)
            if (vetor[i] > vetor[pos]) pos = i;
        return pos;
    }
}
