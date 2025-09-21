package se.jensen.elias.dicegame;

import java.util.Scanner; // importerar Scanner så jag kan ta emot användar input

public class Menu {
    Scanner scanner = new Scanner(System.in); // Skapar en instans av Scanner

    public void menu() { // menyn som sköter input med mera
        boolean go = true;
        while (go) { // While loop som gör att man kan spela fler gångr
            System.out.println("Welcome to DiceGame!"); // Välkommnar
            System.out.println(" ");
            System.out.println("Press [1] to play"); // Ger val
            System.out.println("Press [2] to exit");
            int choice = scanner.nextInt(); //tar emot svaret
            scanner.nextLine();

            switch (choice) { // En switch som kör koden utifrån valet ovan
                case 1:
                    Player player1 = new Player(); //Skapa player1 objekt/spelare 1
                    System.out.println("Enter firstname player 1: ");
                    player1.setFirstName(scanner.nextLine());// Använder set metod
                    System.out.println("Enter lastname player 1: ");
                    player1.setLastName(scanner.nextLine());
                    // Spelar information
                    Player player2 = new Player(); //Skapar player2 objekt/spelare 2
                    System.out.println("Enter firstname player 2: ");
                    player2.setFirstName(scanner.nextLine()); // använder set metod
                    System.out.println("Enter lastname player 2: ");
                    player2.setLastName(scanner.nextLine());

                    Game game = new Game(); // Skapar en instans av klassen Game
                    game.play(player1, player2); // kör spelet med objekten/spelarna

                    break;
                case 2:
                    scanner.close(); // Stänger Scannern när programmet avslutas
                    go = false; // sätter loopens argument till false, vilket avslutar programmet
                    break;
            }
        }
    }
}
