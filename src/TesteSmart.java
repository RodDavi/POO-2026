public class TesteSmart {
    public static void main (String[] args){
        SmartTv st1 = new SmartTv("Samsung", "Widescreen", 0, false);
        st1.setVolume(120);
        st1.setVolume(48);
        System.out.println("Volume de st1: " + st1.getVolume());
        System.out.println("Marca de st1: " + st1.getMarca());

        SmartTv st2 = new SmartTv("Samsung", "Widescreen", 0, true);
    }
}
