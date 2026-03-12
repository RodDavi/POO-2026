public class ContaTeste {
    public static void main (String[] args){

        ContaBancaria conta1 = new ContaBancaria(1, 4, "João Silva", 0, true);
        conta1.depositar(500);
        conta1.sacar(200);
        System.out.println(conta1.toString());

        ContaBancaria conta2 = new ContaBancaria(2, 4, "Maria Souza", 0, true);
        conta2.sacar(40);

        conta1.encerrarConta();
        conta1.sacar(300);
        conta1.encerrarConta();
        System.out.println(conta1.toString());
    }
}