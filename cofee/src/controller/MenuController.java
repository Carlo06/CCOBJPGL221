package controller;

import stocks.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.lang.model.util.ElementScanner14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import alert.PopupMessage;

public class MenuController implements Initializable {


    @FXML
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12, 
    button13, button14, button15, button16, button17, button18, button19, button20, button21, button22, button23, button24, cartbutton;

    @FXML
    private Stage stage;

    @FXML
    private Scene scene;

    @FXML
    private Parent root = null;

    FXMLLoader loader;

    @FXML
    CheckoutController checkoutController = null;


    static Espresso esp = new Espresso();
    static Cappucino capp = new Cappucino();
    static Americano amar = new Americano();
    static HotChocolate hot= new HotChocolate();
    static Latte latt = new Latte();
    static ChocolateFrappe choc= new ChocolateFrappe();
    static VanilaOreo vani = new VanilaOreo();
    static MilkShake milk = new MilkShake();
    static Croissant croi = new Croissant();
    static CarrotCake carr = new CarrotCake();
    static StrawberryChesscake straw = new StrawberryChesscake();
    static Cookies coo = new Cookies();




    @Override
    public void initialize(URL location, ResourceBundle resources) {


        try {
            loader = new FXMLLoader(getClass().getResource("/view/Checkout.fxml"));
            root = loader.load();
        } catch (Exception e) {
            // 
        }

        // Clears all items in Checkout.fxml
      
    }
   //------------------------ ORDER ADD TO CART -----------------------//
    public void buy(ActionEvent event) throws IOException {

        PopupMessage.showSimpleAlert("View your order", "Item added!");

        Button sourceButton = (Button) event.getSource();

        // If addtocart button is pressed, set product status to true
        if (sourceButton.equals(button1)) {
            amar.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane1);
        }

        else if (sourceButton == button2) {
            capp.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane2);
        }

        else if (sourceButton == button3) {
            carr.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane3);
        }

        else if (sourceButton == button4) {
            choc.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane4);
        }

        else if (sourceButton == button5) {
            coo.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane5);
        }

        else if (sourceButton == button6) {
            croi.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane6);
        }

        else if (sourceButton == button7) {
            esp.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane7);
        }

        else if (sourceButton == button8) {
            hot.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane8);
        }

        else if (sourceButton == button9) {
            latt.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane9);
        }

        else if (sourceButton == button10) {
            milk.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane10);
        }

        else if (sourceButton == button11) {
            straw.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane11);
        }

        else if (sourceButton == button12) {
            vani.setProductStatus(true);
            checkoutController.addItem(checkoutController.pane12);
        }
    }

        //-----------------Description-----------------------//
    public void description(ActionEvent event) throws IOException {

        Button sourceButton = (Button) event.getSource(); 

        if (sourceButton.equals(button13)) {
            esp.showDescriptionMessage(true);
            PopupMessage.showDescriptionMessage("DESCRIPTION OF YOUR ORDER");
        }

        else if(sourceButton.equals(button14)) {
            capp.showDescriptionMessage(true);    
            PopupMessage.showDescriptionMessage2("DESCRIPTION OF YOUR ORDER");
        }
        
        else if(sourceButton.equals(button15)) {
            amar.showDescriptionMessage(true); 
            PopupMessage.showDescriptionMessage3("DESCRIPTION OF YOUR ORDER");   
        }

        else if(sourceButton.equals(button16)) {
            hot.showDescriptionMessage(true);    
            PopupMessage.showDescriptionMessage4("DESCRIPTION OF YOUR ORDER");
        }

        else if(sourceButton.equals(button17)) {
            latt.showDescriptionMessage(true);   
            PopupMessage.showDescriptionMessage5("DESCRIPTION OF YOUR ORDER"); 
        }

        else if(sourceButton.equals(button18)) {
            choc.showDescriptionMessage(true); 
            PopupMessage.showDescriptionMessage6("DESCRIPTION OF YOUR ORDER");    
        }
        else if(sourceButton.equals(button19)) {
            vani.showDescriptionMessage(true);
            PopupMessage.showDescriptionMessage7("DESCRIPTION OF YOUR ORDER");    
        }
        else if(sourceButton.equals(button20)) {
            milk.showDescriptionMessage(true); 
            PopupMessage.showDescriptionMessage8("DESCRIPTION OF YOUR ORDER");   
        }
        else if(sourceButton.equals(button21)) {
            croi.showDescriptionMessage(true); 
            PopupMessage.showDescriptionMessage9("DESCRIPTION OF YOUR ORDER");   
        }
        else if(sourceButton.equals(button22)) {
            carr.showDescriptionMessage(true);  
            PopupMessage.showDescriptionMessage10("DESCRIPTION OF YOUR ORDER");  
        }
        else if(sourceButton.equals(button23)) {
            straw.showDescriptionMessage(true);  
            PopupMessage.showDescriptionMessage11("DESCRIPTION OF YOUR ORDER");  
        }
        else if(sourceButton.equals(button24)) {
            coo.showDescriptionMessage(true); 
            PopupMessage.showDescriptionMessage12("DESCRIPTION OF YOUR ORDER");  
        }
    }

    // Goes to Checkout.fxml

    public void gotocheckout(ActionEvent event) throws IOException {

        Scene scene = new Scene(root);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}