package Package;

public class SistemaCondominio {
    public static void main(String[] args) {
        Camera c1 = new Camera("Entrada", true, "1080p");
        Camera c2 = new Camera("Garagem", true, "4K");

        SensorMovimento s1 = new SensorMovimento("Corredor", true, 0.8);
        SensorMovimento s2 = new SensorMovimento("Portão", true, 0.9);

        Condominio condominio = new Condominio("Residencial Franca");

        condominio.adicionarDispositivo(c1);
        condominio.adicionarDispositivo(c2);
        condominio.adicionarDispositivo(s1);
        condominio.adicionarDispositivo(s2);

        condominio.testeGeralSeguranca();
    }
}