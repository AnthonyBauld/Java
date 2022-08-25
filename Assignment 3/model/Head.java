package model;

import javafx.scene.canvas.GraphicsContext;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Robot Olympic's
 * @duedate June 30st, 2020 at 11:59PM
 */

public class Head {
    private final double x, y; // X, Y Coordinates.

    /**
     * This function creates a constructor that will be used
     * for the creation of the Head.
     *
     * @param x The number to calculate the position of the drawing.
     * @param y The number to calculate the position of the drawing.
     */
    public Head(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /**
     * This function draws the head using GraphicsContent with
     * specific input for X, Y, W, and H.
     *
     * @param gc Draw's the head in X, Y, W, and H.
     */
    public void draw(GraphicsContext gc) {
        gc.fillOval(x, y, 40, 40);
        gc.fillRect(x + 17.5, y + 40, 5, 10);
    }
}
