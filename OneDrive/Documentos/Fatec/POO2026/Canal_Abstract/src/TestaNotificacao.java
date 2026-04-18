package Herenca_Abstract;
import java.util.ArrayList;

public class TestaNotificacao {
    public static void main(String[] args) {

        ArrayList<CanalNotificacao> lista = new ArrayList<>();

        lista.add(new Email("joao@email.com", "Olá João!", "Boas-vindas"));
        lista.add(new Sms("Maria", "Seu código é 1234", 169999999));
        lista.add(new Whatsapp("Carlos", "Mensagem via WhatsApp", "Lida"));

        for (CanalNotificacao canal : lista) {
            canal.enviar();
            System.out.println("-------------------");
        }
    }
}
