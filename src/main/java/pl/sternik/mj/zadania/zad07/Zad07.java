package pl.sternik.mj.zadania.zad07;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Zad07
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj X");
        int x = in.nextInt();

        int[] tablica = {2,5,10,25};

        for (int j = 0; j <tablica.length ; j++) {
            if(tablica[j]%x==0) {
                System.out.println(tablica[j]);
                System.out.println(j);
                break;
            }

        }

        int a=-1;
        do {
            a++;
        } while (a<tablica.length && tablica[a]%x!=0);
        if (a<tablica.length) System.out.println(tablica[a]);


    }
}
