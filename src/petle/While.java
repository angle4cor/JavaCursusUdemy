package petle;

public class While {
    public static void main(String[] args) {
        int liczenie = 1;
        while (liczenie <= 10) {
            System.out.println("Tekst " + liczenie);
            liczenie++;
        }
        /* drugi rodzaj while. Najpierw wykonaj, potem sprawdź. Przynajmniej raz pętla do while się wykona, nawet jeżeli
        założenie jest błędne */
        liczenie = 1; // zerujemy, bo po poprzedniej liczenie = 11
        do {
            System.out.println("Tekst z do while: " + liczenie);
            liczenie++;
        } while(liczenie <= 10);
    }
}
