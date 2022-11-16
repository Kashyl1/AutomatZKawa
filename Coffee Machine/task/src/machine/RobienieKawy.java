package machine;


import java.util.Scanner;
import static java.lang.Math.min;
public class RobienieKawy {
    Maszyna maszyna = new Maszyna();
    static Scanner scanner = new Scanner(System.in);
     void obsluga() {

        boolean petla = true;
        while (petla) {
            String zapytaj = zapytaj();
            switch (zapytaj) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");

                    String rodzaj = scanner.next();
                    switch (rodzaj) {
                        case "1":
                            if (maszyna.getWoda() < 250) {
                             System.out.println("Sorry, not enough water!");
                            }
                            else if (maszyna.getNasionaKawy() < 16) {
                                System.out.println("Sorry, not enough coffe beans!");
                            }
                            else if (maszyna.getKubki() < 1) {
                                System.out.println("Sorry! not enough disposable cups!");
                            }
                            else {
                                maszyna.setWoda(maszyna.getWoda() - 250);
                                maszyna.setNasionaKawy(maszyna.getNasionaKawy() - 16);
                                maszyna.setPieniadze(maszyna.getPieniadze() + 4);
                                maszyna.setKubki(maszyna.getKubki() - 1);
                                System.out.println("I have enough resources, making you a coffe!");
                            }
                            break;
                        case "2":
                            if (maszyna.getWoda() < 350) {
                                System.out.println("Sorry, not enough water!");
                            }
                            else if (maszyna.getNasionaKawy() < 26) {
                                System.out.println("Sorry, not enough coffe beans!");
                            }
                            else if (maszyna.getKubki() < 1) {
                                System.out.println("Sorry! not enough disposable cups!");
                            }
                            else if (maszyna.getMleko() < 75) {
                                System.out.println("Sorry! not enough milk!");
                            }
                            else {
                                maszyna.setWoda(maszyna.getWoda() - 350);
                                maszyna.setMleko(maszyna.getMleko() - 75);
                                maszyna.setNasionaKawy(maszyna.getNasionaKawy() - 20);
                                maszyna.setPieniadze(maszyna.getPieniadze() + 7);
                                maszyna.setKubki(maszyna.getKubki() - 1);
                                System.out.println("I have enough resources, making you a coffe!");
                            }
                            break;
                        case "3":
                            if (maszyna.getWoda() < 200) {
                                System.out.println("Sorry, not enough water!");
                            }
                            else if (maszyna.getNasionaKawy() < 12) {
                                System.out.println("Sorry, not enough coffe beans!");
                            }
                            else if (maszyna.getKubki() < 1) {
                                System.out.println("Sorry! not enough disposable cups!");
                            }
                            else if (maszyna.getMleko() < 100) {
                                System.out.println("Sorry! not enough milk!");
                            }
                            else {
                                maszyna.setWoda(maszyna.getWoda() - 200);
                                maszyna.setMleko(maszyna.getMleko() - 100);
                                maszyna.setNasionaKawy(maszyna.getNasionaKawy() - 12);
                                maszyna.setPieniadze(maszyna.getPieniadze() + 6);
                                maszyna.setKubki(maszyna.getKubki() - 1);
                                System.out.println("I have enough resources, making you a coffe!");
                            }
                            break;
                        case "back":
                            break;
                    }
                    break;
                case "fill":
                    maszyna.setWoda(maszyna.getWoda() + wodaMaszyny());
                    maszyna.setMleko(maszyna.getMleko() + mlekoMaszyny());
                    maszyna.setNasionaKawy(maszyna.getNasionaKawy() + nasionaMaszyny());
                    maszyna.setKubki(maszyna.getKubki() + kubkiMaszyna());
                    break;
                case "take":
                    System.out.println("I gave you $" + maszyna.getPieniadze());
                    maszyna.setPieniadze(0);
                    System.out.println();
                    break;
                case "exit":
                    petla = false;
                    break;
                case "remaining":
                    wyswietlZawartosc();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji!");
            }
        }
    }
    String zapytaj() {
        System.out.println("Write action (buy, fill, take, remaining, exit): ");
        return scanner.next();
    }
    void wyswietlZawartosc() {
        System.out.println(maszyna.getWoda() + " ml of water");
        System.out.println(maszyna.getMleko() + " ml of milk");
        System.out.println(maszyna.getNasionaKawy() + " g of coffee beans");
        System.out.println(maszyna.getKubki() + " disposable cups");
        System.out.println("$" + maszyna.getPieniadze() + " of money");
    }
    int kubki() {
        System.out.println("Write how many cups of coffe you will need:");
            return scanner.nextInt();
    }
    int wodaMaszyny() {
        System.out.println("Write how many ml of water you want to add:");
        return scanner.nextInt();
    }
    int mlekoMaszyny() {
        System.out.println("Write how many ml of milk you want to add:");
        return scanner.nextInt();
    }
    int nasionaMaszyny() {
            System.out.println("Write how many grams of coffee beans you want to add:");
            return scanner.nextInt();
    }
    int iloscKawyMaszyna() {
        int ile = min(wodaMaszyny() / 200, mlekoMaszyny() / 50);
        return min(ile, nasionaMaszyny() / 15);
    }
    int kubkiMaszyna() {
        System.out.println("Write how many disposable cups you want to add:");
        return scanner.nextInt();
    }
    int iloscKawyKlient() {
        Kawa Kawka = new Kawa(kubki());
            int ile = min(Kawka.getWoda() / 200, Kawka.getMleko() / 50);
            return min(ile, Kawka.getNasionakawy() / 15);
    }
    void robienieKawy() {
            int kawaMaszyny = iloscKawyMaszyna();
            int kawaKlient = iloscKawyKlient();

            if (kawaMaszyny == kawaKlient) {
                System.out.println("Yes, I can make that amount of coffee");
            }
            if (kawaMaszyny > kawaKlient) {
                int reszta = kawaMaszyny - kawaKlient;
                System.out.println("Yes, I can make that amount of coffee (and even " + reszta + " more than that)");
            }
            if (kawaMaszyny < kawaKlient) {
                System.out.println("No, I can make only " + kawaMaszyny + " cup(s) of coffee");
            }
    }

}
