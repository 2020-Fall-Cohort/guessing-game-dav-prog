import java.util.Scanner;

public class GuessingGameApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 1-10:");
        int guess = input.nextInt();
        if (guess == 7){
            System.out.println("You win!");
        }else{
            System.out.println("You lose!");
        }
                

    }

}
