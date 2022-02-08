package curs10;

public class TestTextFileProcessor {

	public static void main(String[] args) {
		
		TextFileProcessor textFIle =  new TextFileProcessor();
		
		textFIle.writeFile();
		textFIle.readFile();
		textFIle.appendTextToFile();
		System.out.println("----------------");
		textFIle.readFile();
		textFIle.deleteFile();

		
	}

}