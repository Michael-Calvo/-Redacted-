/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veteranservice;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author Richard
 */
public class VF0Controller extends MainController implements MouseListener{
    
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField EmailTextField;
    @FXML
    private TextField AgeTextField;
    
    @FXML
    private AnchorPane ap;
    
    @FXML
    private VBox vb;

    @FXML
    private CheckBox cb1;
    
    @FXML
    private CheckBox cb2;
    
    @FXML
    private CheckBox cb3;
    
    static boolean isStillOnSlide = true;
    
    
    @FXML
    public String CheckBoxMethod(){
        String ans = "";
        if(cb1.isSelected()){
            ans = "Male";
        }
        
        if(cb2.isSelected()){
            ans = "Female";
        }
        
        if(cb3.isSelected()){
            ans = "Other";
        }
        return ans;
    }
    
     @FXML
    public void next() throws IOException {
        String ans = CheckBoxMethod();
        String name = nameText();
        String email = emailText();
        String age = ageText();
        System.out.println(name + " " + email + " " + age + " " + ans);
        //isStillOnSlide = false;
        CheckBoxMethod();
        super.load("VF1ServiceBranchList");
        
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

    @Override
    public void mouseClicked(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent me) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 

   
    
}
