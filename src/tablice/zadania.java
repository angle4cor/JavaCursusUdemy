package tablice;

public class zadania {
    public static void main(String[] args) {
    /* int[] tablica = new int [5];
    tablica[0] = 1;
    tablica[1] = 2;
    tablica[2] = 3;
    tablica[3] = 4;
    tablica[4] = 5;

        int[] tablica = {1,2,3,4,5};
        int wynik = tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica[4];

        System.out.println("Wynik sumowania wszystkich elementów tablicy: " + wynik); */

//        double[][] tablicaDwa = new double[3][5];
//        tablicaDwa[0][0] = 3.5;
//        tablicaDwa[0][1] = 5.5;
//        tablicaDwa[0][2] = 3.4;
//        tablicaDwa[0][3] = 5.6;
//        tablicaDwa[0][4] = 9.9;
//
//        tablicaDwa[1][0] = 3.5;
//        tablicaDwa[1][1] = 5.5;
//        tablicaDwa[1][2] = 3.4;
//        tablicaDwa[1][3] = 5.6;
//        tablicaDwa[1][4] = 9.9;

        double[][] tabDwu = {
                {3.5, 5.5, 2.0, 6.7, 2.3},
                {0.5, 2.4, 5.5, 3.8, 99.4},
                {23.4, 11.5, 88.4, 55.22, 45.2},
        };
        double pierwszyWiersz = tabDwu[0][0] + tabDwu[0][1] + tabDwu[0][2] + tabDwu[0][3] + tabDwu[0][4];
        System.out.println("Suma pierwszego wiersza: " + pierwszyWiersz );


    }
}