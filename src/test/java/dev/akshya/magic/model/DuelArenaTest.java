package dev.akshya.magic.model;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class DuelArenaTest {


    @Test
    public void testSimpleGame() {
        IPlayer playerA = new Player("A", 20, 2, 2);
        IPlayer playerB = new Player("B", 20, 1, 3);
        Arena duelArena = new DuelArena("Arena1", playerA, playerB);
        duelArena.startGame();
        assert playerA.isAlive()||playerB.isAlive() == true;
        assert duelArena.endGame() == true;
    }

}