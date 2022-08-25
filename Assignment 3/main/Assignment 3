package main;

import view.ThreeTeams;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Robot Olympic's
 * @duedate June 30st, 2020 at 11:59PM
 */

public class Assignment3 extends Application {

    /**
     * This function creates a constructor that will be used
     * for the creation of the Program. It also creates an empty
     * constructor, sets the canvas size in (Pixel)s, creates a stage
     * title that will be used for the window title.
     *
     * @param stage Create's a title that will be used for the window.
     */
    @Override
    public void start (Stage stage) {
        //constructor
        Group root = new Group(); // Creates an empty constructor.
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(775, 625); // Set's the canvas size in pixel's.

        stage.setTitle("Robot Olympic's - Anthony Bauld"); // Set's the windows title to whatever I want.
        GraphicsContext gc = canvas.getGraphicsContext2D();
        ThreeTeams teams = new ThreeTeams();
        teams.draw(gc);

        root.getChildren().add(canvas);
        stage.setScene(scene);
        stage.setResizable(false);

        // YOUR CODE STOPS HERE
        stage.show();
    }

    public static void main (String[] args) {
        launch(args);
    }
}
