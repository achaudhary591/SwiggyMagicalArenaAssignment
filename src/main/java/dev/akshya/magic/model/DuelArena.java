package dev.akshya.magic.model;

import java.util.Random;

public class DuelArena implements Arena {
    private String id;
    private Player playerA;
    private Player playerB;

    public DuelArena(String id, Player playerA, Player playerB) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.id = id;
    }

    @Override
    public void startGame() {
        IPlayer attacker = new Random().nextInt(2) == 1 ? playerA : playerB;
        IPlayer defender = attacker == playerA ? playerB : playerA;
        while (playerA.isAlive() && playerB.isAlive()) {
            int attackValue = attacker.rollDice();

            defender.takeDamage(attackValue*attacker.attackAttribute());
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
    public void endGame() {
        if (playerA.isAlive()) {
            System.out.println("Player A wins!");
        } else {
            System.out.println("Player B wins!");
        }
        System.out.println("Game Ends here!");
    }
}
