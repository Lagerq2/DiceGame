package se.jensen.elias.dicegame;

import java.util.Random;

public class Game {
    private final Random rand = new Random();
    /*Metod som rullar två tärningar samtidigt, valde att ha två tärningar för att
    ge känslan av att det faktiskt är två olika Random objekt.
    Den skrivet ut ett meddelande och returnerar summan.
     */
    public int rollDice() {
        int dice1 = rand.nextInt(6) + 1;//man kan få värdet 1 till och med 6
        int dice2 = rand.nextInt(6) + 1;
        int sum = dice1 + dice2;
        System.out.println("Dice one: " + dice1 + " Dice two: " + dice2 + " = " + sum);
        return sum;
    }
    //Metod som kör spelet. Den tar Objekten player1 och 2 som skapades innan
    public void play(Player player1, Player player2) {
        //Jag använder en for-each loop för att slippa använda liknande kod två gånger
        //Lägger in objekten i en lista och itererar igenom dem och kör rollDice metoden
        for (Player player : new Player[]{player1, player2}) {
            System.out.println(player.getFirstName() + " turn");
            player.setScore(rollDice());
        }
        //if-sats som berättar vem som vunnit utifrån resultatet från rollDIce
        if (player1.getScore() > player2.getScore()) {
            System.out.println("Winner is: " + player1.getFullName());
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println("Winner is: " + player2.getFullName());
        } else {
            System.out.println("It's a draw!");
        }
    }
}
