import java.util.Scanner;

public class EX1 {

    public static void main (String [] args){

        Scanner leia = new Scanner(System.in);

        System.out.println("Escreva o valor de um nuemro inteiro");
        int num = leia.nextInt();

        if(num > 10){
            System.out.println("O número é maior que 10");
        } else{
            System.out.println("Número é menor que 10");
        }
    }
}