public class TestaDrone {

    public static void main(String[] args) {

        Drone d1 = new Drone();

        System.out.println("=== TESTE DO DRONE ===");

        d1.setBateria(150);

        d1.setBateria(50);

        d1.decolar();

        d1.subir(10);

        d1.descer(5);

        d1.subir(200);

        d1.descer(50);

        System.out.println("=== FIM DO TESTE ===");
    }
}