package classeassociacao;

import java.time.LocalDateTime;

public class TestaConsulta {
    public static void main(String[] args) {

        Medico medico1 = new Medico(1, "Dr.Ciclano", "Ortopedista");
        Paciente paciente1 = new Paciente(1, "Daniel", "123");
        LocalDateTime data = LocalDateTime.of(2026,5,20,15,30);
        Consulta consulta1 = new Consulta(data, 350, medico1, paciente1);
        System.out.println(consulta1.toString());

    }
}