package com.example.teacher_panel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.controlsfx.control.action.ActionGroup;

import java.io.IOException;

public class CreateAccountController {


    private FXMLLoader loader;

    @FXML
    private TextField firstName,lastName,email,userName,password,confirmPassword;

    @FXML
    private Button registerButton;
    @FXML
    private void showLoginStage() throws IOException {
        Stage stage = (Stage) registerButton.getScene().getWindow();
        stage.close();

        Parent root = FXMLLoader.load(getClass().getResource("login_fragment.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("User Login");
        //stage.getIcons().add(new Image("/assets/pngegg.png"));
        stage.show();
    }
    @FXML
    private void signInUser(){
        String  em = email.getText();
        String pass = password.getText();
        if (em.isEmpty() && pass.isEmpty()){

        }
        else {

        }
    }

}
