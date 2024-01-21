import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int computerNumber = random.nextInt(99) +1;

        boolean levelOne = true;
        boolean levelTwo = false;


        while (levelOne){

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
                    System.out.println("Next level? y / n");
                    playerInput = scanner.nextLine();

                    if (playerInput.equals("y") || playerInput.equals("yes")){

                        levelTwo = true;
                        levelOne = false;
                    } else if (playerInput.equals("n") || playerInput.equals("no")) {
                        levelOne = false;
                    }
                }else if( playerNumber < computerNumber){
                    System.out.println("Too Low\n");
                }else if (playerNumber > computerNumber){
                    System.out.println("Too High\n");
                }

                }else {
                System.out.println("Invalid input!");
            }
        }

        computerNumber = random.nextInt(199) + 1;


        while (levelTwo){

            System.out.print("Guess the number between 1 and 200:");
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
                    System.out.println("New game? y / n");
                    playerInput = scanner.nextLine();

                    if (playerInput.equals("y") || playerInput.equals("yes")){
                        levelOne = true;
                        levelTwo = false;
                    } else if (playerInput.equals("n") || playerInput.equals("no")) {
                        levelTwo = false;
                    }
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

