package com.main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");

        int position = 0;
        int winningPosition = 100;
        int diceRolls = 0;

        Random random = new Random();

        // Game loop
        while (position < winningPosition) {
            diceRolls++;

            // Roll the die to get a number between 1 to 6
            int dice = random.nextInt(6) + 1;
            System.out.println("Dice Roll #" + diceRolls + ": Rolled a " + dice);

            // Determine the player's option (0 = No Play, 1 = Ladder, 2 = Snake)
            int option = random.nextInt(3);

            switch (option) {
                case 0:
                    System.out.println("Option: No Play. Player stays at position: " + position);
                    break;

                case 1:
                    if (position + dice > winningPosition) {
                        System.out.println("Move exceeds 100. Stay at position: " + position);
                    } else {
                        position += dice;
                        System.out.println("Option: Ladder! Player climbs up to position: " + position);
                    }
                    break;

                case 2:
                    position -= dice;
                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Option: Snake! Player slides down to position: " + position);
                    break;
            }

            System.out.println("Current position after roll: " + position);
        }

        System.out.println("Congratulations! The player reached the exact winning position: " + winningPosition);
        System.out.println("Total dice rolls to win the game: " + diceRolls);
    }
}
