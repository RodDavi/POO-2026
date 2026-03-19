//É a forma mais comum e legível para percorrer todos os elementos de uma lista, sem a necessidade de 
//gerenciar índices.
import java.util.ArrayList;
import java.util.List;
public class ExemploForEach {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã"); 
        frutas.add("Banana");
        frutas.add("Laranja");
        // Loop for-each
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
