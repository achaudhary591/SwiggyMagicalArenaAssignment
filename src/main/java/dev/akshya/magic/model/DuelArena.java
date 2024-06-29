package dev.akshya.magic.model;

import java.util.Random;

import static dev.akshya.magic.util.Constants.WINNER_MSG;

public class DuelArena implements Arena {
    private final String id;
    private final IPlayer playerA;
    private final IPlayer playerB;

    public DuelArena(String id, IPlayer playerA, IPlayer playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.id = id;
    }

    @Override
    public void startGame() {
        IPlayer attacker = new Random().nextInt(2) == 1 ? playerA : playerB;
        IPlayer defender = attacker == playerA ? playerB : playerA;
        while (attacker.isAlive() && defender.isAlive()) {
            System.out.printf("%s is attacking %s%n", attacker.name(), defender.name());
            int attackValue = attacker.attack();
            defender.defend(attackValue);

            IPlayer temp = attacker;
            attacker = defender;
            defender = temp;
        }
        endGame();
    }

    @Override
    public boolean endGame() {
        if (playerA.isAlive()) {
            System.out.printf((WINNER_MSG) + "%n", playerA.name());
        } else {
            System.out.printf((WINNER_MSG) + "%n", playerB.name());
        }
        System.out.println("Game Ends here!");
        return true;
    }
}
