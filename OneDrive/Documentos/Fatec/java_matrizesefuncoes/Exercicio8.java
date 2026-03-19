import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        boolean[][] sala = new boolean[5][10];
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            menu();
            op = sc.nextInt();
            executar(op, sala, sc);
        } while (op != 9);
    }

    static void menu() {
        System.out.println("1-Mapa 2-Reservar 3-Cancelar 9-Sair");
        System.out.print("Opção: ");
    }

    static void executar(int op, boolean[][] sala, Scanner sc) {
        if (op == 1) mostrarMapa(sala);
        else if (op == 2) reservar(sala, sc);
        else if (op == 3) cancelar(sala, sc);
    }

    static void mostrarMapa(boolean[][] sala) {
        System.out.println("Mapa (X=ocupado O=livre):");
        for (int i=0;i<sala.length;i++) {
            for (int j=0;j<sala[i].length;j++) System.out.print(sala[i][j] ? "X " : "O ");
            System.out.println();
        }
    }

    static void reservar(boolean[][] sala, Scanner sc) {
        System.out.print("Linha (1-5): "); int l = sc.nextInt()-1;
        System.out.print("Coluna (1-10): "); int c = sc.nextInt()-1;
        if (l>=0 && l<sala.length && c>=0 && c<sala[0].length) {
            if (!sala[l][c]) { sala[l][c] = true; System.out.println("Reservado."); }
            else System.out.println("Já ocupado.");
        } else System.out.println("Posição inválida.");
    }

    static void cancelar(boolean[][] sala, Scanner sc) {
        System.out.print("Linha (1-5): "); int l = sc.nextInt()-1;
        System.out.print("Coluna (1-10): "); int c = sc.nextInt()-1;
        if (l>=0 && l<sala.length && c>=0 && c<sala[0].length) {
            if (sala[l][c]) { sala[l][c] = false; System.out.println("Cancelado."); }
            else System.out.println("Já livre.");
        } else System.out.println("Posição inválida.");
    }
}
