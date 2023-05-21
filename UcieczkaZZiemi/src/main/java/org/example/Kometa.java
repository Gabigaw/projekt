package org.example;

import java.util.Random;


class Kometa {
    private final Random random = new Random();//tworzony jest obiekt ktory ma za zadanie generowac liczby pseudolosowe

    boolean sprawdzCzyUderzy(String planeta) {//sprawdzenie czy przeniesienie danych na druga planete ma sie nie udac
        int liczba = random.nextInt(10) + 1;//wykonywanie losowania z zakresu liczb od 0 do 9 przy uzyciu metody nextInt
        switch (planeta) {
            case "Mars":
                return liczba == 3;//dla marsa kometa uderzy kiedy liczba wylosowana przy kliknieciu bedzie 3
            case "Wenus":
                return liczba == 3 || liczba == 6;//dla marsa kometa uderzy kiedy liczba wylosowana przy kliknieciu bedzie 3 i 6
            case "Merkury":
                return liczba == 3 || liczba == 6 || liczba == 9;//dla marsa kometa uderzy kiedy liczba wylosowana przy kliknieciu bedzie 3, 6 i 9
            default:
                return false;//jesli zaden case sie nie wywola przeniesienie sie udaje
        }
    }
}
