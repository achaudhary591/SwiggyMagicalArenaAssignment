package dev.akshya.magic;

import dev.akshya.magic.model.Arena;
import dev.akshya.magic.model.DuelArena;
import dev.akshya.magic.model.IPlayer;
import dev.akshya.magic.model.Player;

public class MagicalArena {
    public static void main(String[] args) {
        IPlayer playerA = new Player("A", 50, 5, 10);
        IPlayer playerB = new Player("B", 100, 10, 5);
        Arena duelArena = new DuelArena("Arena1", playerA, playerB);
        duelArena.startGame();
    }
}