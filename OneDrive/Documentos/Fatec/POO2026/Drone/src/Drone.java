import java.util.Random;

public class Drone {
    private float altura;
    private int bateria;
    private boolean emVoo = false;

    public Drone() {

    }

    public Drone(String codigo, float altura, boolean emVoo) {
        this.altura = altura;
        this.bateria = bateria;
        this.emVoo = emVoo;
    }

    public void setAltura(float a) {
        if (a >= 0 && a <= 120) {
            this.altura = a;
        } else {
            System.out.println("Altura não compatível a capacidade do drone");
        }
    }

    public void setBateria(int b) {
        if (b >= 0 && b <= 100) {
            this.bateria = b;
        } else {
            System.out.println("Bateria inválida, precisa ser de 0 a 100");
        }
    }

    public void decolar() {
        if (bateria <= 20) {
            System.out.println("Bateria insuficiente para voar");
        }

        if (TestaMotores()) {
            emVoo = true;
            setAltura(2);
            System.out.println("Em voo");
        } else {
            System.out.println("Falha nos motores");
        }


    }

    private boolean TestaMotores() {
        System.out.println("Calibrando helices...");
        System.out.println("\nCalibrando GPS...");

        double n = Math.random() * 10;

        return n < 8;
    }

    public void subir(float s) {
        if (emVoo) {
            setAltura(this.altura + s);
        } else {
            System.out.println("O drone precisa estar em voo");
        }
    }

    public void descer(float d) {
        if (emVoo) {
            setAltura(this.altura - d);
        } else {
            System.out.println("O drone precisa estar em voo");
        }
    }
}