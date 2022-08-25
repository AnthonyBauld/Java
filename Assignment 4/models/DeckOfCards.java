package models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Deck of Cards
 * @duedate July 12th, 2020 at 11:59PM
 */

public class DeckOfCards {
    private ArrayList < Card > cards;
    private int suit;
    private int rank;

    /**
     * This function creates a constructor that will be used
     * for the creation of the Program. It also creates an empty
     * constructor that will be used to create an ArrayList that
     * will be used to create the suit and ranked cards.
     *
     * @param suit The number to calculate the suit created.
     * @param rank The number to calculate the ranked created.
     */
    public DeckOfCards(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
        cards = new ArrayList < > ();
        createCards();
    }

    /**
     * This function is to initialize the ArrayList.
     */
    private void createCards() {
        for (int i = 1; i <= suit; i++)
            for (int j = 1; j <= rank; j++)
                cards.add(new Card(i, j));
    }

    /**
     * This function is used to shuffle the ArrayList as
     * well as create a random int that will be used to pull
     * randomized cards upon called within the program.
     */
    public void shuffle() {
        ArrayList < Card > temp = new ArrayList < > ();
        Random random = new Random();
        for (int i = 0; i < suit * rank; i++) {
            int index = random.nextInt(cards.size());
            temp.add(cards.get(index));
            cards.remove(index);
        }
        cards = temp;
    }

    /**
     * This function is used to create and call upon a random
     * histogram. It takes the ArrayList for the cards and sets
     * a value to create a new Arraylist. It then runs a for loop
     * that will deal a amount of cards preset and return.
     *
     * @param numOfCards This is used to deal a amount of cards.
     * @param times This is used run the histogram a specific amount of times.
     * @return After looping return histogram.
     */
    public HashMap < Integer, Integer > getHistogram(int numOfCards, int times) {
        ArrayList < Card > setValue = new ArrayList < > ();
        HashMap < Integer, Integer > histogram = new HashMap < > ();
        for (int i = 0; i < times; i++) {
            setValue = deal(numOfCards);
            int value = getTotalValue(setValue);
            Integer occurrences = histogram.get(value);
            if (occurrences == null)
                occurrences = 0;
            histogram.put(value, occurrences + 1);
        }
        return histogram;
    }

    /**
     * This function is used to get the total amount of set cards
     * while creating a for loop that will take the total amount and
     * set amount to get the value.
     *
     * @param setValue The value preset to run the ArrayList.
     * @return After looping return totalValue.
     */
    private int getTotalValue(ArrayList < Card > setValue) {
        int totalValue = 0;
        for (int i = 0; i < setValue.size(); i++) {
            totalValue += setValue.get(i).getValue();
        }
        return totalValue;
    }

    /**
     * This function is used to deal a specific amount (n) of cards.
     * It then takes the ArrayList and creates a new random that will
     * be used within this function to use with the number of cards.
     * It then returns to deal the cards once it's done the loop.
     *
     * @param numOfCards This is used to deal a amount of cards.
     * @return After looping return deal.
     */
    public ArrayList < Card > deal(int numOfCards) {
        ArrayList < Card > temp = new ArrayList < > ();
        ArrayList < Card > deal = new ArrayList < > ();
        for (int i = 0; i < cards.size(); i++)
            temp.add(cards.get(i));
        Random random = new Random();
        for (int i = 0; i < numOfCards; i++) {
            int index = random.nextInt(temp.size());
            deal.add(temp.get(index));
            temp.remove(index);
        }
        return deal;
    }
    @Override
    public String toString() {
        int num = suit * rank;
        return "Deck of " + num + " cards: low = 1 high = " + num + " top = " + cards.get(0);
    }
}
