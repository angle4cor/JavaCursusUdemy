package petle;

import java.util.Scanner;

public class cwiczenia {
    public static void main(String[] args) {
//        int i = 0;
//        for (i = 0; i < 31; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        int j = 30;
//        for (j = 30; j >= 0; j--) {
//            System.out.print(j +" ");
//}
//    }
//}

        // 2.
//        int liczba = 0;
//        while (liczba <= 30) {
//            if (((liczba % 2) == 0) && (liczba != 0)) {
//                System.out.print(liczba + " ");
//            }
//            liczba++;
//        }
        // 3.
//    int a = 4;
//    int b = 9;
//    while (a < b) {
//        System.out.print(a + " ");
//        a++;
//    }
        // 4.
//
//        int tab[] = new int [10];
//        for (int i = 0; i < tab.length; i++) {
//            tab[i] = i;
//            System.out.print(tab[i] + " ");
//        }
//        System.out.println();
//        int j = 9;
//        for (j = 9; j >= 0; j--) {
//            System.out.print(tab[j] + " ");
//        }
        // 5.
//        int suma = 0;
//        int i = 0;
//        for (i = 0; i < tab.length; i++) {
//            suma = suma + tab[i];
//        }
//        System.out.println("Suma wszystkich elementów: " + suma);
        // 6.
//        int liczba = 5;
//        long silnia = 1L;
//     for (int i = liczba; i >= liczba; i--) {
//         silnia = silnia * i;
//         System.out.println(silnia);
//     }
//        System.out.println("Silnia liczby " + liczba + " to: " + silnia);
        // 7.
//       int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//                i++;
//        }
        // 8.
//        int n = 5;
//        int liczbaGwiazdekLustrzanych = 1;
//        int liczbaSpacjiLustrzanych = n - 1;
//        for(int i = 1; i <= n; i++) {
//            for(int j = 1; j <= liczbaSpacjiLustrzanych; j++) {
//                System.out.print(" ");
//            }
//
//            for(int j = 1; j <= liczbaGwiazdekLustrzanych; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            liczbaSpacjiLustrzanych--;
//            liczbaGwiazdekLustrzanych++;
//        }
        // 9.
        Scanner scan = new Scanner(System.in);
        System.out.print("Wpisz liczbę dodatnią: ");
        int n = scan.nextInt();
         if (n > 0) {
            int liczbaGwiazdek = 1;
            int liczbaSpacji = ((n * 2) - 1) / 2;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= liczbaSpacji; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= liczbaGwiazdek; k++) {
                    System.out.print("*");
                }
                System.out.println();
                liczbaSpacji--;
                liczbaGwiazdek = liczbaGwiazdek + 2;
            }
        } else {
             System.out.println("Spróbuj ponownie.");
         }
    }
}
