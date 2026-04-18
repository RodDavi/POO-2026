package classeassociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Reserva {
    private int codigo;
    LocalDateTime dataRes;
    private int Poltrona;
    private Passageiro passageiro;
    private Voo voo;

    public Reserva() {
    }

    public Reserva(int codigo, LocalDateTime dataRes, int poltrona, Passageiro passageiro, Voo voo) {
        this.codigo = codigo;
        this.dataRes = dataRes;
        Poltrona = poltrona;
        this.passageiro = passageiro;
        this.voo = voo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public LocalDateTime getDataRes() {
        return dataRes;
    }

    public void setDataRes(LocalDateTime dataRes) {
        this.dataRes = dataRes;
    }

    public int getPoltrona() {
        return Poltrona;
    }

    public void setPoltrona(int poltrona) {
        Poltrona = poltrona;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'm");
        return "Reserva{" +
                "codigo=" + codigo +
                ", dataRes=" + dataRes.format(formatoBR) +
                ", Poltrona=" + Poltrona +
                ", \npassageiro=" + passageiro +
                ", \nvoo=" + voo +
                '}';
    }
}