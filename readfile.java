import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.stream.Stream;
import java.util.*;
import javax.swing.*;

public class readfile {

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
	
	
	
	public void openFile() {
		try {
			x = new Scanner(new File("C:\\Users\\Richard\\Desktop\\"+fileName));
		}
		
		catch (Exception e) {
			System.out.println("Could not find the file to open");
		}
	}
	
	public void readFile() {
		while(x.hasNext()) {
			document = x.next();
			addMember(document);
		}
	}
		
	public void closeFile() {
		x.close();
	}
	
	public void addMember(String x) {
	    myList.add(x);
	};
	
	public void toLowerCases(List<String> list) {
		List tempList = new ArrayList();
		int amtofwords = list.size();
		String oldWord = "";
		
		//CREATE THE NEWWORD STRING FROM THE LIST
		for (int a = 0; a<amtofwords; a++) {
			oldWord = (String) list.get(a);
			String newWord = oldWord.toLowerCase();
			tempList.add(newWord);
		}
		this.myList = tempList;
	}
	
	public void RemoveSyntax(List<String> list) {
		
		//USING A TEMP LIST TO OVERWRITE THE REAL ONE
		List tempList = new ArrayList();
		int amtofwords = list.size();
		String oldWord = "";
		
		//CREATE THE NEWWORD STRING FROM THE LIST
		for (int a = 0; a<amtofwords; a++) {
			oldWord = (String) list.get(a);
			String newWord = oldWord.replaceAll("[^a-zA-Z]", "");
			tempList.add(newWord);
		}
		this.myList = tempList;
	}
	
	public int TotalWordCount(List<String> list) {
		int totalamountofwords = list.size();
		return totalamountofwords;
		//System.out.println("The total amount of words in " + fileName + " is: " + totalamountofwords);
	}
	
	public void AmountOfExistingWord(List<String> list, String word) {
		int count = 0;
		for (int amount = 0; amount<list.size(); amount++) {
			if (list.get(amount).equals(word)) {
				count++;
			}
		}
		System.out.println("The amount of time(s): |" + word + "| was found in " + fileName + ": " + count + " times");
	}
	
	
	
	
	//RETURNS THE MOST COMMON WORD WITHIN THE DOCUMENT GIVEN
	public String MostCommonWord() {
		
		//METHODS THAT MODIFY THE LIST SO IT CAN BE USED CORRECTLY
		RemoveSyntax(myList);
		toLowerCases(myList);
		
		String newWord;
		Map<String, Integer> newMap = new HashMap<>();
		
		//CREATE A LIST WITH ALL THE WORDS
		for (int someCount = 0; someCount<myList.size(); someCount++) {
			
			int newCount = 1;
			
			//CREATE A NEWWORD EVERYTIME FOR COMPARISON
			newWord = (String) myList.get(someCount);

			//CHECK IF THE NEWWORD EXISTS INSIDE OF THE LIST
			if (newMap.containsKey(newWord)) {
				newMap.replace(newWord, newMap.get(newWord)+1);
			}
			
			//IF IT DOESN'T EXIST, ADD IT TO THE LIST
			else {
				newMap.put(newWord, newCount);
			}
		}
		
		//FIND THE GREATEST VALUE WITHIN THE MAP BY RUNNING THROUGH THE MAP
		for (int cnt = 0; cnt<newMap.size(); cnt++) {

			Object someKey = newMap.keySet().toArray()[cnt]; //RETURNS THE STRING
			int valueOfWord = newMap.get(someKey); //RETURNS THE INT VALUE
			
			//KEEP GETTING THE GREATEST VALUE OF THE WORD UNTIL CAN'T GO HIGHER
			if (keepHighestCount < valueOfWord) {
				keepHighestCount = valueOfWord;
			}
		}
		Object mostCommonWord = newMap.keySet().toArray()[keepHighestCount];
		
		//RETURN THE MOST COMMON WORD
		return (String) mostCommonWord;
	}
	
	//NEW METHOD OF SOME TYPE
	public Object GuiObject() {
		
		JFrame jFrame = new JFrame();
		JPanel jPanel = new JPanel();
		JButton jButton = new JButton("Save");
		
		jFrame.setSize(400, 400);
		jFrame.add(jPanel);
		jFrame.setVisible(true);
		jPanel.setVisible(true);
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.PAGE_AXIS));
		
		
		//CREATE THE CHECKBOXES
		JCheckBox jCheckBoxMCW = new JCheckBox("Most Common Word");
		JCheckBox jCheckBoxRS = new JCheckBox("Remove Syntax");
		JCheckBox jCheckBoxTWC = new JCheckBox("Total Word Count");
		
		//ADD EVERYTHING TO THE JPANEL
		jPanel.add(jCheckBoxMCW);
		jPanel.add(jCheckBoxRS);
		jPanel.add(jCheckBoxTWC);
		
		jPanel.add(jButton);
		
		jCheckBoxMCW.setVisible(true);
		jCheckBoxRS.setVisible(true);
		jCheckBoxTWC.setVisible(true);
		
		//ACTION LISTENER HERE
		jButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  
			  if (jCheckBoxMCW.isSelected() == true) {
				  System.out.println("The most common word is: " + MostCommonWord() + "!");
			  }
			  
			  if (jCheckBoxRS.isSelected() == true) {
				  RemoveSyntax(myList);
				  System.out.println("Syntax has been moved from the list!");
			  }
			  
			  if (jCheckBoxTWC.isSelected() == true) {
				  System.out.println("There are " + TotalWordCount(myList) + " words in the list!");
			  }
			  
		  }
		});  
		return jPanel;
	}
}
	
	

