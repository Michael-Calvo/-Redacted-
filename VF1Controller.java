/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veteranservice;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Richard
 */
public class VF1Controller extends MainController implements MouseListener {
    
    @FXML private CheckBox ArmyCheckBox;
    @FXML private CheckBox MarineCheckBox;
    @FXML private CheckBox AirForceCheckBox;
    @FXML private CheckBox NationalGuardCheckBox;
    @FXML private CheckBox CoastGuardCheckBox;
    @FXML private CheckBox NavyCheckBox;
    
    @FXML
    
    public String CheckBoxMethod(){
        List<String> al = new LinkedList<String>();
        String ans = "";
        if(ArmyCheckBox.isSelected()){
            ans = "Army";
            al.add(ans);
        }
        
        if(MarineCheckBox.isSelected()){
            ans = "Marine";
            al.add(ans);
        }
        
        if(AirForceCheckBox.isSelected()){
            ans = "AirForce";
            al.add(ans);
        }
        if(NationalGuardCheckBox.isSelected()){
            ans = "NationalGuard";
            al.add(ans);
        }
        
        if(CoastGuardCheckBox.isSelected()){
        ans = "CoastGuard";
        al.add(ans);
        }
        
        if(NavyCheckBox.isSelected()){
        ans = "Navy";
        al.add(ans);
        }
        String arr = al.toString();
        return arr;
    }
    
    
    
    
    
    @FXML
    public void next() throws IOException{
        System.out.println(CheckBoxMethod());
        super.load("VF2ServiceTimeDetails");
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
