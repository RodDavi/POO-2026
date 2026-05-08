package Package;

public class Camera extends DispositivoSeguranca implements DispositivoConectado {
    private String resolucao;

    public Camera(String localizacao, boolean ativo, String resolucao) {
        super(localizacao, ativo);
        this.resolucao = resolucao;
    }

    @Override
    public void dispararAlerta() {
        System.out.println("Gravando imagens em alta definição de " + localizacao + " e enviando para a central");
    }

    @Override
    public void conectarWiTone() {
        System.out.println("Câmera conectada via protocolo seguro SSL");
    }

    @Override
    public void realizarAutodiagnostico() {
        System.out.println("Autodiagnóstico da câmera realizado com sucesso");
    }
}