public class fileReader {
	
	public static void main(String[] args) {
		readfile rf = new readfile();
		//rf.CheckAmountOfWords("Rel", rf.document);
		rf.openFile();
		rf.readFile();
		rf.closeFile();

		//rf.RemoveSyntax(rf.myList);
		//System.out.println(rf.MostCommonWord());
		//System.out.println(rf.GuiObject());
		rf.GuiObject();
	}
}
