package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;


public class CheckoutController implements Initializable {

    @FXML
    Pane pane1, pane2, pane3, pane4, pane5, pane6, pane7, pane8, pane9, pane10, pane11, pane12;

    @FXML
    VBox myvbox;
    
    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    Label name1, name2, name3, name4, name5, name6, name7, name8, name9, name10, name11, name12, name13, 
    price1, price2, price3, price4, price5, price6, price7, price8, price9, price10, price11, price12, price13, total;

    @FXML
    ImageView img1, img2, img3, img4, img5, img6, img7, img8, img9, img10, img11, img12,img13;
     
    @FXML
    Button checkout;

    @FXML
    private ChoiceBox<String> choicebox1, choicebox2, choicebox3, choicebox4, choicebox5, choicebox6, choicebox7, choicebox8, choicebox9, choicebox10, choicebox11, choicebox12,choicebox13;

    private String[] quantity = { "1", "2", "3" };



    @Override
    public void initialize(URL location, ResourceBundle resources){

        name1.setText(MenuController.amar.getProductName());
        price1.setText(Double.toString(MenuController.amar.getProductPrice()));
        Image bedroomLamp = new Image(MenuController.amar.getProductImage());
        img1.setImage(bedroomLamp);

        name2.setText(MenuController.capp.getProductName());
        price2.setText(Double.toString(MenuController.capp.getProductPrice()));
        Image ceilinglamp = new Image(MenuController.capp.getProductImage());
        img2.setImage(ceilinglamp);

        name3.setText(MenuController.carr.getProductName());
        price3.setText(Double.toString(MenuController.carr.getProductPrice()));
        Image walllamp = new Image(MenuController.carr.getProductImage());
        img3.setImage(walllamp);

        name4.setText(MenuController.hot.getProductName());
        price4.setText(Double.toString(MenuController.hot.getProductPrice()));
        Image hotImg = new Image(MenuController.hot.getProductImage());
        img4.setImage(hotImg);

        name5.setText(MenuController.latt.getProductName());
        price5.setText(Double.toString(MenuController.latt.getProductPrice()));
        Image lattImg = new Image(MenuController.latt.getProductImage());
        img5.setImage(lattImg);

        name6.setText(MenuController.choc.getProductName());
        price6.setText(Double.toString(MenuController.choc.getProductPrice()));
        Image chocImg = new Image(MenuController.choc.getProductImage());
        img6.setImage(chocImg);

        name7.setText(MenuController.vani.getProductName());
        price7.setText(Double.toString(MenuController.vani.getProductPrice()));
        Image vanImg = new Image(MenuController.vani.getProductImage());
        img7.setImage(vanImg);

        name8.setText(MenuController.milk.getProductName());
        price8.setText(Double.toString(MenuController.milk.getProductPrice()));
        Image milImg = new Image(MenuController.milk.getProductImage());
        img8.setImage(milImg);

        name9.setText(MenuController.croi.getProductName());
        price9.setText(Double.toString(MenuController.croi.getProductPrice()));
        Image croiImg = new Image(MenuController.croi.getProductImage());
        img9.setImage(croiImg);

        name10.setText(MenuController.carr.getProductName());
        price10.setText(Double.toString(MenuController.carr.getProductPrice()));
        Image carrImg = new Image(MenuController.carr.getProductImage());
        img10.setImage(carrImg);

        name11.setText(MenuController.straw.getProductName());
        price11.setText(Double.toString(MenuController.straw.getProductPrice()));
        Image berryImg = new Image(MenuController.straw.getProductImage());
        img11.setImage(berryImg);

        name12.setText(MenuController.coo.getProductName());
        price12.setText(Double.toString(MenuController.coo.getProductPrice()));
        Image cookImg = new Image(MenuController.coo.getProductImage());
        img12.setImage(cookImg);







        // Set default quantities in choicebox to 1
        choicebox1.setValue("1");
        choicebox2.setValue("1");
        choicebox3.setValue("1");
        choicebox4.setValue("1");
        choicebox5.setValue("1");
        choicebox6.setValue("1");
        choicebox7.setValue("1");
        choicebox8.setValue("1");
        choicebox9.setValue("1");
        choicebox10.setValue("1");
        choicebox11.setValue("1");
        choicebox12.setValue("1");

        // Insert quantity array to choicebox
        choicebox1.getItems().addAll(quantity);
        choicebox2.getItems().addAll(quantity);
        choicebox3.getItems().addAll(quantity);
        choicebox4.getItems().addAll(quantity);
        choicebox5.getItems().addAll(quantity);
        choicebox6.getItems().addAll(quantity);
        choicebox7.getItems().addAll(quantity);
        choicebox8.getItems().addAll(quantity);
        choicebox9.getItems().addAll(quantity);
        choicebox10.getItems().addAll(quantity);
        choicebox11.getItems().addAll(quantity);
        choicebox12.getItems().addAll(quantity);

        // Add event handler on all choiceboxes
        choicebox1.setOnAction(this::computeTotal);
        choicebox2.setOnAction(this::computeTotal);
        choicebox3.setOnAction(this::computeTotal);
        choicebox4.setOnAction(this::computeTotal);
        choicebox5.setOnAction(this::computeTotal);
        choicebox6.setOnAction(this::computeTotal);
        choicebox7.setOnAction(this::computeTotal);
        choicebox8.setOnAction(this::computeTotal);
        choicebox9.setOnAction(this::computeTotal);
        choicebox10.setOnAction(this::computeTotal);
        choicebox11.setOnAction(this::computeTotal);
        choicebox12.setOnAction(this::computeTotal);
       
    }

