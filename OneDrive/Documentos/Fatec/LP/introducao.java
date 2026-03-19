import java.util.Random;
public class introducao{

    public static void main(String[] args) {
        //criar um objeto da classe Random
        int contador = 0, numero = 0, acumulador = 0;
        Random random = new Random();

        while (contador < 4) {
            //gerar um numero aleatorio de 0 a 6
            numero = random.nextInt(6);
            acumulador = acumulador + numero;
            contador++;
            System.out.println("Numero: " + numero + " Acumulador: " + acumulador + " Contador: " + contador);
        }

        System.out.println("-----------");
    }
}
