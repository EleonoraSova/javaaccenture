public class arraysSumForLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] marks = { 76, 23, 42, 100, 99, 10, 56 };
		// Sum of vallues in arrays
		// Print in console
		// int result = 10;
		// System.out.println("result value: "+result);
		// int testInt = 90;
		// result = 200;
		// System.out.println("result value: "+result);
		
		int sum = 0;
		
		for(int i = 0; i < marks.length; i++){
			sum += marks[i];
			
		}
		
		System.out.println("Sum of marks: "+sum);
		
		//System.out.println(marks[0] + marks[1] + marks[2]);
		
		int sumTest = 0;
		sumTest = sumTest + 200;
		sumTest = sumTest + 220;
		sumTest = sumTest + 240;
		
		System.out.println("Testing += operator: " +sumTest);
		
		// -= and look how this operator works
		
		int subOperator = 1000;
		subOperator = subOperator - 200;
		subOperator -= 220;
		subOperator -= 240;
		
		
		System.out.println("Testing -= operator:" +subOperator);

	}

}
