package petle;

public class petleTablice {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for(int i = 0; i <= tab.length - 1; i++) {
            tab[i] = i;
        }
        for(int i = 0; i < tab.length; i++) { // lepiej używać tego zapisu
            System.out.println("tab " + i + ": " + tab[i]);
        }
    }
}
