//Introduzido com a API de Streams, é uma maneira concisa e funcional de realizar uma ação para cada 
//elemento da lista. Aceita uma expressão lambda.

import java.util.ArrayList;
import java.util.List;
    public class ExemploForEachMethod {
        public static void main(String[] args) {
            List<String> frutas = new ArrayList<>();
            frutas.add("Maçã");
            frutas.add("Banana");
            frutas.add("Laranja");
        // Usando o método forEach com uma expressão lambda
            frutas.forEach(fruta -> System.out.println(fruta));
        // Usando uma referência de método
            frutas.forEach(System.out::println);
        }
}
