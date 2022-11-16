package machine;


import java.util.Scanner;
import static java.lang.Math.min;
public class RobienieKawy {
    Maszyna maszyna = new Maszyna(); // Tworzenie obiektu maszyny
    static Scanner scanner = new Scanner(System.in);
     void obsluga() {

        boolean petla = true;
        while (petla) {
            String zapytaj = zapytaj();
            switch (zapytaj) {  // Opcje użytkownika do wyboru
                case "kup": 
                    System.out.println("Co chcesz kupić? 1 - espresso, 2 - latte, 3 - cappuccino, cofnij - do menu");

                    String rodzaj = scanner.next();
                    switch (rodzaj) {   // Opcje kupna kawy
                        case "1":
                            if (maszyna.getWoda() < 250) {
                             System.out.println("Wybacz, nie ma wystarczającej ilości wody!");
                            }
                            else if (maszyna.getNasionaKawy() < 16) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości nasion kawy!");
                            }
                            else if (maszyna.getKubki() < 1) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości kubków!");
                            }
                            else {
                                maszyna.setWoda(maszyna.getWoda() - 250);
                                maszyna.setNasionaKawy(maszyna.getNasionaKawy() - 16);
                                maszyna.setPieniadze(maszyna.getPieniadze() + 4);
                                maszyna.setKubki(maszyna.getKubki() - 1);
                                System.out.println("Rozpoczynam robienie kawy!");
                            }
                            break;
                        case "2":
                            if (maszyna.getWoda() < 350) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości wody!");
                            }
                            else if (maszyna.getNasionaKawy() < 26) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości nasion kawy!");
                            }
                            else if (maszyna.getKubki() < 1) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości kubków!");
                            }
                            else if (maszyna.getMleko() < 75) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości mleka!");
                            }
                            else {
                                maszyna.setWoda(maszyna.getWoda() - 350);
                                maszyna.setMleko(maszyna.getMleko() - 75);
                                maszyna.setNasionaKawy(maszyna.getNasionaKawy() - 20);
                                maszyna.setPieniadze(maszyna.getPieniadze() + 7);
                                maszyna.setKubki(maszyna.getKubki() - 1);
                                System.out.println("Rozpoczynam robienie kawy!");
                            }
                            break;
                        case "3":
                            if (maszyna.getWoda() < 200) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości wody!");
                            }
                            else if (maszyna.getNasionaKawy() < 12) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości nasion kawy!");
                            }
                            else if (maszyna.getKubki() < 1) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości kubków!");
                            }
                            else if (maszyna.getMleko() < 100) {
                                System.out.println("Wybacz, nie ma wystarczającej ilości mleka!");
                            }
                            else {
                                maszyna.setWoda(maszyna.getWoda() - 200);
                                maszyna.setMleko(maszyna.getMleko() - 100);
                                maszyna.setNasionaKawy(maszyna.getNasionaKawy() - 12);
                                maszyna.setPieniadze(maszyna.getPieniadze() + 6);
                                maszyna.setKubki(maszyna.getKubki() - 1);
                                System.out.println("Rozpoczynam robienie kawy!");
                            }
                            break;
                        case "cofnij":
                            break;
                    }
                    break;
                case "uzupełnij":
                    maszyna.setWoda(maszyna.getWoda() + wodaMaszyny());
                    maszyna.setMleko(maszyna.getMleko() + mlekoMaszyny());
                    maszyna.setNasionaKawy(maszyna.getNasionaKawy() + nasionaMaszyny());
                    maszyna.setKubki(maszyna.getKubki() + kubkiMaszyna());
                    break;
                case "wyjmijPieniadze":
                    System.out.println("Wypłacam: " + maszyna.getPieniadze() + "zł");
                    maszyna.setPieniadze(0);
                    System.out.println();
                    break;
                case "wyjdź":
                    petla = false;
                    break;
                case "zawartość":
                    wyswietlZawartosc();
                    break;
                default:
                    System.out.println("Nie ma takiej opcji!");
            }
        }
    }
    String zapytaj() {
        System.out.println("Wybierz opcje (kup, uzupełnij, wyjmijPieniadze, zawartość, wyjdź): ");
        return scanner.next();
    }
    void wyswietlZawartosc() {
        System.out.println("Aktualna zawartość: " + maszyna.getWoda() + " ml wody");
        System.out.println("Aktualna zawartość: " + maszyna.getMleko() + " ml mleka");
        System.out.println("Aktualna zawartość: " + maszyna.getNasionaKawy() + " g nasion kawy");
        System.out.println("Aktualna zawartość: " + maszyna.getKubki() + " kubków");
        System.out.println("Aktualna zawartość: " + maszyna.getPieniadze() + "zł");
    }
    int wodaMaszyny() {
        System.out.println("Napisz ile ml wody chcesz dolać:");
        return scanner.nextInt();
    }
    int mlekoMaszyny() {
        System.out.println("Napisz ile ml mleka chcesz dolać:");
        return scanner.nextInt();
    }
    int nasionaMaszyny() {
            System.out.println("Napisz ile nasion kawy chcesz dodać:");
            return scanner.nextInt();
    }
    int kubkiMaszyna() {
        System.out.println("napisz ile kubków chcesz dodac:");
        return scanner.nextInt();
    }
}
