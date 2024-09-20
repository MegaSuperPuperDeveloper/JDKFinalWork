package org.example;

import lombok.Getter;
import lombok.Setter;
import org.example.Game.WinLose;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;

public class Statistics {
    @Getter
    @Setter
    private static BigDecimal countWin = new BigDecimal(String.valueOf(0));

    @Getter
    @Setter
    private static BigDecimal countLose = new BigDecimal(String.valueOf(0));
    @Setter
    private HashMap<Integer, WinLose> stepResult = new HashMap();

    public static void getStatistics() {
        BigDecimal sum = new BigDecimal(String.valueOf(countLose.add(countWin)));
        BigDecimal percentLose = new BigDecimal(String.valueOf(countLose.divide(sum, 3, BigDecimal.ROUND_HALF_UP)));
        BigDecimal percentWin = new BigDecimal(String.valueOf(countWin.divide(sum, 3, BigDecimal.ROUND_HALF_UP)));
        System.out.println("Процент выиграша: " + percentWin);
        System.out.println("Процент проигрыша: " + percentLose);
    }

}