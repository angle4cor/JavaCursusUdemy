package Metody;

public class Metody {
    public static void main(String[] agrs) {

        KlasaDlaMetod nazwaObiektu = new KlasaDlaMetod();
        nazwaObiektu.metodaKtoraNicNieZwraca();
        nazwaObiektu.metodaKtoraPrzyjmujeArgument(5, 'x');
        nazwaObiektu.nazewnictwoDowolneAleKolejnaMetoda(false, 45);

        int wynikDodawanie = nazwaObiektu.dodawanie(10, 15);
        System.out.println(wynikDodawanie);

        double wynikKolejnejMetody = nazwaObiektu.dodajCosPoPrzecinku(10.5);
        System.out.println("Po przecinku: " + wynikKolejnejMetody);
    }
}
