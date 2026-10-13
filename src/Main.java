import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String playAgain = "Y";

        while (playAgain.equalsIgnoreCase("Y")){

            String playerA;
            String playerB;
            boolean validMove;

            //Get Player A's move
            System.out.println(" Player A, Enter R, P, or S: ");
            playerA = input.nextLine();

            validMove = false;

            while (!validMove) {
                if (playerA.equalsIgnoreCase("R")) {
                    validMove = true;
                } else if (playerA.equalsIgnoreCase("P")) {
                    validMove = true;
                } else if (playerA.equalsIgnoreCase("S")) {
                    validMove = true;
                } else {
                    System.out.print("Invalid move. Enter R, P, or S: ");
                    playerA = input.nextLine();
                }
            }

            // Get Player B's move
            System.out.print("Player B, enter R, P, or S: ");
            playerB = input.nextLine();

            validMove = false;

            while (!validMove) {
                if (playerB.equalsIgnoreCase("R")) {
                    validMove = true;
                } else if (playerB.equalsIgnoreCase("P")) {
                    validMove = true;
                } else if (playerB.equalsIgnoreCase("S")) {
                    validMove = true;
                } else {
                    System.out.print("Invalid move. Enter R, P, or S: ");
                    playerB = input.nextLine();
                }
            }

            // Check the result
            if (playerA.equalsIgnoreCase(playerB)) {
                if (playerA.equalsIgnoreCase("R")) {
                    System.out.println("Rock vs Rock it's a Tie!");
                } else if (playerA.equalsIgnoreCase("P")) {
                    System.out.println("Paper vs Paper it's a Tie!");
                } else {
                    System.out.println("Scissors vs Scissors it's a Tie!");
                }
            } else if (playerA.equalsIgnoreCase("R")) {
                if (playerB.equalsIgnoreCase("S")) {
                    System.out.println("Rock breaks Scissors");
                    System.out.println("Player A wins!");
                } else {
                    System.out.println("Paper covers Rock");
                    System.out.println("Player B wins!");
                }
            } else if (playerA.equalsIgnoreCase("P")) {
                if (playerB.equalsIgnoreCase("R")) {
                    System.out.println("Paper covers Rock");
                    System.out.println("Player A wins!");
                } else {
                    System.out.println("Scissors cuts Paper");
                    System.out.println("Player B wins!");
                }
            } else {
                if (playerB.equalsIgnoreCase("P")) {
                    System.out.println("Scissors cuts Paper");
                    System.out.println("Player A wins!");
                } else {
                    System.out.println("Rock breaks Scissors");
                    System.out.println("Player B wins!");
                }
            }

            // Ask to play again
            System.out.print("Play again? (Y/N): ");
            playAgain = input.nextLine();

            while (!playAgain.equalsIgnoreCase("Y")) {
                if (playAgain.equalsIgnoreCase("N")) {
                    break;
                } else {
                    System.out.print("Please enter Y or N: ");
                    playAgain = input.nextLine();
                }
            }
        }

        System.out.println("Thanks for playing!");

        input.close();
    }
}
