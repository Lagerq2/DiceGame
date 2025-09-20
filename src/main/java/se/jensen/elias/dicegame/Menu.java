package se.jensen.elias.dicegame;
import java.util.Scanner;
import java.util.Random;


public class Menu {
    public void menu() {
        Scanner scanner=new Scanner(System.in);
        boolean go = true;
        while (go) {
            System.out.println("Welcome to the DiceGame");
            System.out.println(" ");
            System.out.println("To play press [1]");
            System.out.println("Quit press [2]");
            String choice = scanner.nextLine();
            switch(choice) {
                case "1":
                    Random rand = new Random();
                    System.out.println("Player 1 username");
                    String player1 = scanner.next();
                    System.out.println("Player 2 username");
                    String player2 = scanner.next();
                    System.out.println("Press enter to begin");
                    scanner.nextLine();
                    scanner.nextLine();
                    int player1Slag1 = rand.nextInt(6) + 1;
                    int player1Slag2 = rand.nextInt(6) + 1;
                    int player1Sum =  player1Slag1 + player1Slag2;

                    int player2Slag1 = rand.nextInt(6) + 1;
                    int player2Slag2 = rand.nextInt(6) + 1;
                    int player2Sum =  player2Slag1 + player2Slag2;
                    System.out.println(player1 + " You got " + player1Sum + "!");
                    System.out.println(player2 + " You got " + player2Sum + "!");

                    if(player1Sum == player2Sum) {
                        System.out.println("It's a tie");
                    }
                    else if(player1Sum > player2Sum) {
                        System.out.println(player1 + " Win!");
                    }
                    else {
                        System.out.println(player2 + " Win!");
                    }




                    break;
                    case "2":
                        scanner.close();
                        go = false;
            }
        }
    }
}
