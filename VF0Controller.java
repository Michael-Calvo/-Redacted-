/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veteranservice;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;

/**
 *
 * @author Richard
 */
public class VF0Controller extends MainController{
    
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField EmailTextField;
    @FXML
    private TextField AgeTextField;
    @FXML
    private ChoiceBox cb;
            

    @FXML
     public void foo() {

    }
     
     @FXML
     public String nameText() {
         String name = NameTextField.getText();
         return name;
     }
     
      @FXML
     public String emailText() {
         String email = EmailTextField.getText();
         return email;
     }
     
      @FXML
     public String ageText() {
         String age = AgeTextField.getText();
         return age;
     }
     
     @FXML
     public String ChoiceBox() {
         String cbvalue = cb.getValue().toString();
         return cbvalue;
     }
     
     
    @FXML
    public void next() throws IOException {
        String cb = ChoiceBox();
        String name = nameText();
        String email = emailText();
        String age = ageText();
        System.out.println(name + " " + email + " " + age + " " + cb);
        super.load("VF1ServiceBranchList");
        
    }
    
    
   
    
}
