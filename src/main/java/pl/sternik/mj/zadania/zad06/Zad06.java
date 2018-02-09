package pl.sternik.mj.zadania.zad06;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Zad06
{
    public static void main( String[] args )
    {
        int[][] values={{3,8,16},
                {1,22,28,24},
                {3},
                {41,42}};



        int najmniejsza= values[0][0];
        int najwieksza= values[0][0];

        for(int j=0;j<values.length;j++) {
            for(int k=0;k<values[j].length;k++) {
                if(values[j][k] > najwieksza) {
                    najwieksza = values[j][k]; }
                if(values[j][k] < najmniejsza) {
                    najmniejsza = values[j][k];
                };
            }

        }
        System.out.println("Najmniejsza = " + najmniejsza);
        System.out.println("Największa = " + najwieksza);
    }
}
