import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        boolean playAgain = true;
        String choice;

        while (playAgain) {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + crapsRoll);

            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12) {
                System.out.println("Craps! You crapped out. You lose.");
                System.out.print("Play again? (y/n): ");
                choice = in.next();
                playAgain = choice.equalsIgnoreCase("y");
            } else if (crapsRoll == 7 || crapsRoll == 11) {
                System.out.println("Natural! You win.");
                System.out.print("Play again? (y/n): ");
                choice = in.next();
                playAgain = choice.equalsIgnoreCase("y");
            } else {
                int point = crapsRoll;
                System.out.println("The point is now " + point);
                System.out.println("Trying for point...");

                while (true) {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;
                    System.out.println("Rolling the dice...");
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + crapsRoll);

                    if (crapsRoll == point) {
                        System.out.println("Made point! You win.");
                        System.out.print("Play again? (y/n): ");
                        choice = in.next();
                        playAgain = choice.equalsIgnoreCase("y");
                        break;
                    } else if (crapsRoll == 7) {
                        System.out.println("Seven out! You lose.");
                        System.out.print("Play again? (y/n): ");
                        choice = in.next();
                        playAgain = choice.equalsIgnoreCase("y");
                        break;
                    }
                }
            }
        }
    }
}
