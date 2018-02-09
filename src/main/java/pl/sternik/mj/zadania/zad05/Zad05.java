package pl.sternik.mj.zadania.zad05;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Zad05 
{
    public static void main( String[] args )
    {
        String[] auta = {"Fiat","Ferrari","Ford"};

        for(int i=0;i<auta.length;i++) {
            System.out.println(auta[i]);
        }

        System.out.println();

        for(String x : auta) {
            System.out.println(x);
        }

        System.out.println();

        int i = 0;
        while(i < auta.length)
        {
            System.out.println(auta[i]);
            i++;
        }


    }
}
