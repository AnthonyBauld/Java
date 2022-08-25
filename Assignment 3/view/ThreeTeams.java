package view;

import model.Team;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.Random;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Assignment 3: The Robot Olympic's
 * @duedate June 30st, 2020 at 11:59PM
 */

public class ThreeTeams {
    public void draw(GraphicsContext gc) {
        /**
         * This function creates an arraylist called titles. It
         * then (add)s three new titles that I specifically input
         * to be selected at random later on. I then created a random
         * function that will be used to call upon to allow me to select
         * a random Team for 1,2,3 and referee positions.
         */
        // Set the title (Team)s and create an Arraylist alongside a randomIndex.
        ArrayList < String > titles = new ArrayList < > ();
        titles.add("Brobot");
        titles.add("Ranger");
        titles.add("Scrappy");
        Random random = new Random();
        int randomIndex;
        Team[] teams = new Team[3];

        /**
         * This function calls upon a random Team and assigns it within the first
         * position of the three set Teams. It then initialise's the Team and removes
         * the Team name from the set arraylist. It then draws the Team from the randomly
         * selected Arraylist.
         */
        randomIndex = random.nextInt((titles.size())); // Call upon title 1 (Team) randomly and assign it to the first team.
        teams[0] = new Team(titles.get(randomIndex), 40.0, 20.0, Color.ORANGE); // Initialize the team.
        titles.remove(randomIndex); // Remove title (Team) from the Arraylist.
        teams[0].draw(gc); // Draw the title (Team) in it's randomly selected place.

        /**
         * This function calls upon a random Team and assigns it within the second
         * position of the three set Teams. It then initialise's the Team and removes
         * the Team name from the set arraylist. It then draws the Team from the randomly
         * selected Arraylist.
         */
        randomIndex = random.nextInt((titles.size())); // Call upon title 2 (Team)  randomly and assign it to the second team.
        teams[1] = new Team(titles.get(randomIndex), 40.0, 220.0, Color.RED); // Initialize the team.
        titles.remove(randomIndex); // Remove title (Team) from the Arraylist.
        teams[1].draw(gc); // Draw the title (Team) in it's randomly selected place.

        /**
         * This function calls upon a random Team and assigns it within the third
         * position of the three set Teams. It then initialise's the Team and removes
         * the Team name from the set arraylist. It then draws the Team from the randomly
         * selected Arraylist.
         */
        randomIndex = random.nextInt((titles.size())); // Call upon title 3 (Team) randomly and assign it to the third team.
        teams[2] = new Team(titles.get(randomIndex), 40.0, 420.0, Color.BLUE); // Initialize the team.
        teams[2].draw(gc); // Draw the title (Team) in it's randomly selected place.

        /**
         * This function calls upon a Team and place that team as the referee
         * at random. It then draws the Team as the referee for that specific
         * launch.
         */
        randomIndex = random.nextInt(3); // Call upon a random title (Team) and assign it as a referee.
        teams[randomIndex].drawReferee(gc); // Draw the title (Team) in it's randomly selected place.
    }
}
