/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veteranservice;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Richard
 */
public class VF2Controller extends MainController{
    int whichChecked = 0;
    @FXML private CheckBox partTimeCheckBox;
    @FXML private CheckBox fullTimeCheckBox;
    @FXML private TextField yearsTextField;
    
    public void next() throws IOException{
        System.out.println(getTextField() + " " + getCheckedBox());
        super.load("VF3VeteranBenefits");
    }
    
    public void ifPartTimeIsPressed(){
        fullTimeCheckBox.setSelected(false);
        whichChecked = 1;
    }
    
    public void iffullTimeIsPressed(){
        partTimeCheckBox.setSelected(false);
        whichChecked = 2;
    }
    
    public String getCheckedBox(){
        String ans = "";
        if (whichChecked == 1){
            ans = "PartTime";
        }
        if (whichChecked== 2){
            ans = "FullTime";
        }
        return ans;
    }
    
    public String getTextField(){
        String ans = "";
        ans = yearsTextField.getText();
        return ans;
    }
    
    
    
}
