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

public class VF4Controller extends MainController{
    
    @FXML private CheckBox check1;
    @FXML private CheckBox check2;
    @FXML private CheckBox check3;
    @FXML private CheckBox check4;
    @FXML private CheckBox None;
    @FXML private CheckBox Housing;
    @FXML private CheckBox Apartment;
    @FXML private CheckBox TrailerHome;
    @FXML private CheckBox Shelter;
    
    
    
    
    @FXML
    public void next() throws IOException {
        System.out.println(CheckBoxMethod());
        super.load("VF5MentalHealthServices");
        
    }
    
         public void NoneCheck2(){
         if (None.isSelected()){
             Housing.setSelected(false);
             TrailerHome.setSelected(false);
             Apartment.setSelected(false);
             Shelter.setSelected(false);
         }
     }
    
    
       public String CheckBoxMethod(){
        List<String> al = new LinkedList<String>();
        String ans = "";
        if(check1.isSelected()){
            ans = "yes";
            al.add(ans);
        }
        else{
            ans="no";
        }
        
        if(check2.isSelected()){
            ans = "yes";
            al.add(ans);
        }
                else{
            ans="no";
        }
        
        if(check3.isSelected()){
            ans = "yes";
            al.add(ans);
        }
                else{
            ans="no";
        }
        
        if(check4.isSelected()){
            ans = "yes";
            al.add(ans);
        }
                else{
            ans="no";
        }
       
        String arr = al.toString();
        return arr;
    }
       
       
     public String CheckBoxMethod2(){
        List<String> al = new LinkedList<String>();
        String ans = "";
        if(Housing.isSelected()){
            ans = "Housing";
            al.add(ans);
        }
        if(TrailerHome.isSelected()){
            ans = "TrailerHome";
            al.add(ans);
        }
        if(Apartment.isSelected()){
            ans = "Apartment";
            al.add(ans);
        }
        
        if(Shelter.isSelected()){
            ans = "Shelter";
            al.add(ans);
        }
       
        String arr = al.toString();
        return arr;
    }
       

    
    
    
    
    
}
