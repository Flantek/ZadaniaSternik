package pl.sternik.mj.zadania.zad11;

public class Zad11 {
    public enum StanZamowien {NOWE, OCZEKUJĄCE, REALIZOWANE, WYSŁANE, ZWROT}

    public static void main(String[] args) {

        for (StanZamowien stan : StanZamowien.values()) {
            wypisz(stan);
        }
    }

    public static void wypisz(StanZamowien a) {
        switch (a) {
            case REALIZOWANE:
                System.out.println("Pilne!");
                break;

            case ZWROT:
                System.out.println("Kontakt!");
                break;

            default:
                System.out.println(a.toString());
        }
    }
}
