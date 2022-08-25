import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class DrawCircle extends Application
{

// This is where you create your components
    @Override
    public void start(Stage stage) throws Exception
    {
        Pane root = new Pane();
        StackPane holder = new StackPane();
        Scene scene = new Scene(root); // set window size here
        Canvas canvas = new Canvas(400, 400); // set canvas size here
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Button button = new Button("Draw Circle");
        button.setLayoutX(100);
        button.setLayoutY(0);
        Text text = new Text(20, 40, "Radius: ");
        TextField textField = new TextField();
        textField.setPrefColumnCount(6);

        // action event
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent e)
            {
                String s = textField.getText();
                int r = Integer.parseInt(s);
                Circle c = new Circle(200,200,r);
                c.setFill(Color.BLUE);
                root.getChildren().add(c);
            }
        };
        button.setOnAction(event);

        holder.getChildren().add(canvas);
        root.getChildren().add(holder);
        root.getChildren().add(button);
        root.getChildren().add(text);
        root.getChildren().add(textField);
        holder.setStyle("-fx-background-color: green");
        stage.setTitle("Circle"); // set window title here
        stage.setScene(scene);


        stage.show();
    }
    public static void main(String[] args)
    {
        launch(args);
    }
}
