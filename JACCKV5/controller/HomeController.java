package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class HomeController implements Initializable{

    @FXML
    ImageView img1, img2;

    @FXML
    Button button1, button2;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

     @FXML
    private AnchorPane scenepane; 

    @FXML
    Label namelabel;

    FXMLLoader loader;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO Auto-generated method stub
        namelabel.setText(LoginController.username);
    }

    // Goes to Checkout.fxml
    public void gotoplant(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Plants.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

        // Goes to Checkout.fxml
    public void gotocart(ActionEvent event) throws IOException {

        // Load items to cart before switching to checkout page
        LoginController.checkoutController.showItems(LoginController.cart.getItemList());

        // Set initial total amount in checkout page
        LoginController.checkoutController.getInitialAmount();

        Scene scene = new Scene(LoginController.homeRoot);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
        // Alert alert1 = new Alert(AlertType.INFORMATION );
        // alert1.setTitle("Information");
        // alert1.setHeaderText("Your cart is still empty");
        // alert1.show();
    }
    
    public void gotolight(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Lights.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
         public void logout(ActionEvent event) {

        Alert alert = new Alert(AlertType.CONFIRMATION  );
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to leave JACCK.");
        alert.setContentText("Do you wish to stop shopping? ");
  
            // Load the app icon
        Image appIcon = new Image("images/JACCK-removebg-preview.png");
        ImageView imageView = new ImageView(appIcon);
        imageView.setFitWidth(48); // Set the desired width of the icon
        imageView.setFitHeight(48); // Set the desired height of the icon

        // Set the app icon as the graphic of the alert dialog
        alert.setGraphic(imageView);

        if (alert.showAndWait().get() == ButtonType.OK) {
            System.out.println("You have successfully logged out.");
            stage.close();
        }
    }
}
        

