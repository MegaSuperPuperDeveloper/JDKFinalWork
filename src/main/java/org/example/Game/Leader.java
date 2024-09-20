package org.example.Game;

import lombok.Getter;
import org.example.Statistics;

import java.math.BigDecimal;
import java.util.Random;

public class Leader {
    private int numWhichPlayerChose;
    private final int numCorrectDoor;

    public Leader() { // Начало игры и ее запуск
        Game.init();
        numWhichPlayerChose = Player.chooseDoor();
        numCorrectDoor = Game.getNumCorrectDoor();
        sayIncorrectDoor();
    }


    public void sayIncorrectDoor() { // Ведущий говорит неправильную дверь, а затем игрок делает окончательный выбор
        int random = new Random().nextInt(0, 3);
        while (random == numWhichPlayerChose || random == numCorrectDoor) {
            random = new Random().nextInt(0, 3);
        }
        numWhichPlayerChose = Player.chooseDoor(random);
        winOrLose();
    }

    public void winOrLose() { // В зависимости от ответа, игрок выиграл или проиграл
        if (numWhichPlayerChose == numCorrectDoor) {
            Statistics.setCountWin(Statistics.getCountWin().add(BigDecimal.ONE));
        } else {
            Statistics.setCountLose(Statistics.getCountLose().add(BigDecimal.ONE));
        }
    }

}