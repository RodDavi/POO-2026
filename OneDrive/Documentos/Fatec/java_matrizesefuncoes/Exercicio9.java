import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        String[] vetor = nomes();
        String[][] mat = popularMatriz(vetor);
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            menu();
            op = sc.nextInt();
            executar(op, mat, sc);
        } while (op != 9);
    }

    static String[] nomes() {
        return new String[]{"José","Maria","Luís","Pedro","Claudia","Nena","Carla","Júnior","Ivã"};
    }

    static String[][] popularMatriz(String[] v) {
        String[][] m = new String[3][3];
        int k=0;
        for (int i=0;i<3;i++) for (int j=0;j<3;j++) m[i][j] = v[k++];
        return m;
    }

    static void menu() {
        System.out.println("1-Mostrar 2-Trocar 3-Substituir 9-Sair");
    }

    static void executar(int op, String[][] m, Scanner sc) {
        if (op == 1) mostrar(m);
        else if (op == 2) trocar(m, sc);
        else if (op == 3) substituir(m, sc);
    }

    static void mostrar(String[][] m) {
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) System.out.printf("%-10s", m[i][j]);
            System.out.println();
        }
    }

    static void trocar(String[][] m, Scanner sc) {
        System.out.print("Pos1 (0..8): "); int p1 = sc.nextInt();
        System.out.print("Pos2 (0..8): "); int p2 = sc.nextInt();
        int r1 = p1/3, c1 = p1%3, r2 = p2/3, c2 = p2%3;
        String tmp = m[r1][c1]; m[r1][c1] = m[r2][c2]; m[r2][c2] = tmp;
        System.out.println("Trocado.");
    }

    static void substituir(String[][] m, Scanner sc) {
        System.out.print("Pos (0..8): "); int p = sc.nextInt();
        System.out.print("Novo nome: "); sc.nextLine(); String novo = sc.nextLine();
        int r = p/3, c = p%3;
        m[r][c] = novo;
        System.out.println("Substituído.");
    }
}
