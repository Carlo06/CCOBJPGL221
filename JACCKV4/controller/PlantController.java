package controller;

import model.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.Action;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import alert.AlertMaker;

public class PlantController implements Initializable {

    @FXML
    Label name1, name2, name3, name4, name5, name6, price1, price2, price3, price4, price5, price6;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6;

    @FXML
    Button button1, button2, button3, button4, button5, button6, cartbutton, homebutton, logoutbutton;

    @FXML
    private AnchorPane scenepane; 

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

  

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== BASEBALL PRINT SHIRT ==================//

        name1.setText(LoginController.bshirt.getProductName());
        price1.setText(Double.toString(LoginController.bshirt.getProductPrice()));
        Image baseballShirt = new Image(LoginController.bshirt.getProductImage());
        img1.setImage(baseballShirt);

        // ============== BOTTOM SHIRT ==================//

        name2.setText(LoginController.btshirt.getProductName());
        price2.setText(Double.toString(LoginController.btshirt.getProductPrice()));
        Image bottomShirt = new Image(LoginController.btshirt.getProductImage());
        img2.setImage(bottomShirt);

        // ============== MUSHROOM DRAWSTRING HOODIE ==================//

        name3.setText(LoginController.dthoodie.getProductName());
        price3.setText(Double.toString(LoginController.dthoodie.getProductPrice()));
        Image drawstringHoodie = new Image(LoginController.dthoodie.getProductImage());
        img3.setImage(drawstringHoodie);

        // ============== FLAP POCKET SHIRT AND PANTS ==================//

        name4.setText(LoginController.fpshirtpants.getProductName());
        price4.setText(Double.toString(LoginController.fpshirtpants.getProductPrice()));
        Image flapShirtPants = new Image(LoginController.fpshirtpants.getProductImage());
        img4.setImage(flapShirtPants);

        // ============== SKULL FLORAL PRINT WIDE LEG JEANS ==================//

        name5.setText(LoginController.fjeans.getProductName());
        price5.setText(Double.toString(LoginController.fjeans.getProductPrice()));
        Image floralJeans = new Image(LoginController.fjeans.getProductImage());
        img5.setImage(floralJeans);

        // ============== SHOULDER SWEATER ==================//

        name6.setText(LoginController.ssweater.getProductName());
        price6.setText(Double.toString(LoginController.ssweater.getProductPrice()));
        Image shoulderSweater = new Image(LoginController.ssweater.getProductImage());
        img6.setImage(shoulderSweater);
    }

    

    public void buy(ActionEvent event) throws IOException {

        AlertMaker.showSimpleAlert("hello", "item added");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            LoginController.bshirt.setProductStatus(true);
            LoginController.bshirt.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane9);
        }

        if (sourceButton.equals(button2)) {
            LoginController.btshirt.setProductStatus(true);
            LoginController.btshirt.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane10);
        }

        if (sourceButton.equals(button3)) {
            LoginController.dthoodie.setProductStatus(true);
            LoginController.dthoodie.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane11);
        }

        if (sourceButton.equals(button4)) {
            LoginController.fpshirtpants.setProductStatus(true);
            LoginController.fpshirtpants.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane12);
        }

        if (sourceButton.equals(button5)) {
            LoginController.fjeans.setProductStatus(true);
            LoginController.fjeans.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane13);
        }

        if (sourceButton.equals(button6)) {
            LoginController.ssweater.setProductStatus(true);
            LoginController.ssweater.setProductQuantity(1);
            LoginController.cart.addItem(LoginController.checkoutController.pane14);
        }



        

       
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
    }

    public void gotohome(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("/view/Home.fxml"));
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    public void logout(ActionEvent event) {

        Alert alert = new Alert(AlertType.CONFIRMATION  );
        alert.setTitle("Exit");
        alert.setHeaderText("You are about to leave JAACK.");
        alert.setContentText("Do you wish to stop shopping?: ");

        if (alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenepane.getScene().getWindow();
            System.out.println("You have successfully logged out.");
            stage.close();
        }


    }
}
