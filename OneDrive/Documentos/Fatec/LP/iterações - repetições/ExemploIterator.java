//É a maneira mais segura para iterar e modificar a lista (como remover elementos) simultaneamente. 
//Evita a ConcurrentModificationException
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExemploIterator {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        Iterator<String> iterador = frutas.iterator();
        while (iterador.hasNext()) {
            String fruta = iterador.next();
            System.out.println(fruta);
            if (fruta.equals("Banana")) {
            iterador.remove(); // Remoção segura
            }
        }
        System.out.println("Lista após a remoção: " + frutas);
    }
}
