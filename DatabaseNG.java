/*
 * 
 * 
 * 
 */
package javaapplication25;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author biscu
 */
public class DatabaseNG {
//libs for the housing file
    private static final String HOUSING_SHEET_ONE ="C:\\Users\\biscu\\Desktop\\CodeLinc\\JavaApplication25\\topics\\Housing\\Database.housingType - Sheet1.csv";
    private static final String HOUSING_SHEET_TWO ="C:\\Users\\biscu\\Desktop\\CodeLinc\\JavaApplication25\\topics\\Housing\\Database.rentTrouble - Sheet1.csv";
    private static final String HOUSING_SHEET_THREE="C:\\Users\\biscu\\Desktop\\CodeLinc\\JavaApplication25\\topics\\Housing\\Database.subsidizedHousing - Sheet1.csv";
    private static final String HOUSING_SHEET_FOUR="C:\\Users\\biscu\\Desktop\\CodeLinc\\JavaApplication25\\topics\\Housing\\Database.voucher - Sheet1.csv";
    
//libs for the Mhealth file
    private static final String MHEALTH_SHEET_ONE="C:\\Users\\biscu\\Desktop\\CodeLinc\\JavaApplication25\\topics\\MentalHealth\\mHealth - Sheet1.csv";
    
//libs for substance file
    private static final String SUBSTANCE_SHEET_ONE="C:\\Users\\biscu\\Desktop\\CodeLinc\\JavaApplication25\\topics\\SubstanceAbuse\\substanceAbuse - Sheet1.csv";
    
//libs for Phealth File
    private static final String PHEALTH_SHEET_ONE="C:\\\\Users\\\\biscu\\\\Desktop\\\\CodeLinc\\\\JavaApplication25\\\\topics\\\\PhysicalHealth\\\\pDisability.csv";
     
//libs for MilitaryBranch File
    private static final String MILITARYBRANCH_SHEET_ONE="C:\\Users\\biscu\\Desktop\\CodeLinc\\JavaApplication25\\topics\\MilitaryBranch";
    
    String document;
    private Scanner x;
    ArrayList<String> arrString = new ArrayList<String>();
    /**
     * 
     * @param arr boolean values of questions about housing
     * @return depending on what index of arr is true it will output 4 different csvs as an array string
     */
    //Takes a boolean array that has a size of 4
    public ArrayList getHousing(boolean[] arr) {
        
        //opens and sends the housing type csv as a ArrayList
        if (arr[0] == true) {

            try {
                x = new Scanner(new File(HOUSING_SHEET_ONE));
            } catch (Exception e) {
                System.out.println("Could not find the file to open");

            }
            ArrayList<String> arrString = new ArrayList<String>();
            while (x.hasNext()) {
                document = x.nextLine();
                arrString.add(document);
            }
            x.close();
            return arrString;
        }

        //opens and sends the rentTrouble csv as an ArrayList
        if (arr[1] == true) {

            try {
                 x = new Scanner(new File(HOUSING_SHEET_TWO));
            } catch (Exception e) {
                System.out.println("Could not find the file to open");

            }
            ArrayList<String> arrString1 = new ArrayList<String>();
            while (x.hasNext()) {
                document = x.nextLine();
                arrString.add(document);
            }
            x.close();
            return arrString1;

        }
        //opens and sends the subsidizedHousing csv as an ArrayList
        if (arr[2] == true) {

            try {
                x = new Scanner(new File(HOUSING_SHEET_THREE));
            } catch (Exception e) {
                System.out.println("Could not find the file to open");

            }
            ArrayList<String> arrString2 = new ArrayList<String>();
            while (x.hasNext()) {
                document = x.nextLine();
                arrString.add(document);
            }
            x.close();
            return arrString2;
        }
        //opens and sends the voucher csv as an ArrayList
        if (arr[3] == true) {

            try {
                x = new Scanner(new File(HOUSING_SHEET_FOUR));
            } catch (Exception e) {
                System.out.println("Could not find the file to open");

            }
            ArrayList<String> arrString3 = new ArrayList<String>();
            while (x.hasNext()) {
                document = x.nextLine();
                arrString.add(document);
            }
            x.close();
            return arrString3;
        } else {
            return arrString;
        }
    }
/**
 * 
 * @param b true if veteran has a form of mental health
 * @return if true returns mentalHealth csv as an ArrayList
 */
    public ArrayList getMentalHealth(boolean b) {
        //if true opens and sends the mHealth csv as an Array List
        if(b==true){            
        try {
                x = new Scanner(new File(MHEALTH_SHEET_ONE));
            } catch (Exception e) {
                System.out.println("Could not find the file to open");

            }
            ArrayList<String> arrString = new ArrayList<String>();
            while (x.hasNext()) {
                document = x.nextLine();
                arrString.add(document);
            }
            x.close();
            return arrString;
    }
        else{ 
        return arrString;
        }
    }
    /**
     * 
     * @param b true if veteran has a Substance Problem
     * @return returns Specific csv files as arrayStrings
     */

    public ArrayList getSubstanceAbuse(boolean b) {
        //if true opens and sends the substanceAbuse csv as an Array List
        if(b == true)  {  
        try {
             x = new Scanner(new File(SUBSTANCE_SHEET_ONE));
            } catch (Exception e) {
                System.out.println("Could not find the file to open");

            }
            ArrayList<String> arrString = new ArrayList<String>();
            while (x.hasNext()) {
                document = x.nextLine();
                arrString.add(document);
            }
            x.close();
            return arrString;
        }
        else{
            return arrString;
        }
    }
    
    /**
     * 
     * @param b if veteran has a physical health problem
     * @return if b is true returns the pDisability csv as an Array List
     */
    public ArrayList getPhysicalHealth(boolean b) {
        if(b == true) {   
        try{
                x = new Scanner(new File(PHEALTH_SHEET_ONE));
            }catch (Exception e) {
                System.out.println("Could not find the file to open");

            }
            ArrayList<String> arrString = new ArrayList<String>();
            while (x.hasNext()) {
                document = x.nextLine();
                arrString.add(document);
            }
            x.close();
            return arrString;
    }
        else{
            return arrString;
        }
    }
/**
 * 
 * @param arr takes boolean values of military branch, fulltime or part, Service length (5yrs)
 * @return returns Specific csv files as arrayStrings 
 */
    public ArrayList getMilitaryBranch(boolean[] arr) {
        if(arr[0]==true)  {  
        try {
            x = new Scanner(new File(MILITARYBRANCH_SHEET_ONE));
            } catch (Exception e) {
                System.out.println("Could not find the file to open");

            }
            ArrayList<String> arrString = new ArrayList<String>();
            while (x.hasNext()) {
                document = x.nextLine();
                arrString.add(document);
            }
            x.close();
            return arrString;
    }
        else{
            return arrString;
        }
    }
    
    

}
