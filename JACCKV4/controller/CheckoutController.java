package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane9, pane10, pane11, pane12, pane13, pane14;

    @FXML
    VBox myvbox;

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, name14, name15, name16, 
    price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, price12, price13, price14, price15, price16, total;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12, img13, img14, img15, img16;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7, choicebox8, choicebox9, choicebox10, choicebox11, choicebox12, choicebox13,
    choicebox14, choicebox15, choicebox16;

    private String[] quantity = { "1", "2", "3" };


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        name1.setText(LoginController.bdress.getProductName());
        price1.setText(Double.toString(LoginController.bdress.getProductPrice()));
        Image bedroomLamp = new Image(LoginController.bdress.getProductImage());
        img1.setImage(bedroomLamp);

        name2.setText(LoginController.cap.getProductName());
        price2.setText(Double.toString(LoginController.cap.getProductPrice()));
        Image ceilinglamp = new Image(LoginController.cap.getProductImage());
        img2.setImage(ceilinglamp);

        name3.setText(LoginController.bshoes.getProductName());
        price3.setText(Double.toString(LoginController.bshoes.getProductPrice()));
        Image walllamp = new Image(LoginController.bshoes.getProductImage());
        img3.setImage(walllamp);

        name4.setText(LoginController.bbucket.getProductName());
        price4.setText(Double.toString(LoginController.bbucket.getProductPrice()));
        Image Beige = new Image(LoginController.bbucket.getProductImage());
        img4.setImage(Beige);

        name5.setText(LoginController.csleeve.getProductName());
        price5.setText(Double.toString(LoginController.csleeve.getProductPrice()));
        Image cargoSleeve = new Image(LoginController.csleeve.getProductImage());
        img5.setImage(cargoSleeve);

        name6.setText(LoginController.mdress.getProductName());
        price6.setText(Double.toString(LoginController.mdress.getProductPrice()));
        Image Dress = new Image(LoginController.mdress.getProductImage());
        img6.setImage(Dress);

        //PLANTS

        name9.setText(LoginController.bshirt.getProductName());
        price9.setText(Double.toString(LoginController.bshirt.getProductPrice()));
        Image bedroomPlant = new Image(LoginController.bshirt.getProductImage());
        img9.setImage(bedroomPlant);

        name10.setText(LoginController.btshirt.getProductName());
        price10.setText(Double.toString(LoginController.btshirt.getProductPrice()));
        Image Plant = new Image(LoginController.btshirt.getProductImage());
        img10.setImage(Plant);

        name11.setText(LoginController.dthoodie.getProductName());
        price11.setText(Double.toString(LoginController.dthoodie.getProductPrice()));
        Image Planting = new Image(LoginController.dthoodie.getProductImage());
        img11.setImage(Planting);

        name12.setText(LoginController.fpshirtpants.getProductName());
        price12.setText(Double.toString(LoginController.fpshirtpants.getProductPrice()));
        Image shirtPants = new Image(LoginController.fpshirtpants.getProductImage());
        img12.setImage(shirtPants);

        name13.setText(LoginController.fjeans.getProductName());
        price13.setText(Double.toString(LoginController.fjeans.getProductPrice()));
        Image jeansImage = new Image(LoginController.fjeans.getProductImage());
        img13.setImage(jeansImage);

        name14.setText(LoginController.ssweater.getProductName());
        price14.setText(Double.toString(LoginController.ssweater.getProductPrice()));
        Image sweaterImage = new Image(LoginController.ssweater.getProductImage());
        img14.setImage(sweaterImage);


        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");
        choicebox5.setValue("1");
        choicebox6.setValue("1");
        choicebox9.setValue("1");
        choicebox10.setValue("1");
        choicebox11.setValue("1");
        choicebox12.setValue("1");
        choicebox13.setValue("1");
        choicebox14.setValue("1");


        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);
        choicebox5.getItems().addAll(quantity);
        choicebox6.getItems().addAll(quantity);
        choicebox9.getItems().addAll(quantity);
        choicebox10.getItems().addAll(quantity);
        choicebox11.getItems().addAll(quantity);
        choicebox12.getItems().addAll(quantity);
        choicebox13.getItems().addAll(quantity);
        choicebox14.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);
        choicebox5.setOnAction(this::computeTotal);
        choicebox6.setOnAction(this::computeTotal);
        choicebox9.setOnAction(this::computeTotal);
        choicebox10.setOnAction(this::computeTotal);
        choicebox11.setOnAction(this::computeTotal);
        choicebox12.setOnAction(this::computeTotal);
        choicebox13.setOnAction(this::computeTotal);
        choicebox14.setOnAction(this::computeTotal);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item9Amount = 0;
        double item10Amount = 0;
        double item11Amount = 0;
        double item12Amount = 0;
        double item13Amount = 0;
        double item14Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (LoginController.bdress.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            LoginController.bdress.setProductQuantity(qty);
            item1Amount = LoginController.bdress.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = LoginController.bdress.getProductPrice() * qty;
            }
        }

        if (LoginController.cap.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            LoginController.cap.setProductQuantity(qty);
            item2Amount = LoginController.cap.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = LoginController.cap.getProductPrice() * qty;
            }
        }

        if (LoginController.bshoes.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            LoginController.bshoes.setProductQuantity(qty);
            item3Amount = LoginController.bshoes.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = LoginController.bshoes.getProductPrice() * qty;
            }
        }

        if (LoginController.bbucket.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            LoginController.bbucket.setProductQuantity(qty);
            item4Amount = LoginController.bbucket.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = LoginController.bbucket.getProductPrice() * qty;
            }
        }

        if (LoginController.csleeve.getProductStatus()) {

            double qty = Double.parseDouble(choicebox5.getValue());
            LoginController.csleeve.setProductQuantity(qty);
            item5Amount = LoginController.csleeve.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = LoginController.csleeve.getProductPrice() * qty;
            }
        }

        if (LoginController.mdress.getProductStatus()) {

            double qty = Double.parseDouble(choicebox6.getValue());
            LoginController.mdress.setProductQuantity(qty);
            item6Amount = LoginController.mdress.getProductPrice() * qty;

            if (source == choicebox6) {
                item6Amount = LoginController.mdress.getProductPrice() * qty;
            }
        }


        if (LoginController.bshirt.getProductStatus()) {

            double qty = Double.parseDouble(choicebox9.getValue());
            LoginController.bshirt.setProductQuantity(qty);
            item9Amount = LoginController.bshirt.getProductPrice() * qty;

            if (source == choicebox9) {
                item9Amount = LoginController.bshirt.getProductPrice() * qty;
            }
        }

        if (LoginController.btshirt.getProductStatus()) {

            double qty = Double.parseDouble(choicebox10.getValue());
            LoginController.btshirt.setProductQuantity(qty);
            item10Amount = LoginController.btshirt.getProductPrice() * qty;

            if (source == choicebox10) {
                item10Amount = LoginController.bshirt.getProductPrice() * qty;
            }
        }

        if (LoginController.dthoodie.getProductStatus()) {

            double qty = Double.parseDouble(choicebox11.getValue());
            LoginController.dthoodie.setProductQuantity(qty);
            item11Amount = LoginController.dthoodie.getProductPrice() * qty;

            if (source == choicebox11) {
                item11Amount = LoginController.dthoodie.getProductPrice() * qty;
            }
        }

        if (LoginController.fpshirtpants.getProductStatus()) {

            double qty = Double.parseDouble(choicebox12.getValue());
            LoginController.fpshirtpants.setProductQuantity(qty);
            item12Amount = LoginController.fpshirtpants.getProductPrice() * qty;

            if (source == choicebox12) {
                item12Amount = LoginController.fpshirtpants.getProductPrice() * qty;
            }
        }

        if (LoginController.fjeans.getProductStatus()) {

            double qty = Double.parseDouble(choicebox13.getValue());
            LoginController.fjeans.setProductQuantity(qty);
            item13Amount = LoginController.fjeans.getProductPrice() * qty;

            if (source == choicebox13) {
                item13Amount = LoginController.fjeans.getProductPrice() * qty;
            }
        }

        if (LoginController.ssweater.getProductStatus()) {

            double qty = Double.parseDouble(choicebox14.getValue());
            LoginController.ssweater.setProductQuantity(qty);
            item14Amount = LoginController.ssweater.getProductPrice() * qty;

            if (source == choicebox14) {
                item14Amount = LoginController.ssweater.getProductPrice() * qty;
            }
        }

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item9Amount + item10Amount + item11Amount + item12Amount + item13Amount + item14Amount;

        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    // Computes initial Amount before modifying item quantity
    public void getInitialAmount() {

        double totalAmount = 0.00;

        if (LoginController.bdress.getProductStatus()) {
            totalAmount += LoginController.bdress.getProductPrice();
        }

        if (LoginController.cap.getProductStatus()) {
            totalAmount += LoginController.cap.getProductPrice();
        }

        if (LoginController.bshoes.getProductStatus()) {
            totalAmount += LoginController.bshoes.getProductPrice();
        }

        if (LoginController.bbucket.getProductStatus()) {
            totalAmount += LoginController.bbucket.getProductPrice();
        }

        if (LoginController.csleeve.getProductStatus()) {
            totalAmount += LoginController.csleeve.getProductPrice();
        }

        if (LoginController.mdress.getProductStatus()) {
            totalAmount += LoginController.mdress.getProductPrice();
        }

        if (LoginController.bshirt.getProductStatus()) {
            totalAmount += LoginController.bshirt.getProductPrice();
        }

        if (LoginController.dthoodie.getProductStatus()) {
            totalAmount += LoginController.dthoodie.getProductPrice();
        } 

        if (LoginController.fpshirtpants.getProductStatus()) {
            totalAmount += LoginController.fpshirtpants.getProductPrice();
        }

        if (LoginController.fjeans.getProductStatus()) {
            totalAmount += LoginController.fjeans.getProductPrice();
        }

        if (LoginController.ssweater.getProductStatus()) {
            totalAmount += LoginController.ssweater.getProductPrice();
        }
        

        total.setText(Double.toString(totalAmount));
    }

    // Go to Receipt Page
    public void checkout(ActionEvent event) throws IOException {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    // Show all items in ArrayList
    public void showItems(ArrayList<Pane> itemList) {
        for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }
}
