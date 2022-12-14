package sample;

import javafx.application.Application;
import javafx.event.Event;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import java.util.Random;

/**
 * I, Anthony Bauld - 000754334. Certify that I own and created this code. I have
 * not plagiarized or stole any code from another source nor have given this code
 * to another student.
 * @author Anthony Bauld - 000754334
 * @project Exam Test 2
 * @duedate Tuesday, August 18 at 10:00 am to 12:30 pm
 */

public class MouseColorSquare extends Application {

    private Rectangle rectangle1, rectangle2, rectangle3, rectangle4, rectangle5;
    private final Color[] colors = new Color[] {Color.INDIGO, Color.VIOLET, Color.BLUE, Color.GREEN, Color.YELLOW, Color.ORANGE, Color.RED};
    @Override
    public void start(Stage stage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 400, 400, Color.LIGHTBLUE);
        stage.setTitle("Square Color Changer");
        stage.setScene(scene);


        rectangle1 = new Rectangle(150, 150, 90, 90);
        rectangle1.setFill(Color.YELLOW);

        rectangle2 = new Rectangle(55, 55, 90, 90);
        rectangle2.setFill(Color.RED);

        rectangle3 = new Rectangle(55, 245, 90, 90);
        rectangle3.setFill(Color.GREEN);

        rectangle4 = new Rectangle(245, 55, 90, 90);
        rectangle4.setFill(Color.ORANGE);

        rectangle5 = new Rectangle(245, 245, 90, 90);
        rectangle5.setFill(Color.BLUE);

        root.getChildren().addAll(rectangle1, rectangle2, rectangle3, rectangle4, rectangle5);

        scene.addEventHandler(MouseEvent.MOUSE_PRESSED,this::changeColor);
        stage.show();
    }

    private void changeColor(MouseEvent me) {
        int x = (int)me.getX();
        int y = (int)me.getY();
        Random random = new Random();
        int randomIndex = random.nextInt((colors.length));
        if (x > 150 && x < (150+90) && y > 150 &&  y < (150+90)){
            rectangle1.setFill(colors[randomIndex]);
        } else if (x > 55 && x < (55+90) && y > 55 &&  y < (55+90)){
            rectangle2.setFill(colors[randomIndex]);
        } else if (x > 55 && x < (55+90) && y > 245 &&  y < (245+90)){
            rectangle3.setFill(colors[randomIndex]);
        } else if (x > 245 && x < (245+90) && y > 55 &&  y < (55+90)){
            rectangle4.setFill(colors[randomIndex]);
        } else if (x > 245 && x < (245+90) && y > 245 &&  y < (245+90)){
            rectangle5.setFill(colors[randomIndex]);
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
