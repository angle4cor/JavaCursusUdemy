package petle;

public class For {
    public static void main(String[] args) {
        // loops
        int liczenie;
        for (liczenie = 1; liczenie <= 10; liczenie++) { //liczenie++ = liczenie = liczenie + 1
            System.out.println("Tekst " + liczenie);
        }
        System.out.println("Poza pętlą: " + liczenie);
    }
}
