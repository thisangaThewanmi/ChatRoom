package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

import java.io.BufferedReader;
import java.io.File;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientFormController {

    public Label txtUsername;
    public VBox mainContainor;
    public TextField txtFeild;
    public ImageView btnSend;

    PrintWriter writer;

    BufferedReader reader;
    Socket socket;

    private FileChooser fileChooser;
    private File filePath;


    public void initialize(){
        txtUsername.setText(LoginPageController.username);

    }

    public void btnSendOnAction(ActionEvent actionEvent) {


    }
}
