package lv.Eleonora;

public class RefactorMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
    
    System.out.println(getGreating(20));
    getGreatingWithVoid(3);
    
	}
	public static String getGreating(int time){
		if(time <= 8){
			return "Good Morning.";
						
		}else if(time <= 18){
			return "Good day.";
						
		}else{
			return "Good evening.";
		}  
}

	public static void getGreatingWithVoid(int time){
		if(time <= 8){
          System.out.println("Good Morning.");						
		
		}else if(time <= 18){
			System.out.println("Good day.");
						
		}else{
			System.out.println("Good evening.");
		}
	}
}