package machine;

public class Maszyna {
    int woda;
    int mleko;
    int nasionaKawy;
    int kubki;
    int pieniadze;

    public Maszyna() {
        this.woda = 400;
        this.mleko = 540;
        this.nasionaKawy = 120;
        this.kubki = 9;
        this.pieniadze = 550;
    }

    public void setWoda(int woda) {
        this.woda = woda;
    }

    public void setMleko(int mleko) {
        this.mleko = mleko;
    }

    public void setNasionaKawy(int nasionaKawy) {
        this.nasionaKawy = nasionaKawy;
    }

    public void setKubki(int kubki) {
        this.kubki = kubki;
    }

    public void setPieniadze(int pieniadze) {
        this.pieniadze = pieniadze;
    }

    public int getWoda() {
        return woda;
    }

    public int getMleko() {
        return mleko;
    }

    public int getNasionaKawy() {
        return nasionaKawy;
    }

    public int getKubki() {
        return kubki;
    }

    public int getPieniadze() {
        return pieniadze;
    }
}
