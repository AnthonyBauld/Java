package models;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Deck of Cards
 * @duedate July 12th, 2020 at 11:59PM
 */

public class Card {
    private int suit;
    private int rank;

    /**
     * This function creates a constructor that will be used
     * for the creation of cards.
     *
     * @param s The letter to calculate the the specific suit.
     * @param r The letter to calculate the the specific rank.
     */
    public Card(int s, int r) {
        this.suit = s;
        this.rank = r;
    }
    @Override
    public String toString() {
        return "Card S" + suit + "R" + rank;
    }

    /**
     * This function takes the rank and suit values
     * and times them between themselves.
     *
     * @return the getValue of the (time)s of suit and rank.
     */
    public int getValue() {
        return rank * suit;
    }
}
