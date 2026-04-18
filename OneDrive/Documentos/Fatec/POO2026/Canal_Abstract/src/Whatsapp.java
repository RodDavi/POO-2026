package Herenca_Abstract;

public class Whatsapp extends CanalNotificacao{
    private String statusLeitura;
    public Whatsapp(){
        super();
    }

    public Whatsapp(String statusLeitura) {
        this.statusLeitura = statusLeitura;
    }

    public Whatsapp(String destinatario, String mensagem, String statusLeitura) {
        super(destinatario, mensagem);
        this.statusLeitura = statusLeitura;
    }
    @Override
    public void enviar(){
        System.out.println("Enviando Zap para: " + this.getDestinatario() + " - " + this.getMensagem());
    }

    @Override
    public String toString() {
        return "Whatsapp{" +
                super.toString() +
                "statusLeitura='" + statusLeitura + '\'' +
                '}';
    }
}