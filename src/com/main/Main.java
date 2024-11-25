package com.main;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Snake and Ladder Game!");

        // Initialize start position
        int position = 0;
        System.out.println("Player starts at position: " + position);

        // Simulate rolling a die
        Random random = new Random();
        int dice = random.nextInt(6) + 1; // Roll a die (1 to 6)
        System.out.println("Rolled the die: " + dice);

        // Update position
        position += dice;
        System.out.println("Player moves to position: " + position);
    }
}

