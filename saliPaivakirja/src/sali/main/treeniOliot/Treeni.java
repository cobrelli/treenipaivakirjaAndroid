package sali.main.treeniOliot;

import java.util.ArrayList;

public class Treeni {

    private String treeninTyyppi;
    private String pvm;
    private ArrayList<Liike> liikkeet;

    public Treeni(String treeninTyyppi, String pvm) {
        this.treeninTyyppi = treeninTyyppi;
        this.pvm = pvm;
    }

    public void lisaaLiike(Liike liike) {
        liikkeet.add(liike);
    }

    public String palautaLiikkeet() {
        String palautettava = this.pvm + " " + this.treeninTyyppi + "\n";

        for (Liike liike : liikkeet) {
            palautettava += liike.palautaLiikeJaToistot();
        }

        return palautettava;
    }

    @Override
    public String toString() {
        return this.pvm + " " + this.treeninTyyppi;
    }
}
