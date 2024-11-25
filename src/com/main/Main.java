package com.main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");

        int player1Position = 0;
        int player2Position = 0;
        int winningPosition = 100;
        int diceRollsPlayer1 = 0;
        int diceRollsPlayer2 = 0;

        Random random = new Random();
        boolean isPlayer1Turn = true;

        while (player1Position < winningPosition && player2Position < winningPosition) {
            if (isPlayer1Turn) {
                diceRollsPlayer1++;
                System.out.println("Player 1's turn:");
                int dice = random.nextInt(6) + 1;
                System.out.println("Rolled: " + dice);
                int option = random.nextInt(3);

                switch (option) {
                    case 0:
                        System.out.println("Option: No Play. Player 1 stays at position: " + player1Position);
                        break;
                    case 1:
                        if (player1Position + dice > winningPosition) {
                            System.out.println("Move exceeds 100. Stay at position: " + player1Position);
                        } else {
                            player1Position += dice;
                            System.out.println("Option: Ladder! Player 1 climbs to position: " + player1Position);
                            isPlayer1Turn = true;
                        }
                        break;
                    case 2:
                        player1Position -= dice;
                        if (player1Position < 0) {
                            player1Position = 0;
                        }
                        System.out.println("Option: Snake! Player 1 slides to position: " + player1Position);
                        break;
                }
                if (option != 1) {
                    isPlayer1Turn = false;
                }
            } else {
                diceRollsPlayer2++;
                System.out.println("Player 2's turn:");
                int dice = random.nextInt(6) + 1;
                System.out.println("Rolled: " + dice);
                int option = random.nextInt(3);

                switch (option) {
                    case 0:
                        System.out.println("Option: No Play. Player 2 stays at position: " + player2Position);
                        break;
                    case 1:
                        if (player2Position + dice > winningPosition) {
                            System.out.println("Move exceeds 100. Stay at position: " + player2Position);
                        } else {
                            player2Position += dice;
                            System.out.println("Option: Ladder! Player 2 climbs to position: " + player2Position);
                            isPlayer1Turn = false;
                        }
                        break;
                    case 2:
                        player2Position -= dice;
                        if (player2Position < 0) {
                            player2Position = 0;
                        }
                        System.out.println("Option: Snake! Player 2 slides to position: " + player2Position);
                        break;
                }
                if (option != 1) {
                    isPlayer1Turn = true;
                }
            }
            System.out.println("Player 1 Position: " + player1Position);
            System.out.println("Player 2 Position: " + player2Position);
            System.out.println("----------------------------------");
        }

        if (player1Position == winningPosition) {
            System.out.println("Congratulations! Player 1 won the game!");
        } else {
            System.out.println("Congratulations! Player 2 won the game!");
        }

        System.out.println("Total Dice Rolls: Player 1 = " + diceRollsPlayer1 + ", Player 2 = " + diceRollsPlayer2);
    }
}
