package Package;

public abstract class DispositivoSeguranca {
    protected String localizacao;
    protected boolean ativo;

    public DispositivoSeguranca(String localizacao, boolean ativo) {
        this.localizacao = localizacao;
        this.ativo = ativo;
    }

    public void status() {
        System.out.println("Localização: " + localizacao + " | Ativo: " + ativo);
    }

    public abstract void dispararAlerta();
}