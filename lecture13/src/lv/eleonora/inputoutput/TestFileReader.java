package lv.eleonora.inputoutput;

import java.io.FileReader;

public class TestFileReader {

	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("Data.txt");
		
		int i;
		char test = 100;
		
		System.out.println(test);
		
		while((i=fr.read()) != -1){
			System.out.print((char)i);
		}
		

	}

}
