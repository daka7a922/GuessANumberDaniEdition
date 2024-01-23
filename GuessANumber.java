import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

     int computerNumber = 0;


        // Need to make start game loop
        //Need to implement difficulties

        boolean gameStart = true;
        boolean difficultyEasy = false;
        boolean difficultyMedium = false;
        boolean difficultyHard = false;

        boolean levelOneEasy = false, levelTwoEasy = false, levelThreeEasy = false;
        boolean levelOneMedium = false, levelTwoMedium= false, levelThreeMedium = false;
        boolean levelOneHard= false, levelTwoHard= false, levelThreeHard= false;

        int failCounter = 0;

        while(gameStart){

            System.out.println("Welcome to the console game \"Guess a number\" made by me");
            System.out.println("To START the game please choose one of the following difficulties: [e]asy, [m]edium, [h]ard. If you want to learn more about the difficulties type help.");
            String playerInput = scanner.nextLine();

            if (playerInput.equals("e") || playerInput.equals("easy")) {
                System.out.println("Starting new game with easy difficulty!");
                difficultyEasy = true;
                levelOneEasy = true;
                gameStart = false;
                computerNumber = random.nextInt(19) +1;
            }else if (playerInput.equals("m") || playerInput.equals("medium")){

                System.out.println("Starting new game with medium difficulty! Each level you have 13 tries to guess it before failing.");
                difficultyMedium = true;
                levelOneMedium = true;
                gameStart = false;
                computerNumber = random.nextInt(19) +1;
            } else if (playerInput.equals("h") || playerInput.equals("hard")) {
                System.out.println("Starting new game with hard difficulty! Each level you have 7 tries to guess it before failing.");
                difficultyHard = true;
                levelOneHard = true;
                gameStart = false;
                computerNumber = random.nextInt(19) +1;
            }

        }

        //****************************************
        // *     Easy difficulty starts here     *
        //****************************************
        while (difficultyEasy){


            while (levelOneEasy) {

                System.out.print("Guess the number between 1 and 20:");
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

                            levelTwoEasy = true;
                            levelOneEasy = false;
                            computerNumber = random.nextInt(49) +1;
                        } else if (playerInput.equals("n") || playerInput.equals("no")) {
                            levelOneEasy = false;
                            break;
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

            while (levelTwoEasy) {

                System.out.print("Guess the number between 1 and 50:");
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

                            levelThreeEasy = true;
                            levelTwoEasy = false;
                            computerNumber = random.nextInt(99) +1;
                        } else if (playerInput.equals("n") || playerInput.equals("no")) {
                            levelTwoEasy = false;
                            break;
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


            while (levelThreeEasy) {

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
                        System.out.println("New game? y / n");
                        playerInput = scanner.nextLine();

                        if (playerInput.equals("y") || playerInput.equals("yes")){

                            gameStart = true;
                            levelThreeEasy = false;
                            difficultyEasy = false;
                        } else if (playerInput.equals("n") || playerInput.equals("no")) {
                            levelThreeEasy = false;
                            break;
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

        //****************************************
        // *     Medium difficulty starts here   *
        //****************************************


        while (difficultyMedium) {

            while (levelOneMedium) {

                System.out.print("Guess the number between 1 and 20:");
                String playerInput = scanner.nextLine();

                int playerNumber;

                boolean isValid = true;

                for (int i = 1; i < playerInput.length(); i++) {
                    if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    playerNumber = Integer.parseInt(playerInput);
                    if (playerNumber == computerNumber) {
                        System.out.println("Bravo! You guessed it");
                        System.out.println("Next level? y / n");
                        playerInput = scanner.nextLine();

                        if (playerInput.equals("y") || playerInput.equals("yes")) {

                            levelTwoMedium = true;
                            levelOneMedium = false;
                            computerNumber = random.nextInt(49) + 1;
                        } else if (playerInput.equals("n") || playerInput.equals("no")) {

                            break;
                        }
                    } else if (playerNumber < computerNumber) {
                        failCounter++;
                        System.out.println("Too Low\n");

                    } else if (playerNumber > computerNumber) {
                        failCounter++;
                        System.out.println("Too High\n");
                    }

                } else {
                    System.out.println("Invalid input!");
                }

                if (failCounter == 13) {

                    //Will implement logic to restart level or start new game

                    System.out.println("Level Failed.Start over!");
                    System.exit(0);
                    break;
                }

            }

            while (levelTwoMedium) {

                System.out.print("Guess the number between 1 and 50:");
                String playerInput = scanner.nextLine();

                int playerNumber;

                boolean isValid = true;

                for (int i = 1; i < playerInput.length(); i++) {
                    if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    playerNumber = Integer.parseInt(playerInput);
                    if (playerNumber == computerNumber) {
                        System.out.println("Bravo! You guessed it");
                        System.out.println("Next level? y / n");
                        playerInput = scanner.nextLine();

                        if (playerInput.equals("y") || playerInput.equals("yes")) {

                            levelThreeMedium = true;
                            levelTwoMedium = false;
                            computerNumber = random.nextInt(99) + 1;
                        } else if (playerInput.equals("n") || playerInput.equals("no")) {
                            break;
                        }
                    } else if (playerNumber < computerNumber) {
                        failCounter++;
                        System.out.println("Too Low\n");
                    } else if (playerNumber > computerNumber) {
                        failCounter++;
                        System.out.println("Too High\n");
                    }

                } else {
                    System.out.println("Invalid input!");
                }

                if (failCounter == 13) {

                    //Will implement logic to restart level or start new game

                    System.out.println("Level Failed.Start over!");
                    System.exit(0);
                    break;

                }
            }


            while (levelThreeMedium) {

                System.out.print("Guess the number between 1 and 100:");
                String playerInput = scanner.nextLine();

                int playerNumber;

                boolean isValid = true;

                for (int i = 1; i < playerInput.length(); i++) {
                    if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                        isValid = false;
                        break;
                    }
                }

                if (isValid) {
                    playerNumber = Integer.parseInt(playerInput);
                    if (playerNumber == computerNumber) {
                        System.out.println("Bravo! You guessed it. All medium levels completed.");
                        System.out.println("New game? y / n");
                        playerInput = scanner.nextLine();

                        if (playerInput.equals("y") || playerInput.equals("yes")) {

                            gameStart = true;
                            levelThreeMedium = false;
                        } else if (playerInput.equals("n") || playerInput.equals("no")) {
                            System.out.println("Good bye!");
                            break;
                        }
                    } else if (playerNumber < computerNumber) {
                        failCounter++;
                        System.out.println("Too Low\n");
                    } else if (playerNumber > computerNumber) {
                        failCounter++;
                        System.out.println("Too High\n");
                    }

                } else {
                    System.out.println("Invalid input!");
                }

                if (failCounter == 13) {

                    //Will implement logic to restart level or start new game

                    System.out.println("Level Failed.Start over!");
                    System.exit(0);
                    break;

                }

            }

        }

            //****************************************
            // *     Hard difficulty starts here     *
            //****************************************

            while (difficultyHard){

                while (levelOneHard) {

                    System.out.print("Guess the number between 1 and 20:");
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

                                levelTwoHard = true;
                                levelOneHard = false;
                                computerNumber = random.nextInt(49) +1;
                            } else if (playerInput.equals("n") || playerInput.equals("no")) {
                                break;
                            }
                        }else if( playerNumber < computerNumber){
                            failCounter++;
                            System.out.println("Too Low\n");

                        }else if (playerNumber > computerNumber){
                            failCounter++;
                            System.out.println("Too High\n");
                        }

                    }else {
                        System.out.println("Invalid input!");
                    }

                    if (failCounter == 7){

                        //Will implement logic to restart level or start new game

                        System.out.println("Level Failed.Start over!");
                        difficultyHard = false;
                        levelOneHard = false;
                        break;
                    }

                }

                while (levelTwoHard) {

                    System.out.print("Guess the number between 1 and 50:");
                    String playerInput = scanner.nextLine();

                    int playerNumber;

                    boolean isValid = true;

                    for (int i = 1; i < playerInput.length(); i++) {
                        if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57) {
                            isValid = false;
                            break;
                        }
                    }

                    if (isValid) {
                        playerNumber = Integer.parseInt(playerInput);
                        if (playerNumber == computerNumber) {
                            System.out.println("Bravo! You guessed it");
                            System.out.println("Next level? y / n");
                            playerInput = scanner.nextLine();

                            if (playerInput.equals("y") || playerInput.equals("yes")) {

                                levelThreeHard = true;
                                levelTwoHard = false;
                                computerNumber = random.nextInt(99) + 1;
                            } else if (playerInput.equals("n") || playerInput.equals("no")) {
                                break;
                            }
                        } else if (playerNumber < computerNumber) {
                            failCounter++;
                            System.out.println("Too Low\n");
                        } else if (playerNumber > computerNumber) {
                            failCounter++;
                            System.out.println("Too High\n");
                        }

                    } else {
                        System.out.println("Invalid input!");
                    }

                    if (failCounter == 7) {

                        //Will implement logic to restart level or start new game

                        System.out.println("Level Failed.Start over!");
                        System.exit(0);
                        break;

                    }
                }


                while (levelThreeHard) {

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
                            System.out.println("Bravo! You guessed it. All hard levels completed.");
                            System.out.println("New game? y / n");
                            playerInput = scanner.nextLine();

                            if (playerInput.equals("y") || playerInput.equals("yes")){

                                gameStart = true;
                                levelThreeHard = false;
                            } else if (playerInput.equals("n") || playerInput.equals("no")) {
                                System.out.println("Good bye! Thank you for playing and defeating the game on hardest difficulty");
                                break;
                            }
                        }else if( playerNumber < computerNumber){
                            failCounter++;
                            System.out.println("Too Low\n");
                        }else if (playerNumber > computerNumber){
                            failCounter++;
                            System.out.println("Too High\n");
                        }

                    }else {
                        System.out.println("Invalid input!");
                    }

                    if (failCounter == 7) {

                        //Will implement logic to restart level or start new game and fail counter to show each turn.

                        System.out.println("Level Failed.Start over!");
                        System.exit(0);

                        break;

                    }

            }
        }

  }
}

