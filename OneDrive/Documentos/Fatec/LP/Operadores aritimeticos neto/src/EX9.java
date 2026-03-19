import java.util.Scanner;

public class EX9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entrada de dados
        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = sc.nextInt();
        System.out.print("Digite o salário por hora: ");
        double salarioHora = sc.nextDouble();

        // Jornada mensal padrão (40 horas por semana * 4 semanas)
        int horasNormais = 40 * 4; 

        double salarioTotal;

        if (horasTrabalhadas <= horasNormais) {
            // Sem hora extra
            salarioTotal = horasTrabalhadas * salarioHora;
        } else {
            // Com hora extra
            int horasExtras = horasTrabalhadas - horasNormais;
            double valorHoraExtra = salarioHora * 1.5;
            salarioTotal = (horasNormais * salarioHora) + (horasExtras * valorHoraExtra);
        }
        // Saída
        System.out.println("O salário total do funcionário é: R$ " + salarioTotal);
        sc.close();
    }
}
