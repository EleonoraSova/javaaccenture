import java.util.ArrayList;


public class Hometask {

	static ArrayList<Integer> getSameValues(int[] arr1, int[] arr2) {  //Создаем метод getSameValues, задаем параметры двух масивов в методе

		ArrayList<Integer> responseArray = new ArrayList<>();  //это массив

		for (int i = 0; i < arr1.length; i++) {   

			int currentValue = arr1[i];

			for (int j = 0; j < arr2.length; j++) {
				int secondValue = arr2[j];
				if (currentValue == secondValue) {
					responseArray.add(currentValue);
				}
			}
		}
		return responseArray;
	}

	public static void main(String args[]) {
		int[] arr1 = { 1, 4, 8, 9, 11, 15, 17, 28, 41, 59 };
		int[] arr2 = { 4, 7, 11, 17, 19, 20, 23, 28, 37, 59, 81 };
		ArrayList<Integer> response = getSameValues(arr1, arr2);

		for (int i : response) {
			System.out.println(i);
		}
	}
}