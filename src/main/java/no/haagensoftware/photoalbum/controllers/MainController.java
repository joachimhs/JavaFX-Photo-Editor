package no.haagensoftware.photoalbum.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by jhsmbp on 07/10/15.
 */
public class MainController implements Initializable {
    private static Logger logger = Logger.getLogger(MainController.class.getName());
    private Stage primaryStage;

    @FXML
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void setupUi() {

    }


    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }
}
