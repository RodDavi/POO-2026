public class ContaBancaria {
    public int numeroConta, agencia;
    public String nomeCliente;
    public double saldo;
    public boolean status;

    public ContaBancaria(int numeroConta, int agencia, String nomeCliente, double saldo, boolean status){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = status;
    }

    public String toString(){
        //retorna string
        return  "Número da conta: " + this.numeroConta + "\n" +
                "Agencia: " + this.agencia + "\n" +
                "Nome do Cliente: " + this.nomeCliente + "\n" +
                "Saldo bancário: " + this.saldo + "\n" +
                "Status: " + this.status;
    }

    public void depositar(double deposito){
        if (this.status){
            this.saldo += deposito;
            System.out.println("Depósito efetuado com secesso! Saldo: R$ " + this.saldo);
        } else {
            System.out.println("Ative essa conta");
        }
    }

    public void sacar(double saque){
        if (!this.status){
            System.out.println("Conta não ativa");
        } else if (this.saldo > saque){
            this.saldo -= saque;
            System.out.println("Saque efetuado! Saldo: R$ " + this.saldo);
        } else {
            System.out.println("ERRO! Saldo menor que o valor de saque!");
        }
    }


    public void encerrarConta(){
        if (this.saldo == 0){
            this.status = false;
            System.out.println("Conta encerrada!");
        } else if (this.saldo > 0){
            System.out.println("Há dinheiro na conta! Ela não pode ser encerrada");
        }
    }
}
