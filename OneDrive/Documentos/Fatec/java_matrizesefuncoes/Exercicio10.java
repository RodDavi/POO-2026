import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        String[] itens = {"X-Burguer","X-Salada","Coxinha","Refrigerante","Suco","BatataFrita"};
        double[] preco = {12.0,13.5,5.0,4.0,6.0,8.0};
        Scanner sc = new Scanner(System.in);
        double fatur = 0;
        int op;
        do {
            menu();
            op = sc.nextInt();
            fatur = executar(op, itens, preco, fatur, sc);
        } while (op != 9);
    }

    static void menu() {
        System.out.println("1-Cardápio 2-Novo pedido 3-Resumo 9-Sair");
        System.out.print("Opção: ");
    }

    static double executar(int op, String[] itens, double[] preco, double fatur, Scanner sc) {
        if (op == 1) mostrarCardapio(itens, preco);
        else if (op == 2) fatur = novoPedido(itens, preco, fatur, sc);
        else if (op == 3) mostrarResumo(fatur);
        return fatur;
    }

    static void mostrarCardapio(String[] itens, double[] preco) {
        for (int i=0;i<itens.length;i++) System.out.printf("%d - %s R$ %.2f\n", i+1, itens[i], preco[i]);
    }

    static double novoPedido(String[] itens, double[] preco, double fatur, Scanner sc) {
        System.out.println("Informe código do item (0 para encerrar):");
        int cod;
        do {
            cod = sc.nextInt();
            if (cod == 0) break;
            if (cod < 1 || cod > itens.length) { System.out.println("Código inválido."); continue; }
            System.out.print("Quantidade: "); int q = sc.nextInt();
            fatur += preco[cod-1] * q;
        } while (true);
        System.out.printf("Pedido registrado. Total acumulado R$ %.2f\n", fatur);
        return fatur;
    }

    static void mostrarResumo(double fatur) {
        System.out.printf("Faturamento total: R$ %.2f\n", fatur);
    }
}
