package lab;

import java.util.Scanner;

public class Game {
    private final Scanner consoleScanner;
    private Node current;

    public Game(Node root) {
        consoleScanner = new Scanner(System.in);
        this.current = root;
    }


    public void playGame() {
        boolean shouldEnd = false;

        while (!shouldEnd) {
            playCurrentNode();
            shouldEnd = currentNodeIsEndingNode();

            if (shouldEnd)
                System.out.printf("%s%n", current);
        }

        consoleScanner.close();
    }

    private void playCurrentNode() {
        System.out.print(current);
        System.out.print(">> ");
        safelyEnactInputChoice();
    }

    private void safelyEnactInputChoice() {
        try {
            int choiceIndex = scanChoiceIndex();
            current = current.chooseNextNode(choiceIndex);
        }
        catch (NumberFormatException inputWasNotAnIntException) {
            System.err.printf("That was not a number. Please try again.%n>> ");
            safelyEnactInputChoice();
        }
        catch (IndexOutOfBoundsException inputWasNotInChoicesException) {
            System.err.printf("That number was not a choice. Please try again.%n>> ");
            safelyEnactInputChoice();
        }
    }

    private int scanChoiceIndex() {
        return Integer.parseInt(consoleScanner.nextLine()) - 1;
    }

    private boolean currentNodeIsEndingNode() {
        return current.isEndNode();
    }
}