import java.util.Scanner;
public class Challenge5 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            String answer;

            do {
                System.out.print("Do you want to continue? (yes/no): ");
                answer = input.nextLine().toLowerCase();
            } while (!answer.equals("no"));

            System.out.println("You chose to stop. Goodbye!");
            input.close();
        }

}
