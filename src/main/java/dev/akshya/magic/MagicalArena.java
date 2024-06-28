package dev.akshya.magic;

import dev.akshya.magic.model.Arena;
import dev.akshya.magic.model.DuelArena;
import dev.akshya.magic.model.IPlayer;
import dev.akshya.magic.model.Player;

public class MagicalArena {
    public static void main(String[] args) {
        IPlayer playerA = new Player("A", 20, 2, 2);
        IPlayer playerB = new Player("B", 20, 1, 3);
        Arena duelArena = new DuelArena("Arena1", playerA, playerB);
        duelArena.startGame();
    }
}