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
    }

    @Test
    public void zrobPetleForEach() {
    }
}