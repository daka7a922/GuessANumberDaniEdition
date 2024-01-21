import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int computerNumber = random.nextInt(99) +1;

        while (true){

            System.out.print("Guess the number between 1 and 100:");
            String playerInput = scanner.nextLine();

            int playerNumber;
            
            boolean isValid = true;

            for (int i = 1; i < playerInput.length(); i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) >57 ){
                    isValid = false;
                    break;
                }
            }

            if (isValid){
                playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == computerNumber){
                    System.out.println("Bravo! You guessed it");
                    break;
                }else if( playerNumber < computerNumber){
                    System.out.println("Too Low\n");
                }else if (playerNumber > computerNumber){
                    System.out.println("Too High\n");
                }

                }else {
                System.out.println("Invalid input!");
            }
        }
    }
}

