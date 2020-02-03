package lv.eleonora;

import java.util.Scanner;

public class TestScannerInputArrays2 {

	public static void main(String[] args) {

		String[] strArr = new String[3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < strArr.length; i++) {

			System.out.println("Input the name");
			strArr[i] = sc.nextLine();
		}
		System.out.println("Do you want to print array?");
		String x = sc.nextLine();

		if (x.equals("Print")) {
			for (int i = 0; i < strArr.length; i++) {

				System.out.println(strArr[i]);
			}
		} else if (x.equals("Not print")) {
			System.out.println("Exit");
		}
	}

}
