package lv.Eleonora;

public class LearnMethods {

	/**
	 * @param args
	 */
	// void do not return type
	// public private protected
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getMyName();
		getMyCity();
		//String objectString = "58582 ajajajja"
		
		LearnMethods classObject = new LearnMethods();
		
		classObject.doYouHaveCat();		
	
	}
	public static void getMyName(){
		System.out.println("My name is Eleonora");
	}
	public static void getMyCity(){
		getMyName();
		System.out.println("I am from Riga");
}
	public static void doYouHaveCat(){
		System.out.println("Yes");
	}
}