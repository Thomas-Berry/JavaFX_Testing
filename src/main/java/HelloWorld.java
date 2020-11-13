import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class HelloWorld extends Application {
    

    @Override
    public void start(Stage stage) throws Exception {

        Pane root = new Pane();

        Scene scene = new Scene(root, 1024, 768);

        stage.setTitle("Hello World");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
        Button myButton = new Button("Click me!");
        myButton.setPrefSize(100, 35);
        myButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Information Dialog");
                alert.setHeaderText("yeet");
                alert.setContentText("Wow, you clicked the button with style!");
                alert.showAndWait();
            }
        });
        root.getChildren().add(myButton);
        myButton.setLayoutX(450);
        myButton.setLayoutY(300);
    }

    private void doSomething(ActionEvent ae) {
    }

    public static void main(String[] args) {
        launch(args);
    }

    ;
}

