import java.util.Scanner;
public class EX2 {

    public static void main (String [] args){
        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o valor de um nuemro inteiro sendo ele negativo ou positivo");
        int num = leia.nextInt();

        if(num < 0){
            System.out.println("O número é negativo");
        } else{
            System.out.println("Número é positivo");
        }
    }
}
