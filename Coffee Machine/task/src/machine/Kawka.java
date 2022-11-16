package machine;


public class Kawka {
    private final int woda;
    private final int mleko;
    private final int nasionakawy;

    public Kawka(int ilosc) {

        this.woda = ilosc * 200;
        this.mleko = ilosc * 50;
        this.nasionakawy = ilosc * 15;
    }
    public int getMleko() {
        return mleko;
    }

    public int getWoda() {
        return woda;
    }

    public int getNasionakawy() {
        return nasionakawy;
    }
}
