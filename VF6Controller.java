/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veteranservice;

import java.io.IOException;

/**
 *
 * @author Richard
 */
public class VF6Controller extends MainController{
    public void next() throws IOException {
        super.load("VF7AdditionalInfo");
    }
}
