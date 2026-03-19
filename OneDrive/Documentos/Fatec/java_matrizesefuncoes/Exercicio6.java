import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Conta[] contas = inicializarContas();

        int op;
        do {
            menu();
            op = sc.nextInt();
            executarOpcao(op, contas, sc);
        } while (op != 9);
    }

    static Conta[] inicializarContas() {
        return new Conta[] {
            new Conta(1, "Brasil A", 1000),
            new Conta(2, "Caixa 01", 500),
            new Conta(3, "Santander", 2300),
            new Conta(4, "Itaú Centro", 45),
            new Conta(5, "Brasil MG", 92345)
        };
    }

    static void menu() {
        System.out.println("1-Listar  2-Lançamento  9-Sair");
    }

    static void executarOpcao(int op, Conta[] contas, Scanner sc) {
        if (op == 1) listar(contas);
        else if (op == 2) lancamento(contas, sc);
    }

    static void listar(Conta[] contas) {
        for (Conta c : contas) System.out.println(c);
    }

    static void lancamento(Conta[] contas, Scanner sc) {
        System.out.print("Código: "); int cod = sc.nextInt();
        Conta c = buscar(contas, cod);
        if (c == null) { System.out.println("Conta não encontrada."); return; }
        System.out.print("1=Crédito 2=Débito: "); int t = sc.nextInt();
        System.out.print("Valor: "); double v = sc.nextDouble();
        if (t == 1) c.saldo += v; else c.saldo -= v;
        System.out.println("Saldo atualizado: R$ " + c.saldo);
    }

    static Conta buscar(Conta[] contas, int cod) {
        for (Conta c : contas) if (c.codigo == cod) return c;
        return null;
    }
}

class Conta {
    int codigo; String desc; double saldo;
    Conta(int codigo, String desc, double saldo) { this.codigo = codigo; this.desc = desc; this.saldo = saldo; }
    public String toString() { return codigo + " - " + desc + " - R$ " + saldo; }
}
