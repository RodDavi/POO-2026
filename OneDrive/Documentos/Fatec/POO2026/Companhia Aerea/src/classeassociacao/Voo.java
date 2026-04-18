package classeassociacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Voo {
    private int num;
    private String origem, destino;
    private LocalDateTime data;

    public Voo() {
    }

    public Voo(int num, String origem, String destino, LocalDateTime data) {
        this.num = num;
        this.origem = origem;
        this.destino = destino;
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy 'às' HH'h'm");
        return "Voo{" +
                "num=" + num +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", data=" + data.format(formatoBR) +
                '}';
    }
}