package pl.sternik.mj.zadania.z05;

import org.junit.Test;


import static org.assertj.core.api.Assertions.*;


public class Z05Test {


    @Test
    public void dummyTest() {
        assertThat(1).isEqualTo(1);
    }


    @Test
    public void zrobPetleFor() {
        String[] tablica = {"Raz", "Dwa", "Trzy", "Cztery"};
        String expected = "Petla FOR\nRaz\nDwa\nTrzy\nCztery";

        String actual = Z05.zrobPetleFor(tablica);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void zrobPetleWhile() {
        String[] tablica = {"Raz", "Dwa", "Trzy", "Cztery"};
        String expected = "Petla WHILE\nRaz\nDwa\nTrzy\nCztery";

        String actual = Z05.zrobPetleWhile(tablica);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void zrobPetleForEach() {
        String[] tablica = {"Raz", "Dwa", "Trzy", "Cztery"};
        String expected = "Petla FOREach\nRaz\nDwa\nTrzy\nCztery";

        String actual = Z05.zrobPetleForEach(tablica);

        assertThat(actual).isEqualTo(expected);
    }
}