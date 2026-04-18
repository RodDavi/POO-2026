package classeassociacao;

import java.time.LocalDateTime;

public class TestaVoo {
    public static void main(String[] args) {

        Passageiro passageiro1 = new Passageiro("123", "Miguel");
        LocalDateTime data = LocalDateTime.of(2026,7,15,13,10 );
        Voo voo1 = new Voo(777, "São Paulo", "Rio de Janeiro",data);
        Reserva reserva1 = new Reserva(10,LocalDateTime.now(), 1,  passageiro1, voo1);

        System.out.println(reserva1.toString());
    }
}