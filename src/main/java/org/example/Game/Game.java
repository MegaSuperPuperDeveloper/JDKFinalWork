package org.example.Game;

import lombok.Getter;

import java.util.Random;

public class Game {
    private static final int COUNT_OF_DOORS = 3;

    @Getter
    private final static boolean[] isCar = new boolean[COUNT_OF_DOORS];

    @Getter
    private static int numCorrectDoor;

    public static void init() { // Инициализация дверей
        int random = new Random().nextInt(0, 2);
        for (int i = 0; i < COUNT_OF_DOORS; i++) {
            if (random == i) {
                isCar[i] = true;
                numCorrectDoor = i;
            } else {
                isCar[i] = false;
            }
        }
    }

}