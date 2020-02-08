package lv.eleonora.inputoutput;

import java.io.*;

public class TestReadFile {

	public static void main(String[] args) {
		
		InputStream inputStream;
		OutputStream outputStream;
		int c;
		
		final int EOF = -1;
		
		outputStream = System.out;
		
		try {
			File intputFile = new File("Data.txt");
			inputStream = new FileInputStream(intputFile);
			
			try { 
				while((c = inputStream.read()) != EOF){
					outputStream.write(c);
				}
				}catch (IOException e){
					System.out.println("Error: " + e.getMessage());
				}finally {
					try {
						inputStream.close();
						outputStream.close();
				}catch (IOException e){
					System.out.println("File did not closed");

				}
			}
	} catch (FileNotFoundException e) {
		e.printStackTrace();
		System.exit(1);
	}
}
}
