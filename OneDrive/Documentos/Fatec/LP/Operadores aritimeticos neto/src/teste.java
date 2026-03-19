import java.util.Scanner;
public class teste {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       int numeros = 5;
       int [] tamanho = new int[numeros];

       for (int i = 0; i < tamanho.length; i++) {
            // Acessa o elemento na posição 'i' do array
             tamanho[i] = sc.nextInt(); 
            
            
        }
    

    }
}