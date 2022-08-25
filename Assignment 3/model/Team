package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Robot Olympic's
 * @duedate June 30st, 2020 at 11:59PM
 */

public class Team {
    private final double x, y; // X, Y Coordinates.
    private final String name; // String for Team name.
    private final Color color; // Color to represent the (Team)s.
    Player[] players; // Players.

    /**
     * This function creates a constructor that will be used
     * for the creation of the Teams.
     *
     * @param name The Team name that will be used for the specific position.
     * @param x The number to calculate the position of the drawing.
     * @param y The number to calculate the position of the drawing.
     * @param color The color that will be used for the specified Team.
     */
    public Team(String name, double x, double y, Color color) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
        players = new Player[3];
    }

    /**
     * This function is used to plot each Team within there
     * respected position. It will initialize each player 1-3
     * then draw the player and total score and write the average
     * of the entire Team.
     *
     * @param gc Draw's the position of each player 1-3.
     */
    public void draw(GraphicsContext gc) {
        players[0] = new Player(x, y, color, "Player 1");
        players[1] = new Player(x + 180, y, color, "Player 2");
        players[2] = new Player(x + 340, y, color, "Player 3");

        /**
         * This function is used to draw each player 1-3 and collect
         * the average score and place it within (average).
         */
        int average = 0;
        for (Player player: players) {
            player.draw(gc);
            average += player.getAverage();
        }

        /**
         * This function is used to collect and draw the final
         * average of each Team and displays it within a specific
         * position.
         */
        average = (int)(average * 1.0 / 3);
        gc.fillText(name + " (team average " + average + ") ", x, y + 180);
    }

    /**
     * This function is used to draw the referee. It calls upon the Team
     * that was randomly selected and draws the same color as that randomly
     * selected Team.
     *
     * @param gc Draw's the referee with the same color as that Team.
     */
    public void drawReferee(GraphicsContext gc) {
        Player ref = new Player(650, 220, color, "Coach " + name);
        ref.draw(gc);
    }
}
