package pl.sternik.mj.zadania.zad09;

import java.util.Scanner;

/**
 * Hello world!
 */
public class Zad09 {
    public static void main(String[] args) {

        int[][] tablica = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 1, 2}, {3, 4, 5}};
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj 1 wiersz do zamiany: ");
        int a = input.nextInt();
        System.out.print("Podaj 2 wiersz do zamiany: ");
        int b = input.nextInt();
        zamien(a,b,tablica);
        wyswietl(tablica);
    }
    public static int[][] zamien(int a,int b,int[][] tablica) {
        int[] tmp1, tmp2;
        tmp1 = tablica[a];
        tmp2 = tablica[b];
        tablica[a] = tmp2;
        tablica[b] = tmp1;
        return tablica;

    }
    public static void wyswietl(int[][] tab1){
        int[][] tab = tab1;
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
