
package javaapplication25;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;
import java.util.ArrayList;
import static javaapplication25.PersonController.HousingList;

/*
 Example that declaring person class and database works
*/
public class  Javaapplication25{


    public static void main(String[] args) {
       javaapplication25.FileReader fr = new javaapplication25.FileReader();
         

         boolean[] array = new boolean[4];
         array[0] = true;
         
         //ArrayList<String> arrString = new ArrayList<String>();
         
         //javaapplication25.DatabaseNG f = new javaapplication25.DatabaseNG();
         //arrString = f.getHousing(array);
         //System.out.println(arrString.toString());
       
       MilitaryBranch mb = new MilitaryBranch("yes", "yes", "yes");
       MentalHealth mh = new MentalHealth("yes");
       PhysicalHealth ph = new PhysicalHealth("no");
       SubstanceAbuse sa = new SubstanceAbuse("no");
       Housing hg = new Housing("yes", "no", "no", "no");
         
       Person vet = new Person(mh,hg,mb,ph,sa);
       
       ArrayList arrHousing = DatabaseNG.getHousing(vet.getHousingData());
       
       
        System.out.println(arrHousing.toString());
       
     }


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*String fileName= "Database2.0 - sheet1.csv";
         String line = "";
          
         BufferedReader br = null;
         try{
            br = new BufferedReader(new FileReader(fileName));
         }
         catch(FileNotFoundException f){
             System.out.println(f.getMessage());
         }
         
        
         
         while ((line = br.readline()) != null){
        
    }
            
         String csv = file.spl
    }
    
                */
        
        
                
                
}