    public void addItem(Pane pane) {
        myvbox.getChildren().add(pane);
    }

    public void computeTotal(ActionEvent event) {

        double totalAmount = 0;
        double item1Amount = 0;
        double item2Amount = 0;
        double item3Amount = 0;
        double item4Amount = 0;
        double item5Amount = 0;
        double item6Amount = 0;
        double item7Amount = 0;
        double item8Amount = 0;
        double item9Amount = 0;
        double item10Amount = 0;
        double item11Amount = 0;
        double item12Amount = 0;

        ChoiceBox source = (ChoiceBox) event.getSource();

        // If product is chosen, compute item amount
        if (MenuController.amar.getProductStatus()) {

            double qty = Double.parseDouble(choicebox1.getValue());
            MenuController.amar.setProductQuantity(qty);
            item1Amount = MenuController.amar.getProductPrice() * qty;

            if (source == choicebox1) {
                item1Amount = MenuController.amar.getProductPrice() * qty;
            }
        }

        if (MenuController.capp.getProductStatus()) {

            double qty = Double.parseDouble(choicebox2.getValue());
            MenuController.capp.setProductQuantity(qty);
            item2Amount = MenuController.capp.getProductPrice() * qty;

            if (source == choicebox2) {
                item2Amount = MenuController.capp.getProductPrice() * qty;
            }
        }

        if (MenuController.carr.getProductStatus()) {

            double qty = Double.parseDouble(choicebox3.getValue());
            MenuController.carr.setProductQuantity(qty);
            item3Amount = MenuController.carr.getProductPrice() * qty;

            if (source == choicebox3) {
                item3Amount = MenuController.carr.getProductPrice() * qty;
            }
        }

        if (MenuController.choc.getProductStatus()) {

            double qty = Double.parseDouble(choicebox4.getValue());
            MenuController.choc.setProductQuantity(qty);
            item4Amount = MenuController.choc.getProductPrice() * qty;

            if (source == choicebox4) {
                item4Amount = MenuController.choc.getProductPrice() * qty;
            }
        }

        if (MenuController.coo.getProductStatus()) {

            double qty = Double.parseDouble(choicebox5.getValue());
            MenuController.coo.setProductQuantity(qty);
            item5Amount = MenuController.coo.getProductPrice() * qty;

            if (source == choicebox5) {
                item5Amount = MenuController.coo.getProductPrice() * qty;
            }
        }

        if (MenuController.croi.getProductStatus()) {

            double qty = Double.parseDouble(choicebox6.getValue());
            MenuController.croi.setProductQuantity(qty);
            item6Amount = MenuController.croi.getProductPrice() * qty;

            if (source == choicebox6) {
                item6Amount = MenuController.croi.getProductPrice() * qty;
            }
        }


        if (MenuController.esp.getProductStatus()) {

            double qty = Double.parseDouble(choicebox7.getValue());
            MenuController.esp.setProductQuantity(qty);
            item7Amount = MenuController.esp.getProductPrice() * qty;

            if (source == choicebox7) {
                item7Amount = MenuController.esp.getProductPrice() * qty;
            }
        }

        if (MenuController.hot.getProductStatus()) {

            double qty = Double.parseDouble(choicebox8.getValue());
            MenuController.hot.setProductQuantity(qty);
            item8Amount = MenuController.hot.getProductPrice() * qty;

            if (source == choicebox8) {
                item8Amount = MenuController.hot.getProductPrice() * qty;
            }
        }

        if (MenuController.latt.getProductStatus()) {

            double qty = Double.parseDouble(choicebox9.getValue());
            MenuController.latt.setProductQuantity(qty);
            item9Amount = MenuController.latt.getProductPrice() * qty;

            if (source == choicebox9) {
                item9Amount = MenuController.latt.getProductPrice() * qty;
            }
        }

        if (MenuController.milk.getProductStatus()) {

            double qty = Double.parseDouble(choicebox10.getValue());
            MenuController.milk.setProductQuantity(qty);
            item10Amount = MenuController.milk.getProductPrice() * qty;

            if (source == choicebox10) {
                item10Amount = MenuController.milk.getProductPrice() * qty;
            }
        }

        if (MenuController.straw.getProductStatus()) {

            double qty = Double.parseDouble(choicebox11.getValue());
            MenuController.straw.setProductQuantity(qty);
            item11Amount = MenuController.straw.getProductPrice() * qty;

            if (source == choicebox11) {
                item11Amount = MenuController.straw.getProductPrice() * qty;
            }
        }

        if (MenuController.vani.getProductStatus()) {

            double qty = Double.parseDouble(choicebox12.getValue());
            MenuController.vani.setProductQuantity(qty);
            item12Amount = MenuController.vani.getProductPrice() * qty;

            if (source == choicebox12) {
                item12Amount = MenuController.vani.getProductPrice() * qty;
            }
        }


        

        // Compute total amount for all items chosen
        totalAmount = item1Amount + item2Amount + item3Amount + item4Amount + item5Amount + item6Amount + item7Amount + item8Amount + item9Amount + item10Amount + item11Amount + item12Amount;
        // Display total amount in total label
        total.setText(Double.toString(totalAmount));
    }

