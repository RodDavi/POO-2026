package Package;

public class SensorMovimento extends DispositivoSeguranca implements DispositivoConectado {
    private double sensibilidade;

    public SensorMovimento(String localizacao, boolean ativo, double sensibilidade) {
        super(localizacao, ativo);
        this.sensibilidade = sensibilidade;
    }

    @Override
    public void dispararAlerta() {
        System.out.println("Movimento detectado em " + localizacao + ". Acionando luzes de emergência");
    }

    @Override
    public void conectarWiTone() {
        System.out.println("Sensor conectado via rádio frequência 433MHz");
    }

    @Override
    public void realizarAutodiagnostico() {
        System.out.println("Autodiagnóstico do sensor realizado com sucesso");
    }
}