package se.jensen.elias.dicegame;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void menu() {
        boolean go = true;
        while (go) {
            System.out.println("Welcome to DiceGame!");
            System.out.println(" ");
            System.out.println("Press [1] to play");
            System.out.println("Press [2] to exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Player player1 = new Player();
                    System.out.println("Enter firstname player 1: ");
                    player1.setFirstName(scanner.nextLine());
                    System.out.println("Enter lastname player 1: ");
                    player1.setLastName(scanner.nextLine());

                    Player player2 = new Player();
                    System.out.println("Enter firstname player 2: ");
                    player2.setFirstName(scanner.nextLine());
                    System.out.println("Enter lastname player 2: ");
                    player2.setLastName(scanner.nextLine());

                    Game game = new Game();
                    game.play(player1, player2);
                    break;
                case 2:
                    go = false;
                    break;
            }
        }
    }
}
