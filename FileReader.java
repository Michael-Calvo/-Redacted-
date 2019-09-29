
package javaapplication25;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;
import java.util.*;
import javax.swing.*;


public class FileReader {

	private Scanner x;
	String findWord;
	String document;
	boolean isCaps;
	int lastNumber = 0;
	int index;
	int count = 0;
	String fileName = "Lily.txt";
	String word = "";
	String wordsArray[];
	String wordsArray2[];
	int amountOfWords[];
	int keepHighestCount = 0;
	
	List<String> myList = new ArrayList();
	List wordList = new ArrayList();
	List documentArray = new ArrayList();
	
	String finalDoc = "";
        
        
	public void openHousingType() {
		try {
			x = new Scanner(new File("C:\\Users\\biscu\\Desktop\\CodeLinc\\JavaApplication25\\topics\\Housing\\Database.housingType - Sheet1"));
		}
		
		catch (Exception e) {
			System.out.println("Could not find the file to open");
		}
	}
	
	public ArrayList readLine() {
            ArrayList<String> arr = new ArrayList<String>();
            while(x.hasNext()) {
			document = x.nextLine();
                        arr.add(document);
		}
                return arr;
	}
        
        public String getdoc()
        {
            return finalDoc;
        }
		
	public void closeFile() {
		x.close();
	}
       
}
	