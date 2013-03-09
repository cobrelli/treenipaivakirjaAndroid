package sali.main.treeniOliot;

public class Toisto {

    private int maara;
    private int paino;

    public Toisto(int maara, int paino) {
        this.maara = maara;
        this.paino = paino;
    }

    public int palautaMaara() {
        return this.maara;
    }

    public int palautaPaino() {
        return this.paino;
    }

    @Override
    public String toString() {
        return this.maara + " x " + this.paino + " kg";
    }
}
