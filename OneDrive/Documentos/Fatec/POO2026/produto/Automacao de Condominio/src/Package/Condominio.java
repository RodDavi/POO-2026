package Package;

import java.util.ArrayList;

public class Condominio {
    private String nome;
    private ArrayList<DispositivoSeguranca> dispositivos;

    public Condominio(String nome) {
        this.nome = nome;
        this.dispositivos = new ArrayList<>();
    }

    public void adicionarDispositivo(DispositivoSeguranca d) {
        dispositivos.add(d);
    }

    public void testeGeralSeguranca() {
        for (DispositivoSeguranca d : dispositivos) {
            d.dispararAlerta();
            if (d instanceof DispositivoConectado) {
                ((DispositivoConectado) d).realizarAutodiagnostico();
            }
        }
    }
}