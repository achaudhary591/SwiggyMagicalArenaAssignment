package dev.akshya.magic.model;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DuelArenaTest {


    @Test
    public void testSimpleGame() {
        IPlayer playerA = new Player("A", 20, 2, 2);
        IPlayer playerB = new Player("B", 20, 1, 3);
        Arena duelArena = new DuelArena("Arena1", playerA, playerB);
        duelArena.startGame();
        assert playerA.isAlive()|| playerB.isAlive();
        assert duelArena.endGame();
    }

    @Test
    public void testGameFlow() {
        IPlayer playerA = new Player("PlayerA", 50, 5, 10);
        IPlayer playerB = new Player("PlayerB", 100, 10, 5);
        DuelArena arena = new DuelArena("TestArena", playerA, playerB);
        arena.startGame();

        assertTrue(playerA.isAlive() != playerB.isAlive());
    }

}