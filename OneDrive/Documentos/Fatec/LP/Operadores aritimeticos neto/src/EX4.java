import java.util.Scanner;
public class EX4 {
    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva as duas notas do aluno: ");
        float n1 = leia.nextFloat();
        float n2 = leia.nextFloat();

        float resultado;

        resultado = (n1 + n2) / 2;
        
        if(resultado >= 6){
            System.out.println("ALUNO APROVADO nota:" + resultado);
        } else{
            System.out.println("ALUNO REPROVADO nota:" + resultado);
        }
    }
}
