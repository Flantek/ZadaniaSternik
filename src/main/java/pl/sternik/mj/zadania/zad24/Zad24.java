package pl.sternik.mj.zadania.zad24;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class Zad24 {
    private static int[] tabela = {1, 4, 6};

    public static void main(String[] args) {

        try {
            System.out.println(dzielenie(1, 0));
        } catch (ArithmeticException e) {
            System.out.println("Exception " + e);
        }

        System.out.println(dajElement(3));
        wczytaj();


    }

    public static int dzielenie(int a, int b) {
        return a / b;
    }

    static int dajElement(int i) {
        try {
            System.out.println(tabela[i]);
            return tabela[i];
        } catch (Exception e) {
            System.out.println("Brak indeksu");
            System.out.println(e);
            return 0;
        }
    }

    public static Date wczytaj() {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj datę w formacie dd.mm.yyyy: ");
        String tekst = input.nextLine();
        DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
        Date d;
        try {
            d = df.parse(tekst);
            return d;
        } catch (ParseException e) {
            System.out.println("Błędny format daty");
            e.printStackTrace();
            return null;
        } finally {
            System.out.println("Finally wywołane!");
            input.close();
        }
    }
}
