package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import model.BeigeDress;
import model.BeigeShoes;
import model.Cap;
import model.BeigeBucket;
import model.CargoSleeve;
import model.Cart;
import model.MiniDress;
import model.BaseballShirt;
import model.BottomShirt;
import model.DrawstringHoodie;
import model.FlapPocketShirtPants;
import model.FloralJeans;
import model.ShoulderSweater;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class LoginController implements Initializable {

    @FXML
    TextField mytextfield;

    @FXML
    PasswordField mypasswordfield;

    @FXML
    Button mybutton;

    @FXML
    Label mywarninglabel;

    @FXML
    HomeController homeController = null;

    @FXML
    static CheckoutController checkoutController = null;

    @FXML
    static Parent homeRoot = null;

    static String username;

    FXMLLoader loader;

    static BeigeDress bdress = new BeigeDress();
    static Cap cap = new Cap();
    static BeigeShoes bshoes = new BeigeShoes();
    static BeigeBucket bbucket = new BeigeBucket();
    static CargoSleeve csleeve = new CargoSleeve();
    static MiniDress mdress = new MiniDress();
    static BaseballShirt bshirt = new BaseballShirt();
    static BottomShirt btshirt = new BottomShirt();
    static DrawstringHoodie dthoodie = new DrawstringHoodie();
    static FlapPocketShirtPants fpshirtpants = new FlapPocketShirtPants();
    static FloralJeans fjeans = new FloralJeans();
    static ShoulderSweater ssweater = new ShoulderSweater();


    static Cart cart = new Cart();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        // ============== WOMEN PRODUCTS ==================/

        // ============== BEIGE DRESS ==================//
        bdress.setProductName("Beige Dress");
        bdress.setProductPrice(699.00);
        bdress.setProductImage("images/beige dress.jpg");
        // ============== CAP ==================//

        cap.setProductName("Cap");
        cap.setProductPrice(250.00);
        cap.setProductImage("images/cap.jpg");

        // ============== BEIGE SHOES ==================//
        bshoes.setProductName("Beige Shoes");
        bshoes.setProductPrice(2699.00);
        bshoes.setProductImage("images/beige shoes.jpg");

        // ============== BEIGE BUCKET ==================//
        bbucket.setProductName("Beige Bucket");
        bbucket.setProductPrice(300.00);
        bbucket.setProductImage("images/Bucket.png");
        
        // ============== CARGO SLEEVE ==================//
        csleeve.setProductName("Cargo Sleeve");
        csleeve.setProductPrice(500.00);
        csleeve.setProductImage("images/Cargo.PNG");

        // ============== MINI DRESS ==================//
        mdress.setProductName("Mini dress");
        mdress.setProductPrice(899.00);
        mdress.setProductImage("images/midi dress.PNG");


        // ============== MEN PRODUCTS ==================/

        // ============== BASEBALL SHIRT ==================/
        bshirt.setProductName("Baseball Shirt");
        bshirt.setProductPrice(499.00);
        bshirt.setProductImage("images/Graphic baseball shirt.png");

        // ============== BOTTOM SHIRT ==================/
        btshirt.setProductName("Front Bottom Shirt");
        btshirt.setProductPrice(799.00);
        btshirt.setProductImage("images/Bottom front shirt.png");

        // ============== MUSHROOM DRAWSTRING HOODIE ==================/
        dthoodie.setProductName("drawstring hoodie");
        dthoodie.setProductPrice(1500.00);
        dthoodie.setProductImage("images/Mushroom drawstring hoodie.png");

        // ============== FLAP POCKET SHIRT AND PANTS ==================/
        fpshirtpants.setProductName("Flap Pocket Shirt and Pants");
        fpshirtpants.setProductPrice(1999.00);
        fpshirtpants.setProductImage("images/Flap pocket shirt and pants.png");

        // ============== SKULL FLORAL PRINT WIDE LEG JEANS ==================/
        fjeans.setProductName("Skull Floral Print Wide Leg Jeans");
        fjeans.setProductPrice(1300.00);
        fjeans.setProductImage("images/Skull floral print wide leg jeans.png");

        // ============== SHOULDER SWEATER ==================/
        ssweater.setProductName("Half Zip Drops Shoulder Sweater");
        ssweater.setProductPrice(1300.00);
        ssweater.setProductImage("images/Half zip drops shoulder sweater.png");

        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            homeRoot = loader.load();

        } catch (Exception e) {
            e.printStackTrace();

        }

        // Clears all items in Checkout.fxml
        checkoutController = loader.getController();
        checkoutController.myvbox.getChildren().removeAll(checkoutController.myvbox.getChildren());
    }

    public void login(ActionEvent event) throws IOException {

        username = mytextfield.getText();
        String password = mypasswordfield.getText();

        if (username.equals("a") && password.equals("a")) {

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

            //Calls the method for getting the username to display
            FXMLLoader getName = new FXMLLoader(getClass().getResource("/view/Home.fxml"));
            root = getName.load();

        } else {
            mywarninglabel.setVisible(true);
        }
    }


    

}
