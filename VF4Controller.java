/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veteranservice;

import java.io.IOException;
import javafx.fxml.FXML;

/**
 *
 * @author Richard
 */

public class VF4Controller extends MainController{
    @FXML
    public void next() throws IOException {
        super.load("VF5MentalHealthServices");
    }
}
