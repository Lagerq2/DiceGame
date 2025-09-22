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
        for (Player player : new Player[]{player1, player2}) {
            System.out.println(player.getFirstName() + " turn");
            player.setScore(rollDice());
        }
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Winner is: " + player1.getFullName());
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Winner is: " + player2.getFullName());
        } else {
            System.out.println("It's a draw!");
        }
    }
}
