import java.util.Scanner;
public class EX3 {
    public static void main (String [] args){

        Scanner leia = new Scanner(System.in);
        System.out.println("maçãs: ");
        float qntd = leia.nextInt();
        float valor;
        float total;

        if(qntd >= 12){
            valor = 1;
            total = valor * qntd;
        } else{
            valor = 1.30f;
            total = valor * qntd;
        }

        System.out.println("Resultado: " + total);
    }
}
