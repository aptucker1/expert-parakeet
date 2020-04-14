import java.util.Scanner;

import java.util.Random;

public class Jackpot {

    public static void main(String[] args) {
        //PA3 redo
        int gameScore = 500;

        while (true) {

            System.out.println("\nWelcome to Jolly Jackpot Land! \n" +
                    "Enter 1 to play the Slot Machine \n" +
                    "Enter 2 to play Dice Toss \n" +
                    "Enter 3 to reset game \n" +
                    "Enter 4 to see casino rules \n" +
                    "Enter 5 to exit the application");

            Scanner scan = new Scanner(System.in);
            int userInput = scan.nextInt();

            switch (userInput) {
                case 1:
                    gameScore = slotMachine(gameScore);
                    break;
                case 2:
                    //dice toss
                    break;
                case 3:
                    gameScore = 500;
                    System.out.println("Game Reset");
                    break;
                case 4:
                    gameRules(gameScore);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }

    public static int slotMachine(int gameScore) {

        System.out.println("\nWelcome to the Slot Machine Casino! \n");

        return gameScore;
    }

    public static void gameRules(int gameScore) {

        System.out.println(
                "Enter 1 to view Slot Machine rules \n" +
                "Enter 2 to view Dice Toss rules \n");

        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("\nSlot Machine Rules: \n" +
                        "1. You begin the game with 500 points. \n" +
                        "2. The game will prompt you to enter the amount of points " +
                        "you would like to risk. \n" +
                        "3. You will be notified on how many points you have each round, so " +
                        "you can risk accordingly. \n" +
                        "4. If none of the words match, you lose the amount " +
                        "you risked. \n" +
                        "5. If two of the words match, you win double the amount " +
                        "you risked. \n" +
                        "6. If all three match, you win triple the amount you risked. \n" +
                        "You have " + gameScore + " points.\n");
                break;
            case 2:
                System.out.println("\nDice Toss Rules: \n" +
                        "1. You begin the game with 500 points. \n" +
                        "2. You decide the amount you want to risk. \n" +
                        "3. You can play two options: Range or Amount. \n" +
                        "4. With Range, you pick high or low. If you hit your selected range, you win double your " +
                        "risk amount. \n" +
                        "5. With Amount, you pick an exact number between 2-12. If you hit, you win triple your risk " +
                        "amount. \n" +
                        "6. The program will roll two 6-sided die and will add up the results to decide if you win. " +
                        "\n");
                break;
        }
    }
}
