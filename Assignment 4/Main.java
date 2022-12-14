import models.Card;
import models.DeckOfCards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 4: The Deck of Cards
 * @duedate July 12th, 2020 at 11:59PM
 */

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        Scanner in = new Scanner(System.in);
        out.print("How many suits would you like? ");
        int suits = in .nextInt();
        out.print("How many ranks would you like? ");
        int ranks = in .nextInt();
        DeckOfCards d = new DeckOfCards(suits, ranks);

        /**
         * This function creates a while loop the will ask the user
         * a set of questions to choose from. It displays a list of
         * choices that are broken with \n. The user can pick between
         * shuffling, dealing 1 hand, dealing 100,000 hands or exiting
         * the program. If the user inputs a invalid value it loops back.
         */
        while (true) {
            out.println("\n" + d);
            out.print("1. Shuffle\n2. Deal 1 hand\n3. Deal 100,000 times\n4. Quit Program\nWhat would you like to do?: ");
            choice = in .nextInt();

            /**
             * This function if chosen shuffles the current randomly
             * selected cards. After chosen it choose new randomly
             * selected cards that will be used.
             */
            if (choice == 1) {
                d.shuffle();

                /**
                 * This function asks the user how many cards they would like
                 * then deals 1 cards and then displays the random histogram
                 * from the preselected choices from the user.
                 */
            } else if (choice == 2) {
                out.println("How many cards would you like? ");
                int numOfCards = in .nextInt();
                ArrayList < Card > cards = d.deal(numOfCards);
                for (int i = 0; i < cards.size(); i++) {
                    out.print(cards.get(i) + " ");
                }
                out.println("");

                /**
                 * This function asks the user how many cards they would like
                 * then deals 100,000 cards and then displays the random histogram
                 * from the preselected choices from the user.
                 */
            } else if (choice == 3) {
                out.println("How many cards would you like? ");
                int numOfCards = in .nextInt();
                HashMap < Integer, Integer > histogram = d.getHistogram(numOfCards, 100000);
                for (Map.Entry < Integer, Integer > entry: histogram.entrySet()) {
                    out.println(entry.getKey() + ": " + entry.getValue());
                }

                /**
                 * This function is used when the user wants to exit
                 * the program. If selected the program will display a
                 * message then close.
                 */
            } else if (choice == 4) {
                break;

                /**
                 * This function is used when the user inputs the correct
                 * value and returns them back to the selection to choose
                 * a different value.
                 */
            } else {
                out.println("\nInvalid input. Please try again!");
            }
        }
        /**
         * The function displays a message before exiting the program.
         */
        out.println("\nEnding Program. Goodbye :)");
    }
}
