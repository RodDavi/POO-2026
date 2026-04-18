package classeassociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Consulta {
    private LocalDateTime data;
    private float ValorDaConsulta;
    private Medico medico;
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(LocalDateTime data, float valorDaConsulta, Medico medico, Paciente paciente) {
        this.data = data;
        ValorDaConsulta = valorDaConsulta;
        this.medico = medico;
        this.paciente = paciente;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public float getValorDaConsulta() {
        return ValorDaConsulta;
    }

    public void setValorDaConsulta(float valorDaConsulta) {
        ValorDaConsulta = valorDaConsulta;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'm");
        return "Consulta{" +
                "data=" + data.format(formatoBR) +
                ", ValorDaConsulta=" + ValorDaConsulta +
                ", \nmedico=" + medico +
                ", \npaciente=" + paciente +
                '}';
    }
}