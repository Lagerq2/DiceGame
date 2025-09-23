package se.jensen.elias.dicegame;

import java.util.Scanner; // importerar Scanner så jag kan ta emot användar input

public class Menu {
    Scanner scanner = new Scanner(System.in); // Skapar en instans av Scanner

    private Player createPlayer(int playerNumber) {
        Player player = new Player(); //Skapar player objekt
        while (true) {
            try {
                System.out.println("Enter firstname player " + playerNumber + " : ");
                player.setFirstName(scanner.nextLine());// Använder set metod
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("You have to enter firstname! Try again.");
            }
        }
        while (true) {
            try {
                System.out.println("Enter lastname player " + playerNumber + " : ");
                player.setLastName(scanner.nextLine());
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("You have to enter lastname! Try again.");
            }
        }
        return player;
    }

    public void startMenu() { // menyn som sköter input med mera

        while (true) { // While loop som gör att man kan spela fler gångr
            System.out.println(" ");
            System.out.println("Welcome to DiceGame!"); // Välkommnar
            System.out.println("Press [1] to play"); // Ger val
            System.out.println("Press [2] to exit");
            String choice = scanner.nextLine(); //tar emot svaret
            if (!choice.equals("1") && !choice.equals("2")) {
                System.out.println("Choose 1 or 2!");
                continue;
            }
            switch (choice) { // En switch som kör koden utifrån valet ovan
                case "1":
                    Player player1 = createPlayer(1);
                    Player player2 = createPlayer(2);
                    Game game = new Game();
                    game.play(player1, player2);
                    break;
                case "2":
                    return;
            }
        }
    }
}
