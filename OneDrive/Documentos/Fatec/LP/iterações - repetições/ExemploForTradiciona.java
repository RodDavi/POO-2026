//Útil quando você precisa de controle sobre o índice da lista (por exemplo, para acessar a posição ou 
//iterar de forma reversa).
import java.util.ArrayList;
import java.util.List;

public class ExemploForTradiciona {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        // Loop for tradicional
        for (int i = 0; i < frutas.size(); i++) {
            System.out.println("Índice " + i + ": " + frutas.get(i));
        }
    }
}
