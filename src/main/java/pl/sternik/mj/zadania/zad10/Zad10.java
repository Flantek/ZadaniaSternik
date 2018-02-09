package pl.sternik.mj.zadania.zad10;

public class Zad10 {
    public static void main(String[] args) {
        int[][] tablica = {{1, 1, 1, 2}, {2, 1, 2, 2}};
        char[] dzialania = {'+', 'x', '-', '*'};


        wyswietl(wynik(tablica, dzialania));
    }

    public static int[] wynik(int[][] liczby, char[] dzialania) {
        int[] wyniki = new int[liczby[0].length];


        for (int j = 0; j < liczby[0].length; j++) {
            switch (dzialania[j]) {
                case '+':
                    wyniki[j] = liczby[0][j] + liczby[1][j];
                    break;

                case '-':
                    wyniki[j] = liczby[0][j] - liczby[1][j];
                    break;

                case '*':
                    wyniki[j] = liczby[0][j] * liczby[1][j];
                    break;

                case '/':
                    wyniki[j] = liczby[0][j] / liczby[1][j];
                    break;

                default:
                    wyniki[j] = liczby[0][j] + liczby[1][j];
            }

        }

        return wyniki;
    }


    public static void wyswietl(int[] tabl) {
        for (int i = 0; i < tabl.length; i++) {
            System.out.print(tabl[i] + " ");
        }
    }
}
