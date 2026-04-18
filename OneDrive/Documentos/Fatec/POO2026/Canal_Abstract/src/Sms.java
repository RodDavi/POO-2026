package Herenca_Abstract;

public class Sms extends CanalNotificacao{
    private int telefone;
    public Sms(){
        super();
    }

    public Sms(int telefone) {
        this.telefone = telefone;
    }

    public Sms(String destinatario, String mensagem, int telefone) {
        super(destinatario, mensagem);
        this.telefone = telefone;
    }
    @Override
    public void enviar(){
        System.out.println("Enviando SMS para o número " + telefone + " - " + this.getMensagem());
    }
    @Override
    public String toString() {
        return "Sms{" +
                super.toString() +
                "telefone=" + telefone +
                '}';
    }
}