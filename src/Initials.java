import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

public class Initials extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Input.readString("What is up");
    }
}
