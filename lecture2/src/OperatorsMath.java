
public class OperatorsMath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double num1 = 0.4d;
		double num2 = 0.20d;
		double result1;
		double result2;
		double result3;
		double result4;
		
		char add = '+';
		char sub = '-';
		char mult = '*';
		char divi = '/';
		
		result1 = num1 + num2;
		result2 = num1 - num2;
		result3 = num1 * num2;
		result4 = num1 / num2;
		
		
		System.out.println(num1 + ""+add+""+num2+" = "+result1);
		System.out.println();
		System.out.println(num1 + ""+sub+""+num2+" = "+result2);
		System.out.println();
		System.out.println(num1 + ""+mult+""+num2+" = "+result3);
		System.out.println();
		System.out.println(num1 + ""+divi+""+num2+" = "+result4);
		System.out.println();
	
		
		int a = 10;
		int b = 3;
		int x = a % b; 
		
		System.out.println("x = "+x);
		
		int i = 1;
		i++;
		System.out.println(i);
		
		int k = 2;
		//return increment result ++ increment by value 1
		int p = ++k;
		
		System.out.println("p after increment: "+p);
		
		int o = 2;
		
		int f = o++;
		
		System.out.println("f after increment: "+f);
		
		
		

	}

}
