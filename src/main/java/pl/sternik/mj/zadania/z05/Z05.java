package pl.sternik.mj.zadania.z05;

import java.util.Date;

public class Z05 {

    public static void main(String[] args) {
        String[] tablica = {"Raz", "Dwa", "Trzy", "Cztery"};

        String tmp = zrobPetleFor(tablica);
        System.out.println(tmp);

        tmp = zrobPetleForEach(tablica);
//        System.out.println(tmp);

        tmp = zrobPetleWhile(tablica);
//        System.out.println(tmp);


        Date h = new Date();
        h.toGMTString();


    }

    static String zrobPetleFor(String[] tablica) {
        int i;
        String tmp = "Petla FOR";
        for (i = 0; i <= tablica.length - 1; i++) {
            tmp = tmp + "\n" + tablica[i];
        }
        return tmp;
    }

    static String zrobPetleWhile(String[] tablica) {
        int i;
        i = 0;
        String tmp = "Petla WHILE";
        while (i <= tablica.length - 1) {
            tmp = tmp + "\n" + tablica[i];
            i++;
        }
        return tmp;
    }

    static String zrobPetleForEach(String[] tablica) {
        String tmp = "";
        //brzydka metoda sklejania Stringa.
        tmp = tmp + "Petla FOREach";
        for (String string : tablica) {
            tmp = tmp + "\n" + string;
        }

        return tmp;
    }
}