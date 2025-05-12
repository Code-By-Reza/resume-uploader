package reza.input;

import java.util.Scanner;

/**
 * This class handles user input for creating a Resume object.
 */
public class InputHandler {

    private final Scanner scanner;

    // Constructor to initialize the scanner
    public InputHandler() {
        scanner = new Scanner(System.in);
    }

    /**
     * Prompts the user and reads a line of input.
     *
     * @param prompt The message to show to the user
     * @return The input entered by the user
     */
    public String prompt(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    /**
     * Alias method for prompt(), used for compatibility.
     */
    public String getInput(String prompt) {
        return prompt(prompt);
    }

    /**
     * Closes the scanner to release system resources.
     */
    public void closeScanner() {
        scanner.close();
    }
}

