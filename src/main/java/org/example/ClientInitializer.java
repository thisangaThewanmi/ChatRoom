package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class ClientInitializer extends Application {

    public static void main(String[] args) {
     launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/veiw/client.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("clientForm");
        stage.show();

    }
}
