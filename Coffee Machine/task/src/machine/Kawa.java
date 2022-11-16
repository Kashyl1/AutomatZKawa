package machine;


public class Kawa {
    private final int woda;
    private final int mleko;
    private final int nasionakawy;


    public Kawa(int ilosc) {

        this.woda = ilosc;
        this.mleko = ilosc;
        this.nasionakawy = ilosc;
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