    public void getInitialAmount() {

        double totalAmount = 0.00;

        if (MenuController.amar.getProductStatus()) {
            totalAmount += MenuController.amar.getProductPrice();
        }

        if (MenuController.capp.getProductStatus()) {
            totalAmount += MenuController.capp.getProductPrice();
        }

        if (MenuController.carr.getProductStatus()) {
            totalAmount += MenuController.carr.getProductPrice();
        }

        if (MenuController.choc.getProductStatus()) {
            totalAmount += MenuController.choc.getProductPrice();
        }

        if (MenuController.coo.getProductStatus()) {
            totalAmount += MenuController.coo.getProductPrice();
        }

        if (MenuController.croi.getProductStatus()) {
            totalAmount += MenuController.croi.getProductPrice();
        }

        if (MenuController.esp.getProductStatus()) {
            totalAmount += MenuController.esp.getProductPrice();
        }

        if (MenuController.hot.getProductStatus()) {
            totalAmount += MenuController.hot.getProductPrice();
        } 

        if (MenuController.latt.getProductStatus()) {
            totalAmount += MenuController.latt.getProductPrice();
        }

        if (MenuController.milk.getProductStatus()) {
            totalAmount += MenuController.milk.getProductPrice();
        }

        if (MenuController.straw.getProductStatus()) {
            totalAmount += MenuController.straw.getProductPrice();
        }
        

        total.setText(Double.toString(totalAmount));
    }

    public void gotoOrder(ActionEvent event) throws IOException {

        loader = new FXMLLoader(getClass().getResource("/view/Receipt.fxml"));
        root = loader.load();
        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();

        
}

public void showItems(ArrayList<Pane> itemList) {
         for (Pane p : itemList) {
            myvbox.getChildren().add(p);
        }
    }
}
    
    
