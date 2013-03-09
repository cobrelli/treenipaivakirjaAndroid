package sali.main.treeniOliot;

import java.util.ArrayList;

public class Liike {

    private ArrayList<Toisto> toistoja;
    private String liikkeenNimi;

    public Liike(String liike) {
        this.toistoja = new ArrayList<Toisto>();
        this.liikkeenNimi = liike;
    }

    public void lisaaToisto(int maara, int paino) {
        this.toistoja.add(new Toisto(maara, paino));
    }

    public String palautaLiikeJaToistot() {
        String palautettava = liikkeenNimi + "\n";

        for (Toisto toisto : toistoja) {
            palautettava += toisto.toString() + "\n";
        }

        return palautettava;
    }
}
