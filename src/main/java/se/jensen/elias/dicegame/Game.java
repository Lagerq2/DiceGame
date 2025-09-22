package se.jensen.elias.dicegame;

import java.util.Random;

public class Game {
    private final Random rand = new Random();

    public int rollDice() {
        int dice1 = rand.nextInt(6) + 1;
        int dice2 = rand.nextInt(6) + 1;
        int sum = dice1 + dice2;
        System.out.println("Dice one: " + dice1 + " Dice two: " + dice2 + " = " + sum);
        return sum;
    }

    public void play(Player player1, Player player2) {
        player1.getFullName();
        System.out.println("turn");
        player1.setScore(rollDice());

        player2.getFullName();
        System.out.println("turn");
        player2.setScore(rollDice());

        if (player1.getScore() > player2.getScore()) {
            System.out.print("Winner is: ");
            player1.getFullName();
        } else if (player1.getScore() < player2.getScore()) {
            System.out.print("Winner is: ");
            player2.getFullName();
        } else {
            System.out.println("It's a draw!");
        }
    }
}
