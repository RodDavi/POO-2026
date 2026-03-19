//Para operações mais complexas, como filtragem, mapeamento ou processamento paralelo, as Streams 
//são a melhor opção.
import java.util.Arrays;
import java.util.List;

public class ExemploStream {
    public static void main(String[] args) {
        List<String> frutas = Arrays.asList("Maçã", "Banana", "Laranja", "Morango");
        // Filtra e imprime apenas as frutas que começam com "M"
        frutas.stream()
        .filter(fruta -> fruta.startsWith("M"))
        .forEach(System.out::println);
    }
}
