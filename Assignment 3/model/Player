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

public class Player {
    private final double x, y; // X, Y Coordinates.
    private final int average; // Average score generated randomly.
    private final Color color; // Color for the body of the (Team)s.
    private String title; // Title for the (Team)s.

    /**
     * This function creates a constructor that will be used
     * for the creation of the Players.
     *
     * @param x The number to calculate the position of the drawing.
     * @param y The number to calculate the position of the drawing.
     * @param color The color that will be used for the specific Team.
     * @param title The title of the (Team)s.
     */
    public Player (double x, double y, Color color, String title) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.title = title;
        double rand = Math.random();
        average = (int)(rand * 100);
    }

    /**
     * This function is used the plot and draw the (Team)s. It
     * will used a GraphicsContent to draw the head, body, wheels
     * and writes the player title (Team).
     *
     * @param gc Draw's the head, body, and wheels.
     */
    public void draw (GraphicsContext gc) {

        // Draw's the head.
        Head h = new Head(x + 20, y);
        h.draw(gc);

        // Draw's the body.
        gc.setFill(color);
        gc.fillOval(x, y + 50, 80, 80);

        // Draw's the wheels.
        gc.setFill(Color.BLACK);
        Wheel wheel1 = new Wheel(x - 10, y + 50);
        Wheel wheel2 = new Wheel(x + 80, y + 50);
        wheel1.draw(gc);
        wheel2.draw(gc);

        // Display's and writes the title (Team).
        gc.fillText(average + "", x + 32.5, y + 92.5);
        gc.fillText(title, x + 20, y + 160);
    }

    // Creates and returns the average.
    public int getAverage() {
        return average;
    }
}
