package com.main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
            System.out.println("Welcome to the Snake and Ladder Game!");

            // Initialize start position
            int position = 0;
            System.out.println("Player starts at position: " + position);

            Random random = new Random();

            int dice = random.nextInt(6) + 1;
            System.out.println("Rolled the die: " + dice);

            // Determine the player's option (0 = No Play, 1 = Ladder, 2 = Snake)
            int option = random.nextInt(3);

            switch (option) {
                case 0:
                    System.out.println("Option: No Play. Player stays at position: " + position);
                    break;

                case 1:
                    position += dice;
                    System.out.println("Option: Ladder! Player climbs up to position: " + position);
                    break;

                case 2:
                    position -= dice;
                    // Ensure position does not go below 0
                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Option: Snake! Player slides down to position: " + position);
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }


