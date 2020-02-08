package lv.eleonora.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestCreateAndWriteFile {

	public static void main(String[] args) throws Exception {
		
		
		File fileObj = new File("Date.txt");
		FileWriter fw = new FileWriter(fileObj);
		
		try {
		      File myObj = new File("filename.txt");
		      if (myObj.createNewFile()) {
		        System.out.println("File created: " + myObj.getName());
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		
		
		}

	}
