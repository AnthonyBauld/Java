package week1code;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Use this template to create drawings in FX. Change the name of the class and
 * put your own name as author below. Change the size of the canvas and the
 * window title where marked and add your drawing code where marked.
 *
 * @author Anthony Bauld - 000754334
 */
public class BarGraph extends Application {
    private final int width = 800, height = 400; //The dimensions of the window
    private final Point zero =  new Point(35, height - 35); // The point at which the vertical and horizontal lines interfere
    private final Point up = new Point(35,35); // The highest point at the vertical line
    private final Point right = new Point(width-35, height-35); // The point at the most east in the horizontal line
    private final Line vertical = new Line(zero.x,zero.y, up.x,up.y); // The vertical line with its coordinates
    private final Line horizontal = new Line(35,right.y, right.x,right.y); // The horizontal line with its coordinates
    private final int verticalLength = zero.y - up.y - 35; // The length of the vertical line
    private final int horizontalLength = right.x - zero.x - 35; // The length of the horizontal line


    private static class Point {
        public int x, y; // The point coordinates
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    private static class Bar {
        public Text text; // The bar label
        public Rectangle rectangle; // The bar ( in a rectangle shape )
        public Bar(Text text, Rectangle rectangle) {
            this.text = text;
            this.rectangle = rectangle;
        }
    }

    /**
     * This process is the start of the application because it involves user feedback and
     * traces the vertical and horizontal lines, vertical values and horizontal labels and
     * each label value with its corresponding circle.
     *
     * @param stage describes the initial state that is taken from the main.
     */
    @Override
    public void start(Stage stage) {
        Scanner in = new Scanner(System.in);
        Group root = new Group();
        Scene scene = new Scene(root);
        Canvas canvas = new Canvas(width, height); // Set canvas Size in Pixels
        System.out.print("Weather Throughout the year: ");
        String title = in.next(); //title of the window
        stage.setTitle(title); // Set window title
        root.getChildren().add(canvas);
        root.getChildren().add(vertical);
        root.getChildren().add(horizontal);
        stage.setScene(scene);
        stage.setResizable(false);
        int from, to, numberOfLabels;

        System.out.println("Enter Range");
        while (true) {
            System.out.print("From: ");
            from = in.nextInt();
            System.out.print("To: ");
            to = in.nextInt();
            if (from < to && from >= 0) {
                break;
            }
            System.out.println("Enter valid range");
        }
        //Write Y axis ranges
        ArrayList<Text> texts = getVerticalTexts(from, to, verticalLength);
        for (Text text : texts) {
            root.getChildren().add(text);
        }

        System.out.println("Enter number of labels: ");
        numberOfLabels = in.nextInt();
        ArrayList<Bar> bars = getBars(numberOfLabels, from, to, in);
        for (Bar bar : bars) {
            root.getChildren().add(bar.text);
            root.getChildren().add(bar.rectangle);
        }
        stage.show();
    }

    /**
     * This function takes these inputs and add vertical numbers as
     * (Text) with respect to converting from user range to window range.
     *
     * @param from The minimum bar value taken from user
     * @param to The maximum bar value taken from user
     * @param verticalLength The length of the vertical line
     * @return ArrayList that contains the texts with its coordinates
     */
    public ArrayList<Text> getVerticalTexts(int from, int to, int verticalLength) {
        int userVerticalRange = to - from;
        int numberOfLines = 5;
        if (numberOfLines > userVerticalRange)
            numberOfLines = userVerticalRange;
        int verticalUnit = (userVerticalRange / numberOfLines);
        ArrayList<Text> texts = new ArrayList<>();
        for (int i=from ; i<= from + 5*verticalUnit ; i += verticalUnit) {
            double scale = (i - from) * 1.0 / userVerticalRange;
            double y = height - 35 - verticalLength * scale;
            Text text = new Text(5, y, "" + i);
            texts.add(text);
        }
        return texts;
    }

    /**
     * This function generates bars according to the number of labels available
     * it writes labels to the horizontal line with respect to scaling
     * number of labels within horizontal line. Then, it produces
     * bars according to each label value that is taken as an input from
     * user. Finally, it gathers all the rectangles and labels into a bar ArrayList
     *
     * @param numberOfLabels The number of all user-taken labels
     * @param from The minimum bar value taken from user
     * @param to The minimum bar value taken from user
     * @param in The scanner which used in start function
     * @return ArrayList of label and rectangle bars with their coordinates
     */
    public ArrayList<Bar> getBars(int numberOfLabels, int from, int to, Scanner in) {
        double value;
        int horizontalUnit = horizontalLength / numberOfLabels;
        int userVerticalRange = to - from;
        ArrayList<Bar> bars = new ArrayList<>();
        for (int i=35 ; i<horizontalLength ; i+=horizontalUnit) {
            System.out.print("Label: ");
            String label = in.next();
            while (true) {
                System.out.print("Value: ");
                value = in.nextDouble();
                if (value >= from && value <= to)
                    break;
                System.out.println("Invalid value (outside of range)");
            }
            Text text = new Text(i + 35, height-15, label);
            double scale = (value - from) * 1.0 / userVerticalRange;
            double tall = verticalLength * scale;
            Rectangle rectangle = new Rectangle(i+35,height-35-tall,15,tall);
            bars.add(new Bar(text, rectangle));
        }
        return bars;
    }
    /**
     * The actual main method that launches the app.
     *
     * @param args unused
     */
    public static void main(String[] args) {
        launch(args);
    }
}
