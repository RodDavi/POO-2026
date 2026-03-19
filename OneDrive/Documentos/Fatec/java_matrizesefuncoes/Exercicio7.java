import java.util.Random;

public class Exercicio7 {
    static Random rand = new Random();

    public static void main(String[] args) {
        double[][] notas = gerarNotas();
        mostrarMenorPorAluno(notas);
    }

    static double[][] gerarNotas() {
        double[][] m = new double[10][3];
        for (int i=0;i<10;i++)
            for (int j=0;j<3;j++)
                m[i][j] = rand.nextInt(11); // 0..10
        return m;
    }

    static int posMenor(double[] v) {
        int pos = 0;
        for (int i=1;i<v.length;i++) if (v[i] < v[pos]) pos = i;
        return pos;
    }

    static void mostrarMenorPorAluno(double[][] m) {
        for (int i=0;i<m.length;i++)
            System.out.println("Aluno " + (i+1) + " -> menor nota na prova " + (posMenor(m[i]) + 1));
    }
}
