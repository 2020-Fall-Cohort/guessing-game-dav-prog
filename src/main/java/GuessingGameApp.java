import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String instructions = "Guess a number between 1-10:";
        int myNumber = 7;
        System.out.println(instructions);

        int guess = input.nextInt();
        while (guess != myNumber) {

            if (guess == 0) {
                System.out.println(instructions);
                guess = input.nextInt();
            }
            System.out.println("You lose, try again!");
            guess = input.nextInt();
        }
        if (guess == myNumber)
        { System.out.println("You win!");
        }
    }
}


