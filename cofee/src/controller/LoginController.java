package controller;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController {

    public static Object amar;

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    @FXML
    MenuController menuController = null;

    public void login(ActionEvent event) throws IOException {

        String username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("admin") && password.equals("admin")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Menu.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } else {
            mywarninglabel.setVisible(false);
        }
    }
}
