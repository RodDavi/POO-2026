package classeassociacao;

import java.time.LocalDateTime;

public class TestaEmprestimo {
    public static void main(String[] args) {

        Leitor leitor1 = new Leitor(1,"jose");
        Livro livro1 = new Livro(1, "1984", "George Orwell");
        LocalDateTime data = LocalDateTime.of(2026,5,20,15,30);
        Emprestimo emprestimo1 = new Emprestimo(data, LocalDateTime.now(), livro1, leitor1);
        System.out.println(emprestimo1);
    }
}