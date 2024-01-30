package lk.ijse.controller;

import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController extends Application {
    public JFXTextField txtUsername;

    public static String username;

    public void AddUser(ActionEvent actionEvent) throws IOException {
        username = txtUsername.getText();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/veiw/client.fxml"))));
        stage.setTitle(username +"'s chat room");

        stage.show();
        txtUsername.clear();

    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/veiw/LoginPage.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("lOGIN PAGE");
        stage.show();

        new Thread(() -> {

            ServerFormController serverFormController = new ServerFormController();



                try {
                    serverFormController.Server();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


        }).start();

    }
}
