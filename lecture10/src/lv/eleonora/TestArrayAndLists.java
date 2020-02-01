package lv.eleonora;

public class TestArrayAndLists {

	public static void main(String[] args) {
	
		String[] arr = new String[10];
		String[] arrWith = {"1", "1", "1", "1", "1", "1", "1", "1","1", "1",};
		arrToString(arr);
		System.out.println();
		arrToString(arrWith);
		System.out.println();
		addElementToArr(arr);
		
		
		
		public static void arrToString(String[] arr){
			for(int i = 0; i < arr.length; i++){
			System.out.println("index number is "+i+" "+arr[i]);
		}

	  }
		public static void addElementToArr(String[] arr){
			for(int i = 0; i < arr.length; i++){
				arr[i] = arr[i] + 1;
			}
		}
	}
}
