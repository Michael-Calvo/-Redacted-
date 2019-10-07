/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veteranservice;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;

/**
 *
 * @author Richard
 */
public class VF6Controller extends MainController{
    
    @FXML private CheckBox Disabilities;
    @FXML private CheckBox Substances;
    
    public void next() throws IOException {
        super.load("VF7AdditionalInfo");
        CheckBoxMethod();
    }
    
    public String CheckBoxMethod(){
        List<String> al = new LinkedList<String>();
        String ans = "";
        if(Disabilities.isSelected()){
            ans = "yes";
            al.add(ans);
        }
        else{
            ans="no";
        }
        
        if(Substances.isSelected()){
            ans = "yes";
            al.add(ans);
        }
                else{
            ans="no";
        }

        String arr = al.toString();
        return arr;
    }
    
    
    
}
