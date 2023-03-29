import petle.For;

public class StringCwiczenia {
    public static void main(String[] args) {
        String imie = "Marcin";
        String nazwisko = "Martyniak";
        String imieINazwisko = "Marcin Martyniak";

        // 1.
        // a)
        System.out.println("Liczba znaków dla zmiennych: imie = " + imie.length() + " nazwisko = " + nazwisko.length() + " oraz imie i nazwisko = " + imieINazwisko.length());

        // b)
        System.out.println(imie.equals("Jan"));
        System.out.println(nazwisko.equals("Martyniak"));

        // c)
        System.out.println("Nazwisko z dużych liter: " + nazwisko.toUpperCase());

        // d)
        System.out.println("Nazwisko po zmianie litery 'a' na 'e': " +  nazwisko.replace("a","e"));
        // 2.
        String zdanie = "Potrafię coraz więcej z programowania.";
        for (int i = 0; i < zdanie.length(); i++) {
            System.out.println(zdanie.charAt(i));
        }
        // 3.
        for (int j = zdanie.length() - 1; j >= 0; j--) {
            System.out.print(zdanie.charAt(j));
        }
    }
}
