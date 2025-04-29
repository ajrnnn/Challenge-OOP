import java.util.Scanner;
import java.util.Random;

public class dice_challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random dice = new Random();
        String playAgain;

        do {
            int roll1 = dice.nextInt(6) + 1;
            int roll2 = dice.nextInt(6) + 1;
            int roll3 = dice.nextInt(6) + 1;
            int total = roll1 + roll2 + roll3;

            System.out.println("Dice roll: " + roll1 + " + " + roll2 + " + " + roll3);

            if (roll1 == roll2 && roll2 == roll3) {
                System.out.println("You rolled triples! +6 bonus!");
                total += 6;
            } else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
                System.out.println("You rolled doubles! +2 bonus!");
                total += 2;
            }

            System.out.println("Total: " + total);

            if (total >= 15) {
                System.out.println("You win!");
            } else {
                System.out.println("Sorry, you lose.");
            }

            System.out.print("Play again? (yes/no): ");
            playAgain = input.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        input.close();
    }
}
