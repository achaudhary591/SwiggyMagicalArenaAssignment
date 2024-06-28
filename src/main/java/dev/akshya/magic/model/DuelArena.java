package dev.akshya.magic.model;

import java.util.Random;

import static dev.akshya.magic.util.Constants.WINNER_MSG;

public class DuelArena implements Arena {
    private String id;
    private IPlayer playerA;
    private IPlayer playerB;

    public DuelArena(String id, IPlayer playerA, IPlayer playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.id = id;
    }

    @Override
    public void startGame() {
        IPlayer attacker = new Random().nextInt(2) == 1 ? playerA : playerB;
        IPlayer defender = attacker == playerA ? playerB : playerA;
        while (playerA.isAlive() && playerB.isAlive()) {
            int attackValue = attacker.attack();
            defender.defend(attackValue);
            switchRoles(attacker, defender);
        }
        endGame();
    }

    private void switchRoles(IPlayer attacker, IPlayer defender) {
        IPlayer temp = attacker;
        attacker = defender;
        defender = temp;
    }

    @Override
    public boolean endGame() {
        if (playerA.isAlive()) {
            System.out.println(String.format(WINNER_MSG, playerA.name()));
        } else {
            System.out.println(String.format(WINNER_MSG, playerB.name()));
        }
        System.out.println("Game Ends here!");
        return true;
    }
}
