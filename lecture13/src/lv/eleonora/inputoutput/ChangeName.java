package lv.eleonora.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ChangeName {

	public static void main(String[] args) throws Exception {
		
//		String defaultStr = "Hello user userName";
//		
//		String lastString = defaultStr.replace("userName", "");
//		
//		System.out.println(lastString+"Eleonora");
//		
		
        File file = new File("Data.txt");
		
		Scanner sc = new Scanner(file);
		String stringFromTextFile = "";
		
		while(sc.hasNextLine()){
			stringFromTextFile = sc.nextLine();
		}
		String lastString = stringFromTextFile.replace("userName", "");
		String userName = "Eleonora v";
		File fileForUser = new File(userName+" .txt");
		FileWriter fw = new FileWriter(fileForUser, true);
		fw.write(lastString+userName);
		
		fw.close();
		}

	}
