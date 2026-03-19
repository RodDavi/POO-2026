public class ArCondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
    }

    public ArCondicionado(String marca, String modelo, int temperatura, boolean ligado) {
        setMarca(marca);
        this.modelo = modelo;
        setTemperatura(temperatura);
        this.ligado = ligado;
    }

    public void setTemperatura(int t) {
        if (t >= 16 && t <= 30) {
            this.temperatura = t;
        } else {
            System.out.println("Temperatura fora da faixa");
        }
    }

    public void setMarca(String m) {
        if (m != null && m.trim().length() >= 3) {
            this.marca = m;
        } else {
            System.out.println("Marca deve ter pelo menos 3 caracteres");
        }
    }

    public void ativarModoTurbo() {
        if (verificarCompressor()) {
            setTemperatura(16);
            System.out.println("Modo turbo ativado!");
        } else {
            System.out.println("Falha técnica no compressor.");
        }
    }

    private boolean verificarCompressor() {
        double numero = Math.random() * 5;
        return numero > 2;
    }

    @Override
    public String toString() {
        return "ArCondicionado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", temperatura=" + temperatura +
                ", ligado=" + ligado +
                '}';
    }
}
