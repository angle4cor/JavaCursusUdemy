package Metody;

public class KlasaDlaMetod {
    // typyZwracany nazwaMetody(parametry) {
    // }
    void metodaKtoraNicNieZwraca() {
        System.out.println("Wartość wypisana z metody z dopisanym tekstem");
    }
        void metodaKtoraPrzyjmujeArgument(int liczba, char pojedynczyZnak) {
            System.out.println("Wartość z metody " + liczba + " oraz znak: " + pojedynczyZnak);
        }

        void nazewnictwoDowolneAleKolejnaMetoda(boolean czyPOkazac, int liczba) {
        if(czyPOkazac) {
            System.out.println("Liczba: " + liczba);
        } else {
            System.out.println("Nie pozwolono pokazać.");
        }
        }

        // Jezeli funkcja ma coś zwrócić:
    int dodawanie(int a, int b) {
        int wynik = a + b;
        return wynik;
    }
    double dodajCosPoPrzecinku(double liczbaDouble) {
        double wynik = liczbaDouble + 0.55; // moge uzyc znow nazwy wynik, poniewaz miesci sie w innej metodzie
                return wynik;
    }
}
