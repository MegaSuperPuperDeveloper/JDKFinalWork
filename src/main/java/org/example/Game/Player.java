package org.example.Game;

import java.util.Random;

public class Player {

    public Player() {}

    public static int chooseDoor() { // Случайный выбор двери
        return new Random().nextInt(0, 3);
    }

    public static int chooseDoor(int incorrectNum) { // Игрок выбирает дверь, зная 1 неправильную
        int random = new Random().nextInt(0, 3);
        while (random == incorrectNum) {
            random = new Random().nextInt(0, 3);
        }
        return random;
    }

}