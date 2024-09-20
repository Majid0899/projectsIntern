import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Generate a random integer between 0 (inclusive) and 11 (exclusive)
        int range = random.nextInt(11);

        boolean isWon = false;
        int chance = 5;
        System.out.println("You have 5 Chance to guess the number!!!");

        while (chance > 0) {
            int guess = ValidateNumber(sc);

            if (guess > range) {
                System.out.println("Too High");
            } else if (guess < range) {
                System.out.println("Too Low");

            } else if (guess == range) {
                isWon = true;
                break;
            }

            chance--;
        }
        if (isWon) {
            System.out.println("You have Won the Game !!!!");
        } else {
            System.out.println("You Lose the Game Attemp is Exceded !!!");
        }

    }

    public static int ValidateNumber(Scanner sc) {
        while (true) {
            System.out.println("Please Enter the number between 1 to 10");
            String guess = sc.next();
            try {
                int num = Integer.parseInt(guess);
                return num;
            } catch (Exception e) {
                System.out.println("Please Enter a Valid number");
            }
        }

    }

}
