package org.example.Game;

import lombok.Getter;

public enum WinLose {
    WIN("Победа"), LOSE("Поражение");
    private String winLose;

    WinLose(String winLose) {
        this.winLose = winLose;
    }

    public String getWinLose() {
        return winLose;
    }

}