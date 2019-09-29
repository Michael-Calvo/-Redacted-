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
public class VF3Controller extends MainController{
    
    @FXML private CheckBox DC;
    @FXML private CheckBox CaT;
    @FXML private CheckBox None;
    @FXML private CheckBox Housing;
    
    public void next() throws IOException {
        super.load("VF4HousingBenefits");
        System.out.println(CheckBoxMethod());
    }
    
     public String CheckBoxMethod(){
        List<String> al = new LinkedList<String>();
        String ans = "";
        if(DC.isSelected()){
            ans = "Army";
            al.add(ans);
        }
        
        if(CaT.isSelected()){
            ans = "Marine";
            al.add(ans);
        }
        
        if(Housing.isSelected()){
            ans = "AirForce";
            al.add(ans);
        }
       
        String arr = al.toString();
        return arr;
    }
     
     public void NoneCheck(){
         if (None.isSelected()){
             Housing.setSelected(false);
             CaT.setSelected(false);
             DC.setSelected(false);
         }
     }
    
    
    
    
    
}
