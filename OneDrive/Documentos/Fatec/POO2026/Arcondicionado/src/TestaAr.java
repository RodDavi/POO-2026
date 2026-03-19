public class TestaAr {

    public static void main(String[] args) {

        ArCondicionado ar1 = new ArCondicionado("LG", "Dual Inverter", 24, true);
        System.out.println(ar1);

        ar1.ativarModoTurbo();
        System.out.println();

    }
}
