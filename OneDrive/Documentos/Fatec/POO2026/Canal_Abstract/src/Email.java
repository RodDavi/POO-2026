package Herenca_Abstract;

public class Email extends CanalNotificacao{
    private String assunto;
    public Email(){
        super();
    }

    public Email(String assunto) {
        this.assunto = assunto;
    }

    public Email(String destinatario, String mensagem, String assunto) {
        super(destinatario, mensagem);
        this.assunto = assunto;
    }
    @Override
    public void enviar(){
        System.out.println("Enviar email para: "  + this.getDestinatario());
    }

    @Override
    public String toString() {
        return "Email{" +
                super.toString() +
                "assunto='" + assunto + '\'' +
                '}';
    }
}