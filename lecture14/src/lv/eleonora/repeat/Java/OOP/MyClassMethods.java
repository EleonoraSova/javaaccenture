package lv.eleonora.repeat.Java.OOP;

public class MyClassMethods {
	
	public MyClass myClass;
	

	public MyClassMethods(MyClass myClass){
		this.myClass = myClass;
	}
	
	public MyClass createNewObjMyClass(){
		return new MyClass();
	}
	public void createNewObjMyClassVoid(){
		MyClass obj = new MyClass();
	}
	
	public static int myMethod(){
		System.out.println("Hello World!");
		return 1;
	}
	public String myStringMethod(){
		System.out.println(myMethod());
		return "Hello";
	}
	public double returnDouble(){
		return 65.3;
	}
	public char returnChar(int a, int b){
		int charFromInt = a + b;
		char charVariable = (char)charFromInt;
		return charVariable;
	}
	
}
