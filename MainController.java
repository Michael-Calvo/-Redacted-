/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veteranservice;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Richard
 */


public class MainController implements Initializable {

    public static Stage currentStage;
    
    public void load(String _screen) throws IOException{
        
        Stage window = (Stage) currentStage.getScene().getWindow();
        //VBox window = FXMLLoader.load(getClass().getResource(_screen + ".fxml"));
        Parent root = FXMLLoader.load(getClass().getResource(_screen+".fxml"));

        Scene scene = new Scene(root);
        window.setScene(scene);
        window.show();
    }   
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
